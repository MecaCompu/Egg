package Entidad;

public class Curso {
	
	private String nombreCurso;
	private int cantidadHorasPorDia;
	private int cantidadDiasPorSemana;
	private char turno;
	private double precioPorHora;
	private String[] alumnos = new String[5];
	
	public Curso() {
		super();
	}

	public Curso(String nombreCurso, int cantidadHorasPorDia,
			int cantidadDiasPorSemana, char turno, double precioPorHora,
			String[] alumnos) {
		super();
		this.nombreCurso = nombreCurso;
		this.cantidadHorasPorDia = cantidadHorasPorDia;
		this.cantidadDiasPorSemana = cantidadDiasPorSemana;
		this.turno = turno;
		this.precioPorHora = precioPorHora;
		this.alumnos = alumnos;
	}
	
	
	
	

}
