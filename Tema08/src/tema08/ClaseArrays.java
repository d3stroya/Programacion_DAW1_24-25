
package tema08;

import java.util.Arrays;

/**
 * Java tiene una clase Arrays con métodos preparados
 * para trabajar con arrays (rellenar, buscar, ordenar,...).
 * 
 * @author d3stroya
 */
public class ClaseArrays {
    public static void main(String[] args) {
//        System.out.println("********* ARRAYS DE TIPOS SIMPLES *********");
//        int[] numeros = new int[10];
//        int[] numeros2 = new int[10];
//                
//        // Mostrar un array
//        System.out.println(Arrays.toString(numeros));
//        
//        // Rellenar todo el array con un valor
//        Arrays.fill(numeros, -1);
//        System.out.println(Arrays.toString(numeros));
//        
//        // Rellenar parte del array con un valor
//        Arrays.fill(numeros, 2, 6, 5);
//        System.out.println(Arrays.toString(numeros));
//        
//        // Comprobar si dos arrays son iguales
//        System.out.print("\n¿Son iguales los arrays numeros y numeros2?: ");
//        System.out.println(Arrays.equals(numeros, numeros2));
//        
//        // Clonar un array
//        int[] numeros3 = numeros.clone();
//        System.out.print("¿Son iguales los arrays numeros y numeros3?: ");
//        System.out.println(Arrays.equals(numeros, numeros3));
//        
//        // Ordenar un array
//        System.out.println("\nArray ordenado: ");
//        Arrays.sort(numeros);
//        System.out.println(Arrays.toString(numeros));
//        
//        // Buscar un valor en el array ordenado.
//        // IMPORTANTE: El array debe estar ordenado para que la búsqueda se realice correctamente
//        System.out.println("\nNúmero 5 encontrado en el índice: " + 
//                Arrays.binarySearch(numeros, 5));
        
        
        
        System.out.println("\n********* ARRAYS DE TIPOS SIMPLES *********");
        // Instanciar array de objetos
        Bicicleta[] bicis = new Bicicleta[10];
        
        // Imprimir array de objetos
        System.out.println(Arrays.toString(bicis));
        
        // Rellenar array de objetos con Arrays.fill
        // IMPORTANTE: rellena todo el array con el mismo objeto
        Arrays.fill(bicis, new Bicicleta("rojo", 10, new Bateria()));        
        System.out.println(Arrays.toString(bicis));
        
        // Modificando el objeto de una posición, 
        // se modifican todas las posiciones, porque es el mismo objeto
        bicis[0].setVelocidad(50);        
        System.out.println(Arrays.toString(bicis));
        
        System.out.println("\n- ARRAY DE BICIS -");
        bicis[0] = new Bicicleta("verde", 10, new Bateria());
        bicis[1] = new Bicicleta("negro", 20, new Bateria());
        bicis[2] = new Bicicleta("blanco", 5, new Bateria());
        System.out.println(Arrays.toString(bicis));
        
        // Ordenar un array de objetos
        System.out.println("\n- ARRAY ORDENADO POR VELOCIDAD -");
        Arrays.sort(bicis); // ERROR: Tenemos que implementar la interfaz comparable con su método compareTo()
        System.out.println(Arrays.toString(bicis));
        
        
    }
}
