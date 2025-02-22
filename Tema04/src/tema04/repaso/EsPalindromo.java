
package tema04.repaso;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class EsPalindromo {
    /**
     * Método que le pide al usuario una palabra
     * @return la palabra
     */
    public static String pedirPalabra() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe una palabra: ");
        return entrada.nextLine();
    }
    
    /**
     * Método que devuelve al revés una palabra pasada por parámetro
     * @param palabra
     * @return la palabra al revés
     */
    public static String revertirPalabra(String palabra) {
        String palabraAlReves = "";
        
        for(int i = palabra.length() - 1; i >= 0; i--) {
            palabraAlReves += palabra.charAt(i);
        }
        
        return palabraAlReves;
    }
    
    /**
     * Método que comprueba si una palabra pasada por parámetro
     * es un palíndromo o no
     * @param palabra
     * @return true si es palíndromo y false en caso contrario
     */
    public static boolean esPalindromo(String palabra) {
        String palabraAlReves = revertirPalabra(palabra);

//        if(palabraAlReves.equalsIgnoreCase(palabra)) {
//            return true;
//        } else {
//            return false;
//        }
        
        return palabraAlReves.equalsIgnoreCase(palabra);
    }
    
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        String palabra = pedirPalabra();
        if(esPalindromo(palabra)) {
            System.out.println(palabra + " es palíndromo");
        } else {
            System.out.println(palabra + " no es palíndromo");
        }
    }
}
