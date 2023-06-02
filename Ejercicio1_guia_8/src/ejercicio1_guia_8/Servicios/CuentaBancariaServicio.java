
package ejercicio1_guia_8.Servicios;

import ejercicio1_guia_8.Entidades.CuentaBancaria;
import java.util.Scanner;


public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //private double saldo;

    public CuentaBancaria crearcuenta() {
        System.out.println("ingrece el numero de cuenta:");
        int numCuenta = leer.nextInt();

        System.out.println("ingrece el numero de DNI del cliente:");
        long dniCliente = leer.nextInt();

        System.out.println("ingrece el saldo de la cuenta:");
        double saldo = leer.nextInt();

        CuentaBancaria c1 = new CuentaBancaria(numCuenta, dniCliente, saldo);
        return c1;
    }

    public double ingresar(CuentaBancaria c1) {

        double saldoing;

        System.out.println("Ingrece el saldo a ingresar");

        saldoing = leer.nextDouble();

        c1.setSaldo(c1.getSaldo() + saldoing);

        return c1.getSaldo();

    }

    public double retirar(CuentaBancaria c1) {

        System.out.println("ingrece el monto a retirar de la cuenta:");
        double montrerar = leer.nextDouble();

        if (c1.getSaldo() > montrerar) {
            c1.setSaldo(c1.getSaldo() - montrerar);
        } else {
            System.out.println("el monto a rerirar exece al disponible");
            System.out.println("retira" + c1.getSaldo());

            c1.setSaldo(0);
            System.out.println("su saldo es cero");
        }

        return c1.getSaldo();
    }

    public void conultarSaldo(CuentaBancaria c1) {
        System.out.println("El saldo es " + c1.getSaldo());

    }
    // Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.

    public void extracioRapida(CuentaBancaria c1) {

        System.out.println("Por esta via solo puede retirar como maximo $" + c1.getSaldo());
        System.out.println("ingrce el monto a retirar:");
        double retiro = leer.nextDouble();

        if (retiro <= (c1.getSaldo() * 0.2)) {

            c1.setSaldo(c1.getSaldo() - retiro);
        } else {
            System.out.println("no se puede procesar el retiro");
        }
    }

    public void consultarDatos(CuentaBancaria c1) {
        System.out.println("El numero de cuenta es: " + c1.getNumCuenta());
        System.out.println("El DNI del cliente es: " + c1.getDniCliente());
    }

}
