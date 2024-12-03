
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        saludoRecursivo(5);
    }
    
    public static void saludoRecursivo(int veces) {
        if(veces > 0) {
            System.out.println("Hola");
            saludoRecursivo(veces - 1);
        }                
    }
}
