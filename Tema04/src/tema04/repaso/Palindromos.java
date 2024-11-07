
package tema04.repaso;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Palindromos {
    /**
     * Método que pide una palabra al usuario
     * @return la palabra escrita por el usuario
     */
    public static String pedirPalabra() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        return entrada.nextLine();
    }
    
    /**
     * Método que devuelve revertida la palabra pasada por parámetro
     * @param palabra
     * @return la palabra revertida
     */
    public static String revertirPalabra(String palabra) {
        String palabraAlReves = "";
        
        for(int i = palabra.length() - 1; i >= 0; i--) {
            palabraAlReves += palabra.charAt(i);
        }
        
        return palabraAlReves;
    }
    
    /**
     * Método que comprueba si una palabra pasada por
     * parámetro es un palíndromo (es igual al derecho y del revés)
     * @param palabra
     * @return true si es palíndromo y false en caso contratio
     */
    public static boolean esPalindromo(String palabra) {
        String palabraAlReves = revertirPalabra(palabra);
        return palabra.equalsIgnoreCase(palabraAlReves);
    }
    
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        String palabra = pedirPalabra();
        System.out.println("¿Es palíndromo?: " + esPalindromo(palabra));
    }
}
