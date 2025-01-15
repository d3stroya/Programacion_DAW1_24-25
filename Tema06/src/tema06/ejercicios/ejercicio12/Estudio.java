
package tema06.ejercicios.ejercicio12;

/**
 * Clase Estudio
 * 
 * @author d3stroya
 */
public class Estudio {
    // ATRIBUTOS
    private String nombre;
    private String ultimoLanzamiento;

    // CONSTRUCTORES
    public Estudio() {
        this.nombre = "";
        this.ultimoLanzamiento = "";
    }
    
    public Estudio(String nombre, String ultimoLanzamiento) {
        this.nombre = nombre;
        this.ultimoLanzamiento = ultimoLanzamiento;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUltimoLanzamiento() {
        return ultimoLanzamiento;
    }

    public void setUltimoLanzamiento(String ultimoLanzamiento) {
        this.ultimoLanzamiento = ultimoLanzamiento;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Estudio{" + "nombre=" + nombre + ", ultimoLanzamiento=" + ultimoLanzamiento + '}';
    }
       
}
