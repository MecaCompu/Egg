/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ejercicio2.pkg1;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia4Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String des;
        Scanner leer = new Scanner(System.in);
        

        do {
            personas();
            System.out.println("desea seguir ingresando personas: si/no");
            des = leer.next();
        } while (! des.equals("no"));
    }
    public static void personas() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre: ");
        String nom = leer.nextLine();
        System.out.println("ingrese la edad:");
        int edad = leer.nextInt();
        System.out.println("La persona se llama " + nom + " y su edad es: " + edad);
        if (edad >= 18) {
            System.out.println("es mayor de edad");


        } else {
            System.out.println(" es menor de edad");
        }
    

    }

 }