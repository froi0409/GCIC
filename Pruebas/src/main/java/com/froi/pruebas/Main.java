/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.pruebas;

import com.froi.pruebas.frames.frame;
import com.froi.pruebas.gramaticas.Dato;
import java.util.Objects;

/**
 *
 * @author froi-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 9);
            System.out.println("Numero: " + num);
        }
        frame ventana = new frame();
        ventana.setVisible(true);
    }
    
} 