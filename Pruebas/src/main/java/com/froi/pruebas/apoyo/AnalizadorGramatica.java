/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.pruebas.apoyo;

import com.froi.pruebas.gramaticas.Advertencia;
import com.froi.pruebas.gramaticas.EtiquetadoLexer;
import com.froi.pruebas.gramaticas.EtiquetadoParser;
import java.io.StringReader;
import java.util.ArrayList;

/**
 *
 * @author froi-pc
 */
public class AnalizadorGramatica {
    
    public void analizarGramatica(String entrada) {
        ArrayList<Advertencia> listaErrores = new ArrayList<>();
        
        System.out.println(entrada + "\n\nErrores:");
        StringReader reader = new StringReader(entrada);
        EtiquetadoLexer lexer = new EtiquetadoLexer(reader);
        EtiquetadoParser parser = new EtiquetadoParser(lexer, listaErrores);
        try {
            parser.parse();
            if(listaErrores.size() > 0) {
                for(Advertencia error: listaErrores) {
                    System.out.println(error + "\n");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al ejecutar el parser: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
