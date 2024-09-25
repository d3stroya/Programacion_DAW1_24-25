
package tema02.ejercicios;

/**
 *
 * @author d3stroya
 */

// CLASE
public class Ejercicio09 {
    
    // ATRIBUTOS
    public static float radio = 3.55f;
    public final static float PI = 3.14159f;
        
    // MÉTODOS
    public static void main(String[] args) {
        // Declaración de variable local
        float longitud;
        
        longitud = 2 * PI * radio;
        
        System.out.println("La longitud de una circunferencia cuyo radio vale 3,55 "
                + "es igual a " + longitud + " metros");
    }
}
