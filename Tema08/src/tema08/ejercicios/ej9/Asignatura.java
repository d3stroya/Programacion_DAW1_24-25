
package tema08.ejercicios.ej9;

/**
 *
 * @author d3stroya
 */
public class Asignatura {
    private String nombre;
    private float nota;

    public Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }
    
    public Asignatura(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ": " + nota;
    }        
}
