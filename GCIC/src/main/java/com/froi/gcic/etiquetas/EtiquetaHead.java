/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.etiquetas;

import java.util.ArrayList;

/**
 *
 * @author froi-pc
 */
public class EtiquetaHead extends Etiqueta {
    
    private ArrayList<Etiqueta> etiquetasHead;
    
    public EtiquetaHead() {
        super();
        etiquetasHead = new ArrayList<>();
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<head>\n";
        for(Etiqueta element: etiquetasHead) {
            codigo += element.generarHTML() + "\n";
        }
        codigo += "</head>";
        return codigo;
    }

    public ArrayList<Etiqueta> getEtiquetasHead() {
        return etiquetasHead;
    }

    public void setEtiquetasHead(ArrayList<Etiqueta> etiquetasHead) {
        this.etiquetasHead = etiquetasHead;
    }
    
    
}
