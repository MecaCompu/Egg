/*
    Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad,
    sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede hacerlo.
    Agregar constructores, getters y setters.

    En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le asignan
    a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, es decir,
    H, M o O. Si no es correcto se deberá mostrar un mensaje


    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
    Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y
    la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está
    en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que
    la persona tiene sobrepeso, y la función devuelve un 1.

    A continuación, en la clase main hacer lo siguiente:
    Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto,
    deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar para
    cada objeto si la persona es mayor de edad.
    Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays),
    para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal
    y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto,
    podemos crear unos métodos adicionales.

 */
package Servicios;

import Entidades.Personas;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    // Creamos un objeto con nombre "p1" para utilizarlo posteriormente en los metodos convocando la clase Persona del paquete Entidades
    Personas p1 = new Personas();

    public boolean esMayorDeEdad() {
        // Creamos una variable para retornar el valor booleano que nos pide la consigna
        boolean comparacion = false;

        if (p1.getEdad() > 18) {
            comparacion = true;
        }
        
        return comparacion;
    }

    public void crearPersona() {

        System.out.println("Ingrese el nombre:");
        p1.setNombre(leer.nextLine());

        System.out.println("Ingrese la edad:");
        p1.setEdad(leer.nextInt());
        
        // Creamos una variable para utilizarla dentro del bucle siguiente
        String opcion = "a";

        while (opcion.equals("a")) {

            System.out.println("Ingrese el sexo (H: hombre, M: mujer, O: otro");
            opcion = leer.next().toUpperCase();
            

            switch (opcion) {
                case "H":
                    p1.setSexo("Hombre");
                    break;
                case "M":
                    p1.setSexo("Mujer");
                    break;
                case "O":
                    p1.setSexo("Otro");
                    break;
                default:
                    System.out.println("Error: la opcion ingresada es invalida.");
                    opcion = "a";
                    break;
            }
        }

        System.out.println("Ingrese el peso:");
        p1.setPeso(leer.nextInt());

        System.out.println("Ingrese la altura:");
        p1.setAltura(leer.nextDouble());
    }

    public int calcularIMC() {

        // Creamos una variable para guardar el resultado de la formula IMC
        double formula = p1.getPeso() / Math.pow(p1.getAltura(), 2);
        // Creamos otra variable para retornar un valor segun lo pedido en la consigna
        int retorno;

        if (formula < 20) {
            retorno = (-1);
        } else if (formula >= 20 && formula <= 25) {
            retorno = 0;
        } else {
            retorno = 1;
        }

        return retorno;
    }

                             // Entre paréntesis recibimos como parámetro el vector enviado desde el Main
    public void porcentajesIMC(int[] imc) {
        // Creamos variables que utilizaremos como contador para la cantidad de personas segun su peso
        int bajo = 0, ideal = 0, encima = 0;

        for (int i = 0; i < 4; i++) {

            switch (imc[i]) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                case 1:
                    encima++;
                    break;
            }
        }
        System.out.println("Porcentajes de pesos:");
        System.out.println(bajo + " de 4 personas se encuentran por debajo de su peso ideal");
        System.out.println(ideal + " de 4 personas se encuentran en su peso ideal");
        System.out.println(encima + " de 4 personas se encuentran por encima de su peso ideal");
    }

                                // Entre paréntesis recibimos como parámetro el vector enviado desde el Main
    public void porcentajesEdad(boolean[] edades) {
        // Creamos 2 variables que utilizaremos como contadores
        int mayor = 0, menor = 0;

        for (int i = 0; i < 4; i++) {
            // Dentro del If solo se encuentra los elementos del vector ya que es booleano, es decir, serán Verdaderos o Falsos
            if (edades[i]) {
                mayor++;
            } else {
                menor++;
            }
        }

        System.out.println("Porcentajes de edades:");
        System.out.println(menor + " de 4 personas son menores de edad");
        System.out.println(mayor + " de 4 personas son mayores de edad");
    }

}
