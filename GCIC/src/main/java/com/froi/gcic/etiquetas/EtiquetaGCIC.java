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
public class EtiquetaGCIC extends Etiqueta {
    
    private String id;
    private String name;
    
    private ArrayList<Etiqueta> listaEtiquetas;
    
    public EtiquetaGCIC() {
        this.id = generarId();
        this.listaEtiquetas = new ArrayList<>();
    }
    
    public String generarName() {
        String name = "";
        return name;
    }

    @Override
    public void setByString(Parametro parametro, ArrayList<Advertencia> listaErrores) {
        switch(parametro.getNombre()) {
            case "id":
                setId(parametro.getValor());
                break;
            case "name":
                setName(parametro.getValor());
                break;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Etiqueta> getListaEtiquetas() {
        return listaEtiquetas;
    }

    public void setListaEtiquetas(ArrayList<Etiqueta> listaEtiquetas) {
        this.listaEtiquetas = listaEtiquetas;
    }
    
}
