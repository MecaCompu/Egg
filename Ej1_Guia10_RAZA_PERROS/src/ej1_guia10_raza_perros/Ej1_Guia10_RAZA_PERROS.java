/*
  Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package ej1_guia10_raza_perros;



import Service.RazaPerrosService;

public class Ej1_Guia10_RAZA_PERROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RazaPerrosService rps = new RazaPerrosService();
        rps.ingresarRaza();
        
        
        
       
    }
    
}
