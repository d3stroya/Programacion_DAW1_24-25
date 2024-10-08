package tema03.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio05 {

    public static void main(String[] args) {
        // Pido un número al usuario
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        numero = entrada.nextInt();

        // Compruebo si es par o impar e imprimo el resultado
        if (numero % 2 == 0) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }
    }
}
