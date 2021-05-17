/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.etiquetas;

import com.froi.gcic.entidades.Advertencia;
import com.froi.gcic.entidades.Captcha;
import com.froi.gcic.entidades.Parametro;
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
    public void setByString(Parametro parametro, ArrayList<Advertencia> listaErrores) {
        switch(parametro.getNombre()) {
            case "background":
                setBackground(parametro.getValor());
                break;
            case "onClick":
                setOnClick(parametro.getValor());
                break;
            case "font-size":
                setFontSize(parametro.getValor());
                break;
            case "font-family":
                setFontFamily(parametro.getValor());
                break;
            case "text-align":
                setTextAlign(parametro.getValor());
                break;
            case "id":
                setId(parametro.getValor());
                break;
            case "color":
                setColor(parametro.getValor());
                break;
        }
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
        parametros += " background-color: " + background + ";";
        parametros += " color: " + getColor() + ";";
        parametros += " \"";
        return parametros;
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<button" + generarParametros() + ">";
        codigo += getTextoInterno();
        codigo += "</button>";
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
