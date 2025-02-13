package tema07.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio11 {
    public final static int MIN = 0;
    public final static int MAX = 9;
    public final static int LONGITUD = 10;
    
    /**
     * Método que crea un número aleatorio dentro del rango MIN - MAX
     * @return el número aleatorio
     */
    public static int generarAleatorio() {
        return (int)(Math.random() * (MAX + 1 - MIN) + MIN);
    }
    
    /**
     * Método que incializa todas las posiciones del array a -1
     * @param array 
     */
    public static void inicializar(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = -1;
        }
    }
    
    /**
     * Método que comprueba si un número ya está en el array
     * @param num
     * @param array 
     * @return true si el número es repetido y false en caso contrario
     */
    public static boolean esRepetido(int num, int[] array) {
        boolean enc = false;
        int i = 0;
        
        while(!enc && i < array.length) {
            if(array[i] == num) {
                enc = true;
            } else {
                i++;
            }
        }
        
        return enc;
    }
    
    /**
     * Método que inserta números únicos (no repetidos) en el array
     * @param array 
     */
    public static void insertarNumerosUnicos(int[] array) {
        int num;
        boolean repetido = false;
        
        // Itero sobre cada posición del array generando un aleatorio 
        // hasta que sea único. Cuando lo es, lo inserto.
        for(int i = 0; i < array.length; i++) {
            do {
                num = generarAleatorio();
                repetido = esRepetido(num, array);
            } while(repetido);
            
            array[i] = num;
        }                
    }
    
    /**
     * Método que muestra el array
     * @param array 
     */
    public static void mostrar(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("");
    }
    
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        int[] array = new int[LONGITUD];
        inicializar(array);
        insertarNumerosUnicos(array);
        mostrar(array);
    }
}
