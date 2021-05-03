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
public class EtiquetaImg extends Etiqueta {

    private String src;
    private String width;
    private String height;
    private String alt;
    private String id;
    
    public EtiquetaImg(ArrayList<Captcha> listaCaptchas, ArrayList<Advertencia> listaErrores) {
        super(listaCaptchas, listaErrores);
        this.src = "https://www.universidadesonline.com.gt/logos/original/logo-centro-universitario-de-occidente.png";
        this.width = "30px";
        this.height = "30px";
        this.alt = "Logotipo";
        this.id = generarId();
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
