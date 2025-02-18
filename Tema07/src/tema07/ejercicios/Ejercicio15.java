package tema07.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio15 {   
    
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
     * Método que rellena el array con números aleatorios entre 10 y 100.
     * 
     * @param array 
     */
    public static void rellenarArray(int[] array) {
        System.out.println("Rellenando ventas...");
        for (int i = 0; i < array.length; i++) {
            array[i] = generarNumAleatorio(10, 100);
        }
        System.out.println("Operación completada.");
    }

    /**
     * Método que muestra el array con los meses y el número de ventas de cada mes.
     * 
     * @param array
     * @param meses 
     */
    public static void mostrarArray(int[] array, String[] meses) {
        System.out.println("Mostrando ventas...");
        for (int i = 0; i < array.length; i++) {
            System.out.println(meses[i] + ": " + array[i]);
        }
    }

    /**
     * Método que muestra el array invertido.
     * 
     * @param array
     * @param meses 
     */
    public static void mostrarArrayInvertido(int[] array, String[] meses) {
        System.out.println("Mostrando ventas al revés...");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(meses[i] + ": " + array[i]);
        }
    }

    /**
     * Método que muestra la suma de ventas totales.
     * 
     * @param array 
     */
    public static void mostrarSumaVentas(int[] array) {
        System.out.println("Mostrando ventas totales...");
        int suma = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            suma += array[i];
        }
        System.out.println("  ->  " + suma);
    }

    /**
     * Método que muestra las ventas de los meses pares.
     * 
     * @param array
     * @param meses 
     */
    public static void mostrarVentasMesesPares(int[] array, String[] meses) {
        System.out.println("Mostrando ventas de los meses pares...");
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.println(meses[i] + ": " + array[i]);
        }
    }

    /**
     * Método que muestra el mes con más ventas.
     * 
     * @param array
     * @param meses 
     */
    public static void mostrarMesConMasVentas(int[] array, String[] meses) {
        int mes = array[0];
        int indiceMes = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > mes) {
                mes = array[i];
                indiceMes = i;
            }
        }
        System.out.println("El mes con más ventas fue " + meses[indiceMes] + " con " + array[indiceMes] + " ventas.");
    }

    /**
     * Método que muestra y gestiona el menú
     * 
     * @param array 
     */
    public static void mostrarMenu(int[] array) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        do {
            System.out.println("1. Rellenar array");
            System.out.println("2. Mostrar array");
            System.out.println("3. Mostrar array al revés");
            System.out.println("4. Mostrar suma total");
            System.out.println("5. Mostrar meses pares");
            System.out.println("6. Mostrar mes con más ventas");
            System.out.println("7. Salir");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    rellenarArray(array);
                case 2 ->
                    mostrarArray(array, meses);
                case 3 ->
                    mostrarArrayInvertido(array, meses);
                case 4 ->
                    mostrarSumaVentas(array);
                case 5 ->
                    mostrarVentasMesesPares(array, meses);
                case 6 ->
                    mostrarMesConMasVentas(array, meses);
                case 7 ->
                    System.out.println("Cerrando...");
            }
        } while (opcion != 7);
    }
    
    /**
     * Método principal
     * 
     * @param args 
     */
    public static void main(String[] args) {
        int[] array = new int[12];
        mostrarMenu(array);
    }
}
