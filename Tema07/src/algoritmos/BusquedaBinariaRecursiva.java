
package algoritmos;

import java.util.Arrays;



/**
 *
 * @author d3stroya
 */
public class BusquedaBinariaRecursiva {       
    
    public static boolean buscar(int[] array, int num, int izq, int der) {        
        // Calculamos el medio
        if(der >= izq) {
            int med = (izq + der) / 2;
            
            // Comprobamos si el número del medio es el que buscamos
            if(array[med] == num) {
                System.out.println("Número " + num + " encontrado en la posición " + (med + 1));
                return true;
            } else if(array[med] > num) {   // Buscamos el número en la mitad izquierda
                return buscar(array, num, izq, med - 1);
            } else {    // Buscamos el número en la mitad derecha
                return buscar(array, num, med + 1, der);
            }
        }
        // Si llegamos a aquí es porque no se ha encontrado el número
        System.out.println("Número " + num + " no encontrado.");
        return false;
    }
    
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(array));        buscar(array, 0, 0, array.length);
        buscar(array, 3, 0, array.length);
        
    }
}
