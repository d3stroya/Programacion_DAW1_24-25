package tema07.ejercicios;

/**
 * 
 * @author d3stroya
 */
public class Ejercicio07_burbuja {
    public final static int MIN = 0;
    public final static int MAX = 50;
    
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
    
    /**
     * Método que rellena el array con números aleatorios
     * en un rango MIN - MAX.
     * 
     * @param array 
     */
    public static void rellenar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumAleatorio(MIN, MAX);
        }
    }
    
    /**
     * Método que ordena el array de mayor a menor
     * usando el método de la burbuja (bubble sort).
     * 
     * @param array 
     */
    public static void burbuja(int[] array) {
        int aux = 0;
        
        // Iteramos n-1 veces (array.length - 1)
        for (int j = 0; j < array.length - 1; j++) {            
            // Vamos comparando de 2 en 2 hasta llegar al final del array
            for (int i = 1; i < array.length; i++) {
                
                // Intercambiamos posiciones si 2º número > 1º número
                if (array[i] > array[i - 1]) {
                    aux = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = aux;
                }
                
            }
        }
    }
    
    /**
     * Método que muestra los 10 primeros números del array
     * 
     * @param array 
     */
    public static void mostrar(int[] array) {
        System.out.println("Mostrando los 10 números mayores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[] array = new int[15];
        rellenar(array);
        burbuja(array);
        mostrar(array);      
    }
}
