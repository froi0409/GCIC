/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.servlets.analisis;

import com.froi.gcic.entidades.Captcha;
import com.froi.gcic.herramientas.ManejadorBD;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "GenerarCaptcha", urlPatterns = {"/GenerarCaptcha"})
public class GenerarCaptcha extends HttpServlet {

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
        ManejadorBD db = new ManejadorBD();
        ArrayList<Captcha> listaCaptchas = new ArrayList<>();
        
        db.recuperarCaptchas(listaCaptchas);
        
        String id = request.getParameter("id");
        System.out.println("identifcador " + id);
        
        Captcha captchaUsado = null;
        boolean comprobante = false;
        for(Captcha element: listaCaptchas) {
            if(element.getId().equals(id)) {
                comprobante = true;
                captchaUsado = element;
                break;
            }
        }
        
        String codigo;
        if(comprobante) {
            try (BufferedReader reader = new BufferedReader(new FileReader(new File(captchaUsado.getPath())))) {
                String provisional;
                codigo = "";
                while((provisional = reader.readLine()) != null) {
                    codigo += provisional + "\n";
                }
            } catch (Exception e) {
                codigo = generarError();
                System.err.println("Error al generar codigo del captcha: " + e.getMessage());
            }
        } else {
            codigo = generarError();
        }
        
        request.setAttribute("codigo", codigo);
        request.getRequestDispatcher("generar-captcha.jsp").forward(request, response);
    }

    private String generarError() {
        String codigo = "<html>\n";
        codigo += "<head>\n";
        codigo += "<title>PAGINA INVALIDA</title>\n";
        codigo += "</head>\n";
        codigo += "<body>\n";
        codigo += "<h1>ERROR: CAPTCHA NO ENCONTRADO</h1>\n";
        codigo += "</body>\n";
        codigo += "</html>\n";
        return codigo;
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

}
