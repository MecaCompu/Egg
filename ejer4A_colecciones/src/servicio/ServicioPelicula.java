package servicio;
import entidades.EntidadPelicula;
import java.util.ArrayList;
import java.util.Scanner;
/**
 */  
public class ServicioPelicula {

    ArrayList<EntidadPelicula> lista = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPelicula() {
        String var;
        do {
            EntidadPelicula p1 = new EntidadPelicula();
            System.out.println("Ingrese el nombre de la pelicula");
            p1.setTitulo(leer.next());
            System.out.println("Ingrese el nombre del director de la pelicula");
            p1.setDirector(leer.next());
            System.out.println("Ingrese la duraccion de la pelicula");
            p1.setDuracion(leer.nextDouble());

            lista.add(p1);

            System.out.println("Desea ingresar otra pelicula, presione S o N");
            var = leer.next();

        } while (var.equalsIgnoreCase("s"));
    }
//Mostrar en pantalla todas las películas.

    public void mostrar() {
        for (EntidadPelicula aux : lista) {
            System.out.println("Peliculas " + aux);
        }
        System.out.println("---------------------------------");
    }
//Mostrar en pantalla todas las películas con una duración mayor a 1 hora

    public void mostrarMay() {
        for (EntidadPelicula aux : lista) {

            if (aux.getDuracion() > 1) {
                System.out.println("Peliculas " + aux);
            }
            System.out.println("---------------------------------");
        }
    }
//Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.

    public void orden() {
        System.out.println("**duracion de mayor a menor** ");
        lista.sort(EntidadPelicula.compararaDuracion);
        mostrar();
    }
//Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla. 

    public void ordenMenAMay() {
        System.out.println("**duracion de menor a mayor**");
        lista.sort(EntidadPelicula.compararaDuracion.reversed());
        mostrar();
    }
    //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    
    public void tituloAlf() {
        System.out.println("**peliculas por orden alfabetico**");
        lista.sort(EntidadPelicula.compararaTitulo);
        mostrar();   
}
    //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    
    public void directorAlf() {
        System.out.println("**director por orden alfabetico**");
        lista.sort(EntidadPelicula.compararaDirector);
        mostrar();
    }
}  
    
    
    
    


