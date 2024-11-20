
package tema05;

import java.time.LocalDate;

/**
 *
 * @author d3stroya
 */
public class EjemploBibliotecaMain {
    public static void main(String[] args) {
        // 1. INSTANCIACIÓN DE OBJETOS CON CONSTRUCTORES
        // Creo un libro con el constructor por defecto
        Libro libro = new Libro();
        
        // Creo un libro con el constructor parametrizado
        Libro aprendeAProgramar = new Libro(
                new Prestamo(),     // Creo un préstamo con el constructor por defecto
                "Aprende a programar", 
                "No ficción", 
                "E45136S938", 
                "María García"
        );
        
        // Creo 3 bibliotecas, con los 3 constructores que he implementado en Biblioteca.java
        Biblioteca biblioteca1 = new Biblioteca();
        Biblioteca biblioteca2 = new Biblioteca(2, 4, libro, new Usuario(), new Trabajador());
        Biblioteca biblioteca3 = new Biblioteca(aprendeAProgramar);
        
        
        // 2. ASIGNACIÓN Y OBTENCIÓN DE DATOS CON SETTER Y GETTER
        // Asigno un libro a la biblioteca1 con el setter
        biblioteca1.setLibro(new Libro());
        
        // Uso el getter para obtener el libro de la biblioteca1 y lo imprimo por pantalla
        System.out.println("Has reservado el libro: ");
        System.out.println(biblioteca3.getLibro());
        
        // Imprimo por pantalla la fecha de fin del préstamo del libro de la biblioteca 1
        System.out.println("\nDebes devolver el libro");
        System.out.println(biblioteca1.getLibro().getPrestamo().getFechaFin());
        
        // 3. IMPRESIÓN POR PANTALLA DE LOS OBJETOS GRACIAS AL MÉTODO TO STRING
        // Imprimo por pantalla los objetos biblioteca2 y biblioteca3
        // Reucerda que si no implementamos el método toString() en la clase Biblioteca, 
        // estas sentencias me van a imprimir la dirección de memoria de los objetos.
        System.out.println("\nLas bibliotecas abiertas en tu zona son: ");
        System.out.println(biblioteca2);
        System.out.println(biblioteca3);
        
        // Llamando al método toString() hacemos lo mismo
        System.out.println("\nLo mismo con .toString()");
        System.out.println(biblioteca2.toString());
        System.out.println(biblioteca3.toString());
        
    }
}
