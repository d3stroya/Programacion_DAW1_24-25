
package tema11;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author anabel
 */

/*
 * Sets y maps
    +-----------+---------+---------------+------------+------------------------+
    |Operación	| HashSet | LinkedHashSet | TreeSet    | ConcurrentSkipListSet  |
    +-----------+---------+---------------+------------+------------------------+
    |add        | O(1)    |  O(1)         |  O(log n)  |     O(log n)           |
    |contains	| O(1)    |  O(1)         |  O(log n)  |     O(log n)           |
    |remove	| O(1)    |  O(1)         |  O(log n)  |     O(log n)           |
    |size	| O(1)    |  O(1)         |  O(1)      |     O(1)               |
    |isEmpty	| O(1)    |  O(1)         |  O(1)      |     O(1)               |
    |iterator	| O(1)    |  O(1)         |  O(1)      |     O(1)               |
    |next	| O(1)    |  O(1)         |  O(log n)  |     O(log n)           |
    |hasNext	| O(1)    |  O(1)         |  O(1)      |      O(1)              |
    +-----------+---------+---------------+------------+------------------------+
    +------------+-------------------------------+--------------------------------+-------------+
    |Operación	 | HashMap                       |   LinkedHashMap                |  TreeMap    |
    +------------+-------------------------------+--------------------------------+-------------+
    |Acceso	 | O(1) promedio, O(n) peor caso | O(1) promedio, O(n) peor caso  |  O(log n)   |   
    |Búsqueda	 | O(1) promedio, O(n) peor caso | O(1) promedio, O(n) peor caso  |  O(log n)   |
    |Inserción	 | O(1) promedio, O(n) peor caso | O(1) promedio, O(n) peor caso  |  O(log n)   |
    |Eliminación | O(1) promedio, O(n) peor caso | O(1) promedio, O(n) peor caso  |  O(log n)   |
    |Ordenación	 | N/A                           | O(n)                           |  O(n log n) |
    +------------+-------------------------------+--------------------------------+-------------+

Notación Big-O: https://www.youtube.com/watch?v=UPDjjuz1Hkw
 */

public class ConjuntosYMapas {
    public static void main(String[] args) {
        // 1. CONJUNTOS (SET)
        System.out.println("1. CONJUNTOS (SET)");
        
        // Instanciar un conjunto
        
      

        // Insertar elementos
        
        
        // Imprimir conjunto
        
        
        // Eliminar elementos
        
        // Recorrer el conjunto con bucles
     
        
        // Iterar sobre el conjunto
               
        
        // Obtener tamaño del conjunto
        
        // ¿Está vacío?
        
        // ¿Contiene un elemento dado?

        // Vaciar el conunto
        
        
        // Insertar todos los elementos de otra estructura, eliminando los duplicados
        
        
        // Diferencias entre HashSet (inserta los elementos por orden de su código hash), 
        // LinkedHashSet (orden de inserción)
        // y TreeSet (orden natural)
        
        
        
        
        
        
        
        // 2. MAPAS
        System.out.println("2. MAPAS");
        
        // Instanciar un mapa

        
        // Insertar elementos (pares clave - valor)
        
        
        
        // Tamaño del mapa
        

        // ¿ Está vacío?
        

        // ¿Contiene la clave?
       
        
        // ¿Contiene el valor?
        
        
        // Acceder a un elemento por su clave
       

        // Acceder a un valor o, si no existe, devolver un valor por defecto 

        
        // Mostrar mapa

        
        // Mostrar el conjunto de claves

        
        // Mostrar los valores del mapa

        
        
        // Recorrer el mapa con forEach
        
        
        // Recorrer el mapa con Iterator
        
        
        // Recorrer el mapa con forEach funcional
        
             
        

        // Eliminar un par clave - valor
        

        // Vaciar el mapa
       


        // Diferencias entre mapas:
        //  - HashMap (orden de hashcode),
        //  - TreeMap (orden natural) y
        //  - LinkedHashMap (orden de inserción)
        
        
    }
}
