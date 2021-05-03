/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.pruebas.gramaticas;

/**
 *
 * @author froi-pc
 */
public class Advertencia {
    
    private String tipo;
    private int linea;
    private int columna;
    private String token;
    private String texto;
    private String solucion;
    private String mensaje;

    public Advertencia(String tipo) {
        this.tipo = tipo;
    }
    
    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = "Se esperaba(n) el(los) simbolo(s): " + solucion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public String toString() {
        if(tipo.equals("Sintactico")) {
            return "linea: " + linea + " - Columna: " + columna + "\nToken: " + token + "\nTexto: " + texto + "\nSolucion: " + solucion;
        } else if(tipo.equals("Semantico")) {
            return "Advertencia: " + mensaje;
        } else {
            return "Error irrecuperable";
        }
    }
    
}
