/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia4Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingrese 2 numeros");
        Scanner leer = new Scanner(System.in);
        double numA, numB;
        numA = leer.nextDouble();
        numB = leer.nextDouble();
        double resultado;
        
        int opcion;
        
        
        do{         
            System.out.println("Que operacion desea hacer");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opcion: ");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1:
                        System.out.println("El resultado de la suma es: "+ suma(numA, numB));
                case 2:
                    
                        System.out.println("El resultado de la suma es: "+ resta(numA, numB));
                case 3:
                    
                        System.out.println("El resultado de la suma es: "+ multi(numA, numB));
                case 4:
                    
                        System.out.println("El resultado de la suma es: "+ div(numA, numB));
                case 5:
                    break;
                            
                //double resultado = suma(num1, num2);
            }
        
   
   
    
    //funcion suma
    public static double suma(double a, double b) {
        double resultado = a + b;
        return resultado;
    }
    //funcion resta
    public static double resta(double a, double b) {
        double resultado = a - b;
        return resultado;
    }   
    //funcion multi
    public static double multi(double a, double b) {
        double resultado = a * b;
        return resultado;
    }
    //funcion div
    public static double div(double a, double b) {
        double resultado = a / b;
        return resultado;
    }    
    
}
