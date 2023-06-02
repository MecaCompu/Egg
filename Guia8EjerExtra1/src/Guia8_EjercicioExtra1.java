public class Guia8_EjercicioExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RaicesServicio ecu = new RaicesServicio();
        
        ecu.cargarValores();
        
        double valor = ecu.getDiscriminate();
        System.out.println("El valor discriminate es: " +valor);
        
        ecu.tieneRaices();


    }
    
}