
package tema03.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        // Pido el número al usuario y lo almaceno en la variable numero
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número entero positivo o negativo: ");
        numero = entrada.nextInt();
        
        // Compruebo si numero es mayor o menor que 0 e informo al usuario
        if(numero > 0) {
            System.out.println("El número es positivo");
        } else if(numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }
    }
}
