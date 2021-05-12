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
public class EtiquetaButton extends EtiquetaTextual {

    private String background;
    private String onClick;
    
    public EtiquetaButton() {
        super();
        this.background = "white";
        this.onClick = "";
    }

    @Override
    public String generarParametros() {
        String parametros = "";
        parametros += " id=\"" + getId() + "\"";
        if(onClick.length() > 0) {
            parametros += " onClick=\"" + onClick + "\"";
        }
        parametros += " style=\"";
        parametros += " font-size: " + getFontSize() + ";";
        parametros += " font-family: " + getFontFamily() + ";";
        parametros += " text-align: " + getTextAlign() + ";";
        parametros += " backgroung-color: " + background + ";";
        parametros += " color: " + getColor() + ";";
        parametros += " \"";
        return parametros;
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<button" + generarParametros() + ">";
        return codigo;
    }
    
    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }
    
}
