package tema07.ejercicios;


/**
 *
 * @author d3stroya
 */
public class Ejercicio10 {
    public final static int MAX = 8;
    public final static int MIN = 1;
    public final static int LONGITUD = 10;
    
    /**
     * Método que crea un número aleatorio dentro del rango MIN - MAX
     * @return el número aleatorio
     */
    public static int generarAleatorio() {
        return (int)(Math.random() * (MAX - MIN) + MIN);
    }
    
    /**
     * Método que rellena el array con números aleatorios
     * @param array 
     */
    public static void rellenar(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = generarAleatorio();
        }
    }
      
    /**
     * Método que sustituye los números repetidos del array por ceros.
     * @param array 
     */
    public static void cambiarRepetidos(int[] array) {
        boolean repetido = false;
        int num1, num2;
        
        // Cogemos un número de referencia
        for(int i = 0; i < array.length; i++) {
            num1 = array[i];
            
            if(num1 != 0) { // Ya está en 0, no tenemos que hacer nada
                
                // Comprobamos el resto de números (num2) con el número de referencia (num1)
                for(int j = i + 1; j < array.length; j++) {
                    num2 = array[j];
                    
                    if(num2 == num1) {  // Si coinciden, se sustituye num2 por 0 y marcamos repetido como true
//                        array[i] = 0;
                        array[j] = 0;
                        repetido = true;
                    }
                }   
                
            }
            
            if(repetido) {  // Si el número es repetido, ponemos num1 a 0
                array[i] = 0;                    
                repetido = false;   // IMPORTANTE: reseteamos repetido a false para volver a comprobar. Si no, pondrá todos los números a 0.
            }
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
        int[] array = new int[10];
        rellenar(array);
        mostrar(array);
        cambiarRepetidos(array);
        mostrar(array);
    }
}
