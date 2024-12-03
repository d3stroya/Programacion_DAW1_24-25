
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio33 {
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return entrada.nextInt();
    }
    
    public static int sumaRecursiva(int numero) {
        if(numero == 0) {
            return 0;
        } else {
            return numero + sumaRecursiva(numero - 1); 
        }
    }
    
    public static void main(String[] args) {
        System.out.println("CALCULADORA: N PRIMEROS ENTEROS");
        System.out.println(sumaRecursiva(pedirNumero()));
    }
}
