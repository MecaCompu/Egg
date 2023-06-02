
package ejercicio1_guia_8;

import ejercicio1_guia_8.Entidades.CuentaBancaria;
import ejercicio1_guia_8.Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes 
atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:

Método para crear cuenta pidiéndole los datos al usuario.

Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.

Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.

Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.

Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.

Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

*/

public class Ejercicio1_guia_8 {

    
    public static void main(String[] args) {
        Scanner keer = new Scanner(System.in);
        
        CuentaBancariaServicio cm = new CuentaBancariaServicio();

        CuentaBancaria c2 = cm.crearcuenta();

        int var = 0;

        while (var != 6) {
            System.out.println("Ingrece una opcion:");
            System.out.println("====================");
            System.out.println("1: Ingresar dinero");
            System.out.println("====================");
            System.out.println("2: Retirar dinero");
            System.out.println("====================");
            System.out.println("3: Extracion rapida");
            System.out.println("====================");
            System.out.println("4: Consultar saldo");
            System.out.println("====================");
            System.out.println("5: Consultar datos");
            System.out.println("====================");
            System.out.println("6: Salir");
            var = keer.nextInt();
            switch (var) {
                case 1:
                    cm.ingresar(c2);
                    break;
                case 2:
                    cm.retirar(c2);
                    break;
                case 3:
                    cm.extracioRapida(c2);
                    break;
                case 4:
                    cm.conultarSaldo(c2);
                    break;
                case 5:
                    cm.consultarDatos(c2);
                    break;
                case 6:
                    System.out.println("gracias por usar el programa");
                    break;
                default:
                    System.out.println("la obcion no es valida");
            }

        }

    }

}
