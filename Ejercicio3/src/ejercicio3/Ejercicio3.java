/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import static java.lang.Character.toUpperCase;
import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
       
        System.out.println("La frase en Mayúsculas: " +frase.toUpperCase());
        
        
        System.out.println("La frase en Mayúsculas: " +frase.toLowerCase());
        
    }
    
}
