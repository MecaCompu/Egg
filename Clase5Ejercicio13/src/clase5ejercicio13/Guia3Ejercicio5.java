/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5ejercicio13;
import java.util.Scanner;
        
/**
 *
 * @author Soporte
 */
public class Guia3Ejercicio5 {
    
}
public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.nextLine();
        
        
        /*while(frase.toUpperCase(frase.charAt (0)) == 'A'){
 ...
 ...
 ...
}*/
       /* while (frase.substring(0, 1) != a || (frase.substring(0, 1) != "A") ) {
            System.out.println("Ingrese una frase nuevamente");
            frase = leer.nextLine();
        //break;
        }*/
        /*if (frase.substring(0, 1).equalsIgnoreCase(frase) == 'A'{
        
            System.out.println("CORRECTO!");
         
        }*/
       /* while (Character.toUpperCase(frase.charAt(0)) != 'A') {
            System.out.println("Incorrecto, ingrese otra palabra");
            frase = leer.nextLine();
            //break;
            
        }
        System.out.println("Correcto");*/
       
        if (frase.substring(0, 1).equalsIgnoreCase("A")) {
            System.out.println("CORRECTO!");
            
        } else {
            System.out.println("Incorrecto, ingrese una frase nuevamente");
            frase = leer.nextLine();
        }
        
    
        

}