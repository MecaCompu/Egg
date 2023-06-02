/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4ejercicioextra04.Entidades;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Cuenta {
    //Atributos
    private double saldo;
    private String titular;
    
    //Constructores

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    //getter y setter

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    //metodo retirar_dinero
    public void retirar_dinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuánto dinero desea retirar?");
        double monto = leer.nextDouble();
        if (monto <= getSaldo()) { 
            this.saldo = saldo-monto;
            System.out.println("El saldo de su cuenta es: "+getSaldo());
            
        }else {
            System.out.println("El monto seleccionado es mayor al saldo en cuenta");
        }
    
    }
    public void crear_cuenta() {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese nombre del titular de la cuenta: ");
        setTitular(leer.next());
        System.out.println("Su saldo mínimo debe ser de 500 U$d");
        setSaldo(leer.nextDouble());
        
    }
}

