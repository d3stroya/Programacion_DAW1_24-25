
package tema02.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe un número: ");
        float num1 = entrada.nextFloat();
        
        System.out.println("Escribe el segundo número: ");
        float num2 = entrada.nextFloat();
        
        System.out.println("Escribe el tercer número: ");
        float num3 = entrada.nextFloat();
        
        float suma = num1 + num2 + num3;
        float producto = num1 * num2 * num3;
        
        System.out.println("La suma de los números introducidos es: " + suma);
        System.out.println("El producto de los números introducidos es: " + producto);
    }
}
