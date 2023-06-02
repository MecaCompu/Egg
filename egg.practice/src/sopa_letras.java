import java.util.Scanner;


public class sopa_letras {

	/**
	 * @param args
	 */
	/*
	 * grama que lea 5 palabras de mínimo 3 y
	 *  hasta 5 caracteres y, a medida que el usuario las va ingresando,
construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres
. Las palabras se ubicarán todas en orden horizontal en una fila 
que será seleccionada de manera aleatoria.
 Una vez concluida la ubicación de las palabras,
  rellene los espacios no utilizados con un número aleatorio del 0 al 9.
   Finalmente imprima por pantalla la sopa de letras creada.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		String ingreso;
		String [][] matriz = new String[20][20];
		
		String palabras[] = new String[5];
		
		for (int i=0; i < 5; i++){
			System.out.println("Ingrese una palabras");
			ingreso = leer.next();
			if (ingreso.length() > 5) {
				System.out.println("Palabra no valida");
				i--;
			} else {
				palabras[i]= ingreso;
			}	
		}
		leer.close();
		
		for (int i=0; i < 20; i++){
			for (int j=0; i < 20; j++){
				matriz[i][j]="*";
			}
		}
		
		CargarMatriz(palabras, matriz);
		
		for (int i=0; i < 20; i++){
			for (int j=0; i < 20; j++){
				System.out.println(matriz[i][j]);
			}
		}
		
	}

	public static  String [][] CargarMatriz(String vector[], String matriz[][]){
		int x;
		int y;
		int h;
		
		for (int i= 0; i <5; i++){
			x = (int) (Math.random() * 15 +1);
			y = (int) (Math.random() * 15 +5);
			h = (int) (Math.random() * 3 +1);
			
			System.out.println(" la palabra " +  vector[i] + "Posicion x " + x +  " Posicion y " + y + " Altura " + h);
			if (h == 1) {
				for (int k= y; k < vector[i].length(); k++){
					int aux_x=0; 
					int aux=0;
					matriz[k][aux_x--]= Integer.toString(vector[i].charAt(aux++));
					System.out.println("Fila " + k + " Columna " + aux_x + " letra " +  vector[i].charAt(aux++));
				}
			}
		}
		return matriz;
	}
}
