package Entidad;

import java.util.Date;

public class Persona {

	private String nombre;
	private Date fechaNacimiento;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento.toString() + "]";
	}
	
	

}
