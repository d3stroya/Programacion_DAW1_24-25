
package algoritmos;

/**
 *
 * @author d3stroya
 */
public class MetodosFrecuentes {
    /**
     * Método que genera un número aleatorio entre un mínimo y un máximo dados.
     * 
     * @param min
     * @param max
     * @return el número aleatorio generado.
     */
    public static int generarNumAleatorio(int min, int max) {
        return (int)(Math.random() * (max - min) + min);
    }
    
    public static void mostrarArrayInt(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
