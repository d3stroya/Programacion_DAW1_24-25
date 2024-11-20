
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio11 {
    /**
     * Método que pide al usuario un número entero por teclado
     * @return el número dado por el usuario
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
        // Creo los números con el constructor por defecto
        Numero num1 = new Numero();
        Numero num2 = new Numero();
        
        // Les asigno los valores con los setters
        num1.setValor(pedirNumero());
        num2.setValor(pedirNumero());
        
        // Imprimo la suma de los números si num1 < 10 y la multiplicación de los mismos si num1 > 10
        if(num1.getValor() > num2.getValor()) {
            System.out.println(num1.getValor() * num2.getValor());
        } else {
            System.out.println(num1.getValor() + num2.getValor());
        }
    }
}
