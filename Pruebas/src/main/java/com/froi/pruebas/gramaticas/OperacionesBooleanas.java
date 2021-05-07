/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.pruebas.gramaticas;

import java.util.Objects;

/**
 *
 * @author froi-pc
 */
public class OperacionesBooleanas extends TablasDeOperaciones {
    
    private String integer = TipoDeDato.INTEGER;
    private String string = TipoDeDato.STRING;
    private String decimal = TipoDeDato.DECIMAL;
    private String character = TipoDeDato.CHAR;
    private String booleano = TipoDeDato.BOOLEAN;
    private String error = TipoDeDato.ERROR;

    public OperacionesBooleanas() {
        super();
    }
    
    /**
     * Permite verificar si dos datos son iguales
     * @param dato1 Dato 1
     * @param dato2 Dato 2
     * @return Retorna un Dato de tipo booleano o error
     */
    public Dato igualIgual(Dato dato1, Dato dato2) {
        Dato nuevoDato = null;
        if(isNumerico(dato1, dato2)) {
            Double valorDato1 = Double.parseDouble(dato1.getValor());
            Double valorDato2 = Double.parseDouble(dato2.getValor());
            if(Objects.equals(valorDato1, valorDato2)) {
                nuevoDato = new Dato(booleano, "true");
            } else {
                nuevoDato = new Dato(booleano, "false");
            }
        } else if(tiposIguales(dato1, dato2)) {
            if(dato1.getValor().equals(dato2.getValor())) {
                nuevoDato = new Dato(booleano, "true");
            } else {
                nuevoDato = new Dato(booleano, "false");
            }
        } else {
            nuevoDato = new Dato(error, "Datos no compatibles para ser operados");
        }
        return nuevoDato;
    }
    
    /**
     * Permite verificar si dos datos son diferentes
     * @param dato1 Dato 1
     * @param dato2 Dato 2
     * @return Retorna un Dato de tipo booleano o error
     */
    public Dato diferenteIgual(Dato dato1, Dato dato2) {
        Dato nuevoDato = null;
        if(isNumerico(dato1, dato2)) {
            Double valorDato1 = Double.parseDouble(dato1.getValor());
            Double valorDato2 = Double.parseDouble(dato2.getValor());
            if(!Objects.equals(valorDato1, valorDato2)) {
                nuevoDato = new Dato(booleano, "true");
            } else {
                nuevoDato = new Dato(booleano, "false");
            }
        } else if(tiposIguales(dato1, dato2)) {
            if(!dato1.getValor().equals(dato2.getValor())) {
                nuevoDato = new Dato(booleano, "true");
            } else {
                nuevoDato = new Dato(booleano, "false");
            }
        } else {
            nuevoDato = new Dato(error, "Datos no compatibles para ser operados");
        }
        return nuevoDato;
    }
    
    /**
     * Permite verificar si un dato es mayor que otro dato
     * @param dato1 Dato 1
     * @param dato2 Dato 2
     * @return Retorna un dato de tipo booleano o error.
     */
    public Dato mayorQue(Dato dato1, Dato dato2) {
        Dato nuevoDato = null;
        if(isNumerico(dato1, dato2)) {
            Double valorDato1 = Double.parseDouble(dato1.getValor());
            Double valorDato2 = Double.parseDouble(dato2.getValor());
            if(valorDato1 > valorDato2) {
                nuevoDato = new Dato(booleano, "true");
            } else {
                nuevoDato = new Dato(booleano, "false");
            }
        } else {
            nuevoDato = new Dato(error, "El operador > solo puede ser utilizado para comparar datos numéricos");
        }
        return nuevoDato;
    }
    
    /**
     * Permite verificar si un dato es menos que otro dato
     * @param dato1
     * @param dato2
     * @return Retorna un dato de tipo booleano o error
     */
    public Dato menorQue(Dato dato1, Dato dato2) {
        Dato nuevoDato = null;
        if(isNumerico(dato1, dato2)) {
            Double valorDato1 = Double.parseDouble(dato1.getValor());
            Double valorDato2 = Double.parseDouble(dato2.getValor());
            if(valorDato1 < valorDato2) {
                nuevoDato = new Dato(booleano, "true");
            } else {
                nuevoDato = new Dato(booleano, "false");
            }
        } else {
            nuevoDato = new Dato(error, "El operador < solo puede ser utilizado para comparar datos numéricos");
        }
        return nuevoDato;
    }
    
    /**
     * Permite verificar si un dato es mayor o igual que otro dato
     * @param dato1 Dato 1
     * @param dato2 Dato 2
     * @return Retorna un dato de tipo booleano o error
     */
    public Dato mayorIgual(Dato dato1, Dato dato2) {
        Dato nuevoDato = null;
        if(isNumerico(dato1, dato2)) {
            Double valorDato1 = Double.parseDouble(dato1.getValor());
            Double valorDato2 = Double.parseDouble(dato2.getValor());
            if(valorDato1 >= valorDato2) {
                nuevoDato = new Dato(booleano, "true");
            } else {
                nuevoDato = new Dato(booleano, "false");
            }
        } else {
            nuevoDato = new Dato(error, "El operador >= solo puede ser utilizado para comparar datos numéricos");
        }
        return nuevoDato;
    }
    
