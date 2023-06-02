/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3ejercicio6;

/**
 *
 * @author Soporte
 */
public class Guia3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, menu;
        String respuesta = "N";
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese dos numeros");

        num1 = leer.nextInt();
        num2 = leer.nextInt();

        do {
            System.out.println("Menu\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Salir\n Elija una opcion");
            menu = leer.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("la suma de amnos numeros " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("la resta de ambos numeros " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("la multiplicación de ambos numeros es" + (num1 * num2));
                    break;
                case 4:
                    System.out.println("la división de ambos numeros es " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("desea salir? s/n ");
                    respuesta = leer.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.println("fin del programa");
                    }
                    break;
            }
          default: 
          { 
    while (!("s".equals(respuesta))); 
    

         }
    }
    
}
