/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Clase5Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
       while (frase != "eureka"){
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto");
        }
        else {
               System.out.println("Incorecto");
               System.out.println("Ingrese una frase, nuevamente");
               frase = leer.nextLine();
               }
       break;
       }
        }
    }
    
