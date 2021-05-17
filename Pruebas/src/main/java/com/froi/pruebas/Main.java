/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.pruebas;

import com.froi.pruebas.frames.frame;
import com.froi.pruebas.gramaticas.Dato;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/**
 *
 * @author froi-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        String hola = "123.45";
        String[] decimales;
        decimales = hola.split(Pattern.quote("."));
        for(String elem: decimales) {
            System.out.println(elem);
        }
        frame ventana = new frame();
        ventana.setVisible(true);
    }
    
} 