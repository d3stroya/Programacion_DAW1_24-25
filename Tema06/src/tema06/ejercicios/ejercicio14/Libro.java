
package tema06.ejercicios.ejercicio14;

/**
 * Clase Libro
 *
 * @author Daniel
 */
public class Libro extends Publicacion implements Prestable {
    
    //Atributos
    private boolean prestado;
    
    //Constructores
    public Libro() {
        super();
        this.prestado = false;
    }

    public Libro(int codigo, String titulo, int anioPublicacion, boolean prestado) {
        super(codigo, titulo, anioPublicacion);
        this.prestado = prestado;
    }
    
    //Getters / Setters
    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    //Metodos
    @Override
    public void prestar() {
        System.out.println("Prestando libro...");
        this.prestado = true;
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo libro...");
        this.prestado = false;
    }

    @Override
    public void mostrarPrestado() {
        if(prestado) {
            System.out.println("El libro est� prestado");
        } else {
            System.out.println("El libro no est� prestado");
        }
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Libro{" + "prestado=" + prestado + '}';
    }

}