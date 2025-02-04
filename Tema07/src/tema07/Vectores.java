
package tema07;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Vectores {
    public static void main(String[] args) {
        // Declarar e inicializar un vector
        int[] edades = new int[8];
        
        // Acceder a una posición del array para mostrarla
//        System.out.println(edades[1]);
    
        // Asignar un valor a una posición
//        edades[1] = 7;
        
        // [!] Desbordar un array
//        System.out.println(edades[8]);

        // Controlar el desbordamiento del array
//        try {
//            System.out.println(edades[8]);            
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("Estás intentando acceder a una posición que no existe");
//        }

//        int[] array2 = new int[pedirEntero()];
//        System.out.println("Array creado con una longitud de " + array2.length);

        rellenarConAleatorios(edades);
        
        System.out.println("Mostrando valores del array");
        mostrar(edades);
        
        System.out.println("\nMostrando índice - valor del array");
        mostrarIndiceValor(edades);
        
        System.out.println("\nMostrando array al revés");
        mostrarAlReves(edades);
        
        System.out.println("\nMostrando números pares");
        mostrarPares(edades);
        
        System.out.println("\nBuscando número 9 en el array");
        buscarNumero(edades);
        
        // Intercambiar posiciones en el array
        int temp1 = edades[2];
        edades[2] = edades[3];        
        edades[3] = temp1;
    }

    // Declarar un array con una longitud elegida por el usuario
    public static int pedirEntero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        return entrada.nextInt();
    }
   
    // Rellenar un vector con números aleatorios
    public static void rellenarConAleatorios(int[] edades) {
        for(int i = 0; i < edades.length; i++) {
            edades[i] = (int)(Math.random() * 10 + 1);
        }        
    }

    // Rellenar un vector con números introducidos por el usuario
    public static void rellenarUsuario(int[] edades) {        
        for(int i = 0; i < edades.length; i++) {
            edades[i] = pedirEntero();
        }        
    }    

    // Recorrer y mostrar un array
    public static void mostrar(int[] edades) {
        for(int i = 0; i < edades.length; i++) {
            System.out.print(edades[i] + " ");
        }
    }

    // Recorrer un array mostrando índice - valor   
    public static void mostrarIndiceValor(int[] edades) {
        for(int i = 0; i < edades.length; i++) {
            System.out.println("Índice: " + i + " - " + edades[i]);
        }
    }    

    // Recorrer y mostrar un array al revés
    public static void mostrarAlReves(int[] edades) {
        for(int i = edades.length - 1; i >= 0; i--) {
            System.out.print("[" + edades[i] + "] ");
        }
        System.out.println("");
    }        

    // Mostrar sólo los valores pares del array
    public static void mostrarPares(int[] edades) {
        for(int i = 0; i < edades.length; i++) {
            if(edades[i] % 2 == 0) {
                System.out.println(edades[i]);
            }
        }
    }

    // Buscar un valor en el array
    public static void buscarNumero(int[] edades) {
        int i = 0;
        boolean encontrado = false;
        
        while(!encontrado && i < edades.length) {
            if(edades[i] == 9) {
                encontrado = true;
                System.out.println("Número encontrado: " + edades[i] + " en la posición " + (i + 1));
            } else {
                i++;
            }
        }
        
        if(!encontrado) {
            System.out.println("No se ha encontrado el número");
        }
    }
    
    
    
        
}
