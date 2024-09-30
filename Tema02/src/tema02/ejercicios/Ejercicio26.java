
package tema02.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número entero de 4 cifras: ");
        int num = entrada.nextInt();
        int aux = num;  // Guardo el número para operar con él y mantener el original en num
        
        int millares = aux / 1000;
        aux %= 1000;
        int centenas = aux / 100;
        aux %= 100;
        int decenas = aux / 10;
        int unidades = aux % 10;  
        
        System.out.println("La primera cifra es " + millares);
        System.out.println("La segunda cifra es " + centenas);
        System.out.println("La primera cifra es " + decenas);
        System.out.println("La primera cifra es " + unidades);
        
    }
}
