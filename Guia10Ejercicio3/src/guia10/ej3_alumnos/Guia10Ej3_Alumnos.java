/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.

En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package guia10.ej3_alumnos;

import servicio.AlumnoService;
import java.util.Scanner;

public class Guia10Ej3_Alumnos {

    public static void main(String[] args) {

        AlumnoService as = new AlumnoService();
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        as.crearAlumno();

        do {
            double nota = as.notaFinal();

            if (nota > 0) {
                System.out.println("La nota final es: " + nota);
            } else {
                System.out.println("El nombre ingresado no se encuentra en la lista de alumnos");
            }

            do {
                System.out.println("-------------------------------------------");
                System.out.println("1. Ver la nota final de otro alumno");
                System.out.println("2. Salir");
                opcion = leer.nextInt();
                leer.nextLine();

                if (opcion != 1 && opcion != 2) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Error: opcion invalida");
                    System.out.println("Ingrese nuevamente una opcion");
                }
            } while (opcion != 1 && opcion != 2);
        } while (opcion != 2);
    }
}
