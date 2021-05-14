/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.etiquetas;

import com.froi.gcic.entidades.Advertencia;
import com.froi.gcic.entidades.Captcha;
import java.util.ArrayList;

/**
 *
 * @author froi-pc
 */
public class EtiquetaSpam extends EtiquetaTextual {

    public EtiquetaSpam() {
        super();
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<span" + generarParametros() + ">";
        codigo += getTextoInterno() + "\n";
        codigo += "</span>";
        return codigo;
    }
    
}
