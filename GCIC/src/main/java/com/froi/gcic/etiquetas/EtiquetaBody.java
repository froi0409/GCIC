/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.etiquetas;

import com.froi.gcic.entidades.Advertencia;
import com.froi.gcic.entidades.Captcha;
import com.froi.gcic.entidades.Parametro;
import java.util.ArrayList;

/**
 *
 * @author froi-pc
 */
public class EtiquetaBody extends Etiqueta {

    private String background;
    private ArrayList<Etiqueta> etiquetasBody;
    
    public EtiquetaBody() {
        super();
        this.background = "white";
        etiquetasBody = new ArrayList<>();
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public ArrayList<Etiqueta> getEtiquetasBody() {
        return etiquetasBody;
    }

    public void setEtiquetasBody(ArrayList<Etiqueta> etiquetasBody) {
        this.etiquetasBody = etiquetasBody;
    }

    @Override
    public void setByString(Parametro arg0, ArrayList<Advertencia> arg1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String generarParametros() {
        String codigo = " style=\"background-color: " + background + ";\" ";
        return codigo;
    }
    
    @Override
    public String generarHTML() {
        String codigo = "";
        codigo += "<body " + generarParametros() + ">\n";
        for(Etiqueta element: etiquetasBody) {
            System.out.println(element.generarHTML());
            codigo += element.generarHTML() + "\n";
        }
        codigo += "</body>";
        return codigo;
    }
    
}
