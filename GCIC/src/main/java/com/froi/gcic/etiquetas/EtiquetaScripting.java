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
public class EtiquetaScripting extends Etiqueta {

    public EtiquetaScripting() {
        super();
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<script>\n";
        codigo += getTextoInterno();
        codigo += "</script>";
        return codigo;
    }
    
}
