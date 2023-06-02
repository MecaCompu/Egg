/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:

En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.

Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Pelicula> lista = new ArrayList<Pelicula>();

    public void crearPelicula() {

        int opcion = 0;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Ingrese el titulo de la pelicula:");
            String nombre = leer.next();

            System.out.println("Ingrese el nombre del Director:");
            String director = leer.next();

            System.out.println("Ingrese la duracion de la pelicula en horas:");
            double duracion = leer.nextDouble();

            lista.add(new Pelicula(nombre, director, duracion));

            System.out.println("--------------------------------------------------");
            do {
                System.out.println("1. Agregar otra pelicula a la lista");
                System.out.println("2. Continuar");
                opcion = leer.nextInt();

                if (opcion != 1 && opcion != 2) {
                    System.out.println("Error: la opcion ingresada es invalida");
                    System.out.println("Ingrese una de las siguientes opciones");
                }

            } while (opcion != 1 && opcion != 2);
        } while (opcion != 2);
    }

    public void mostrarPeliculas() {

        System.out.println("--------------------------------------------------");
        System.out.println("Lista de peliculas:");

        for (Pelicula pelis : lista) {
            System.out.println("- " + pelis.getTitulo());
        }
    }
   /* 
    public void mostrarPeliculas(){
        
        System.out.println(lista.toString());
    }
*/
    public void mostrarPeliculasMayor() {

        System.out.println("--------------------------------------------------");
        System.out.println("Lista de peliculas que duran más de 1 hora:");

        for (Pelicula pelis : lista) {
            if (pelis.getDuracion() > 1) {
                System.out.println("- " + pelis.getTitulo());
            }
        }
    }

    public void ordenarMayorMenor(){
        
        Comparator<Pelicula> cn1 = Comparator.comparing(Pelicula::getDuracion);
        Collections.sort(lista, cn1);
        Collections.reverse(lista);
        
        for(Pelicula peli: lista){
            System.out.println(peli);
        }
    }
    
    public void ordenarMenorMayor(){
        
        Comparator<Pelicula> cn1 = Comparator.comparing(Pelicula::getDuracion);
        Collections.sort(lista, cn1);
        
        for(Pelicula peli: lista){
            System.out.println(peli);
        }
    }
    
    public void ordenarNombre(){
        
        Comparator<Pelicula> cn1 = Comparator.comparing(Pelicula::getTitulo);
        Collections.sort(lista, cn1);
        
        for(Pelicula peli: lista){
            System.out.println(peli);
        }
    }
    
    public void ordenarDirector(){
        
        Comparator<Pelicula> cn1 = Comparator.comparing(Pelicula::getDirector);
        Collections.sort(lista, cn1);
        
        for(Pelicula peli: lista){
            System.out.println(peli);
        }
    }
}