    /**
     * Permite verificar si un dato es menor o igual que otro dato
     * @param dato1 Dato 1
     * @param dato2 Dato 2
     * @return Retorna un dato de tipo booleano o error
     */
    public Dato menorIgual(Dato dato1, Dato dato2) {
        Dato nuevoDato = null;
        if(isNumerico(dato1, dato2)) {
            Double valorDato1 = Double.parseDouble(dato1.getValor());
            Double valorDato2 = Double.parseDouble(dato2.getValor());
            if(valorDato1 <= valorDato2) {
                nuevoDato = new Dato(booleano, "true");
            } else {
                nuevoDato = new Dato(booleano, "false");
            }
        } else {
            nuevoDato = new Dato(error, "El operador <= solo puede ser utilizado para comparar datos numéricos");
        }
        return nuevoDato = null;
    }
    
    /**
     * Permite cambiar el valor de un Dato booleano por su opuesto
     * @param dato Dato
     * @return Dato de tipo booleano o error
     */
    public Dato not(Dato dato) {
        Dato nuevoDato = null;
        if(dato.getTipo().equals(booleano)) {
            if(dato.getValor().equalsIgnoreCase("true")) {
                nuevoDato = new Dato(booleano, "false");
            } else {
                nuevoDato = new Dato(booleano, "true");
            }
        } else {
            nuevoDato = new Dato(error, "El operador ! solo puede ser asignado a un dato de tipo booleano");
        }
        return nuevoDato;
    }
    
    /**
     * Permite comparar dos Datos de timpo booleano a través de un AND
     * @param dato1 Dato 1
     * @param dato2 Dato 2
     * @return Dato de tipo booleano o error
     */
    public Dato and(Dato dato1, Dato dato2) {
        Dato nuevoDato = null;
        if(isBooleano(dato1, dato2)) {
            Boolean valorDato1 = Boolean.parseBoolean(dato1.getValor());
            Boolean valorDato2 = Boolean.parseBoolean(dato2.getValor());
            if(valorDato1 && valorDato2) {
                nuevoDato = new Dato(booleano, "true");
            } else {
                nuevoDato = new Dato(booleano, "false");
            }
        } else {
            nuevoDato = new Dato(error, "El operador && solo puede comparar a dos datos de tipo booleano");
        }
        return nuevoDato;
    }
    
    /**
     * Permite comparar dos Datos de tipo booleano a través de un OR
     * @param dato1 Dato 1
     * @param dato2 Dato 2
     * @return Dato de tipo booleano o error
     */
    public Dato or(Dato dato1, Dato dato2) {
        Dato nuevoDato = null;
        if(isBooleano(dato1, dato2)) {
            Boolean valorDato1 = Boolean.parseBoolean(dato1.getValor());
            Boolean valorDato2 = Boolean.parseBoolean(dato2.getValor());
            if(valorDato1 || valorDato2) {
                nuevoDato = new Dato(booleano, "true");
            } else {
                nuevoDato = new Dato(booleano, "false");
            }
        } else {
            nuevoDato = new Dato(error, "El operador && solo puede comparar a dos datos de tipo booleano");
        }
        return nuevoDato;
    }
    
    /**
     * Permite identificar si ambos datos son de tipo numerico
     * @param dato1 Dato 1
     * @param dato2 Dato 2
     * @return true si ambos datos son de tipo numérico, de lo contrario retorna false
     */
    public boolean isNumerico(Dato dato1, Dato dato2) {
        boolean bandera = true;
        //Detectamos si el dato 1 es un dao no munérico
        if(!dato1.getTipo().equals(integer) && !dato1.getTipo().equals(decimal)) {
             bandera = false;
        }
        if(!dato2.getTipo().equals(integer) && !dato2.getTipo().equals(decimal)) {
            bandera = false;
        }
        return bandera;
    }
    
    /**
     * Permite identificar si ambos datos son de tipo booleano
     * @param dato1 Dato 1
     * @param dato2 Dato 2
     * @return true si ambos datos son de tipo booleano, de lo contrario retorna false
     */
    public boolean isBooleano(Dato dato1, Dato dato2) {
        boolean bandera = true;
        if(!dato1.getTipo().equals(booleano)) {
            bandera = false;
        }
        if(dato2.getTipo().equals(booleano)) {
            bandera = false;
        }
        return false;
    }
    
    /**
     * Permite identificar si ambos datos son del mismo tipo
     * @param dato1 Dato 1
     * @param dato2 Dato 2
     * @return True si ambos datos son del mismo tipo, de lo contrario retorna false
     */
    public boolean tiposIguales(Dato dato1, Dato dato2) {
        if(dato1.getTipo().equals(dato2.getTipo())) {
            return true;
        } else {
            return false;
        }
    }
    
}
