/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author mpssn
 */
public class AhorcadoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado a = new Ahorcado();
    char[] palabra;
    int intentos;
    
    public void crearJuego(){
        System.out.println("Ingrese una palabra: ");
        a.setPalabraABuscar(leer.next());
        int longPalabra = a.getPalabraABuscar().length();
        palabra = new char[longPalabra];       
        
        for (int i = 0; i < longPalabra; i++) {
            palabra[i]= a.getPalabraABuscar().charAt(i);            
        }        
        a.setCantidadJugadasMaximas(longPalabra*2);                
    }
    
    public void longitud(){
    
        System.out.println("Logitud de la palabra: " + palabra.length);    
    }
    
    public int buscarLetra(){
        System.out.println("Ingrese una letra: ");
        char letra = leer.next().charAt(0);
        int contador=0;
        for (int i = 0; i < palabra.length; i++) {
            if(palabra[i]==letra){
            contador++;
        }
        }
        return contador;
    }
    
    public void encontradas(){
        int letrasEncontradas = buscarLetra();
        
        if (letrasEncontradas>0){
            System.out.println("La letra pertence a la palabra");
        }else{
        intentos++;
        }
        System.out.println("Numero de letras (encontradas, faltantes): (" + letrasEncontradas + "," + (palabra.length - letrasEncontradas) + ")");
       
    }
    
    public void intentos(){
        
        System.out.println("Numero de oportunidades restantes: " + (a.getCantidadJugadasMaximas()-intentos));
        
    }
    
    public void juego(){
        crearJuego();
        longitud();
        buscarLetra();
        encontradas();
        intentos();
    }
    
    
}