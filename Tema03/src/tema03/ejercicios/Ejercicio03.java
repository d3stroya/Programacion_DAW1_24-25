
package tema03.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe un número: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Escribe otro número: ");
        numero2 = entrada.nextInt();
        
        System.out.print("Escribe el tercer número: ");
        numero3 = entrada.nextInt();
        
        // Compruebo cuál es el mayor y lo imprimo
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.print(numero1 + " es el mayor.");
        } else if (numero2 > numero3) {
            System.out.print(numero2 + " es el mayor.");
        } else {
            System.out.println(numero3 + " es el mayor.");
        }
    }
}
