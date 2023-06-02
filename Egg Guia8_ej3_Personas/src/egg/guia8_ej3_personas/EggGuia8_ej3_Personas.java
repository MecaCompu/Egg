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
package egg.guia8_ej3_personas;

import Servicios.PersonaServicio;

public class EggGuia8_ej3_Personas {
    
    public static void main(String[] args) {
        
        PersonaServicio ps1 = new PersonaServicio();
        PersonaServicio ps2 = new PersonaServicio();
        PersonaServicio ps3 = new PersonaServicio();
        PersonaServicio ps4 = new PersonaServicio();
        
        int[] imcResultados = new int[4];
        boolean[] edades = new boolean[4];
        PersonaServicio[] vectorPersonas = new PersonaServicio[4];
        
        vectorPersonas[0] = ps1;
        vectorPersonas[1] = ps2;
        vectorPersonas[2] = ps3;
        vectorPersonas[3] = ps4;
        
        
        for(int i = 0; i<4; i++){
        // Convocamos el metodo crearPersona para cada persona dentro del vector 
        vectorPersonas[i].crearPersona();
        
        if (vectorPersonas[i].esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
        
        switch (vectorPersonas[i].calcularIMC()) {
            
            case -1:
                System.out.println("La persona se encuentra por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona se encuentra en su peso ideal!");
                break;
            case 1:
                System.out.println("La persona se encuentra por encima de su peso ideal.");
            
        }
        //Agregamos los valores de IMC y Edad en los arreglos
        imcResultados[i] = vectorPersonas[i].calcularIMC();
        edades[i] = vectorPersonas[i].esMayorDeEdad();
        }
        
        System.out.println("--------------------------------------------------");
        ps1.porcentajesIMC(imcResultados);
        System.out.println("");
        ps1.porcentajesEdad(edades);
        
        
        
        
        /*
        //Creamos la primera persona y convocamos cada metodo
        ps1.crearPersona();
        
        if (ps1.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
        
        switch (ps1.calcularIMC()) {
            
            case -1:
                System.out.println("La persona se encuentra por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona se encuentra en su peso ideal!");
                break;
            case 1:
                System.out.println("La persona se encuentra por encima de su peso ideal.");
            
        }
        //Agregamos los valores de IMC y Edad en los arreglos
        imcResultados[0] = ps1.calcularIMC();
        edades[0] = ps1.esMayorDeEdad();

        // Segunda persona
        ps2.crearPersona();
        
        if (ps2.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
        
        switch (ps2.calcularIMC()) {
            
            case -1:
                System.out.println("La persona se encuentra por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona se encuentra en su peso ideal!");
                break;
            case 1:
                System.out.println("La persona se encuentra por encima de su peso ideal.");
            
        }
        //Agregamos los valores de IMC y Edad en los arreglos
        imcResultados[1] = ps2.calcularIMC();
        edades[1] = ps2.esMayorDeEdad();

        // Tercera persona
        ps3.crearPersona();
        
        if (ps3.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
        
        switch (ps3.calcularIMC()) {
            
            case -1:
                System.out.println("La persona se encuentra por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona se encuentra en su peso ideal!");
                break;
            case 1:
                System.out.println("La persona se encuentra por encima de su peso ideal.");
            
        }
        
        imcResultados[2] = ps3.calcularIMC();
        edades[2] = ps3.esMayorDeEdad();

        // Cuarta persona
        ps4.crearPersona();
        
        if (ps4.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
        
        switch (ps4.calcularIMC()) {
            
            case -1:
                System.out.println("La persona se encuentra por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println("La persona se encuentra en su peso ideal!");
                break;
            case 1:
                System.out.println("La persona se encuentra por encima de su peso ideal.");
            
        }
        
        imcResultados[3] = ps4.calcularIMC();
        edades[3] = ps4.esMayorDeEdad();
        
        System.out.println("--------------------------------------------------");
        ps1.porcentajesIMC(imcResultados);
        System.out.println("");
        ps1.porcentajesEdad(edades);
    }
    */
}
}
/*Scanner sc = new Scanner(input).useDelimiter("\n");*/