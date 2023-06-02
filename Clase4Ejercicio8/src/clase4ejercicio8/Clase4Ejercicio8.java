/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4ejercicio8;
import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Clase4Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
      int nota;
        System.out.println("ingrese una nota ");
        nota=leer.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("Ingrese nuevamente la nota ");
            nota = leer.nextInt();            
        }
        System.out.println("El valor de la nota es: " + nota);
    }
    
}
