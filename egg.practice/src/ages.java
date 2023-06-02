import java.util.Scanner;


public class ages {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		String salir="";
		

		do 	{
			
			String nombre="";
			int edad;
			
			System.out.println("Ingrese un nombre:");
			nombre = leer.next();
			
			System.out.println("Ingrese la edad para : " + nombre);
			edad = leer.nextInt();
			
			MostrarDatos(nombre, edad);
			
			
			System.out.println("Desea continuar (si/no)");
			salir = leer.next();
			
		} while (!salir.equals("no"));
		System.out.println("Saliendo...");
	}
	
	public static void MostrarDatos(String nombre, int edad) {
		System.out.println("Nombre " + nombre);
		System.out.println("Edad " +  edad + " años");
		
		if (edad > 18 ){
			System.out.println(nombre +" es mayor de edad");
		} else {
			System.out.println(nombre + " es menor de edad");
		}
	}

}
