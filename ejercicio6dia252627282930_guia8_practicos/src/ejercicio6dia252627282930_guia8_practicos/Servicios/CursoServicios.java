/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6dia252627282930_guia8_practicos.Servicios;

import ejercicio6dia252627282930_guia8_practicos.Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author Lautaro
 * 
 * Un profesor particular está dando cursos para grupos de cinco alumnos y 
 * necesita un programa para organizar la información de cada curso. Para ello, 
 * crearemos una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, 
 * cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
 * precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de 
 * dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. A 
 * continuación, se implementarán los siguientes métodos:
 * Un constructor por defecto.
 * Un constructor con todos los atributos como parámetro.
 * Métodos getters y setters de cada atributo.
 * 
 * Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
 * alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar 
 * esta información en un arreglo e iterar con un bucle, solicitando en cada 
 * repetición que se ingrese el nombre de cada alumno.
 * 
 * Método crearCurso(): el método crear curso, le pide los valores de los 
 * atributos al usuario y después se le asignan a sus respectivos atributos 
 * para llenar el objeto Curso. En este método invocamos al método 
 * cargarAlumnos() para asignarle valor al atributo alumnos
 * 
 * Método calcularGananciaSemanal(): este método se encarga de calcular la 
 * ganancia en una semana por curso. Para ello, se deben multiplicar la 
 * cantidad de horas por día, el precio por hora, la cantidad de alumnos y 
 * la cantidad de días a la semana que se repite el encuentro.
 * 
 * 
 */
public class CursoServicios {
    
 /** * Método crearCurso(): el método crear curso, le pide los valores de los 
 * atributos al usuario y después se le asignan a sus respectivos atributos 
 * para llenar el objeto Curso. En este método invocamos al método 
 * cargarAlumnos() para asignarle valor al atributo alumnos
     * @return  **/
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    
    public Curso crearCurso(){
        Curso pablo = new Curso();
        System.out.println("Ingrese el Nombre del Curso");
        pablo.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por día");
        pablo.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de días por semana");
        pablo.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese si es turno TARDE ó MAÑANA");
        pablo.setTurno(leer.next());
        System.out.println("Ingrese el precio por hora");
        pablo.setPrecioPorHora(leer.nextDouble());
        cargarAlumnos(pablo);
        return pablo;
    }
    

    
/** * Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
 * alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar 
 * esta información en un arreglo e iterar con un bucle, solicitando en cada 
 * repetición que se ingrese el nombre de cada alumno
     * @param pablo.**/
    
    
    public void cargarAlumnos(Curso pablo){
        String[] vector = new String [5];
        int contAsistencia=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el nombre del Alumno "+(i+1)+"/5" );
            System.out.println("Si el alumno FALTO ingrese una (x)");
            vector[i]=leer.next();
            if (vector[i].equalsIgnoreCase("x")){
                contAsistencia++;
            }
            pablo.setAlumnos(vector);
            pablo.setAsistencia(contAsistencia);
        }  
    }
    
   /** * Método calcularGananciaSemanal(): este método se encarga de calcular la 
 * ganancia en una semana por curso. Para ello, se deben multiplicar la 
 * cantidad de horas por día, el precio por hora, la cantidad de alumnos y 
 * la cantidad de días a la semana que se repite el encuentro
     * @param pablo.**/
    
    public void calcularGananciaSemanal(Curso pablo){
        double ganancia;
        
        ganancia=pablo.getPrecioPorHora()*pablo.getCantidadHorasPorDia()*pablo.getCantidadDiasPorSemana()*pablo.getAsistencia();
        System.out.println("Las ganancias son: "+ganancia+" pesos");
        
    }
    
}
