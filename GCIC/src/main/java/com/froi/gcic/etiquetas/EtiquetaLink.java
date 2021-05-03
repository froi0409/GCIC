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
public class EtiquetaLink extends Etiqueta {
    
    private String href;
    
    public EtiquetaLink(ArrayList<Captcha> listaCaptchas, ArrayList<Advertencia> listaErrores) {
        super(listaCaptchas, listaErrores);
        this.href = "http://ingenieria.cunoc.usac.edu.gt/portal/";
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
    
    
}
