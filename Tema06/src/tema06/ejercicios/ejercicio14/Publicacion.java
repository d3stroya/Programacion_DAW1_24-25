
package tema06.ejercicios.ejercicio14;

/**
 * Clase Publicacion
 * 
 * @author Daniel
 */
public class Publicacion {

    //Atributos
    private int codigo;
    private String titulo;
    private int anioPublicacion;
    
    //Constructores
    public Publicacion() {
        this.codigo = 0;
        this.titulo = "";
        this.anioPublicacion = 0;
    }
    
    public Publicacion(int codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }
    
    //Getters / Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
   
    //toString
    @Override
    public String toString() {
        return "Publicacion{" + "codigo=" + codigo + ", titulo=" + titulo + ", anioPublicacion=" + anioPublicacion + '}';
    }
    
    
}
