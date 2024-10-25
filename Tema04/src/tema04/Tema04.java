/*
    SUBPROGRAMAS (MÉTODOS)
    Los métodos son bloques de código que resuleven un problema,
    de manera que podemos reutilizarlo en lugar de repetir el código
    cada vez que necesitemos dar esa solución.

    De momento vamos a ver métodos estáticos, que son los que
    pertenecen a la clase y no necesitamos crear objetos para llamar
    a esos métodos.

    - Declarar un método: 
        public static void [nombre] ([parámetros]) {
            // Aquí va tu código
        }
       
        * Recuerda dar nombres identificativos a los métodos
        * Los parámetros son variables de entrada que le damos al método
        para que opere con ellos.
        * Los métodos public son accesibles desde otras clases. 
        Los métodos private no son accesibles desde otras clases.
        
    - Invocar el método desde la clase:
        [nombre del método] ([parámetros]);

    - Invocar el método desde otra clase:
        [nombre de la clase].[nombre del método] ([parámetros]);
*/

package tema04;
/**
 *
 * @author d3stroya
 */
public class Tema04 {

    // Declaro el método público, estático y de tipo void (no devuelve nada)
    public static void muestraEdadyAltura(byte edad, float altura) {
        System.out.println("Tengo " + edad + " años.");
        System.out.println("Mido " + altura + " metros.");
    }
    
    // Declaro un método privado, estático y de tipo void
    private static void muestraEdad(byte edad) {
        System.out.println("Tengo " + edad + " años.");
    }
    
    // Método main
    public static void main(String[] args) {
        
        // Declaro las variables
        byte edad;
        float altura;
        
        // Inicializo las variables
        edad = 55;
        altura = 1.75f;
        
        // Invoco el método pasándole las variables por parámetro
        muestraEdadyAltura(edad, altura);
    }

}
