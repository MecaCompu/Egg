/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        String Nombre;
        
        System.out.println("Ingrese su Nombre");
        Nombre = leer.nextLine();
        
        System.out.println("el nombre ingresado es: " + Nombre);
    }
    
}