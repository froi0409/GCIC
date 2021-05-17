/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.herramientas;

import com.froi.gcic.entidades.Captcha;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author froi-pc
 */
public class ManejadorBD {
    
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
            codigoGuardado += "\"FALLOS\" : " + "\"" + element.getFallos() + "\",\n";
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
    
    public void recuperarCaptchas(ArrayList<Captcha> listaCaptchass) {
        
    }
    
}
