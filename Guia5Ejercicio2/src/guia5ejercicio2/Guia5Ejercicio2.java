/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia5Ejercicio2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int vector[] = new int[10];
        int numero;
        int cantidad=0;
        for (int i=0; i<vector.length ; i++){
        
        vector[i] = (int)(Math.random()*10);
        
        }
        
        System.out.println("Ingrese un numero a buscar");
        numero = leer.nextInt();
        
        for (int i=0; i<vector.length ; i++){
        
            if (vector[i]==numero){
                System.out.println("El numero " +numero +" se encuentra en la posicion " +i);
                cantidad++;
            }
            else {
            
                
            }
        }
        
        if (cantidad>1){
            System.out.println("El numero se repite " +cantidad +" veces");
        }
        
    }
    
}