
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio12 {
    /**
     * Método que pide al usuario un número por teclado (puede ser decimal)
     * @return el número dado
     */
    public static double pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return entrada.nextDouble();
    }
    
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        // Creo un triángulo con el constructor parametrizado,
        // pidiédole los datos de los catetos al usuario.
        Triangulo triangulo = new Triangulo(pedirNumero(), pedirNumero());
        
        // Calculo e imprimo la hipotenusa
        System.out.println(triangulo.calcularHipotenusa());
    }
}
