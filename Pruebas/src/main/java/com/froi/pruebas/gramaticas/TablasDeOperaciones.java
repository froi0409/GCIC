/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.pruebas.gramaticas;

/**
 *
 * @author froi-pc
 */
public class TablasDeOperaciones {
    
    private String[][] tablaSuma;
    private String[][] tablaResta;
    private String[][] tablaMultiplicacion;
    private String[][] tablaDivision;
    
    private String integer = TipoDeDato.INTEGER;
    private String string = TipoDeDato.STRING;
    private String decimal = TipoDeDato.DECIMAL;
    private String character = TipoDeDato.CHAR;
    private String booleano = TipoDeDato.BOOLEAN;
    private String error = TipoDeDato.ERROR;
    
    public TablasDeOperaciones() {
        this.tablaSuma = inicializarSuma();
        this.tablaResta = inicializarResta();
        this.tablaMultiplicacion = inicializarMultiplicacion();
        this.tablaDivision = inicializarDivision();
    }
    
    private String[][] inicializarSuma() {
        String[][] suma = {
            {integer, string, decimal, integer, integer},
            {string, string, string, string, error},
            {decimal, string, decimal, decimal, decimal},
            {integer, string, decimal, integer, integer},
            {integer, error, decimal, integer, booleano}
        };
        return suma;
    }
    
    private String[][] inicializarResta() {
        String[][] resta = {
            {integer, error, decimal, integer, integer},
            {error, error, error, error, error},
            {decimal, error, decimal, decimal, decimal},
            {integer, error, decimal, integer, error},
            {integer, error, decimal, error, error}
        };
        return resta;
    }
    
    private String[][] inicializarMultiplicacion() {
        String[][] multiplicacion = {
            {integer, error, decimal, integer, integer},
            {error, error, error, error, error},
            {decimal, error, decimal, decimal, decimal},
            {integer, error, decimal, integer, integer},
            {integer, error, decimal, integer, booleano} 
        };
        return multiplicacion;
    }
    
    private String[][] inicializarDivision() {
        String[][]  division = {
            {decimal, error, decimal, decimal, integer},
            {error, error, error, error, error},
            {decimal, error, decimal, decimal, decimal},
            {decimal, error, decimal, decimal, integer},
            {decimal, error, decimal, decimal, error}
        };
        return division;
    }
    
    /**
     * Permite llevar a cabo una suma entre dos datos
     * @param dato1 primer dato a sumar
     * @param dato2 segundo dato a sumar
     * @return Dato sumado (puede retornar un Dato de tipo error)
     */
    public Dato sumar(Dato dato1, Dato dato2) {
        Dato nuevoDato;
        int fila = buscarPosicion(dato1);
        int columna = buscarPosicion(dato2);
        String tipoDato = tablaSuma[fila][columna];
        if(!tipoDato.equals(error)) {
            String valorRetorno;
            if(tipoDato.equals(integer)) {
                Integer dato = Integer.parseInt(dato1.getValor()) + Integer.parseInt(dato2.getValor());
                valorRetorno = dato.toString();
            } else if(tipoDato.equals(string)) {
                valorRetorno = dato1.getValor() + dato2.getValor();
            } else if(tipoDato.equals(decimal)) {
                Double dato = Double.parseDouble(dato1.getValor()) + Double.parseDouble(dato2.getValor());
                valorRetorno = dato.toString();
            } else if(tipoDato.equals(character)) {
                valorRetorno = null;
            } else if(tipoDato.equals(booleano)) {
                Boolean dato = Boolean.parseBoolean(dato1.getValor()) || Boolean.parseBoolean(dato2.getValor());
                valorRetorno = dato.toString();
            } else {
                valorRetorno = null;
            }
            nuevoDato = new Dato(tipoDato, valorRetorno);
        } else {
            nuevoDato = new Dato(error, null);
        }
        return nuevoDato;
    }
    
    private int buscarPosicion(Dato dato) {
        String tipoDeDato = dato.getTipo();
        if(tipoDeDato.equals(integer)) {
            return 0;
        } else if(tipoDeDato.equals(string)) {
            return 1;
        } else if(tipoDeDato.equals(decimal)) {
            return 2;
        } else if(tipoDeDato.equals(character)) {
            return 3;
        } else if(tipoDeDato.equals(booleano)) {
            return 4;
        } else if(tipoDeDato.equals(error)) {
            return 5;
        } else {
            return -1;
        }
    }
    
}
