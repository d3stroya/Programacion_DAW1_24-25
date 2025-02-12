
package tema07.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio07_insercion {
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
     * Método que incializa todos los valores del array a -1
     * para que no coincida con el rango 0 - 50 de los números
     * aleatorios que vamos a insertar.
     * 
     * @param array15 
     */
    public static void inicializar(int[] array15) {
        for(int i = 0; i < array15.length; i++) {
            array15[i] = -1;
        }
    }
    
    /**
     * Método que inserta en el array los números ordenados de mayor a menor.
     * Comprueba si el número es mayor que cada uno de los números del array.
     * Cuando lo encuentra, guarda la posición, desplaza el resto de números
     * 1 posición a la derecha y finalmente inserta el número en la posición encontrada.
     * 
     * @param array15
     * @param num 
     */
    public static void insertarNumOrdenados(int[] array15, int num) {
        System.out.println("-> Insertando número...");
        boolean enc = false;
        int pos = 0, i = 0;
        
        // Buscamos posición para colocar el número
        while(!enc && i < array15.length) {
            if(array15[i] < num) {  // La hemos encontrado
                enc = true;
                pos = i;            // Guardamos la posición para insertar el número
            } else {
                i++;                // Guardamos el siguiente índice
            }
        }
        
        // Desplazamos el resto de números 1 posición a la derecha
        if(enc) {
            for(i = array15.length - 1; i > pos; i--) {
                array15[i] = array15[i - 1];    // Guardamos en la celda actual el número previo
            }
            array15[pos] = num;
            System.out.println("[√] " + num + " insertado correctamente.");
        }            
    }
    
    /**
     * Método que rellena un array con 15 números aleatorios
     * entre un máximo y un mínimo dados.
     * 
     * @param array15 
     */
    public static void rellenar(int[] array15) {
        System.out.println("-> Rellenando array...");
        for(int i = 0; i < array15.length; i++) {
            insertarNumOrdenados(array15, generarNumAleatorio(MIN, MAX));
        }
        System.out.println("[√] Array relleno correctamente.");
    }
    
    public static void mostrar(int[] array15) {
        System.out.println("\n- MOSTRAR ARRAY -");
        for(int i = 0; i < 10; i++) {
            System.out.print("[" + array15[i] + "] ");
        }
    }
    
    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array15 = new int[15];
        inicializar(array15);
        rellenar(array15);
        mostrar(array15);
    }
}
