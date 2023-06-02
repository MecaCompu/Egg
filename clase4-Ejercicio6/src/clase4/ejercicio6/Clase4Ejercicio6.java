/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4_ejercicio6;

import java.util.Scanner;

public class Clase4_Ejercicio6 {

    /**
     * Implementar un programa que le pida dos números enteros al usuario y 
     * determine si ambos o alguno de ellos es mayor a 25.

     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int numero1;
        int numero2;
        
        System.out.println("Ingrese el primer numero");
        numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = leer.nextInt();
        
        if ((numero1 >25)&&(numero2>25)) {
            System.out.println("Ambos numeros son mayor a 25");}
            else if (numero1 >25){
                    System.out.println("El numero 1 es mayor a 25");}
            else if (numero2 >25){
                    System.out.println("El numero 2 es mayor a 25");}
            else{
                System.out.println("Ningun numero es mayor a 25");
            }
                  
   
    }
  
}
/**
 *
 * @author Soporte
 */
public class Clase4Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
