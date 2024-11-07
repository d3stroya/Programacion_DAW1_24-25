
package tema04.repaso;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class NumeroPerfecto {
    /**
     * Método que pide un número positivo al usuario.
     * Si el usuario introduce un número menor o igual a 0,
     * se le vuelve a pedir hasta que escriba uno positivo
     * @return el número positivo
     */
    public static int pedirNumeroPositivo() {
        Scanner entrada = new Scanner(System.in);        
        int numero; 
        
        do {
            System.out.print("Escribe un número positivo: ");
            numero = entrada.nextInt();
            
            if(numero <= 0) {
                System.out.println("Por favor, introduce un número positivo");
            }
            
        } while(numero <= 0);
        
        return numero;
    }
    
    /**
     * Método que comprueba si un número es perfecto,
     * es decir, si es igual a la suma de sus divisores
     * @param numero
     * @return true es el número es perfecto y false en caso contrario
     */
    public static boolean esPerfecto(int numero) {
        int suma = 0;
        
        // Iteramos desde 1 hasta el número dado para encontrar sus divisores
        for(int i = 1; i < (numero); i++) {
            // Si i es divisor de numero, se suma
            if(numero % i == 0) {
                suma += i;
            }
        }
        // Devuelve true si numero es igual a suma
        return numero == suma;
    }
    
    public static void main(String[] args) {
        int numero = pedirNumeroPositivo();
        System.out.println(esPerfecto(numero));
    }
}
