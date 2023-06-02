import Entidad.Persona;
import Services.PersonaService;


public class ejercicio_9_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaService ps = new PersonaService();
		
		Persona p =  ps.crearPersona();
		System.out.println("La persona tiene " + ps.calcularEdad(p) + " años ");
		
		
	}

}
