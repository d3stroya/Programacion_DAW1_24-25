
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
//        Usuario maria = new Usuario();
//        Usuario luis = new Usuario("Luis", 20, "luis@mail.es");
//        Usuario paula = new Usuario("Paula", 2, "paula@mail.es", new Publicacion());
//        
//        maria.setNombre("María");
//        
//        maria.enviarSolicitudDeAmistad(luis);
//        maria.enviarSolicitudDeAmistad(luis, maria);



        // 3. RECURSIVIDAD
        System.out.println("Factorial de 4");
        
        System.out.print("\nRECURSIVIDAD: ");
        System.out.println(factorial(4));
        
        
        /* Podemos hacer lo mismo con un bucle for.
           La recursividad es una herramienta más que nos da la programación
           y que puede ser muy útil en ciertas circunstancias.
        */
        System.out.print("\nBUCE FOR: ");
        int factorial = 1;
        
        for(int i = 4; i >= 1; i--) {
            factorial *= i;
        }
        
        System.out.println(factorial);
    }
    
    
    // RECURSIVIDAD: Los métodos recursivos son aquellos que se llaman a sí mismos.
    /*
        factorial(4) 
            |
            ·--> 4 * factorial(3)
                        |
                        ·--> 3 * factorial(2)
                                    |
                                    ·--> 2 * factorial(1)
                                                |
                                                ·-->1
    
        factorial(4) = 1 * 2 * 3 * 4 = 24
    
    */
    public static int factorial(int numero) {
        int resultado;
        
        if(numero == 0) {   // Caso base
            resultado = 1;
        } else {
            resultado =  numero * factorial(numero - 1);    // Llamada a sí mismo
        }
        
        return resultado;
    }
    
    
    
    
}
