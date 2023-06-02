/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author Soporte
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Circunferencia c1 = new Circunferencia();
        
        System.out.println("ingre radio de la circunferencia");
        c1.creaCircunferencia(leer.nextDouble());
        
        System.out.println("el radio de la circunferncia es" + c1.getRadio());
        
        
        
    }
    }
    
}
