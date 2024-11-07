
package tema04.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio22T4 {
    public static void muestraPI() {
        System.out.println("Número PI: " + Math.PI);
    }
    
    public static void muestraE() {
        System.out.println("Número E: " + Math.E);
    }
    
    public static void muestraConstantes(double pi, double e) {
        System.out.println("Primera constante: " + pi);
        System.out.println("Segunda constante: " + e);
    }
    
    public static void main(String[] args) {
        muestraPI();
        muestraE();
        System.out.println("");
        muestraConstantes(Math.PI, Math.E);
    }
}
