
package tema05;

/**
 *
 * @author d3stroya
 */
public class Biblioteca {
    // ATRIBUTOS
    private int numPasillo;
    private int numEstanteria;
    private Libro libro;
    private Usuario usuario;
    private Trabajador trabajador;
    
    // CONSTRUCTORES
    public Biblioteca() {
        numPasillo = 0;
        numEstanteria = 0;
        libro = new Libro();
        usuario = new Usuario();
        trabajador = new Trabajador();
    }
    
    public Biblioteca(int numPas, int numEst, Libro l, Usuario u, Trabajador t) {
        numPasillo = numPas;
        numEstanteria = numEst;
        libro = l;
        usuario = u;
        trabajador = t;
    }
    
    public Biblioteca(Libro l) {
        numPasillo = 0;
        numEstanteria = 0;
        libro = l;
        usuario = new Usuario();
        trabajador = new Trabajador();        
    }
    
    // GETTERS Y SETTERS
    public void setNumPasillo(int n) {
        numPasillo = n;
    }
    
    public int getNumPasillo() {
        return numPasillo;
    }

    public int getNumEstanteria() {
        return numEstanteria;
    }

    public void setNumEstanteria(int numEstanteria) {
        this.numEstanteria = numEstanteria;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
    
    // MÉTODOS
    
    
    // TO STRING
    @Override
    public String toString() {
        return "Biblioteca: Número Pasillo: " + numPasillo + 
                " Número de estantería: " + numEstanteria + 
                " Libro: " + libro + " Usuario: " + usuario +
                " Trabajador: " + trabajador;
    }
}
