/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.etiquetas;

/**
 *
 * @author froi-pc
 */
public class EtiquetaTitle extends Etiqueta {
    
    private String titulo;

    public EtiquetaTitle() {
        this.titulo = "";
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo = "<title>" + titulo + "</title>";
        return codigo;
    }
    
}
