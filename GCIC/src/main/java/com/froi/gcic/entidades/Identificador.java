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
public class Identificador {
    
    private String id;
    private int linea;
    private int columna;

    public Identificador(String id, int linea, int columna) {
        this.id = id;
        this.linea = linea;
        this.columna = columna;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    
    
}
