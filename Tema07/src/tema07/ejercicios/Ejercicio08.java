package tema07.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio08 {
    public final static int LONGITUD = 5;
    
    /**
     * Método que pide al usuario un número
     * @return el número
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número de 5 cifras: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que cuenta las cifras de un número
     * iterando sobre él: cuenta las veces que 
     * puede dividirse por 10.
     * @param num
     * @return el número de cifras
     */
    public static int contarCifras(int num) {
        int temp = num;
        int cont = 0;
        
        if(num == 0) {
            cont = 1;
        } else {
            while(temp > 0) {
                temp /= 10;
                cont++;
            }            
        }
        
        return cont;
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
     * Método que comprueba que el número introducido
     * es igual a la longitud del array que nos piden.
     * @param num
     * @return true si el número tiene la cantidad de cifras pedidas y false en caso contrario
     */
    public static boolean comprobarNumCifras(int num) {
        return contarCifrasLog(num) == LONGITUD;
    }
    
    /**
     * Método que divide el número en cifras usando el módulo
     * y va insertando cada cifra en el array.
     * @param num
     * @param array 
     */
    public static void dividirCifras(int num, int[] array) {
        int temp = num;
        for(int i = 0; i < array.length; i++) {
            array[i] = temp % 10;   // Asigno la última cifra a la 1ª posición del array
            temp /= 10;             // Quito la última cifra al número
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
        int[] array = new int[LONGITUD];
        int num;
        
        // Pido un número al usuario hasta que escriba uno de 5 cifras
        do {
            num = pedirNumero();
        } while(!comprobarNumCifras(num));
        
        // Lo divido en cifras y lo muestro al revés
        dividirCifras(num, array);
        mostrar(array);
    }
}
