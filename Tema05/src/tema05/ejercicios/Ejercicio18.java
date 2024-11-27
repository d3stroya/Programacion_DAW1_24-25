
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio18 {
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return entrada.nextInt();
    }
    
    public static void realizarOperacion(Numero n1, Numero n2) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1.- Sumar los números.");
            System.out.println("2.- Restar los números.");
            System.out.println("3.- Multiplicar los números.");
            System.out.println("4.- Dividir los números.");
            System.out.println("5.- Salir del programa.");
            opcion = entrada.nextInt();
            
            try {
                switch (opcion) {
                    case 1:
                        System.out.println("Suma: " + (n1.getValor() + n2.getValor()));
                        break;
                    case 2:
                        System.out.println("Resta: " + (n1.getValor() - n2.getValor()));
                        break;
                    case 3:
                        System.out.println("Multiplicación: " + (n1.getValor() * n2.getValor()));
                        break;
                    case 4:
                        System.out.println("División: " + (n1.getValor() / n2.getValor()));
                        break;
                    case 5:
                        break;
                }
            } catch(ArithmeticException e) {
                System.out.println("Operación inválida");
                opcion = 5;
              
            }            
        } while(opcion != 5);
        
        
    }
    
    public static void main(String[] args) {
        realizarOperacion(new Numero(pedirNumero()), new Numero(pedirNumero()));
    }
}
