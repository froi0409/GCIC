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
public class TablaDeSimbolos {
    
    private ArrayList<Simbolo> tablaSimbolos;
    public TablaDeSimbolos() {
        this.tablaSimbolos = new ArrayList<>();
    }
    
    /**
     * Método que permite ingresar un símbolo nuevo a la tabla
     * @param simbolo Simbolo que se desea insertar en la tabla
     * @return Retorna true si el símbolo fue insertado con éxto, de lo contario retorna false
     */
    public boolean insertarSimbolo(Simbolo simbolo) {
        for(Simbolo simb : tablaSimbolos) {
            //Detecta si un simbolo ya existe en el procedimiento solicitado dentro de la tabla de simbolos
            if(simbolo.getModo().equals("@global")) {
                if(simb.getIdentificador().equals(simbolo.getIdentificador())) {
                    return false;
                }
            } else if(simb.getIdentificador().equals(simbolo.getIdentificador()) && (simb.getProcedimiento().equals(simbolo.getProcedimiento()) || simb.getModo().equals("@global"))) {
                return false;
            }
        }
        tablaSimbolos.add(simbolo);
        return true;
    }

    public ArrayList<Simbolo> getTablaSimbolos() {
        return tablaSimbolos;
    }
    
    public Dato obtenerDato(String identificador, String procedimiento) {
        for(Simbolo simb : tablaSimbolos) {
            if(simb.getIdentificador().equals(identificador) && simb.getProcedimiento().equals(procedimiento)) {
                if(simb.getValorActual() == null) {
                    return new Dato(TipoDeDato.ERROR, "La variable " + simb.getIdentificador() + " no tiene valor para ser asignado");
                } else {
                    return new Dato(simb.getTipo(), simb.getValorActual());
                }
                
            }
        }
        return new Dato(TipoDeDato.ERROR, "No existe una variable " + identificador + " en el procedimiento " + procedimiento);
        
    }
    
}
