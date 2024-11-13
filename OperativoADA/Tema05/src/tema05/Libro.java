
package tema05;

/**
 *
 * @author d3stroya
 */
public class Libro {
    // ATRIBUTOS
    private Prestamo prestamo;
    private String nombre;
    private String genero;
    private String isbn;
    private String autor;

    public Libro() {
        this.prestamo = new Prestamo();
        this.nombre = "";
        this.genero = "";
        this.isbn = "";
        this.autor = "";
    }
    
    public Libro(Prestamo prestamo, String nombre, String genero, String isbn, String autor) {
        this.prestamo = prestamo;
        this.nombre = nombre;
        this.genero = genero;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "prestamo=" + prestamo + ", nombre=" + nombre + ", genero=" + genero + ", isbn=" + isbn + ", autor=" + autor + '}';
    }
    
    
    
}
