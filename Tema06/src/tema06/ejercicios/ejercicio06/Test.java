
package tema06.ejercicios.ejercicio06;
/**
 * Clase Test
 * 
 * @author Daniel
 */
public class Test {
    
    public static void main(String[] args) {
       
        System.out.println("*** LIBRO ***");
        Libro libro = new Libro("La Bestia", "Carmen Mola", "Thriller");
        System.out.println(libro.concatenarTodo());
        System.out.println("Iniciales: " + libro.obtenerIniciales());
        libro.contarVocales();
        System.out.println("La cadena m�s larga es: " + libro.obtenerCadenaMasLarga());
        String cadenaBuscada = "Thriller";
        if(libro.buscarCadena(cadenaBuscada)) {
            System.out.println("El libro tiene la cadena '" + cadenaBuscada + "'");
        } else {
            System.out.println("El libro no tiene la cadena '" + cadenaBuscada + "'");
        }
        
        System.out.println("\n*** PERSONA ***");
        Persona persona = new Persona("Pepe", "P�rez Aguilar", "maestro");
        System.out.println(persona.concatenarTodo());
        System.out.println("Iniciales: " + persona.obtenerIniciales());
        persona.contarVocales();
        System.out.println("La cadena m�s larga es: " + persona.obtenerCadenaMasLarga());
        cadenaBuscada = "piloto";
        if(libro.buscarCadena(cadenaBuscada)) {
            System.out.println("La persona tiene la cadena '" + cadenaBuscada + "'");
        } else {
            System.out.println("La persona no tiene la cadena '" + cadenaBuscada + "'");
        } 
        
        System.out.println("\n----- POLIMORFISMO -----");
        
        System.out.println("*** LIBRO ***");
        Transformable libroTransformable = new Libro("La Bestia", "Carmen Mola", "Thriller");
        System.out.println(libroTransformable.concatenarTodo());
        System.out.println("Iniciales: " + libroTransformable.obtenerIniciales());
        libroTransformable.contarVocales();
        System.out.println("La cadena m�s larga es: " + libroTransformable.obtenerCadenaMasLarga());
        cadenaBuscada = "Thriller";
        if(libroTransformable.buscarCadena(cadenaBuscada)) {
            System.out.println("El libro tiene la cadena '" + cadenaBuscada + "'");
        } else {
            System.out.println("El libro no tiene la cadena '" + cadenaBuscada + "'");
        }
        
        System.out.println("\n*** PERSONA ***");
        Transformable personaTransformable = new Persona("Pepe", "P�rez Aguilar", "maestro");
        System.out.println(personaTransformable.concatenarTodo());
        System.out.println("Iniciales: " + personaTransformable.obtenerIniciales());
        personaTransformable.contarVocales();
        System.out.println("La cadena m�s larga es: " + personaTransformable.obtenerCadenaMasLarga());
        cadenaBuscada = "piloto";
        if(personaTransformable.buscarCadena(cadenaBuscada)) {
            System.out.println("La persona tiene la cadena '" + cadenaBuscada + "'");
        } else {
            System.out.println("La persona no tiene la cadena '" + cadenaBuscada + "'");
        } 
        
    }

}
