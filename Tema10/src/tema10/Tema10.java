
package tema10;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author d3stroya
 */
public class Tema10 {

    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarar e inicializar un ArrayList
        ArrayList<Integer> numeros = new ArrayList<>();
        
        // Conocer el tamaño del Arraylist
        System.out.println("Tamaño de la lista: " + numeros.size());
        
        // Saber si la lista está vacía
        System.out.println("¿Está vacía?: " + numeros.isEmpty());
        
        
        
        /* INSERTAR */
        // Añadir elementos al final de la lista
        for(int i = 0; i < 10; i++) {
            numeros.add((int)(Math.random() * 11));
        }
        System.out.println("Nuevo tamaño de la lista: " + numeros.size());
//        
//        // Añadir un elemento en una posición concreta
        numeros.add(5, 30);
        System.out.println("Tamaño acutal: " + numeros.size());
//        
//        // Acceder a un elemento del Arraylist por su índice
        System.out.println("\n- NÚMERO EN EL ÍNDICE 5 -");
        System.out.println(numeros.get(5));
        
        
        
        /* RECORRER */
        // Recorrer un Arraylist
            // 1. For
        System.out.println("\n- ARRAY LIST CON FOR -");
        for(int i = 0; i < numeros.size(); i++) {
            System.out.print("[" + numeros.get(i) + "]");
        }
        
            // 2. For-each
        System.out.println("\n\n- ARRAY LIST CON FOR-EACH -");
        for(Integer num : numeros) {
            System.out.print("[" + num + "]");
        }
        
            // 3. For-each funcional
        System.out.println("\n\n- ARRAY LIST CON FOR-EACH FUNCIONAL -");
        numeros.forEach(num -> System.out.print("[" + num + "]"));
        
        
        
        // Asignar un valor a una posición, reemplazando el que ya existía
        System.out.println("\n\n- ARRAY LIST CON 80 EN EL ÍNDICE 5 -");
        numeros.set(5, 80);
        numeros.forEach(num -> System.out.print("[" + num + "]"));
        
        // Saber si la lista contiene un elemento
        System.out.println("\n¿Contiene un 80? " + numeros.contains(80));
        
        // Saber el índice de un elemento
        System.out.println("\nÍndice del 80: " + numeros.indexOf(10));  
        System.out.println("\nÍndice del 100: " + numeros.indexOf(100));        
        System.out.println("\nÚltimo índice del 10: " + numeros.lastIndexOf(10));   
        
        // Clonar un Arraylist
        ArrayList<Integer> numeros2 = numeros;  // Crea una variable que apunta al ArrayList existente
        ArrayList<Integer> numerosClone = (ArrayList)numeros.clone();   // Crea una copia del ArrayList. 
        System.out.println("\n- ARRAY LIST CLONADO -");
        System.out.println(numerosClone);        
        
        numeros.set(0, 100);
        System.out.println("\nnumeros: " + numeros);
        System.out.println("numeros2: " + numeros2);
        System.out.println("numerosClone: " + numerosClone);
        
        // Pasar la lista a un array
        System.out.println("\n- ARRAY LIST CONVERTIDO EN ARRAY -");
        Object[] arrayNumeros = numeros.toArray();
        System.out.println(Arrays.toString(arrayNumeros));
        
        
        
        
        /* ELIMINAR */
        // Eliminar el elemento de un índice concreto
        System.out.println("\n\n- NÚMERO EN EL ÍNDICE 5 -");
        System.out.println(numeros.get(5));
        numeros.remove(5);
        System.out.println("\n- NÚMERO EN EL ÍNDICE 5 -");
        System.out.println(numeros.get(5));
        
        // Eliminar la primera concurrencia del objeto indicado
        System.out.println("\n- ELIMINANDO ELEMENTO 10 -");
        numeros.remove(Integer.valueOf(10));
        System.out.println(numeros);
        
        // Eliminar todos los elementos de la lista
        System.out.println("\n- ELIMINANDO ELEMENTOS -");
        numeros.clear();
        System.out.println("¿Está vacía?: " + numeros.isEmpty());
        System.out.println(numeros);
        
        
        
    }

}
