<%-- 
    Document   : editor
    Created on : 21/04/2021, 20:04:07
    Author     : froi-pc
--%>

<%@page import="com.froi.gcic.manejodesimbolos.Simbolo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.froi.gcic.manejodesimbolos.TablaDeSimbolos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file = "links.html"%>
        <title>Generador de Captchas - GCIC</title>
    </head>
    <body>
        
        <%
        String entrada = request.getAttribute("entrada").toString();
        String salida = request.getAttribute("salida").toString();
        TablaDeSimbolos tabla = (TablaDeSimbolos) request.getAttribute("tabla");
        if(entrada == null) {
            entrada = "";
        }
        if(salida == null) {
            salida = "";
        }
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
        <!-- Se crea el div que contendrá al edito de texto -->
        <form action="AnalizarEntrada" method="POST">
        <div class="row">
            <div class="col-1"></div>
            <div class="col-10">
                <!-- Se añaden las herramientas que tendrá el editor -->
                <div class="row container-fluid">
                    <div class="col-8" align="left">
                        <button type="submt" class="btn btn-success">Analizar</button>&nbsp;&nbsp;
                        <button type="button" onclick="saveTextAsFile(entrada.value, 'descarga.gcic')" class="btn btn-secondary">Exportar</button>&nbsp;&nbsp;
                        <input type="file" id="archivo" accept=".gcic"/>
                    </div>
                    <div class="col-4" align="right">
                        <label id="lblPosicion">Linea: 0 - Columna: 0</label>
                    </div>
                </div>
                <br>
                <!-- Se añade el editor de texto como tal -->
                <div class="row container-fluid">
                    <textarea class="form-control" onkeyup="actualizarPosicion()" onkeydown="actualizarPosicion()" onclick="actualizarPosicion()" name="entrada" id="entrada" style="height: 500px;"><% out.print(entrada); %></textarea>
                </div>
            </div>
            <div class="col-1"></div>
        </div>
        <br><br>
        </form>
        <!-- Se crea el div que contendrá la salida del editor -->
        <div class="row">
            <div class="col-1"></div>
            <div class="col-10">
                <div class="row container-fluid">
                    <textarea class="form-control" id="salida" style="height: 200px; background-color: beige;"><% out.print(salida); %></textarea>
                </div>
            </div>
            <div class="col-1"></div>
        </div>
        <br><br>
        <!-- A continuación se genera la tabla de simbolos -->
        <% if(tabla != null) {%>
        <div style=" margin-left: 5%; margin-right: 5%">
            <table class="table table-bordered">
                <thead>
                    <tr class="table-secondary">
                    <th scope="col">Identificador</th>
                    <th scope="col">Tipo</th>
                    <th scope="col">Valor</th>
                    <th scope="col">Modo</th>
                    <th scope="col">Procedimiento</th>
                    <th scope="col">No. Ejecucion</th>
                  </tr>
                </thead>
                <tbody>
                    <%
                    ArrayList<Simbolo> tablaDeSimbolos = tabla.getTablaSimbolos();
                    for(Simbolo element: tablaDeSimbolos){
                        out.println("<tr>");
                        out.println("<td>" + element.getIdentificador() + "</td>");
                        out.println("<td>" + element.getTipo() + "</td>");
                        out.println("<td>" + element.getValorActual() + "</td>");
                        out.println("<td>" + element.getModo() + "</td>");
                        out.println("<td>" + element.getProcedimiento() + "</td>");
                        out.println("<td>" + element.getNumeroEjecucion() + "</td>");
                        out.println("</tr>");
                    }
                    %>
                </tbody>
            </table>
        </div>
        <br><br>
        <%}%>
        <%@include file = "scripts.html"%>
    </body>
</html>
