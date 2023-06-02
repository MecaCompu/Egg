/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ejercicio1.pkg1;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia4Ejercicio11 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);
        double a, b, resultado;
        int opcion;
        char  confirmacion;

        System.out.println("Ingrese el primer numero");
        a = leer.nextDouble();
        System.out.println("Ingrese el segundo numero");
        b = leer.nextDouble();

        do {
            System.out.println("-----------MENU------------");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");

            System.out.println("Ingrese la opcion deseada: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (resultado = sumar(a, b)));
                    break;
                case 2:
                    resultado = restar(a, b);
                    System.out.println("La resta es: " + resultado);
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + multi(a, b));
                    break;
                case 4:
                    resultado = div(a, b);
                    System.out.println("La division es: " + resultado);
                    break;

                case 5:
                    System.out.println("Esta seuguro que desea abandonar el programa, S/N? ");
                    confirmacion = leer.next().charAt(0);
                    if (confirmacion.equalsIgnoreCase() = 's') {
                        System.out.println("Saliendo del programa.");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("NO EXISTE");

            }
        } while (opcion <= 4);

    }

    public static double sumar(double a, double b) {
        double suma = a + b;
        return suma;
    }

    public static double restar(double a, double b) {
        double resta = a - b;
        return resta;
    }

    public static double multi(double a, double b) {
        double multiplica = a * b;
        return multiplica;
    }

    public static double div(double a, double b) {
        double dividido = a / b;
        return dividido;
    }

}