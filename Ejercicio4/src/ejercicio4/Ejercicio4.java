/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        float Celsius;
        float grados;
        
        System.out.println("Ingrese temperatura");
        Celsius = leer.nextFloat();
        
        grados = 32 + (9*Celsius/5);
        
        System.out.println("La temperatura en Fahrenheit es: " + grados);
    }
    
}
