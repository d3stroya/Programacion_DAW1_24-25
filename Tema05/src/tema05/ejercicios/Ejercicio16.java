
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio16 {
    public static double pedirNota() {
        double nota = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.print("¿Cuál es su nota? ");
            nota = entrada.nextDouble();
            if(nota < 0 || nota > 10) {
                System.out.println("Error. Por favor, introduzca un valor entre 0 y 10.");  
            }
        } while(nota < 0 || nota > 10);
        
        return nota;
    }
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);    
        System.out.print("Escribe el nombre del alumno: ");
        return entrada.nextLine();
    }
    
    public static void imprimeNota(double nota) {
        System.out.print("Tu calificación es: ");
        if(nota < 5) {
            System.out.println("Suspenso");
        } else if(nota > 4 && nota < 7) {
            System.out.println("Bien");
        } else if(nota > 6 && nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
    
    public static void main(String[] args) {
        Alumno alumno = new Alumno(pedirNombre(), pedirNota());
        imprimeNota(alumno.getNota());
    }
}
