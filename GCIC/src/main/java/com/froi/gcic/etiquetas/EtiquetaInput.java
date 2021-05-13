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
public class EtiquetaInput extends EtiquetaTextual {

    private String type;
    
    public EtiquetaInput() {
        super();
        this.type = "text";
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
            case "type":
                setType(parametro.getValor());
                break;
        }
    }
    
    @Override
    public String generarParametros() {
        String parametros = "";
        parametros += " id=\"" + getId() + "\"";
        parametros += " type=\"" + type + "\"" + "\"";
        parametros += " style=\"";
        parametros += " font-size: " + getFontSize() + ";";
        parametros += " font-family: " + getFontFamily() + ";";
        parametros += " text-align: " + getTextAlign() + ";";
        parametros += " color: " + getColor() + ";";
        parametros += " \"";
        return parametros;
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<input" + generarParametros() + "/>";
        return codigo;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
