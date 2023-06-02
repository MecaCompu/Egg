/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5.ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia5Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       String[] equipo = new String[10];
       
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Ingrese el nombre del participante n° " + i);
            
            equipo[i] = leer.nextLine();
            
            
        }
       
        for (int i = 0; i < 10; i++) {
        
            System.out.println(equipo[i]);
            
        }
        
       
        
    }
}
