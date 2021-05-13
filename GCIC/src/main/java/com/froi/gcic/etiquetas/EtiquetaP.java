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
public class EtiquetaP extends EtiquetaTextual {

    public EtiquetaP() {
        super();
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<p" + generarParametros() + ">" + "</p>";
        return codigo;
    }
    
}
