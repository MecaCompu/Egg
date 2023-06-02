import java.util.Scanner;

import Entidad.Circunferencia;


public class geometria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un radio");

		double radio = leer.nextDouble();

		Circunferencia circ = new Circunferencia(radio);

		perimetro(circ.getRadio());
		leer.close();
	}

	public static void perimetro(double radio) {
		
	}

}
