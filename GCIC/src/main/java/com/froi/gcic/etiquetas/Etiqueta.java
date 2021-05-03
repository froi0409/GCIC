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
public class Etiqueta {
    
    private ArrayList<Captcha> listaCaptchas;
    private ArrayList<Advertencia> listaErrores;
    
    public Etiqueta(ArrayList<Captcha> listaCaptchas, ArrayList<Advertencia> listaErrores) {
        this.listaCaptchas = listaCaptchas;
        this.listaErrores = listaErrores;
    }

    public ArrayList<Captcha> getListaCaptchas() {
        return listaCaptchas;
    }

    public ArrayList<Advertencia> getListaErrores() {
        return listaErrores;
    }
    
    public String generarId() {
        String id = "";
        return id;
    }
    
}
