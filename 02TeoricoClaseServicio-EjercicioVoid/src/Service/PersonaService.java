/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Carli
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        Persona objetopersona = new Persona();

        System.out.println("INGRESE NOMBRE");
        objetopersona.setNombre(leer.next());
        System.out.println("INGRESE EDAD");
        objetopersona.setEdad(leer.nextInt());

        return objetopersona;

    }

    public void mostrarPersona(Persona nuevapersona) {

        System.out.println("EDAD " + nuevapersona.getEdad());
        System.out.println("NOMBRE " + nuevapersona.getNombre());

    }

}
