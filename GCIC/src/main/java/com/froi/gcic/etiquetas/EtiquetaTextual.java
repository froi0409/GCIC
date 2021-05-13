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
public class EtiquetaTextual extends Etiqueta {
    
    private String fontSize;
    private String fontFamily;
    private String textAlign;
    private String id;
    private String color;
    
    public EtiquetaTextual() {
        this.fontSize = "12";
        this.fontFamily = "";
        this.textAlign = "left";
        this.id = generarId();
        this.color = "black";
    }

    
    @Override
    public void setByString(Parametro parametro, ArrayList<Advertencia> listaErrores) {
        switch(parametro.getNombre()) {
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
    
    public String generarParametros() {
        String parametros = "";
        parametros += " id=\"" + id + "\"";
        parametros += " style=\"";
        parametros += " font-size: " + fontSize + ";";
        parametros += " font-family: " + fontFamily + ";";
        parametros += " text-align: " + textAlign + ";";
        parametros += " color: " + color + ";";
        parametros += " \"";
        return parametros;
    }
    
    @Override
    public String generarHTML() {
        String codigo = ""; 
        return codigo;
    }
    
    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getTextAlign() {
        return textAlign;
    }

    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
