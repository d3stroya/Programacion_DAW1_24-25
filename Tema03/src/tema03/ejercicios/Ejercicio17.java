
package tema03.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numUsuario;
        
        do {
            System.out.print("Escribe un número para calcular su raíz cuadrada: ");
            numUsuario = entrada.nextFloat();
            System.out.println("El resultado es " + Math.sqrt(numUsuario));
        } while(numUsuario < 0);
    }
}
