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
public class EtiquetaDiv extends EtiquetaTextual {

    private String clase;
    private String background;
    
    public EtiquetaDiv() {
        super();
        this.clase = "row";
        this.background = "white";
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
    
    @Override
    public void setByString(Parametro parametro, ArrayList<Advertencia> listaErrores) {
        switch(parametro.getNombre()) {
            case "class":
                setClase(parametro.getValor());
                break;
            case "background":
                setBackground(parametro.getValor());
                break;
        }
    }
    
    @Override
    public String generarParametros() {
        String parametros = "";
        parametros += " class=\"" + clase + "\"";
        parametros += " style=\" background-color: " + background + ";\"";
        return parametros;
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<div" + generarParametros() + ">\n";
        for(Etiqueta element: getEtiquetasInternas()) {
            codigo += element.generarHTML() + "\n";
        }
        codigo += "</div>";
        return codigo;
    }
    
}
