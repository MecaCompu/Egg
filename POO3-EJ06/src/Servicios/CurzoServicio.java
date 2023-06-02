// Un profesor particular está dando cursos para grupos de cinco alumnos
// y necesita un programa para organizar la información de cada curso.
// Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
// serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
// turno (mañana o tarde),  precioPorHora y alumnos. Donde alumnos es un
// arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
// nombres de cada alumno. A continuación, se implementarán los
// siguientes métodos:
// a) Un constructor por defecto.
// b) Un constructor con todos los atributos como parámetro.
// c) Métodos getters y setters de cada atributo.
// d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
// los alumnos que asisten a las clases. Nosotros nos encargaremos de
// almacenar esta información en un arreglo e iterar con un bucle, 
// solicitando en cada repetición que se ingrese el nombre de cada
// alumno.
// e) Método crearCurso(): el método crear curso, le pide los valores de
// los atributos al usuario y después se le asignan a sus respectivos
// atributos para llenar el objeto Curso. En este método invocamos al
// método cargarAlumnos() para asignarle valor al atributo alumnos
// f) Método calcularGananciaSemanal(): este método se encarga de
// calcular la ganancia en una semana por curso. Para ello, se deben
// multiplicar la cantidad de horas por día, el precio por hora, la 
// cantidad de alumnos y la cantidad de días a la semana que se repite
// el encuentro.
package Servicios;

import Entidades.Curzo;
import java.util.Scanner;

public class CurzoServicio {
    Scanner sc = new Scanner(System.in);
    Scanner sci = new Scanner(System.in);
    Curzo c = new Curzo();
    
    public String [] CargarAlumnos(){
        String [] alumno = new String[5];
        int n = 0;
        System.out.println("Ingrese los nombre de los 5 alumnos");
        for (int i = 0; i < alumno.length; i++) {
            n = n + 1;
            System.out.print(n + "-");
            alumno[i] = sc.nextLine();
            c.setAlumno(alumno);
        }
        return alumno;
    }
    
    /**
     *
     * @return
     */
    public Curzo crearCurzo(){
        System.out.println("Nombre del curzo");
        String nombreCurzo = sc.nextLine();
        System.out.println("Cantidad de hora por dia");
        int horaPorDia = sci.nextInt();
        System.out.println("Cantidad de dia por semana");
        int diasPorSemana = sci.nextInt();
        System.out.println("Turno (mañana o tarde)");
        String turno = sc.nextLine();
        System.out.println("Precio por hora");
        int precioPorHora = sci.nextInt();
        return new Curzo(nombreCurzo, horaPorDia, diasPorSemana, turno, precioPorHora);
    }
    
    public void ganaciaSemanal(){
        int horaPorDia = c.getHoraPorDia();
        System.out.println(horaPorDia); 
        int precioPorHora = c.getPrecioPorHora();
        System.out.println(precioPorHora);
        String [] alumno = c.getAlumno();
        System.out.println(alumno.length);
        int diasPorSemana = c.getDiasPorSemana();
         System.out.println(diasPorSemana);
        int ganancia = horaPorDia * precioPorHora * alumno.length * diasPorSemana;
        System.out.println("La ganancia semanas es de: " + ganancia);
    }
    /*
    public void mostrarAlumnos(){
        String [] alumno = c.getAlumno();
        int n = 0;
        for (int i = 0; i < 5; i++) {
            n = n +1;
            System.out.println(n + "-" + alumno [i]);
        }*/
    
    }

