
package tema06.ejercicios.ejercicio14;

import java.util.Scanner;

/**
 * Clase Test
 * 
 * @author Daniel
 */
public class Test {
    
    public static int pedirCodigo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca c�digo: ");
        return entrada.nextInt();
    }
    
    public static String pedirTitulo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca t�tulo: ");
        return entrada.nextLine();
    }
    
    public static int pedirAnioPublicacion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el a�o de publicaci�n: ");
        return entrada.nextInt();
    }
    
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca n�mero de revista: ");
        return entrada.nextInt();
    }
    
    public static void main(String[] args) {
        
        System.out.println("*** REVISTA ***");
        Revista revista = new Revista(pedirCodigo(), pedirTitulo(), pedirAnioPublicacion(), pedirNumero());
        System.out.println(revista);
        
        System.out.println("\n*** LIBRO ***");
        Libro libro = new Libro(pedirCodigo(), pedirTitulo(), pedirAnioPublicacion(), false);
        System.out.println(libro);
        System.out.println("");
        libro.prestar();
        libro.mostrarPrestado();
        libro.devolver();
        libro.mostrarPrestado();
        
        System.out.println("\n----- POLIMORFISMO -----");
        
        System.out.println("\n*** REVISTA ***");
        Publicacion revista2 = new Revista(pedirCodigo(), pedirTitulo(), pedirAnioPublicacion(), pedirNumero());
        System.out.println(revista2);
        
        System.out.println("\n*** LIBRO ***");
        Prestable libro2 = new Libro(pedirCodigo(), pedirTitulo(), pedirAnioPublicacion(), false);
        System.out.println(libro2);
        System.out.println("");
        libro2.prestar();
        libro2.mostrarPrestado();
        libro2.devolver();
        libro2.mostrarPrestado();        
        
    }
            

}
