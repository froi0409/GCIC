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
public class EtiquetaH1 extends EtiquetaTextual {

    public EtiquetaH1() {
        super();
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<h1" + generarParametros() + ">" + "</h1>";
        return codigo;
    }
    
}
