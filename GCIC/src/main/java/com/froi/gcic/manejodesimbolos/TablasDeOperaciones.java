/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.manejodesimbolos;

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
            {integer, string, decimal, integer, integer, error},
            {string, string, string, string, error, error},
            {decimal, string, decimal, decimal, decimal, error},
            {integer, string, decimal, integer, integer, error},
            {integer, error, decimal, integer, booleano, error},
            {error, error, error, error, error, error, error}
        };
        return suma;
    }
    
    private String[][] inicializarResta() {
        String[][] resta = {
            {integer, error, decimal, integer, integer, error},
            {error, error, error, error, error, error},
            {decimal, error, decimal, decimal, decimal, error},
            {integer, error, decimal, integer, error, error},
            {integer, error, decimal, error, error, error},
            {error, error, error, error, error, error, error}
        };
        return resta;
    }
    
    private String[][] inicializarMultiplicacion() {
        String[][] multiplicacion = {
            {integer, error, decimal, integer, integer, error},
            {error, error, error, error, error, error},
            {decimal, error, decimal, decimal, decimal, error},
            {integer, error, decimal, integer, integer, error},
            {integer, error, decimal, integer, booleano, error},
            {error, error, error, error, error, error, error}
        };
        return multiplicacion;
    }
    
    private String[][] inicializarDivision() {
        String[][]  division = {
            {decimal, error, decimal, decimal, integer, error},
            {error, error, error, error, error, error},
            {decimal, error, decimal, decimal, decimal, error},
            {decimal, error, decimal, decimal, integer, error},
            {decimal, error, decimal, decimal, error, error},
            {error, error, error, error, error, error, error}
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
                int valorDato1 = devolverInteger(dato1);
                int valorDato2 = devolverInteger(dato2);
                Integer dato = valorDato1 + valorDato2;
                valorRetorno = dato.toString();
            } else if(tipoDato.equals(string)) {
                valorRetorno = dato1.getValor() + dato2.getValor();
            } else if(tipoDato.equals(decimal)) {
                double valorDato1 = devolverDecimal(dato1);
                double valorDato2 = devolverDecimal(dato2);
                Double dato = valorDato1 + valorDato2;
                valorRetorno = dato.toString();
            } else if(tipoDato.equals(character)) {
                valorRetorno = null;
            } else if(tipoDato.equals(booleano)) {
                Boolean valorDato1 = devolverBoolean(dato1);
                Boolean valorDato2 = devolverBoolean(dato2);
                Boolean dato = valorDato1 || valorDato2;
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
    
    /**
     * Permite llevar a cabo una resta entre dos datos
     * @param dato1 primer dato a restar
     * @param dato2 segundo dato a restar
     * @return Dato restado (puede devolver un dato de tipo error)
     */
    public Dato restar(Dato dato1, Dato dato2) {
        Dato nuevoDato;
        int fila = buscarPosicion(dato1);
        int columna = buscarPosicion(dato2);
        String tipoDato = tablaResta[fila][columna];
        if(!tipoDato.equals("error")) {
            String valorRetorno;
            if(tipoDato.equals("integer")) {
                int valorDato1 = devolverInteger(dato1);
                int valorDato2 = devolverInteger(dato2);
                Integer dato = valorDato1 - valorDato2;
                valorRetorno = dato.toString();
            } else if(tipoDato.equals("decimal")) {
                double valorDato1 = devolverDecimal(dato1);
                double valorDato2 = devolverDecimal(dato2);
                Double dato = valorDato1 - valorDato2;
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
    
    /**
     * Permite llevar a cabo una multiplicación entre dos datos
     * @param dato1 primer dato a multiplicar
     * @param dato2 segundo dato a multiplicar 
     * @return Dato multiplicado (puede retornar un tipo de dato error)
     */
    public Dato multiplicar(Dato dato1, Dato dato2) {
        Dato nuevoDato;
        int fila = buscarPosicion(dato1);
        int columna = buscarPosicion(dato2);
        String tipoDato = tablaMultiplicacion[fila][columna];
        if(!tipoDato.equals(error)) {
            String valorRetorno;
            if(tipoDato.equals(integer)) {
                int valorDato1 = devolverInteger(dato1);
                int valorDato2 = devolverInteger(dato2);
                Integer dato = valorDato1 * valorDato2;
                valorRetorno = dato.toString();
            } else if(tipoDato.equals(decimal)) {
                double valorDato1 = devolverDecimal(dato1);
                double valorDato2 = devolverDecimal(dato2);
                Double dato = valorDato1 * valorDato2;
                valorRetorno = dato.toString();
            } else if(tipoDato.equals(booleano)) {
                Boolean valorDato1 = devolverBoolean(dato1);
                Boolean valorDato2 = devolverBoolean(dato2);
                Boolean dato = valorDato1 && valorDato2;
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
    
    /**
     * Permite llevar a cabo una división
     * @param dato1 Dividendo - Numerador
     * @param dato2 Divisor - Denominador
     * @return Dato dividido (puede retornar un dato de tipo error)
     */
    public Dato dividir(Dato dato1, Dato dato2) {
        Dato nuevoDato;
        int fila = buscarPosicion(dato1);
        int columna = buscarPosicion(dato2);
        String tipoDato = tablaDivision[fila][columna];
        if(!tipoDato.equals(error)) {
            String valorRetorno;
            if(tipoDato.equals(integer)) {
                int valorDato1 = devolverInteger(dato1);
                int valorDato2 = devolverInteger(dato2);
                if(valorDato2 != 0) {
                    Integer dato = valorDato1 / valorDato2;
                    valorRetorno = dato.toString();
                } else {
                    tipoDato = error;
                    valorRetorno = "División entre 0";
                }
            } else if(tipoDato.equals(decimal)) {
                double valorDato1 = devolverInteger(dato1);
                double valorDato2 = devolverInteger(dato2);
                if(valorDato2 != 0) {
                    Double dato = valorDato1 / valorDato2;
                    valorRetorno = dato.toString();
                } else {
                    tipoDato = error;
                    valorRetorno = "División entre 0";
                }
            } else {
                valorRetorno = null;
            }
            nuevoDato = new Dato(tipoDato, valorRetorno);
        } else {
            nuevoDato = new Dato(error, null);
        }
        return nuevoDato;
    }
    
    /**
     * Permite identificar una operación de menos unario
     * @param dato
     * @return Dato operado (puede devolver un dato de tipo error)
     */
    public Dato menosUnario(Dato dato) {
        Dato nuevoDato;
        if(!dato.getTipo().equals(error)) {
            String valorRetorno;
            if(dato.getTipo().equals(integer)) {
                int valorDato = devolverInteger(dato);
                Integer datoRetornado = valorDato * -1;
                valorRetorno = datoRetornado.toString();
            } else if(dato.getTipo().equals(decimal)) {
                double valorDato = devolverDecimal(dato);
                Double datoRetornado = valorDato * -1;
                valorRetorno = datoRetornado.toString();
            } else {
                valorRetorno = "La operación del menos unario solo es válida para valores integer y decimal";
            }
            nuevoDato = new Dato(dato.getTipo(), valorRetorno);
        } else {
            nuevoDato = new Dato(error, null);
        }
        return nuevoDato;
    }
    
    /*
    public Dato restar(Dato dato1, Dato dato2) {
        
    }
    */
    
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
    
    /**
     * Permite encontrar el valor entero de un dato
     * @param dato
     * @return valor entero del dato
     */
    private int devolverInteger(Dato dato) {
        switch (dato.getTipo()) {
            case "char":
                char caracter = dato.getValor().charAt(0);
                int caracterEntero = caracter;
                return caracterEntero;
            case "boolean":
                if(dato.getValor().equalsIgnoreCase("true")) {
                    return 1;
                } else {
                    return 0;
                }
            default:
                return Integer.parseInt(dato.getValor());
        }
    }
    
    /**
     * Permite encontrar el valor decimal de un dato
     * @param dato
     * @return valor decimal del dato
     */
    private double devolverDecimal(Dato dato) {
        switch(dato.getTipo()) {
            case "decimal":
                return Double.parseDouble(dato.getValor());
            default:
                return devolverInteger(dato);
        }
    }
    
    /**
     * Permite encontrar el valor booleano de un dato
     * @param dato
     * @return Valor booleano del dato, si no es un valor booleano, devuelve null
     */
    private Boolean devolverBoolean(Dato dato) {
        switch(dato.getTipo()) {
            case "integer":
                int numeroInteger = devolverInteger(dato);
                if(numeroInteger == 0) {
                    return false;
                } else if(numeroInteger == 1) {
                    return true;
                } else {
                    return null;
                }
            case "double":
                double numeroDecimal = devolverDecimal(dato);
                if(numeroDecimal == 0) {
                    return false;
                } else if(numeroDecimal == 1) {
                    return true;
                } else {
                    return null;
                }
            default:
                return Boolean.parseBoolean(dato.getValor());                
        }
    }
    
}
