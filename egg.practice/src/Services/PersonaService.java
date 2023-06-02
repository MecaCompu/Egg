package Services;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Entidad.Persona;

public class PersonaService {

	Scanner leer = new Scanner(System.in);
	Persona p;
	
	
	public Persona crearPersona() {
		System.out.println("Ingrese el nombre ");
		String nombre = leer.next();
		
		System.out.println("Ingrese año de nacimiento: ");
		int anio = leer.nextInt();
		
		System.out.println("Ingrese mes de nacimiento: ");
		int mes = leer.nextInt();
		
		System.out.println("Ingrese dia de nacimiento: ");
		int dia = leer.nextInt();
		
		//Date fecha = new Date(anio - 1900, mes -1 , dia);
		Calendar calendar = new  GregorianCalendar();
		
		calendar.set(anio, mes-1, dia);
		
		Date fecha = calendar.getTime();
        

		System.out.println("Fecha de Nacimiento " + Utilidad.Utilidad.cambioFecha(fecha));
        p= new Persona(nombre, fecha);
		return p;
	}
	
	public long calcularEdad(Persona p){
		
		Date fecha = new Date();
				
		return fecha.getYear() - p.getFechaNacimiento().getYear() ;
		
		//long tiempo_transcurrido = p.getFechaNacimiento().getTime() - fecha.getTime();
		
		//TimeUnit unidad = TimeUnit.DAYS;
		
		//long dias = unidad.convert(tiempo_transcurrido, TimeUnit.MILLISECONDS);
		
		//return dias;
		
	}
	
}
