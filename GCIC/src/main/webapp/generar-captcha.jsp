<%-- 
    Document   : generar-captcha
    Created on : 16/05/2021, 21:22:23
    Author     : froi-pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String codigo = request.getAttribute("codigo").toString();
    out.print(codigo);
%>