/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.herramientas;

import com.froi.gcic.entidades.Captcha;
import com.froi.gcic.gramaticas.almacenamiento.GuardadoLexer;
import com.froi.gcic.gramaticas.almacenamiento.GuardadoParser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringReader;
import java.util.ArrayList;

/**
 *
 * @author froi-pc
 */
public class ManejadorBD {
    
    /**
     * Permite sobreescribir el archivo que contiene la información de loss captchas
     * @param listaCaptchas 
     */
    public void guardarCaptchas(ArrayList<Captcha> listaCaptchas) {
        String pathGuardado = "Captchas/informacion.gcici";
        String codigoGuardado = "";
        int cont = 0;
        codigoGuardado += "db.captchas (\n";
        for(Captcha element: listaCaptchas) {
            if(cont > 0) {
                codigoGuardado += ",\n";
            }
            codigoGuardado += "{\n";
            codigoGuardado += "\"ID\" : " + "\"" + element.getId() + "\",\n";
            codigoGuardado += "\"NOMBRE\" : " + "\"" + element.getName() + "\",\n";
            codigoGuardado += "\"LINK\" : " + "\"" + element.getLink() + "\",\n";
            codigoGuardado += "\"PATH\" : " + "\"" + element.getPath() + "\",\n";
            codigoGuardado += "\"CANTUSOS\" : " + "\"" + element.getCantidadUsos() + "\",\n";
            codigoGuardado += "\"ACIERTOS\" : " + "\"" + element.getAciertos() + "\",\n";
            codigoGuardado += "\"FALLOS\" : " + "\"" + element.getFallos() + "\"\n";
            codigoGuardado += "}";
            cont++;
        }
        codigoGuardado += "\n)\n";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(pathGuardado)))) {
            writer.write(codigoGuardado);
        } catch (Exception e) {
            System.err.println("Error al guardar la información de los captchas... " + e.getMessage());
        }
    }
    
    /**
     * Permite recuperar la información de los captchas que están en el archivo de almacenamiento
     * @param listaCaptchas 
     */
    public void recuperarCaptchas(ArrayList<Captcha> listaCaptchas) {
        String codigoProvisional;
        String codigo = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("Captchas/informacion.gcici")))) {
            while((codigoProvisional = reader.readLine()) != null) {
                codigo += codigoProvisional + "\n";
            }
        } catch (Exception e) {
            System.err.println("Error al leer archivo de almacenamiento: " + e.getMessage());
        }
        System.out.println(codigo);
        StringReader reader = new StringReader(codigo);
        GuardadoLexer guardadoLexer = new GuardadoLexer(reader);
        GuardadoParser guardadoParser = new GuardadoParser(guardadoLexer, listaCaptchas);
        try {
            guardadoParser.parse();
        } catch (Exception e) {
            System.err.println("Error al parsear el archivo de almacenamiento: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
}
