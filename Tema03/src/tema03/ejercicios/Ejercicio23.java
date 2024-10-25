
package tema03.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        // Declaramos las variables
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
         
        // Pedimos un número al usuario mayor que 1
        do {
            // (Opcional) Controlamos que el usuario introduzca un número entero
            try {
                System.out.print("Introduce un número entero mayor que 1: ");
                numero = entrada.nextInt();
                
                // Mostramos mensaje de error si el número introducido es menor o igual que 1
                if(numero <= 1) {
                    System.out.println("El número debe ser mayor que 1");
                }
            } catch(InputMismatchException e) {
                System.out.print("Por favor, introduce un número entero mayor que 1: ");
            }
        } while(numero <= 1);       // Controlamos que el número sea mayor que 1 y si no, volvemos a pedirlo
        
        // Impimimos los números entre el 1 y el introducido por el usuario
        for(int i = 1; numero >= i; i++) {
            System.out.println(i);
        }
        
        
    }
}
