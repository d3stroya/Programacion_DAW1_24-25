package tema07.ejercicios;

import static algoritmos.MetodosFrecuentes.*;


/**
 *
 * @author d3stroya
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        int[] array = new int[10];
        rellenarArray(array);
        mostrarArrayInt(array);
        ordenarArray(array);
        mostrarArrayInt(array);
    }

    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumAleatorio(0, 9);
        }
    }

    public static void ordenarArray(int[] array) {
        int aux = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }
}
