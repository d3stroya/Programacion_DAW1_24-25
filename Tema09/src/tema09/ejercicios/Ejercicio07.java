
package tema09.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        String frase = pedirFrase();
        String[] frases = frase.split(" ");
        mostrarArrayAlReves(frases);        
    }
    
    public static String pedirFrase() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una frase:");
        return entrada.nextLine();
    }
    
    public static void mostrarArrayAlReves(String[] frases) {
        System.out.println("");
        for(int i = frases.length - 1; i >= 0; i--) {
            System.out.println(frases[i]);
        }
    }
}
