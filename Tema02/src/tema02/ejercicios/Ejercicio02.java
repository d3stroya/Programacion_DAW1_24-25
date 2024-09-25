
package tema02.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        float numero1 = 0.5f;
        long numero2;
        float resultado;
        numero2 = 732645132635746L;
        resultado = numero1 * numero2;
        
        // ERROR: El último + debería ir detrás de numero 1 y "numero 2" debería ir junto y fuera de las comillas
        //System.out.println("El resultado de multiplicar " + numero1 "y numero 2 es igual a " + resultado +);
       
        // SOLUCIÓN
        System.out.println("El resultado de multiplicar " + numero1 + " y " + numero2 + "es igual a " + resultado);
    }
}
