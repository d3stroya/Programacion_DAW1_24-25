
package tema06.ejercicios.ejercicio02;

/**
 *
 * @author d3stroya
 */
public class Test {
    public static void main(String[] args) {
        // SIN POLIMORFISMO
        Profesor profe = new Profesor("Informática", "María");
        profe.saludar();
        
        Alumno alumno = new Alumno("DAW1", "Juan");
        alumno.saludar();
        
        System.out.println("");
        
        // CON POLIMORFISMO
        Persona persona;
        
        persona = new Profesor("Informática", "María");
        persona.saludar();
        
        persona = new Alumno("DAW1", "Juan");
        persona.saludar();
    }
}
