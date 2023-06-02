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
package Entidades;

public class Curzo {
    private String nombreCurzo;
    private int horaPorDia;
    private int diasPorSemana;
    private String turno;
    private int precioPorHora;
    private String [] alumno = new String[5];

    public Curzo() {
    }

    public Curzo(String nombreCurzo, int horaPorDia, int diasPorSemana, String turno, int precioPorHora) {
        this.nombreCurzo = nombreCurzo;
        this.horaPorDia = horaPorDia;
        this.diasPorSemana = diasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurzo() {
        return nombreCurzo;
    }

    public int getHoraPorDia() {
        return horaPorDia;
    }

    public int getDiasPorSemana() {
        return diasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumno() {
        return alumno;
    }

    public void setNombreCurzo(String nombreCurzo) {
        this.nombreCurzo = nombreCurzo;
    }

    public void setHoraPorDia(int horaPorDia) {
        this.horaPorDia = horaPorDia;
    }

    public void setDiasPorSemana(int diasPorSemana) {
        this.diasPorSemana = diasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumno(String[] alumno) {
        this.alumno = alumno;
    }

    
}
