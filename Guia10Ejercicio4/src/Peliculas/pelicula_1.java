/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peliculas;

/**
 *
 * @author Soporte
 */
public class pelicula_1.java {
    public int duracion;
    public String titulo;
    public String director;

    public Pelicula() {
    }

    public Pelicula(int duracion, String titulo, String director) {
        this.duracion = duracion;
        this.titulo = titulo;
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public String toString() {
    return "Pelicula{" + "titulo: "+titulo+" , Director: "+director+" duracion: "+duracion'}';
}

}
