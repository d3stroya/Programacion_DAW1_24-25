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

    - Declarar un método que devuelve un tipo de dato
        Los métodos pueden ser de diferentes tipos, igual que las variables,
        cuando devuelven algún tipo de dato. Por ejemplo, podemos crear
        un método que sume 2 números enteros y devuelva la suma de ellos. Será un
        método de tipo int.

        public static int suma(int numero1, int numero2) {
            // Aquí va tu código
        }
*/

package tema04;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Tema04_1 {

    // 1. SUBPROGRAMAS (MÉTODOS)
    // Declaro el método público, estático y de tipo void (no devuelve nada)
    public static void muestraEdadyAltura(byte edad, float altura) {
        System.out.println("Tengo " + edad + " años.");
        System.out.println("Mido " + altura + " metros.");
    }
    
    // Declaro un método privado, estático y de tipo void
    private static void muestraEdad(byte edad) {
        System.out.println("Tengo " + edad + " años.");
    }
    
    
    
    
    
     // 2. TIPOS DE MÉTODOS: SENTENCIA RETURN
    public static int pedirEdad() {
        System.out.print("¿Cuál es tu edad? ");
        Scanner entrada = new Scanner(System.in);
        int edad = entrada.nextInt();
        return edad;
    }
    
    public static float pedirDecimal() {
        System.out.print("Escribe un número: ");
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }
    
    public static float sumar(float numero1, float numero2) {
//        float suma = numero1 + numero2;
//        return suma;
        return numero1 + numero2;
    }
    
    
   
    
    
    // Método main
    public static void main(String[] args) {
        // 1. SUBPROGRAMAS (MÉTODOS)
        // Declaro las variables
//        byte edad;
//        float altura;
//        
//        // Inicializo las variables
//        edad = 55;
//        altura = 1.75f;
//        
//        // Invoco el método pasándole las variables por parámetro
//        muestraEdadyAltura(edad, altura);
        
        
        // 2. TIPOS DE MÉTODOS: SENTENCIA RETURN
        // Invoco al método pedir edad, que devuelve un entero 
        // y guardo su valor en la variable edad
//        int edadPedida = pedirEdad();
//        
//        // Imprimo la edad que ha dado el usuario
//        System.out.println("Tu edad es " + edadPedida);
        
        // Declaro las variables
        float numero1, numero2, suma;
        
        // Pido los números invocando al método pedirDecimal()
        numero1 = pedirDecimal();
        numero2 = pedirDecimal();
        
        // Invoco al método suma pasándole por parámetro los números que me ha dado el usuario
        suma = sumar(numero1, numero2);
        
        // Imprimo por pantalla el resultado
        System.out.println("\n" + suma);
        
        // Otra forma de hacer lo mismo
        System.out.println("\n" + sumar(pedirDecimal(), pedirDecimal()));
    }
    
   

}
