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
        Double dato1 = Double.parseDouble("12.0");
        Double dato2 = Double.parseDouble("12");
        if(dato1 == dato2) {
            System.out.println("si " + dato1 + " " + dato2);
        } else {
            System.out.println("no");
        }
        frame ventana = new frame();
        ventana.setVisible(true);
    }
    
} 