package ejer5_colecciones;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import servicio.ServicioPaises;
/**se requiere un programa que lea y guarde paises, y para evitar que se ingresen
 * repetidos usaremos un conjunto.El programa pedira un pais en un bucle, se 
 * guardara el pais en el conjunto y despues se le preguntara al usuario si 
 * quiere guardar otro pais o si quieren salir, si decide salir, se mostrara 
 * todos los paises guardados en el conjunto.(recordemos hacer los servicios en 
 * la clase correspondiente)
 * Despues deberemos mostrar el conjunto ordenado alfabeticamente: para esto 
 * recordar como se ordena un conjunto
 * Por ultimo, al usuario se le pedira un pais y se recorrera el conjunto con un 
 * iterator, se buscara el pais en el conjunto y si esta en el conjunto se eli-
 * minara el pais que ingreso el usuario y se mostrara el conjunto.Si el pais 
 * no se encuentra en el conjunto se le informara al usuario.
 */
public class Ejer5_colecciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPaises sp = new ServicioPaises();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opcion;
        do {
            System.out.println("****Ingrese un país:****");
            String pais = leer.nextLine();
          
            // Agregar el pais al conjunto utilizando el servicio
            sp.agregarPais(pais);
            System.out.print("¿Desea ingresar otro país? (si/no): ");
            System.out.println();
            opcion = leer.nextLine();
        } while (opcion.equalsIgnoreCase("si"));

        // Mostrar todos los paises guardados en el conjunto
        sp.mostrarPaises();

        // Ordenar y mostrar el conjunto alfabeticamente
        Set<String> conjuntoOrdenado = new TreeSet<>(sp.paises);
        System.out.println("***Conjunto ordenado alfabéticamente:***");
      
        for (String pais : conjuntoOrdenado) {
            System.out.println(pais);
        }
        System.out.println();
        
        System.out.println("***Ingrese un país para eliminar:*** ");
        String paisEliminar = leer.nextLine();
        sp.eliminarPais(paisEliminar);
       
        // Mostrar los nuevos países almacenados después de eliminar, ordenados alfabéticamente
        System.out.println("***Nuevos países almacenados ordenados alfabéticamente:***");
        Set<String> nuevosPaisesOrdenados = new TreeSet<>(sp.paises);
        for (String pais : nuevosPaisesOrdenados) {
            System.out.println(pais);
        }
        System.out.println();
    }
    }
    

