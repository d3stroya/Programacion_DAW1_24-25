
package tema09;

/**
 * STRINGBUFFER crea cadenas mutables a las que podemos añadir, quitar o modificar elementos.
 * 
 * @author d3stroya
 */
public class ClaseStringBuffer {
    public static void main(String[] args) {
        // Instanciación
        StringBuffer nombre = new StringBuffer("Pepe");
        
        // Añadir elementos a la cadena
        nombre.append(" tiene hambre.");
        System.out.println(nombre);
        
        // Eliminar elementos de la cadena
        nombre.deleteCharAt(nombre.length() - 1);
        System.out.println(nombre);
        
        nombre.delete(10, nombre.length());
        System.out.println(nombre);
        
        // Insertar elementos en la cadena a partir de un índice
        nombre.insert(10, " un Ferrari.");
        System.out.println(nombre);
        
        // Reemplazar elementos desde un índice de origen hasta un índice - 1 de fin
        nombre.replace(0, 4, "María");
        System.out.println(nombre);
        
        // Otros métodos
        System.out.println("Capacidad de nombre: " + nombre.capacity());
        System.out.println("Longitud de nombre: " + nombre.length());
        nombre.trimToSize();
        System.out.println("Nueva capacidad de nombre: " + nombre.capacity());
        System.out.println("Caracter en el índice 3: " + nombre.charAt(3));
        System.out.println("Índice de la primera a: " + nombre.indexOf("a"));
        
    }
}
