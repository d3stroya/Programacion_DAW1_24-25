
package tema06.ejercicios.ejercicio02;

/**
 *
 * @author d3stroya
 */
public class Profesor extends Persona {
    private String especialidad;

    public Profesor() {
        super();
        this.especialidad = "";
    }
    
    public Profesor(String especialidad, String nombre) {
        super(nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + getNombre() + " y soy de la especialidad " + especialidad);
    }        

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + '}';
    }
    
    
}
