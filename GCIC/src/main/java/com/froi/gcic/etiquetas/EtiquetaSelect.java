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
public class EtiquetaSelect extends EtiquetaTextual {

    private ArrayList<EtiquetaOption> opciones;
    
    public EtiquetaSelect() {
        super();
        opciones = new ArrayList<>();
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<select" + generarParametros() + ">\n";
        for(EtiquetaOption element: opciones) {
            codigo += element.generarHTML() + "\n";
        }
        codigo += "</select>";
        return codigo;
    }

    public ArrayList<EtiquetaOption> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<EtiquetaOption> opciones) {
        this.opciones = opciones;
    }
    
}
