
package tema05;

import java.util.Date;

/**
 *
 * @author d3stroya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // OBJETO 1
        // Instanciamos un objeto con el constructor por defecto
        Usuario maria = new Usuario();
        
        // Le asignamos valores a sus atributos
        maria.setNombre("María");
        maria.setEdad(20);
        maria.setEmail("maria@email.com");
        
        // Accedemos a los valores de sus atributos
        System.out.println("VALORES DE LOS ATRIBUTOS (CON GETTERS)");
        System.out.println(maria.getNombre());
        System.out.println(maria.getEdad());
        System.out.println(maria.getEmail());
        System.out.println(maria.getPublicacion());
        
        System.out.println("TO STRING 1");
        // Podemos hacer lo mismo usando el toString()
        System.out.println(maria.toString());
        
        System.out.println("TO STRING 2");
        // Lo mismo:
        System.out.println(maria);
        System.out.println("");
        
        // OBJETO 2
        // Instanciamos un objeto con el constructor parametrizado, incluyendo la creación del objeto publicación con el constructor parametrizado 
        Usuario luis = new Usuario(
                "Luis", 22, "luis@mail.com", new Publicacion(
                        new Date(), "vacaciones en el mar", "https://mi-foto-playa.jpg"
                )
        );
        
        // Imprimios sus datos por pantalla gracias al método toString()
        System.out.println(luis);
        
        // Usamos los métodos de la clase Usuario
        luis.enviarSolicitudDeAmistad(maria);        
        luis.notificarNuevaPublicacion(maria.getPublicacion(), maria);
    }
    
}
