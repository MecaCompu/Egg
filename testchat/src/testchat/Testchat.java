/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testchat;

import java.util.Scanner;

/**
 *
 * @author Soporte
 */
public class Testchat {

    /**
     */
   
        public class Main {
    public static void main(String[] args) {
        // Crear un objeto Curso
        Curso curso = new Curso();

        // Llamar al método crearCurso para configurar los atributos del curso
        curso.crearCurso();

        // Obtener la información del curso utilizando los métodos getters
        String nombreCurso = curso.getNombreCurso();
        int cantidadHorasPorDia = curso.getCantidadHorasPorDia();
        int cantidadDiasPorSemana = curso.getCantidadDiasPorSemana();
        String turno = curso.getTurno();
        double precioPorHora = curso.getPrecioPorHora();
        String[] alumnos = curso.getAlumnos();

        // Imprimir la información del curso
        System.out.println("Información del curso:");
        System.out.println("Nombre: " + nombreCurso);
        System.out.println("Horas por día: " + cantidadHorasPorDia);
        System.out.println("Días por semana: " + cantidadDiasPorSemana);
        System.out.println("Turno: " + turno);
        System.out.println("Precio por hora: " + precioPorHora);
        System.out.println("Alumnos:");

        for (String alumno : alumnos) {
            System.out.println(alumno);
        }

        // Calcular y mostrar la ganancia semanal del curso
        double gananciaSemanal = curso.calcularGananciaSemanal();
        System.out.println("Ganancia semanal: " + gananciaSemanal);
    }
}


    }
