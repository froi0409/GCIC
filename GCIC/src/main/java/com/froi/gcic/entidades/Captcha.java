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
    private String id;
    private String name;
    private String link;
    private String path;
    private String linkRedirect;
    private String fecha;
    private int cantidadUsos;
    private int aciertos;
    private int fallos;
    
    public Captcha() {
        this.listaProcesos = new ArrayList<>();
        this.tablaSimbolos = new TablaDeSimbolos();
        this.linkRedirect = "http://ingenieria.cunoc.usac.edu.gt/portal/";
        this.fecha = "-";
        this.cantidadUsos = 0;
        this.aciertos = 0;
        this.fallos = 0;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getCantidadUsos() {
        return cantidadUsos;
    }

    public void setCantidadUsos(int cantidadUsos) {
        this.cantidadUsos = cantidadUsos;
    }
    
    public void aumentarUsos() {
        this.cantidadUsos++;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public String getLinkRedirect() {
        return linkRedirect;
    }

    public void setLinkRedirect(String linkRedirect) {
        this.linkRedirect = linkRedirect;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
