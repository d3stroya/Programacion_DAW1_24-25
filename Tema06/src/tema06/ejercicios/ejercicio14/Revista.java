
package tema06.ejercicios.ejercicio14;

/**
 * Clase Revista
 * 
 * @author Daniel
 */
public class Revista extends Publicacion {
    
    //Atributos
    private int numero;
    
    //Constructores
    public Revista() {
        super();
        this.numero = 0;
    }

    public Revista(int codigo, String titulo, int anioPublicacion, int numero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
    }
    
    //Getters / Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Revista{" + "numero=" + numero + '}';
    }     

}
