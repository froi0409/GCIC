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
public class EtiquetaTextarea extends EtiquetaTextual {

    private String cols;
    private String rows;
    
    public EtiquetaTextarea() {
        super();
        this.cols = "20";
        this.rows = "3";
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
            case "cols":
                setCols(parametro.getValor());
                break;
            case "rows":
                setRows(parametro.getValor());
                break;
        }
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<textarea" + generarParametros() + ">" + "</textarea>";
        return codigo;
    }   

    public String getCols() {
        return cols;
    }

    public void setCols(String cols) {
        this.cols = cols;
    }

    public String getRows() {
        return rows;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }
    
}
