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
public class EtiquetaInput extends EtiquetaTextual {

    private String type;
    
    public EtiquetaInput(ArrayList<Captcha> listaCaptchas, ArrayList<Advertencia> listaErrores) {
        super(listaCaptchas, listaErrores);
        this.type = "text";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
