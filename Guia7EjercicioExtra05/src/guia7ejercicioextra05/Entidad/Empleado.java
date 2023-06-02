/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ejercicioextra05.Entidad;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Empleado {
    //Atributos
    private String nombre;
    private int edad;
    private double salario;
    public Empleado crearEmpleado;
    
    //Constructores

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    //Metodos
    //public String crearEmpleado(Empleado){}   forma de crear metodo fijo que devuelve un valor
    
    public void crearEmpleado(){
    
        //crear nuevo objeto
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); //lee hasta un ENTER
        System.out.println("Ingrese el nombre del empleado");
        setNombre(leer.next());
        System.out.println("Ingrese la edad");
        setEdad(leer.nextInt());
        System.out.println("Ingrese el salario");
        setSalario(leer.nextDouble());
    }
  
    public void calcular_aumento(){
        
        if (getEdad() >= 30) {
            this.salario = salario*1.1;
            System.out.println("El nuevo salario de "+getNombre()+" es: "+getSalario());
            
        }else {
            this.salario = salario*1.05;
            System.out.println("El nuevo salario de "+getNombre()+" es: "+getSalario());
            }

    }
    
    
}
