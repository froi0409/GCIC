/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.pruebas.apoyo;

import com.froi.pruebas.gramaticas.EtiquetadoLexer;
import com.froi.pruebas.gramaticas.EtiquetadoParser;
import java.io.StringReader;

/**
 *
 * @author froi-pc
 */
public class AnalizadorGramatica {
    
    public void analizarGramatica(String entrada) {
        System.out.println(entrada);
        StringReader reader = new StringReader(entrada);
        EtiquetadoLexer lexer = new EtiquetadoLexer(reader);
        EtiquetadoParser parser = new EtiquetadoParser(lexer);
        try {
            parser.parse();
        } catch (Exception e) {
            System.out.println("Error al ejecutar el parser: " + e.getMessage());
        }
    }
    
}
