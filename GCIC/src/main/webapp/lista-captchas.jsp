<%-- 
    Document   : lista-captchas
    Created on : 17/05/2021, 16:35:41
    Author     : froi-pc
--%>

<%@page import="com.froi.gcic.herramientas.ManejadorBD"%>
<%@page import="com.froi.gcic.entidades.Captcha"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file = "links.html"%>
        <title>Generador de Captchas - GCIC</title>
    </head>
    <body>
        
        <%
            ManejadorBD manejador = new ManejadorBD();
            ArrayList<Captcha> listaCaptchas = new ArrayList<>();
            manejador.recuperarCaptchas(listaCaptchas);
        %>
        <!-- Cabecera que tendrá el editor -->
        <div class="row fondoInicio">
            <div class="row container-fluid align-items-center">
                <div class="col-6" align="left">
                    <h2>&nbsp;&nbsp;Generador de Captchas - GCIC</h2>
                </div>
                <div class="col-6" align="right">
                </div>

            </div>
        </div>
        <!-- Se importa la barra de herramientas del editor -->
        <%@include file ="barra-herramientas.html" %>
        <br><br>
        <div align="center">
            <h1>Listado de Captchas Generados</h1>>
        </div>
        <!-- Se crea el div que contendrá el listado -->
        <div style=" margin-left: 5%; margin-right: 5%">
            <table class="table table-bordered">
                <thead>
                    <tr class="table-secondary">
                    <th scope="col">Identificador</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">Link</th>
                  </tr>
                </thead>
                <tbody>
                    <%
                    
                    for(Captcha element: listaCaptchas){
                        out.println("<tr>");
                        out.println("<td>" + element.getId() + "</td>");
                        out.println("<td>" + element.getName() + "</td>");
                        out.println("<td>" + element.getLink() + "</td>");
                        out.println("</tr>");
                    }
                    %>
                </tbody>
            </table>
        </div>
        <br><br>
        <%@include file = "scripts.html"%>
    </body>
</html>
