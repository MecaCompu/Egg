package ejer1extra_colecciones;
import java.util.ArrayList;
import java.util.Scanner;
/**diseñar un programa que lea una serie de valores numericos enteros desde el
 * teclado y los guarde en un ArrayList de tipo Integer.La lectura de numeros
 * termnina cuando se introduzca el valor -99.Este valor no se guarda en el 
 * ArrayList.A continuacion, el programa mostrara por pantalla el numero de 
 * valores que se han leido, su suma y su media(promedio)
 */
public class Ejer1extra_colecciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in).useDelimiter("\n");
     ArrayList<Integer> numerosA=new ArrayList();
        System.out.println("ingresar nros por teclado");
        int num;
        
       do{
             num =leer.nextInt();
             if (num !=-99){
                 numerosA.add(num);
             }
            
        }while(num!=-99);
      int cantidad = numerosA.size();
      int suma=0;
        for (int i = 0; i < numerosA.size(); i++) {
            suma+=numerosA.get(i);     
        }
        double promedio= (double)suma/numerosA.size();
        System.out.println("la cantidad de nros ingresados son: "+cantidad);
        System.out.println("la suma es: "+suma);
        System.out.println("el promedio es: "+promedio);
    }   
}