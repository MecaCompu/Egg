/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Juego {

    private int jugador1;
    private int jugador2;

    public Juego() {
    }

    public Juego(int jugador1, int jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public void iniciarJuego() {
        Scanner leer = new Scanner(System.in);
        int intentos = 0, j1 = 0, j2 = 0;
        String respuesta;

        do {
            System.out.println("JUGADOR 1 INGRESE UN NUMERO");
            setJugador1(leer.nextInt());
            intentos=0;
            do {
                intentos++;
                System.out.println("ADIVINA EL NUMERO (INTENTO " + intentos + ")");
                setJugador2(leer.nextInt());

                if (getJugador1() == getJugador2()) {
                    System.out.println("ADIVINASTE EL NUMERO!!");
                    j2++;
                    break;
                } else if (getJugador1() > getJugador2()) {
                    System.out.println("MAS ALTO");
                } else {
                    System.out.println("MAS BAJO");
                }
                if (intentos == 7) {
                    System.out.println("NO ADIVINASTE EL NUMERO, GANA EL JUGADOR 1!");
                    j1++;
                }
            } while (intentos < 7);

            System.out.println("QUIERES SEGUIR JUGANDO? (S/N)");
            respuesta = leer.next();
            System.out.println("EL JUGADOR 1 HA GANADO: " +j1);
            System.out.println("EL JUGADOR 2 HA GANADO: " +j2);
        } while (respuesta.equalsIgnoreCase("S"));
    }

}
