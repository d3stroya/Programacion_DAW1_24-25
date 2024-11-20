
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio09 {
    /**
     * Método que pide un número al usuario por teclado
     * y crea un objeto con el valor del número dado por el usuario
     * @return el objeto número
     */
    public static Numero pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return new Numero(entrada.nextInt());
    }
    
    /**
     * Método que imprime el número mayor de los 3 pasados por parámetro
     * @param num1
     * @param num2
     * @param num3 
     */
    public static void imprimirNumMayor(Numero num1, Numero num2, Numero num3) {
        if(num1.getValor() > num2.getValor() && num1.getValor() > num3.getValor()) {
            System.out.println(num1);
        } else if(num2.getValor() > num1.getValor() && num2.getValor() > num3.getValor()) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
    
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        // Creo los 3 números e imprimo por pantalla el mayor de ellos
        Numero num1 = pedirNumero();
        Numero num2 = pedirNumero();
        Numero num3 = pedirNumero();
        
        imprimirNumMayor(num1, num2, num3);
    }
}
