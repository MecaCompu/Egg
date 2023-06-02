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
package guia10.ej4_cine;

import Servicios.PeliculaServicios;

import java.util.Scanner;

public class Guia10Ej4_Cine {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        PeliculaServicios ps = new PeliculaServicios();

        ps.crearPelicula();

        int opc = 0;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("1. Mostrar peliculas");
            System.out.println("2. Mostrar lista de peliculas con duracion mayor a 1 hora");
            System.out.println("3. Ver lista de mayor duración a menor");
            System.out.println("4. Ver lista de menor duración a mayor");
            System.out.println("5. Ver lista por Titulo");
            System.out.println("6. Ver lista por Director");
            System.out.println("7. Salir");
            opc = leer.nextInt();

            switch (opc) {
                
                case 1:
                    ps.mostrarPeliculas();
                    break;
                case 2:
                    ps.mostrarPeliculasMayor();
                    break;
                case 3:
                    ps.ordenarMayorMenor();
                    break;
                case 4:
                    ps.ordenarMenorMayor();
                    break;
                case 5:
                    ps.ordenarNombre();
                    break;
                case 6:
                    ps.ordenarDirector();
                    break;
                case 7:
                    System.out.println("Gracias por usar el sistema");
                    break;
                default:
                    System.out.println("Error: la opcion ingresada es inválida");
            }

        } while (opc != 7);
    }

}
