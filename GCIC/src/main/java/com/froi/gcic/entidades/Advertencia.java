/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.entidades;

/**
 *
 * @author froi-pc
 */
public class Advertencia {
    
    private int linea;
    private int columna;
    private String token;
    private String texto;
    private String solucion;

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
    
    @Override
    public String toString() {
        return "linea: " + linea + " - Columna: " + columna + "\nToken: " + token + "\nTexto: " + texto + "\nSolucion: " + solucion;
    }
    
}
