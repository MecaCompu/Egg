//Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.

package guia5ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia5Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     int vector[] = new int[100];
          
     for (int i = 0; i < 100; i++) {
     vector[i]=i;
     }
      for (int j = 99; j >= 0; j--) {
               System.out.println(vector[j]);
               
               
            }
    }
}
        