
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio35 {
    public static int sumaDigitos(int numero) {
        if(numero < 10) {
            return numero;
        } else {
            return numero % 10 + sumaDigitos(numero / 10);
        }
    }
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return entrada.nextInt();
    }
    
    public static void main(String[] args) {
        System.out.println(sumaDigitos(pedirNumero()));
    }
}
