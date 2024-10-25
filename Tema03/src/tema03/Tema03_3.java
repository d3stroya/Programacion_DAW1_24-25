/*
    CONTROL DE EXCEPCIONES
    Es una técnica que permite al programador controlar
    la ejecución del programa, evitando que este se detenga
    de forma inesperada por errores.

    try {
        bloque de código que intentamos ejecutar y puede dar error
    } catch(Excepción que capturamos e) {
        bloque de código que se ejecuta si sucede el error entre paréntesis
    } finally {
        bloque de código que se ejecuta siempre
    }
*/
package tema03;

/**
 *
 * @author d3stroya
 */
public class Tema03_3 {
    public static void main(String[] args) {
        int a, b, c;
        a = 3;
        b = 0;
        
        // Sin control de excepciones        
//        c = a / b;  // Lanza la excepción java.lang.ArithmeticException: / by zero
//        System.out.println("El resultado de dividir " + a + " entre " + b + " es " + c);    // No se ejecuta porque el programa se detiene en la línea anterior
        
        // Con control de excepciones
        try {
            c = a / b;
        } catch(ArithmeticException e) {
            System.out.println("No puedes dividir entre 0");
            System.out.println(e.getMessage());
            c = 0;
        } 
        
        System.out.println("El resultado de dividir " + a + " entre " + b + " es " + c);    // No se ejecuta porque el programa se detiene en la línea anterior

//        
    }
}
