package servicio;
import java.util.HashSet;
import java.util.Set;
/**
 */
public class ServicioPaises {
      public Set<String> paises; // Declaracion de la variable que almacenara los paises en un conjunto

    public ServicioPaises() {
        paises = new HashSet<>(); // Inicializa el conjunto de países en el constructor
    }
    public void agregarPais(String pais) {
        paises.add(pais); // Agrega un pais al conjunto
    }
    public void mostrarPaises() {
        System.out.println("***Paises guardados***"); // Imprime un mensaje indicando que se mostraran los paises guardados
        for (String pais : paises) {
            System.out.println(pais); // Itera sobre el conjunto e imprime cada pais
        }
        System.out.println();
    }
    public void eliminarPais(String pais) {
        if (paises.contains(pais)) { // Verifica si el pais existe en el conjunto
            paises.remove(pais); // Elimina el pais del conjunto
            System.out.println("-*-*El país '" + pais + "' ha sido borrado*-*-"); // Imprime un mensaje confirmando la eliminacion
            System.out.println();
        } else {
            System.out.println("---El país '" + pais + "' no se encuentra en el conjunto---"); // Imprime un mensaje indicando que el pais no se encontro en el conjunto
            System.out.println(); 
        } 
    }
}
