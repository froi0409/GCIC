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
public class Simbolo {
    private String identificador;
    private String tipo;
    private String valorActual;
    private String modo;
    private String procedimiento;
    private int numeroEjecucion;

    public Simbolo(String identificador, String tipo, String valorActual, String modo, String procedimiento) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.valorActual = valorActual;
        this.modo = modo;
        this.procedimiento = procedimiento;
        this.numeroEjecucion = 1;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValorActual() {
        return valorActual;
    }

    public void setValorActual(String valorActual) {
        this.valorActual = valorActual;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public int getNumeroEjecucion() {
        return numeroEjecucion;
    }

    public void setNumeroEjecucion(int numeroEjecucion) {
        this.numeroEjecucion = numeroEjecucion;
    }
    
    @Override
    public String toString() {
        return "Identificador: " + identificador + ". Tipo: " + tipo + ". Valor Actual: " + valorActual + ". Modo: " + modo + ". Procedimiento: " + procedimiento + ". No.ejecucion: " + numeroEjecucion;
    }
    
}