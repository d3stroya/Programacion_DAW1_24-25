
package tema04.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio11 {
    // Pedimos un número positivo al usuario 
    public static double pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número positivo: ");
        return entrada.nextDouble();
    }
    
    // Comprobamos que el número sea positivo
    public static boolean esValido(double numero) {
        return numero > 0;
    }
    
    // Si el número no es positivo, volvemos a pedirlo
    public static double validarNumero() {
        double numero = 0;
        
        do {
            numero = pedirNumero();            
        } while(!esValido(numero));
        
        return numero;
    }

    // Calculamos la raíz cuadrada
    public static double raizCuadrada(double numero) {
        return Math.sqrt(numero);
    }
    
    // Mostramos el resultado por pantalla
    public static void mostrarRaizCuadrada(double numero) {
        System.out.println(raizCuadrada(numero));
    }
    
    public static void main(String[] args) {        
        // Usamos los métodos creados para pedir un número positivo,
        // calcular su raíz cuadrada y mostrar el restuldado
        double numero = validarNumero();
        mostrarRaizCuadrada(raizCuadrada(numero));
    }
}
