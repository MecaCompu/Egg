/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Guia5Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        
        int[][] matriz = new int[3][3];
       
           for(int i=0; i< 3; i++ ){
               for(int j=0; j<3; j++){
                System.out.println("ingrese un numero dejando la diagonal principal en 0  ");
                num = read.nextInt();
                       
                        matriz[i][j]=num;

               }
               
           }
for(int i=0; i< 3; i++ ){
               for(int j=0; j<3; j++){
                   System.out.print(matriz[i][j] + " ");
               }
            System.out.println("");
       }
System.out.println("ingreso a transpuesta Matriz");
        
        
         int[][] invertirM = new int[3][3];
            for(int  i=0; i <3; i++){
                for(int j=0; j<3; j++){
                invertirM[i][j]=matriz[j][i];
                System.out.print(  invertirM[i][j] + " ");

                    }
                System.out.println("");
                }
int cont=0;
        System.out.println("ingreseo a comprobar si la matriz es antisimetrica");
        for(int k=0 ; k < 3 ; k++){
            for(int l=0; l< 3; l++){
                
                if (matriz[k][l] + invertirM[k][l]==0 ){
                    cont ++;
                    
                }
            
            
            }
        
        }
        if(cont ==9){
                System.out.println("la matriz en antisimétrica");
        }else{
            System.out.println("no es anti simetrica");
        }
    }
}
////fin