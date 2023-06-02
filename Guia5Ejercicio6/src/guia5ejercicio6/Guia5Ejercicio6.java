/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia5Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner read = new Scanner(System.in);
        int num;
        
        int fila =0;
        int columna =0;
        int diagonal= 0;
        
        int[][] matriz = new int[3][3];
           for(int i=0; i< 3; i++ ){
               for(int j=0; j<3; j++){
                System.out.println("ingrese 1 al 9  : "); //llena matriz
                num = read.nextInt();
                    matriz[i][j]=num;
                     }
             }
        for(int i=0; i< 3; i++ ){
               for(int j=0; j<3; j++){
                   System.out.print(matriz[i][j] + " "); //imprime matriz
                                 }
            System.out.println("");
            }
        for(int i=0; i< 3; i++ ){
               for(int j=0; j<3; j++){
              
               fila = fila + matriz[0][i];    //suma una fila
               columna = columna + matriz[i][0];//suma una columna
               diagonal= diagonal + matriz[i][i];//suma una diagonal
             }
        }
        if(fila ==columna && columna==diagonal){
           System.out.println("es un cuadrado mágico");
        }else{
           System.out.println("No es cuadrado magico");
       }
    }
//fin
    
}
