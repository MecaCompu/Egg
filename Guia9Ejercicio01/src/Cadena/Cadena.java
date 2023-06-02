/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadena;

/**
 *
 * @author Soporte
 */
public class Cadena {
//    Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    
    private String frase;
    private String longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public String getLongitud() {
        return longitud;
    }
    
    
}

