/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios 
   y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
   denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package guia5ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia5Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] matriz = new int [4] [4];
        int [] [] matrizT = new int [4] [4];
       Scanner leer = new Scanner(System.in);
        //Cargar matriz manualmente
        //int [] [] matriz = new int [3] [3];
        
        //matriz [1] [1] = 1;
        //matriz [1] [2] = 0;
        //matriz [1] [3] = 4;
        
        //matriz [2] [1] = 0;
        //matriz [2] [2] = 5;
        //matriz [2] [3] = 0;
        
        //matriz [3] [1] = 1;
        //matriz [3] [2] = 2;
        //matriz [3] [3] = 3;
        
        //Ingresar
      //Asigno valores mediante el For
    for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.println("Ingrese un numero");
    matriz [i][j] = leer.nextInt();
        }
   }
    
    // Muestro la matriz
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
           	matrizT [j][i] = matriz [i][j];
         }
        }
    
     //Muestra matriz transpuesta
       System.out.println("");
       for (int i =0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
          System.out.print("[" + matrizT[i][j] + "]");
      }
      System.out.println(""); //Salto de linea
    	}
       
    }
}

1
