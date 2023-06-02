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
package servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    List<Alumno> lista = new ArrayList<Alumno>();

    public void crearAlumno() {

        int opcion = 0;

        do {

            Alumno alumnoObjeto = new Alumno();
            ArrayList<Integer> notasLocal = new ArrayList<>();

            System.out.println("Ingrese el nombre:");
            alumnoObjeto.setNombre(leer.next());

            for (int i = 1; i < 4; i++) {
                System.out.println("Ingrese la nota #" + i);
                notasLocal.add(leer.nextInt());
            }
            alumnoObjeto.setNotas(notasLocal);

            lista.add(alumnoObjeto);

            do {
                System.out.println("-------------------------------------------");
                System.out.println("1. Agregar otro alumno");
                System.out.println("2. Ver nota final");
                opcion = leer.nextInt();
                leer.nextLine();

                if (opcion != 1 && opcion != 2) {
                    System.out.println("-------------------------------------------");
                    System.out.println("Error: opcion invalida!");
                    System.out.println("Ingrese una opcion valida");
                }
            } while (opcion != 1 && opcion != 2);
        } while (opcion != 2);

    }

    public double notaFinal() {
        double notaFinal = 0;

        System.out.println("-------------------------------------------");

        System.out.println("Ingrese el nombre del alumno para ver su nota final:");
        String name = leer.nextLine();

        for (Alumno alumno : lista) {
            if (alumno.getNombre().equalsIgnoreCase(name)) {
                for (int nota : alumno.getNotas()) {
                    notaFinal += nota;
                }
            }
        }

        return (notaFinal / 3);
    }
}
