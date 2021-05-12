/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.etiquetas;

import com.froi.gcic.entidades.Advertencia;
import com.froi.gcic.entidades.Captcha;
import java.util.ArrayList;

/**
 *
 * @author froi-pc
 */
public class EtiquetaDiv extends EtiquetaTextual {

    private String clase;
    private String background;
    
    public EtiquetaDiv() {
        this.clase = "row";
        this.background = "white";
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }
    
}
