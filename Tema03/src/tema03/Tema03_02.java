/*
    ESTRUCTURAS REPETITIVAS (BUCLES)
    Los bucles nos permiten controlar el flujo del programa
    para repetir acciones un número de veces (conocido o no).
    Por ejemplo:
        - Pierdo las llaves -> busco hasta que las encuentro
        - Un reloj que suena cada hora
        - Un sistema de riego que echa agua mientras el % de humedad de la tierra sea
        inferior a una cantidad preestablecida.

    * Bucles while: mientras se cumpla una condición, se ejecutan unas acciones. 
    Se valora la condición al principio.
    * Bucles do while: se ejecutan unas acciones mientras se cumple una condición. Las acciones
    siempre suceden al menos una vez. Se valora la condición al final.
    * Bucles for: ejecutan unas acciones un número conocido de veces.
*/
package tema03;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Tema03_02 {
    public static void main(String[] args) {
        int a = 5;  // Si a = 0, while y do-while aparentemente hacen lo mismo,
                    // pero si a = 5, while no imprime nada y do-while sí
        
        // WHILE
//        System.out.println("BUCLE WHILE");
//        while(a < 5) {
//            System.out.println(a);
//            a++;
//        }
        
//        // DO WHILE
//        System.out.println("\nBUCLE DO-WHILE");
//        a = 5;
//        do {
//            System.out.println(a);
//            a++;
//        } while(a < 5);
        
//        // FOR
//        System.out.println("\nBUCLE FOR");
//        for(int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
        
//        // Usaremos mucho los bucles do-while para crear menús de opciones
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        
        do {
            // Mostramos las opciones
            System.out.println("\n1. Aparcar coche");
            System.out.println("2. Buscar coche por matrícula");
            System.out.println("3. Pagar");
            System.out.println("4. Salir");
            
            // Pedimos una opción al usuario
            System.out.print("Elige una opción: ");            
            opcion = entrada.nextInt();
            
            // Ejecutamos una acción u otra dependiendo de la opción del usuario
            switch (opcion) {
                case 1:
                    System.out.println("\nAparcar");
                    break;
                case 2: 
                    System.out.println("\nBuscar");
                    break;
                case 3:
                    System.out.println("\nPagar");
                    break;
                case 4:
                    System.out.println("\nSalir");
                    break;
                default:
                    System.out.println("\nIntroduce una oción válida");
            }
            
        } while(opcion != 4);   
        // 4 es el valor para salir del menú (del bucle). 
        // Mientras pulsemos otro número, seguiremos en el bucle 
        // (interactuando con el programa)
        
    }
}
