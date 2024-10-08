
package tema03.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        // Pido los números al usuario y los almaceno en las variables numero1 y numero2
        int numero1, numero2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escribe un número: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Escribe otro número: ");
        numero2 = entrada.nextInt();
        
        // Compruebo si numero1 es mayor que 10. En ese caso, multiplico ambos. Si no, los sumo
        if(numero1 > 10) {
            System.out.println(numero1 + " * " + numero2 + " = " + numero1 *  numero2);
        } else {
            // Ojo: tenemos que meter la suma entre paréntesis para que haga la suma y no la concatenación de texto
            System.out.println(numero1 + " + " + numero2 + " = " + (numero1 +  numero2)); 
        }
    }
}
