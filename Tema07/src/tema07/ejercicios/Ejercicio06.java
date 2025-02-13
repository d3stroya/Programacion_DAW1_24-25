package tema07.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio06 {
    public final static int MAX = 80;

    /**
     * Método que comprueba si un número es primo
     * buscándole un divisor. Si tiene divisor, no es primo.
     * En caso contrario, es primo.
     * @param num
     * @return true si el número es primo y false en caso contrario.
     */
    public static boolean esPrimo(int num) {
        boolean enc = true;     // Partimos de la hipótesis de que num es primo
        int i = 2;              // Índice con el comprobar si es divisor de num. Sabemos que 1 es divisor siempre, así que empezamos desde 2
        
        // Recorremos desde 2 hasta √num comprobando si i es divisor de num
        while(enc && i <= Math.sqrt(num)) {
            if(num % i == 0) {
                enc = false;    // Hemos encontrado un divisor
            } else {
                i++;    // Seguimos probando con el siguiente número
            }
        }
        
        return enc;
    }
    
    /**
     * Método que rellena un array con los 80 primeros números primos.
     * Lleva la cuenta de los primos y va comprobando desde el número 1
     * si cada número es primo, incrementando en 1 el número en cada iteración.
     * Cuando encontramos un primo, se suma 1 al contador y se añade el número
     * al array en la posición del contador.
     * 
     * @param primos 
     */
    public static void rellenarArray(int[] primos) {
        int contador = 0;
        int num = 1;
        
        while(contador < MAX) {
            if(esPrimo(num)) {
                primos[contador] = num;
                contador++;
            }
            
            num++;
        }
    }
    
    public static void mostrarArray(int[] primos) {
        for(int i = 0; i < primos.length; i++) {
//            System.out.print("Pos: [" + i + "] ");
            System.out.print("[" + primos[i] + "] ");
//            System.out.println("");
        }
    }

    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] primos = new int[MAX];
        rellenarArray(primos);
        mostrarArray(primos);
    }
}
