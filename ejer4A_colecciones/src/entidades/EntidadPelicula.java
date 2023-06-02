package entidades;
import java.util.Comparator;
/**
 */
public class EntidadPelicula {
 
    private String titulo;
    private String director;
    private Double duracion;

    public EntidadPelicula() {
    }

    public EntidadPelicula(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
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

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "EntridadPelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    
    public static Comparator <EntidadPelicula> compararaDuracion = new Comparator <EntidadPelicula> () {    
        @Override
        public int compare(EntidadPelicula t, EntidadPelicula t1) {
          return t1.getDuracion().compareTo(t.getDuracion());   
        }

        @Override
        public Comparator<EntidadPelicula> reversed() {
            return Comparator.super.reversed(); //To change body of generated methods, choose Tools | Templates.
        }   
    };
    
     public static Comparator <EntidadPelicula> compararaTitulo = new Comparator <EntidadPelicula> () {
        @Override
        public int compare(EntidadPelicula t, EntidadPelicula t1) {
        return t.getTitulo(). compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator <EntidadPelicula> compararaDirector = new Comparator <EntidadPelicula> () {
        @Override
        public int compare(EntidadPelicula t, EntidadPelicula t1) {
        return t.getDirector(). compareTo(t1.getDirector());
        }
    };
}
