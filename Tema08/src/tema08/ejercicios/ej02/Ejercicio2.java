package tema08.ejercicios.ej02;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int[] array = new int[pedirLongitud()];
        rellenarArray(array);
        mostrarArray(array);
    }

    /**
     * Método que pide al usuario la longitud de un array. Esa longitud debe
     * estar entre 1 y 10. Si no se cumple, se imprime un mensaje y se vuelve a
     * pedir el número. También se controla que el usuario introduzca un número
     * entero y no otro tipo de dato.
     *
     * @return el número
     */
    public static int pedirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        
        do {
            try {
                System.out.print("Elige la longitud del array (entre 1 y 10): ");
                numero = entrada.nextInt();
                if (numero < 1 || numero > 10) {
                    System.out.println("Por favor, introudce un número entre 1 y 10");
                }

            } catch (InputMismatchException e) {
                System.out.println("Dato no válido. Introduce un número");
                entrada.next();
            }
        } while (numero < 1 || numero > 10);
        
        return numero;
    }    

    /**
     * Método que genera un número aleatorio entre un mínimo y un máximo
     * 
     * @param min
     * @param max
     * @return el número aleatorio
     */
    public static int generarNumeroAleatorio(int min, int max) {
        return (int) (Math.random() * (max + 1 - min) + min);
    }

    /**
     * Método que rellena el array con números aleatorios entre el 1 y el 6
     * 
     * @param array 
     */
    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumeroAleatorio(1, 6);
        }
    }

    /**
     * Método que muestra el array por pantalla
     * 
     * @param array 
     */
    public static void mostrarArray(int[] array) {
        for (int numero : array) {
            System.out.print("[" + numero + "]");
        }
    }
}
