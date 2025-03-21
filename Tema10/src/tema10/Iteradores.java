
package tema10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Los ITERADORES son referencias a una colección
 * que nos permiten ir iterando sobre esa colección,
 * ya sea para imprimir por pantalla los elementos
 * de la colección, para eliminarlos, filtrar, modificarlos...
 * 
 * Son objetos de la clase Iterator. Debemos instanciar el iterador
 * a través del método de la lista .iterator(), que devuelve el iterador.
 * 
 * Tienen los métodos: 
 *  · hasNext(), que nos devuelve true si la colección tiene más elementos.
 *  · next(), que devuelve el siguiente elementos
 * 
 * El iterador nos da más flexibilidad que un for o for-each
 * si, por ejemplo, queremos eliminar elementos de la colección 
 * durante la iteración.
 * 
 * También podemos utilizar la clase ListIterator, que nos permite
 * recorrer la colección al revés con los métodos hasPrevious() y previous().
 * 
 * La lógica de los iteradores es la siguiente:
 * Mientras haya elementos en la colección, me devuelves el siguiente 
 * (y hacemos lo que queramos con él).
 * 
 * Iterator es una clase del paquete java.util y debemos importarla.
 * 
 * @author d3stroya
 */
public class Iteradores {
    private final static String[] nombres = {"Carlos", "Andrea", "Luis", "Sofía", "Miguel", "Valeria", "José", "Camila"};
    private final static String URL = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.freepik.es%2Ffotos-vectores-gratis%2Fusuario&psig=AOvVaw24VutZSI5aAIatRNDWEx3d&ust=1742641711933000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJDTrrOEm4wDFQAAAAAdAAAAABAE";
    
    /**
     * Método que rellena la lista con nombres de usuarios del array nombres,
     * con la foto de perfil de URL y con una edad por defecto entre 1 y 50.
     * @param usuarios 
     */
    private static void rellenarLista(ArrayList<Usuario> usuarios) {
        for(String nombre : nombres) {
            usuarios.add(new Usuario(nombre, URL, (int)(Math.random() * 50 + 1)));
        }
    }
    
    public static void main(String[] args) {
        // Nuestra lista de usuarios
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        // Rellenamos la lista
        rellenarLista(usuarios);
        
        // Mostramos la lista
        System.out.println("- USUARIOS -");
        usuarios.forEach(System.out::println);
        
        
        
        
        /****** ITERATOR ******/
        /*
            Sólo itera hacia delante
            Tiene el método .remove()
            No permite modificar los elementos de la colección
            Siempre itera desde el principio
        */
        
        // Instanciar iterador
        Iterator<Usuario> it = usuarios.iterator();
        
        // Recorrer la lista con el iterador
        Usuario usuario = null;
        
        while(it.hasNext()) {   // Mientras haya más usuarios...
            // ...guardamos el siguiente en la variable usuario
            usuario = it.next();            
            
            // Y hacemos lo que necesitemos, como eliminar los usuarios menores de edad
            if(usuario.getEdad() < 18) {
                it.remove(); // OJO: tenemos que eliminarlos desde el iterador y no desde la lista
            }
                        
        }
        
        // Mostramos la lista
        System.out.println("\n- SÓLO USUARIOS MAYORES DE EDAD -");
        usuarios.forEach(System.out::println);
        
        
        
        
        
        /****** LIST ITERATOR ******/
        /*
            Itera hacia delante y hacia detrás
            Tiene el método .remove()
            Tiene los métodos .set() y .add()
            Puede iterar desde cualquier índice
        */
        
        // Instanciar ListIterator
        ListIterator<Usuario> lit = usuarios.listIterator();
        
        // Instanciar ListIterator desde un índice
        ListIterator<Usuario> litSize = usuarios.listIterator(usuarios.size());
        
        // Recorrer la lista hacia atrás
        System.out.println("\n- USUARIOS HACIA ATRÁS -");
        
        while(litSize.hasPrevious()) {            
            System.out.println(litSize.previous());
        }
        
        // Modificar elementos mientras se recorre la lista        
        Usuario actual = null;
        int i = -1;
        
        // Recorremos la lista modificando la foto de los usuarios con índice par
        while(lit.hasNext()) {
            actual = lit.next();
            i = lit.nextIndex();
            
            if(i % 2 == 0) {
                actual.setFoto("https://cdn-icons-png.flaticon.com/512/6326/6326055.png");
            }
            
        }
        
        // Mostramos la lista
        System.out.println("\n- USUARIOS MODIFICADOS -");
        usuarios.forEach(System.out::println);
    }
}
