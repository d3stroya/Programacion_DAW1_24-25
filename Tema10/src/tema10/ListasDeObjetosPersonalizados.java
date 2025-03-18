
package tema10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class ListasDeObjetosPersonalizados {
    public static void main(String[] args) {
        // Instanciamos el ArrayList
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        // Creamos 2 usuarios
        Usuario franky = new Usuario(
                "Franky", 
                "https://64.media.tumblr.com/0b125d177e20e6e784ad60a40a2e9b25/tumblr_nvrrysFW7N1uwb6u7o1_1280.jpg", 
                27
        );
        
        Usuario elliot = new Usuario(
                "Elliot", 
                "https://64.media.tumblr.com/cb0f6fa6abad9ebf05be06bdc0dddd04/tumblr_obcj28mtTM1vcs6uso1_1280.jpg", 
                34
        );
       
        // Agregamos usuarios a la lista
        usuarios.add(franky);
        usuarios.add(elliot);
        
        // Mostramos nombre y foto de cada usuario
        for(Usuario usuario : usuarios) {
            System.out.println(usuario.getNombre() + " | " + usuario.getFoto());
        }
        
        for(int i = 0; i < 5; i++) {
            // forma 1
            System.out.print("Nombre: ");
            String nombre = pedirString();
            
            System.out.print("URL de foto: ");
            String url = pedirString();
            
            System.out.print("Edad: ");
            int edad = pedirInt();
            
//            Usuario usuario = new Usuario(nombre, url, edad);
            
            // forma 2
            usuarios.add(new Usuario(nombre, url, edad)); 
            
            // forma 3
//            usuarios.add(new Usuario(pedirNombre(), pedirUrl(), pedirEdad()));            
        }
        
        System.out.println("");
        
        // Lo mismo con otra sintaxis
        usuarios.forEach(usuario -> System.out.println(usuario.getNombre() + " | " + usuario.getFoto()));

    }
    
    public static String pedirString() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }
    
    public static int pedirInt() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}
