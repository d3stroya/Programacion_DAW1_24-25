
package tema05;

/**
 *
 * @author d3stroya
 */
public class Tema05 {
    // 1.1. PASO DE PARÁMETROS POR VALOR
//    public static void cambiarNumero(int numero) {
//        numero = 3;
//        System.out.println("Dentro del método cambiarNumero el número es: " + numero);
//    }
    
    // 1.2. PASO DE PARÁMETROS POR REFERENCIA
//    public static void renombrarLibro(Libro libro) {
//        libro.setNombre("Programación en Java");
//    }
   
    
    
    
    
    public static void main(String[] args) {
        // 1.1. PASO DE PARÁMETROS POR VALOR
//        int numero = 7;
//        cambiarNumero(numero);
//        System.out.println("\nEn el método main el número es: " + numero); 
        
        
        
        
        // 1.2. PASO DE PARÁMETROS POR REFERENCIA 
//        Libro aprendeAProgramar = new Libro(
//                new Prestamo(),     // Creo un préstamo con el constructor por defecto
//                "Aprende a programar", 
//                "No ficción", 
//                "E45136S938", 
//                "María García"
//        );
//        
//        System.out.println("\nInformación del libro:");
//        System.out.println(aprendeAProgramar);
//        
//        renombrarLibro(aprendeAProgramar);
//        System.out.println("\nInformación del libro renombrado:");        
//        System.out.println(aprendeAProgramar);
//        
        
        
        
        
        
        // 2. SOBRECARGA DE MÉTODOS: mismo método con distinto número de parámetros
        Usuario maria = new Usuario();
        Usuario luis = new Usuario("Luis", 20, "luis@mail.es");
        Usuario paula = new Usuario("Paula", 2, "paula@mail.es", new Publicacion());
        
        maria.setNombre("María");
        
        maria.enviarSolicitudDeAmistad(luis);
        maria.enviarSolicitudDeAmistad(luis, maria);
    }
    
    
    
    
    
}
