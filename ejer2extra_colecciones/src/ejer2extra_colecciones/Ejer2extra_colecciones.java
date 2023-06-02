package ejer2extra_colecciones;
import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**crear una clase llamada cantantefamoso.Esta clase guardara cantantes famosos 
 * tendra como atributo el nombre y disco mas vendido.
 * Se debe, ademas en el main crear una lista de tipo cantante famoso y agregar
 * 5 objetos de tipo cantante famoso a la lista.Luego se debe mostrar los nombres
 * de cada cantante y su disco con mas ventas por pantalla.
 * Una vez agregado los 5 en otro bucle, crear un menu que le de la opcion al 
 * usuario de agregar un cantante mas, mostrar todos los cantantes, eliminar un
 * cantante que el usuario elija o salir del programa.Al final se debera mostrar
 * la lista con todos los cambios
 */
public class Ejer2extra_colecciones {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    
    List<CantanteFamoso>listaCantante=new ArrayList();
        for (int i = 0; i < 5; i++) {
        System.out.println("ingrese cantante"); 
        String cantante=leer.nextLine();
        System.out.println("ingrese disco mas vendido");
        String disco=leer.nextLine();
        CantanteFamoso cf = new CantanteFamoso(cantante, disco);
        listaCantante.add(cf);        
            }
        for (CantanteFamoso fam :listaCantante) {
            System.out.println("nombre del cantate:"+fam.getNombre()); 
            System.out.println("disco mas vendido:"+fam.getDisco());
        }
    }
    int opcion=0;
     while(opcion!=4){
         System.out.println("=========MENU========");
         System.out.println("1. Agregar un cantante. ");
         System.out.println("2. Mostrar todos los cantantes. ");
         System.out.println("3. Eliminar un cantante. ");
         System.out.println("4. Salir del menu.");
         System.out.println("Ingrese un opcion: ");
         opcion=sc.nextInt();
         
         switch(opcion){
             case 1:
                 System.out.println("Ingrese el nombre del cantante: ");
                 String nombre=sc.next();
                 System.out.println("Ingrese el disco con mas ventas: ");
                 String disco=sc.next();
                 CantanteFamoso nuevoCantante = new CantanteFamoso(nombre, disco);
                 listaCantantes.add(nuevoCantante);
                 break;
    }
   

