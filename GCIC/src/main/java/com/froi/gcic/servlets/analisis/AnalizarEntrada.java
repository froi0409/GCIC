/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.servlets.analisis;

import com.froi.gcic.entidades.Advertencia;
import com.froi.gcic.entidades.Captcha;
import com.froi.gcic.gramaticas.etiquetado.EtiquetadoLexer;
import com.froi.gcic.gramaticas.etiquetado.EtiquetadoParser;
import com.froi.gcic.herramientas.ManejadorBD;
import com.froi.gcic.manejodesimbolos.TablaDeSimbolos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author froi-pc
 */
@WebServlet(name = "AnalizarEntrada", urlPatterns = {"/AnalizarEntrada"})
public class AnalizarEntrada extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ManejadorBD db = new ManejadorBD();
        
        String entradaSinAnalizar = request.getParameter("entrada");
        String entrada = new String(entradaSinAnalizar.getBytes("ISO-8859-1"), "UTF-8");
        String salida = "";
        ArrayList<Advertencia> listaErrores = new ArrayList<>();
        ArrayList<Captcha> listaCaptchas = new ArrayList<>();
        
        StringReader reader = new StringReader(entrada);
        EtiquetadoLexer etiquetadoLexer = new EtiquetadoLexer(reader);
        EtiquetadoParser etiquetadoParser = new EtiquetadoParser(etiquetadoLexer, listaErrores, listaCaptchas);
        
        //Recuperamos los captchas existentes
        db.recuperarCaptchas(listaCaptchas);
        
        for(Captcha captcha : listaCaptchas) {
            System.out.println("El captcha " + captcha.getId());
        }
        TablaDeSimbolos tabla = null;
        try {
            etiquetadoParser.parse();
            
            //Verificamos si el lenguaje de etiquetado posee errores
            if(listaErrores.size() > 0) {
                salida = "Errores de Análisis:\n\n";
                for(Advertencia error: listaErrores) {
                    salida += error + "\n\n";
                }
            } else {
                //Debemos obtener el link del captcha
                //para que el link del captcha pueda ser mostrado en la salida
                Captcha captcha = etiquetadoParser.getCaptcha();
                salida = "Captcha analizado con éxito\n";
                String identificador = etiquetadoParser.getCaptcha().getId();
                try (BufferedWriter write = new BufferedWriter(new FileWriter(new File("Captchas/Codigo/" + identificador + ".html")))) {
                    String html = etiquetadoParser.getGcicPrincipal().generarHTML();
                    write.write(html);
                    captcha.setLink(generarLink(captcha.getId()));
                    captcha.setPath("Captchas/Codigo/" + identificador + ".html");
                    salida += "Link del Captcha: " + captcha.getLink();
                    tabla = captcha.getTablaSimbolos();
                    listaCaptchas.add(captcha);
                } catch (Exception e) {
                    System.err.println("Error al escribir HTML del captcha: " + e.getMessage());
                }
                
            }
            
        } catch (Exception e) {
            System.err.println("Error al analizar el lenguaje de etiquetado: " + e.getMessage());
            e.printStackTrace();
            salida = "Error Irrecuperable";
        }
        
        db.guardarCaptchas(listaCaptchas);
        
        request.setAttribute("tabla", tabla);
        request.setAttribute("salida", salida);
        request.setAttribute("entrada", entrada);
        request.getRequestDispatcher("editor.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public String generarLink(String identificador) {
        try {
            String urlString2Decode = "http://localhost:8080/GCIC/GenerarCaptcha?id=" + identificador;
            String decodedURL = URLDecoder.decode(urlString2Decode, "UTF-8");
            URL url = new URL(decodedURL);
            URI uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
            String decodedURLAsString = uri.toASCIIString();
            System.out.println(decodedURLAsString);
            return decodedURLAsString;
        } catch (Exception e) {
            System.err.println("Error al generar id del captcha");
            return "Error al generar Link del captcha";
        }
    }
    
}
