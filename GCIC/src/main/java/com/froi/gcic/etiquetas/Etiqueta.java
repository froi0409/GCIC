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
public class Etiqueta {
    
    private String textoInterno;
    private ArrayList<Etiqueta> etiquetasInternas;
    
    public Etiqueta() {
        this.textoInterno = "";
        this.etiquetasInternas = new ArrayList<>();
    }
    
    public String generarId() {
        String id = "";
        return id;
    }
    
    public void setByString(Parametro parametro, ArrayList<Advertencia> listaErrores){
        
    }
    
    public String generarHTML() {
        return "";
    }

    public String getTextoInterno() {
        return textoInterno;
    }

    public void setTextoInterno(String textoInterno) {
        this.textoInterno = textoInterno;
    }

    public ArrayList<Etiqueta> getEtiquetasInternas() {
        return etiquetasInternas;
    }

    public void setEtiquetasInternas(ArrayList<Etiqueta> etiquetasInternas) {
        this.etiquetasInternas = etiquetasInternas;
    }
    
}
