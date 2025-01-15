
package tema06.ejercicios.ejercicio02;

/**
 *
 * @author d3stroya
 */
public class Alumno extends Persona {
    private String grupo;

    public Alumno() {
        super();
        this.grupo = "";
    }
    
    public Alumno(String especialidad, String nombre) {
        super(nombre);
        this.grupo = especialidad;
    }

    public String getGrupo() {
        return grupo;
    }

    public void SetGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + getNombre() + " y estoy en el grupo " + grupo);
    }   
}
