/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.servlets.analisis;

import com.froi.gcic.entidades.Captcha;
import com.froi.gcic.herramientas.ManejadorBD;
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
@WebServlet(name = "Redireccionamiento", urlPatterns = {"/Redireccionamiento"})
public class Redireccionamiento extends HttpServlet {

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
        String identificadorCaptcha = request.getParameter("id");
        System.out.println("\n\nREDIRECCIONAMIENTO: " + identificadorCaptcha);
        String redireccionamiento = "";
        ManejadorBD manejador = new ManejadorBD();
        ArrayList<Captcha> listaCaptchas = new ArrayList<>();
        manejador.recuperarCaptchas(listaCaptchas);
        boolean comprobador = false;
        Captcha captchaUsado = null;
        for(Captcha element: listaCaptchas) {
            if(element.getId().equals(identificadorCaptcha)) {
                captchaUsado = element;
                captchaUsado.setAciertos(captchaUsado.getAciertos() + 1);
                captchaUsado.setFallos(captchaUsado.getCantidadUsos() - captchaUsado.getAciertos());
                redireccionamiento = captchaUsado.getLinkRedirect();
                comprobador = true;
                break;
            }
        }
        
        manejador.guardarCaptchas(listaCaptchas);
        response.sendRedirect(redireccionamiento);
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
