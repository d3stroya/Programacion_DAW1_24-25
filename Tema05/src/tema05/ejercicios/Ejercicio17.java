// Eliminar acentos en Strings Java: https://loquemeinteresadelared.wordpress.com/2015/10/01/eliminar-acentos-y-diacriticos-de-un-string-en-java/

package tema05.ejercicios;

import java.text.Normalizer;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio17 {
    /**
     * Método para limpiar Strings de tildes
     * @param texto
     * @return 
     */
    public static String cleanString(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }
    
    /**
     * Método que hace una pregunta al usuario, 
     * lee su respuesta, la compara con la respuesta correcta
     * del enunciado y devuelve true si la respuesta coincide con la correcta.
     * 
     * Limpia de espacios delante y detrás de la respuesta
     * y de tildes los Strings, tanto del enunciado como de 
     * la respuesta del usuario
     * 
     * @param enunciado
     * @return true si la respuesta coincide con la correcta y false en caso contrario
     */
    public static boolean preguntar(Enunciado enunciado) {
        String respuesta;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(enunciado.getPregunta());
        respuesta = entrada.nextLine();
        
        // Limpiamos la respuesta de espacios antes y después y de tildes
        respuesta = cleanString(respuesta.trim());
        
        return respuesta.equalsIgnoreCase(cleanString(enunciado.getRespuesta()));
    }
    
    public static void main(String[] args) {
        Enunciado enunciado1 = new Enunciado("¿Cuál es el tipo de dato que puede tomar los valores true o false?", "boolean");
        Enunciado enunciado2 = new Enunciado("¿Qué símbolos usamos para escribir cadenas de caracteres?", "Comillas dobles");
        Enunciado enunciado3 = new Enunciado("¿Qué símbolos usamos para escribir un caracter?", "Comillas simples");
        Enunciado enunciado4 = new Enunciado("¿Cómo se llama el paradigma que trabaja con objetos?", "Programación orientada a objetos");
        
        double nota = 0;
        if(preguntar(enunciado1))
            nota += 2.5;
        
        if(preguntar(enunciado2))
            nota += 2.5;
        
        if(preguntar(enunciado3))
            nota += 2.5;
        
        if(preguntar(enunciado4))
            nota += 2.5;
  
        System.out.println("Calificación final: " + nota);
    }
}
