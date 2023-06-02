

/**
 *
 * @author EDUCACION
 */
public class Libro {
    public String ISBN;
    public String Título;
    public String Autor;
    public int Númeropáginas;
    
    
    public Libro(){
        
        
    }

    public Libro(String ISBN, String Título, String Autor, int Númeropáginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.Númeropáginas = Númeropáginas;
    }
}

