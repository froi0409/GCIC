/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.herramientas;

import com.froi.gcic.entidades.Advertencia;
import com.froi.gcic.gramaticas.etiquetado.EtiquetadoLexer;
import com.froi.gcic.gramaticas.etiquetado.EtiquetadoParser;
import java.io.StringReader;
import java.util.ArrayList;

/**
 *
 * @author froi-pc
 */
public class AnalizadorEtiquetas {
    
    public String analizar(String entrada) {
        String salida = "";
        ArrayList<Advertencia> listaErrores = new ArrayList<>();
        StringReader reader = new StringReader(entrada);
        EtiquetadoLexer lexer = new EtiquetadoLexer(reader);
        EtiquetadoParser parser = new EtiquetadoParser(lexer, listaErrores);
        return salida;
    }
    
}
