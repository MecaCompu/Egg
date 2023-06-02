
public class Rufini {

	/**
	 * @param args
	 */
	
	public static void BuscarRaices(int c){
		int cont=0;
		
		for (int i=1; i <= c ; i++){
			if ( c % i == 0 ){
		
				if( buscarX(1,2 ,-8,  i) ){
					cont++;
					System.out.println("Valor de x" + cont + " " + i);
				}
				if( buscarX(1,2 ,-8,  (-1 * i))){
					cont++;
					System.out.println("Valor de x" + cont + " " + (-1 * i));
				}
				
			}
		}
	}
	
	public static boolean buscarX(int a, int b, int c, int raiz){
	
		int aux = raiz * a;
		int b_aux = b + aux;
		int c_aux = raiz * b_aux;
		aux = c + c_aux;
		

		if (aux != 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuscarRaices(8);
	}

}
