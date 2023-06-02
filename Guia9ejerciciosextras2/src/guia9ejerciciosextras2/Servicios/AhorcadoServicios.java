package guia9ejerciciosextras2.Servicios;

import guia9ejerciciosextras2.Entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicios {

  Scanner input = new Scanner(System.in);

  public Ahorcado crearJuego(Ahorcado partida) {
    System.out.println("Ingrese la palabra a adivinar:");
    String palabraAhorcado = input.next();
    String[] letrasPalabraABuscar = new String[palabraAhorcado.length()];

    for (int i = 0; i < letrasPalabraABuscar.length; i++) {
      letrasPalabraABuscar[i] = palabraAhorcado.substring(i, i + 1);
    }

    partida.setLetrasPalabraABuscar(letrasPalabraABuscar);

    System.out.println("Ingrese la cantidad máximas de turnos por partida:");
    partida.setCantidadTurnosMaximos(input.nextInt());

    return partida;
  }

  public void informarLongitudPalabra(Ahorcado partida) {
    int longitud = partida.getLetrasPalabraABuscar().length;

    System.out.println("El juego ha comenzado!");
    System.out.println("La palabra a buscar tiene " + longitud + " letras.");
  }

  public boolean buscarLetra(String letraUsuario, Ahorcado partida) {
    boolean letraEncontrada = false;

    for (String letraOriginal : partida.getLetrasPalabraABuscar()) {
      if (letraOriginal.equals(letraUsuario)) {
        System.out.println("Ha acertado! La letra ingresada se encontró en la palabra a adivinar.");
        letraEncontrada = true;
        break;
      }
    }
    
    if (!letraEncontrada) {
      System.out.println("Ha fallado! La letra ingresada NO se encontró en la palabra a adivinar.");
    }
    return letraEncontrada;
  }

  public void letrasEncontradas(String letra, String[] letrasPalabraEnConstruccion, Ahorcado partida) {
    for (int i = 0; i < letrasPalabraEnConstruccion.length; i++) {
      if (letra.equalsIgnoreCase(partida.getLetrasPalabraABuscar()[i])) {
        letrasPalabraEnConstruccion[i] = letra;
      }
      System.out.print(letrasPalabraEnConstruccion[i] +" ");
    }
    System.out.println("");
  }

  public void intentos() {

  }

  public void jugar() {

    Ahorcado partida = new Ahorcado();
    partida = crearJuego(partida);
    informarLongitudPalabra(partida);

    int cantidadIntentos = 0;
    boolean letraEncontrada;
    String[] letrasPalabraEnConstruccion = new String[partida.getLetrasPalabraABuscar().length];
    Arrays.fill(letrasPalabraEnConstruccion, "__");

    do {
      cantidadIntentos++;
      System.out.println("Intento " + cantidadIntentos + "/" + partida.getCantidadTurnosMaximos() + ": ingrese una letra");
      String letra = input.next();
      

      letraEncontrada = buscarLetra(letra, partida);
      letrasEncontradas(letra, letrasPalabraEnConstruccion, partida);
      

    } while (cantidadIntentos != partida.getCantidadTurnosMaximos());

  }

}
