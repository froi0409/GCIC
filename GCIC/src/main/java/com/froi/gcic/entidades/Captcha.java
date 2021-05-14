/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.entidades;

import com.froi.gcic.etiquetas.EtiquetaGCIC;
import com.froi.gcic.manejodesimbolos.TablaDeSimbolos;
import java.util.ArrayList;

/**
 *
 * @author froi-pc
 */
public class Captcha {
    
    private ArrayList<String> listaProcesos;
    private TablaDeSimbolos tablaSimbolos;
    private String estado;
    
    private EtiquetaGCIC contenidoCaptcha;
    
    public Captcha() {
        this.listaProcesos = new ArrayList<>();
        this.tablaSimbolos = new TablaDeSimbolos();
        this.contenidoCaptcha = new EtiquetaGCIC();
        this.estado = "solicitado";
    }

    public ArrayList<String> getListaProcesos() {
        return listaProcesos;
    }

    public void setListaProcesos(ArrayList<String> listaProcesos) {
        this.listaProcesos = listaProcesos;
    }

    public TablaDeSimbolos getTablaSimbolos() {
        return tablaSimbolos;
    }

    public void setTablaSimbolos(TablaDeSimbolos tablaSimbolos) {
        this.tablaSimbolos = tablaSimbolos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public EtiquetaGCIC getContenidoCaptcha() {
        return contenidoCaptcha;
    }

    public void setContenidoCaptcha(EtiquetaGCIC contenidoCaptcha) {
        this.contenidoCaptcha = contenidoCaptcha;
    }
    
}
