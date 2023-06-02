/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.pkg1;
import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int numero1;
        int numero2;
        int suma;
        
        System.out.println("Ingrese un numero");
        numero1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        numero2 = leer.nextInt();
        
        suma = numero1 + numero2;
        
        System.out.println("El resultado de la Suma es: " +suma);
    }
    
}
