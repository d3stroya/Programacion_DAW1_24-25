package tema07.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio09 {
    /**
     * Método que pide al usuario un número
     * @return 
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que cuenta las cifras de un número
     * a través de su logaritmo en base 10. 
     * @param num
     * @return el número de cifras
     */
    public static int contarCifrasLog(int num) {
        if(num == 0) {
            return 1;
        } else {
            return (int)(Math.log10(Math.abs(num)) + 1);
        }
    }
    
    /**
     * Método que divide el número en cifras usando el módulo
     * y va insertando cada cifra en el array.
     * @param num
     * @param array 
     */
    public static void dividirCifras(int num, int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = num % 10;   // Asigno la última cifra a la 1ª posición del array
            num /= 10;             // Quito la última cifra al número
        }
    }
    
    /**
     * Método que muestra el array
     * @param array 
     */
    public static void mostrar(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }
        System.out.println("");
    }
    
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        int num = pedirNumero();
        int longitud = contarCifrasLog(num);
        int[] array = new int[longitud];
        dividirCifras(num, array);
        mostrar(array);
    }
}
