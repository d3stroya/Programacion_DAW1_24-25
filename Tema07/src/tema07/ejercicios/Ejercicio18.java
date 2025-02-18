
package tema07.ejercicios;

import static algoritmos.MetodosFrecuentes.mostrarArrayInt;
import static algoritmos.OrdenacionPorBurbuja.burbuja;

/**
 *
 * @author d3stroya
 */
public class Ejercicio18 {
    public final static int LONGITUD = 10;
    
    public static void main(String[] args) {
        int[] array1 = {119, 21, 360, 43, 53};
        int[] array2 = {68 ,7 , 38, 3582, 58};
        int[] arrayCombinado = new int[10];
        
        combinarArrays(array1, array2, arrayCombinado);
        System.out.println("- MOSTRANDO ARRAY -");
        mostrarArrayInt(arrayCombinado);
        burbuja(arrayCombinado);
        System.out.println("\n- MOSTRANDO ARRAY ORDENADO -");
        mostrarArrayInt(arrayCombinado);
    }
    
    public static void combinarArrays(int[] array1, int[] array2, int[] arrayCombinado) {
        for(int i = 0; i < array1.length; i++) {
            arrayCombinado[i] = array1[i];
            arrayCombinado[i + 5] = array2[i];
        }
    }
    
    
}
