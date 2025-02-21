
package tema08.ejercicios.ej1;

/**
 *
 * @author d3stroya
 */
public class Asignatura {
    private String nombre;
    private double nota;

    /* Constructor por defecto */
    Asignatura() {
        this.nombre = "";
        this.nota = 0;
    }
    
    /* Constructor parametrizado */
    Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    /* Getters y Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
       
}
