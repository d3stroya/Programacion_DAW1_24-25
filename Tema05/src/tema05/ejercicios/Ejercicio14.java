
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio14 {
    /**
     * Método que pide al usuario un número entero por teclado
     * @return el número que escribe el usuario
     */    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return entrada.nextInt();
    }
    
    /**
     * Método main
     * @param args 
     */
    public static void main(String[] args) {
        // Creo un objeto de la clase Número e 
        // imprimo la tabla de multiplicar el número dado por el usuario
        Numero numero = new Numero(pedirNumero());
        numero.imprimirTablaMultiplicar();
    }
}
