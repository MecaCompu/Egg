
import Entidades.Persona;
import Service.PersonaService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Carli
 */
public class MainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        PersonaService P1 = new PersonaService();

        
        //muestra una persona
        Persona P2 = P1.crearPersona();

        P1.mostrarPersona(P2);

        //muestra otra persona
        Persona P3 = P1.crearPersona();

        P1.mostrarPersona(P3);

    }

}
