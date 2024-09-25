
package tema02;

/**
 *
 * @author d3stroya
 */
public class Suma {
    // Variable de ámbito global (puedes ver que el IDE marca la variable en cursiva).
    static int numero1 = 50;
    
    public static void metodoPrueba() {
        // Variable de ámbito local
        int numero3 = 10;
    }
    
    public static void main(String[] args) {
        // Declaración de 2 variables de un mismo tipo en una línea
        int numero2, suma;
        
        // Incialización de la variable numero2
        numero2 = 30;
        
        // Sentencia que almacena en la variable suma el resultado de sumar las variables numero1 y numero2
        suma = numero1 + numero2;
        
        // Sentencia que imprime por pantalla la suma de los 2 números.
        // Ten en cuenta que cuando imprimimos un mensaje por pantalla, podemos
        // concatenar varios valores usando el símbolo +.
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        
        //suma = numero3 + numero2; // Da error porque numero3 es una variable local de metodoPrueba, así que no podemos acceder a ella desde aquí
    }
}
