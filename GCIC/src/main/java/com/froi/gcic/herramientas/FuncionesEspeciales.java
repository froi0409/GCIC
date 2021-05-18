/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.herramientas;

import com.froi.gcic.manejodesimbolos.Dato;
import com.froi.gcic.manejodesimbolos.TipoDeDato;

/**
 *
 * @author froi-pc
 */
public class FuncionesEspeciales {
    
    private String integer = TipoDeDato.INTEGER;
    private String string = TipoDeDato.STRING;
    private String decimal = TipoDeDato.DECIMAL;
    private String character = TipoDeDato.CHAR;
    private String booleano = TipoDeDato.BOOLEAN;
    private String error = TipoDeDato.ERROR;
    
    /**
     * Ordena el valor de un dato de tipo string de manera ascendente
     * @param dato
     * @return 
     */
    public Dato asc(Dato dato) {
        Dato nuevoDato;
        if(dato.getTipo().equals(string)) {
            if(dato.getValor() != null) {
                char[] array = dato.getValor().toCharArray();
                char aux;
                for(int i = 0; i < array.length - 1; i++) {
                    for(int j = 0; j < array.length - 1; i++) {
                        if(array[j+1] < array[j]) {
                            aux = array[j+1];
                            array[j+1] = array[j];
                            array[j] = aux;
                        }
                    }
                }
                String cadenaOrdenada = "";
                for(char element : array) {
                    cadenaOrdenada += element;
                }
                nuevoDato = new Dato(string, cadenaOrdenada);
                System.out.println("Cadena ordenada ascendentemente: " + cadenaOrdenada);
            } else {
                nuevoDato = new Dato(error, "La variable no tiene un valor asignado");
            }
        } else {
            nuevoDato = new Dato(error, "La funcion ASC solo puede recibir parametros de tipo string");
        }
        return nuevoDato;
    }
    
    /**
     * Ordena el valor de un dato de tipo string de manera descendente
     * @param dato
     * @return 
     */
    public Dato desc(Dato dato) {
        Dato nuevoDato;
        if(dato.getTipo().equals(string)) {
            if(dato.getValor() != null) {
                char[] array = dato.getValor().toCharArray();
                char aux;
                for(int i = 0; i < array.length - 1; i++) {
                    for(int j = 0; j < array.length - 1; i++) {
                        if(array[j+1] > array[j]) {
                            aux = array[j+1];
                            array[j+1] = array[j];
                            array[j] = aux;
                        }
                    }
                }
                String cadenaOrdenada = "";
                for(char element : array) {
                    cadenaOrdenada += element;
                }
                nuevoDato = new Dato(string, cadenaOrdenada);
                System.out.println("Cadena ordenada ascendentemente: " + cadenaOrdenada);
            } else {
                nuevoDato = new Dato(error, "La variable no tiene un valor asignado");
            }
        } else {
            nuevoDato = new Dato(error, "La funcion ASC solo puede recibir parametros de tipo string");
        }
        return nuevoDato;
    }
    
    /**
     * codifica las letras pares de la palabra a su equivalente en ascci y la retorna como string
     * @param dato
     * @return 
     */
    public Dato letparNum(Dato dato) {
        Dato nuevoDato;
        if(dato.getTipo().equals(string)) {
            if(dato.getValor() != null) {
                char[] array = dato.getValor().toCharArray();
                String cadenaHecha = "";
                for(int i = 1; i <= array.length; i++) {
                    if(i % 2 == 0) {
                        int caracter = array[i-1];
                        cadenaHecha += caracter;
                    } else {
                        cadenaHecha += array[i-1];
                    }
                }
                nuevoDato = new Dato(string, cadenaHecha);
            } else {
                nuevoDato = new Dato(error, "La variable no tiene un valor asignado");
            }
        } else {
            nuevoDato = new Dato(error, "La funcion solo puede recibir parametros de tipo string");
        }
        return nuevoDato;
    }
    
    /**
     * codifica las letras impares de la palabra a su equivalente en ascci y la retorna como string
     * @param dato
     * @return 
     */
    public Dato letimparNum(Dato dato) {
        Dato nuevoDato;
        if(dato.getTipo().equals(string)) {
            if(dato.getValor() != null) {
                char[] array = dato.getValor().toCharArray();
                String cadenaHecha = "";
                for(int i = 1; i <= array.length; i++) {
                    if(i % 2 == 0) {
                        cadenaHecha += array[i-1];
                    } else {
                        int caracter = array[i-1];
                        cadenaHecha += caracter;
                    }
                }
                nuevoDato = new Dato(string, cadenaHecha);
            } else {
                nuevoDato = new Dato(error, "La variable no tiene un valor asignado");
            }
        } else {
            nuevoDato = new Dato(error, "La funcion solo puede recibir parametros de tipo string");
        }
        return nuevoDato;
    }
    
    
    public Dato reverse(Dato dato) {
        Dato nuevoDato;
        if(dato.getTipo().equals(string)) {
            if(dato.getValor() != null) {
                char[] array = dato.getValor().toCharArray();
                String cadenaHecha = "";
                for(int i = array.length - 1; i >= 0; i--) {
                    cadenaHecha += array[i];
                }
                nuevoDato = new Dato(string, cadenaHecha);
            } else {
                nuevoDato = new Dato(error, "La variable no tiene un valor asignado");
            }
        } else {
            nuevoDato = new Dato(error, "La funcion solo puede recibir parametros de tipo string");
        }
        return nuevoDato;
    }
    
    /**
     * Permite obtener un caracter aleatorio
     * @return Dato de tipo char que contiene como valor un caracter aleatorio
     */
    public Dato caracterAleatorio() {
        int rnd = (int) (Math.random() * 52);
        char base = (rnd < 26) ? 'A' : 'a';
        char caracter = (char) (base + rnd % 26);
        String caracterRetornado = "" + caracter;
        return new Dato(character, caracterRetornado);
    }
    
    /**
     * Permite obtener un numero aleatorio entre 0 y 9
     * @return Dato de tipo integer que contiene como valor un numero aleatorio entre 0 y 9
     */
    public Dato numAleatorio() {
        int num = (int) (Math.random() * 9);
        String numero = "" + num;
        return new Dato(integer, numero);
    }
    
}
