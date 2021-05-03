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
public class EtiquetaGCIC extends Etiqueta {
    
    private String id;
    private String name;
    
    public EtiquetaGCIC(ArrayList<Captcha> listaCaptchas, ArrayList<Advertencia> listaErrores) {
        super(listaCaptchas, listaErrores);
        this.id = generarId();
    }
    
    public String generarName() {
        String name = "";
        return name;
    }
    
}
