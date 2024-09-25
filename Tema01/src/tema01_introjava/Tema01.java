
package tema01_introjava;

// COMENTARIOS DE UNA LÍNEA

/*
    COMENTARIOS DE BLOQUE
*/

/**
 * COMENTARIOS DE JAVA DOC
 */


/**
 *
 * @author d3stroya
 * @version 1.0
 * @since 2024
 * 
 * 
 */

// Clase llamada Tema01
public class Tema01 {
    
    // Atributos de la clase (propiedades, características)
    static int num1 = 6;

    
    // Métodos de la clase (comportamiento)
    /**
     * Método principal (main)
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("Número: " + num1);
        
        System.out.println(suma(3));
    }  
    
    /**
     * 
     * @param num2
     * @param num3 
     */
    public static void restar(int num2, int num3) {
       
    }
   
    /**
     * Método que devuelve la <b>suma</b> de num1 
     * y otro número pasado por parámetro
     * 
     * @param num2
     * @return la suma de num1 y num2
     * @deprecated 
     */
    @Deprecated
    public static int suma(int num2) {
        return num1 + num2;
    }

}
