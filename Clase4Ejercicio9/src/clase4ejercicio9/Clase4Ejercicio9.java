/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4ejercicio9;
import  java.util.Scanner;
/**
 *
 * @author Soporte
 */
public class Clase4Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Escriba un programa que lea 20 números. 
        *Si el número leído es igual a cero se debe salir del bucle y mostrar el 
        *mensaje "Se capturó el numero cero".  El programa deberá calcular y 
        *mostrar el resultado de la suma de los números leídos, pero si el 
        *número es negativo no debe sumarse. Nota: recordar el uso de la 
        *sentencia break.*/
        
        Scanner leer = new Scanner(System.in);
        int numero;
        int contador, suma;
        
        contador = 0;
        suma = 0;
        
        
        System.out.println("ingrese un numero ");
        numero=leer.nextInt();
        
        do {
            if (numero <=0) {
                System.out.println("Se capturó el numero cero");
                break;
                    } else {suma = (suma + numero);
                    contador++;
            } while (contador < 20)
                System.out.println("La suma de los numero ingresados es: "+suma);
            }
        
    }
    
}
