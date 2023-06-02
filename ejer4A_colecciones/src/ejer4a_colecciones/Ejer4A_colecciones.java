package ejer4a_colecciones;
import servicio.ServicioPelicula;
/**un cine necesita implementar un sistema en el que se  puedan cargar peliculas
 * Para esto, tendremos una clase Pelicula con el titulo, director y duracion
 * de la pelicula (en hora).Implemente las clases y metodos necesarios para esta 
 * situacion, teniendo en cuenta lo que se pide a continuacion.
 * En el servicio deberemos tener un bucle que crea un objeto  Pelicula pidiendole
 * al usuario todos sus datos y guardandolos en el objeto pelicula.
 * Despues esa pelicula se guarda una lista de peliculas y se le pregunta al 
 * usuario si quiere crear otra pelicula o no.
 * Despues de ese bucle realizaremos las siguientes acciones:
 * Mostrar en pantalla todas las peliculas.
 * Mostrar en pantalla todas las peliculas con una duracion mayor a 1 hora.
 * Ordenar las peliculas de acuerdo a su duracion(mayor a menor) y mostrarlo en
 * pantalla.
 * Ordenar las peliculas de acuerdo a su duracion (de menor a mayor) y mostrarlo
 * en pantalla.
 * Ordenar las peliculas por titulo, alfabeticamente y mostrarlo por pantalla
 * Ordenar las peliculas por director, alfabeticamente y mostrarlo por 
 * pantalla.
 *
 */
public class Ejer4A_colecciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        ServicioPelicula sp = new ServicioPelicula();

        sp.crearPelicula();
        sp.mostrar();
        sp.mostrarMay();
        sp.orden();
        sp.ordenMenAMay();
        sp.tituloAlf();
        sp.directorAlf();    
    }
    }
    

