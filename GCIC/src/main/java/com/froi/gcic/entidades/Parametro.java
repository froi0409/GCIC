/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.entidades;

/**
 *
 * @author froi-pc
 */
public class Parametro {
    private String nombre;
    private String valor;

    public Parametro() {
        this.nombre = "";
        this.valor = "";
    }
    public Parametro(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
}
