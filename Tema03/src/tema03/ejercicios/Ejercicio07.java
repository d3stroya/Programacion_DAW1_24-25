package tema03.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio07 {

    public static void main(String[] args) {
        // Pido un día al usuario
        int dia;
        boolean laborable = false;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe el número de un día de la semana: ");
        dia = entrada.nextInt();

        // Compruebo si es laborable e imprimo el resultado por pantalla
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable = true;
                System.out.println("¿Es laborable? " + laborable);

                break;
            case 6:
            case 7:
                laborable = false;
                System.out.println("¿Es laborable? " + laborable);
                break;
            default:
                System.out.println("Los días de la semana van del 1 al 7. Escribe un valor válido.");
        }
    }
}
