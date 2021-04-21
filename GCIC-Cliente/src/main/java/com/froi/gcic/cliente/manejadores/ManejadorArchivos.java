/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.froi.gcic.cliente.manejadores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Clase que sirve para el manejo de archivos dentro de la aplicación
 * @author froi-pc
 */
public class ManejadorArchivos {
    
    /**
     * Método que sirve para detectar si el archivo seleccionado ha sufrido cambios
     * @param path path del archivo a verificar
     * @param entrada texto del ide
     * @return retorna true si el archivo ha sufrido cambios. Retorna false si el archivo no ha sufrido cambios
     */
    public boolean verificarCambios(String path, String entrada) {
        //Si el path es una cadena vacía, es porque no hay un archivo creado
        if(!path.equals("")) {
            try(BufferedReader reader = new BufferedReader(new FileReader(new File(path)))) {
                String codigoCompleto = "";
                String lineaActual;
                while((lineaActual = reader.readLine()) != null) {
                    codigoCompleto += lineaActual + "\n";
                }
                if(codigoCompleto.equals(entrada)) {
                    return false;
                } else {
                    return true;
                }
            } catch (Exception e) {
                System.out.println("Error al leer archivo de entrada: " + e.getMessage());
            }
        } else {
            return true;
        }
        
        return true;
    }
    
    /**
     * Método que sobreescribe un archivo en la ruta establecida, con la información de una cadena 
     * @param path path del archivo a sobreescribir
     * @param entrada cadena de texto que se sobreescribirá
     * @return retorna true si el archivo fue sobreescrito con éxito, de lo contrario retorna false
     */
    public boolean guardarArchivo(String path, String entrada) {
        try(BufferedWriter reader = new BufferedWriter(new FileWriter(new File(path)))) {
            reader.write(entrada);
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Obtiene el path que tendrá un archivo al ser guardado
     * @param framePrincipal JFrame en el que se está trabajando
     * @return String que contiene el path del archivo seleccionado. Si no se selecciona ningún archivo se retorna null
     */
    public String obtenerPathGuardado(JFrame framePrincipal) {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.gcic", "gcic");
        fc.setFileFilter(filtro);
        //fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int respuesta = fc.showSaveDialog(framePrincipal);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            //Crear un objeto File con el archivo elegido
            File archivoElegido = fc.getSelectedFile();
            //Mostrar el nombre del archvivo en un campo de texto
            return archivoElegido.getAbsolutePath() + ".gcic";
        }
        return null;
    }
    
    /**
     * btiene el path que tiene un archivo que será abierto
     * @param framePrincipal JFrame en el que se está trabajando
     * @return String que contiene el path del archivo seleccionado. Si no se selecciona ningún archivo se retorna null
     */
    public String obtenerPathAbrir(JFrame framePrincipal) {
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.gcic", "gcic");
        fc.setFileFilter(filtro);
        //fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int respuesta = fc.showOpenDialog(framePrincipal);
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            //Crear un objeto File con el archivo elegido
            File archivoElegido = fc.getSelectedFile();
            //Mostrar el nombre del archvivo en un campo de texto
            return archivoElegido.getAbsolutePath();
        }
        return null;
    }
    
    /**
     * Permite llenar la entrada con el texto que contiene un archivo
     * @param path Path del archivo que se utilizará
     * @return String que contiene el texto de un archivo
     */
    public String obtenerTextoArchivo(String path) {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(path)))) {
            String codigoCompleto = "";
            String lineaActual;
            while((lineaActual = reader.readLine()) != null) {
                codigoCompleto += lineaActual + "\n";
            }
            return codigoCompleto;
        } catch (Exception e) {
            System.out.println("Error al leer archivo de entrada: " + e.getMessage());
            return null;
        }
    }
    
}
