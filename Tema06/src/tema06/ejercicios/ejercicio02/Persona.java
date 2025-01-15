
package tema06.ejercicios.ejercicio02;

/**
 *
 * @author d3stroya
 */
public abstract class Persona {
    private String nombre;

    public Persona() {
        this.nombre = "";
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void saludar();

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }               
}
