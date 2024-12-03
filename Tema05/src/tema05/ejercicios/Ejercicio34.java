
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio34 {
    public static void invertirNumero(int numero) {
        if(numero < 10) 
        {
            System.out.println(numero);
        } else {
            System.out.print(numero % 10);
            invertirNumero(numero / 10);
        }
    }
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return entrada.nextInt();
    }
    
    public static void main(String[] args) {
        invertirNumero(pedirNumero());
    }
}
