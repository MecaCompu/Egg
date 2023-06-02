/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia4Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar un numero para verificar si es verdadero que es primo(true) o no(false): ");
        int n;
        n = leer.nextInt();
        boolean resultado = esPrimo(n);
        System.out.println(n+ "--->"+esPrimo(n));
        
        
    }
    public static boolean esPrimo(int num) {
        boolean primo = true;
        for (int i=2; i <= num/2; i++) {
            if (num % i == 0) {
        primo = false;
            
        }
    }
    return primo;
    
    } 
}