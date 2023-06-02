/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejejrcicio5;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia3Ejejrcicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero límite");
        int limite = leer.nextInt();
        int num;
        int suma = 0;
       // int cont = 0;
        while(suma < limite){
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            suma = suma + num;
          //  cont++;
            //break;
        }
        
        System.out.println("La suma de los números introducidos es: " + suma);  
    }
    }
    

