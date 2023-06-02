/*
 Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Service;

import Entidad.RazaPerros;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RazaPerrosService {

//    public RazaPerrosService() {
//    }

    Scanner leer = new Scanner(System.in);
    ArrayList<RazaPerros> listaRazas = new ArrayList<>();

    //
    public RazaPerros crearRaza() {
        RazaPerros p1 = new RazaPerros();
        System.out.println("Ingresa la raza del perro ");
        p1.setRaza(leer.next());

        return p1;
    }

    public void guardarRaza(RazaPerros p1) {

        listaRazas.add(p1);//se rellena en base al objeto.
    }
    
    public void mostrarRazaPerro(){
        Iterator<RazaPerros> rp = listaRazas.iterator();
        
        while(rp.hasNext()){
            System.out.println(rp.next().getRaza());
        }
    
    }

    public void ingresarRaza() {
        String respuesta = "si";

        do {
            System.out.println("Desea ingresar una raza de perro?(Si/No)");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("si")) {
                guardarRaza(crearRaza());

            }

        } while (respuesta.equalsIgnoreCase("si"));
        //ordenarRaza(listaRazas);
        mostrarRazaPerro();

    }
    
    public void ordenarRaza(ArrayList<String>listaRazas){
        Collections.sort(listaRazas);
        for(String raza:listaRazas){
            System.out.println(raza);
        }
        
//mostrarRazaPerro;
    }
    
    
    public void buscarRaza(){
    
    }
}
