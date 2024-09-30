
package tema02.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nota de Programación: ");
        float notaProg = entrada.nextFloat();
        System.out.println("Nota de Lenguajes de marcas: ");
        float notaLM = entrada.nextFloat();
        System.out.println("Nota de Bases de datos: ");
        float notaBBDD = entrada.nextFloat();
        System.out.println("Nota de Entornos de desarrollo: ");
        float notaED = entrada.nextFloat();
        System.out.println("Nota de Sistemas informáticos: ");
        float notaSI = entrada.nextFloat();
        System.out.println("Nota de IPE: ");
        float notaIPE = entrada.nextFloat();
        
        float media = (notaProg + notaLM + notaBBDD + notaED + notaSI + notaIPE) / 6;
        
        System.out.println("Su nota media del curso es de: " + media);
    }
}
