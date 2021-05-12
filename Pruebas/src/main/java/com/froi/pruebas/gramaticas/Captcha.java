/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.pruebas.gramaticas;

import java.util.ArrayList;

/**
 *
 * @author froi-pc
 */
public class Captcha {
    
    private ArrayList<String> listaProcesos;
    private TablaDeSimbolos tablaSimbolos;
    
    public Captcha() {
        this.listaProcesos = new ArrayList<>();
        this.tablaSimbolos = new TablaDeSimbolos();
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
    
}
