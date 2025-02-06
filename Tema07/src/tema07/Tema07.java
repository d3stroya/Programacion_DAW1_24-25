
import java.util.Scanner;


/**
 *
 * @author d3stroya
 */
public class Tema07 {

    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. VECTORES
        
        // Declarar e inicalizar un array
        int[] edades = new int[8];
//        String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        
        // Acceder a una posición del array y mostrarla
//        System.out.println("- MOSTRAR EL DÍA EN EL ÍNDICE 2 -");
//        System.out.println(dias[2]);
        
        // Agregar valores a un array: asignar un valor a la posición
//        edades[0] = 12;
//        edades[1] = 30;
//        edades[5] = 67;
        
        // Recorrer un array
//        System.out.println("\n- RECORRER ARRAY -");
//        for(int i = 0; i < edades.length; i++) {
//            System.out.print(edades[i] + " ");
//        }
                
        // Rellenar un array con números aleatorios
        for(int i = 0; i < edades.length; i++) {
            edades[i] = (int)(Math.random() * 10 + 1);
        }
        
        // Recorrer un array al revés
//        System.out.println("\n\n- RECORRER ARRAY AL REVÉS -");
//        for(int i = edades.length - 1; i > 0; i--) {
//            System.out.print(edades[i] + " ");
//        } 
        
        // Rellenar un array con datos que pedimos al usuario
//        System.out.println("\n\n- RELLENAR ARRAY CON NÚMEROS INTRODUCIDOS POR EL USUARIO");
//        Scanner entrada = new Scanner(System.in);
//        
//        for(int i = 0; i < edades.length; i++) {
//            System.out.print("Escribe el número de la posición " + i + ": ");
//            edades[i] = entrada.nextInt();
//        }
        
        // Mostrar valores del array junto con su índice
//        System.out.println("\n- MOSTRAR ÍNDICES Y SUS VALORES -");
//        for(int i = 0; i < dias.length; i++) {
//            System.out.println("Índice: " + i + " - Valor: " + dias[i]);
//        }

        // Mostrar sólo los valores pares del array
//        for(int i = 0; i < edades.length; i++) {
//            if(edades[i] % 2 == 0) {
//                System.out.print(edades[i] + " ");
//            }
//        }
        
        // Buscar un valor dentro del array
//        System.out.println("\n- BUSCANDO VALOR EN UN ARRAY -");
//        int indice = 0;
//        boolean encontrado = false;
//        
//        while(indice < dias.length && !encontrado) {
//            if(dias[indice].equalsIgnoreCase("Miércoles")) {
//                encontrado = true;
//                System.out.println("Día encontrado en el índice " + indice);
//            } else {
//                indice++;
//            }
//        }
        
        // Declarar un array con una longitud elegida por el usuario
//        System.out.println("- CREANDO ARRAY DE LONGITUD ELEGIDA POR EL USUARIO -");
//        
//        Scanner entrada = new Scanner(System.in);
//        System.out.print("Indica la longitud del array: ");
//        int longitud = entrada.nextInt();
//        
//        int[] nuevoArray = new int[longitud];
        
        // ¡OJO! Desbordar un array
//        System.out.println(dias[7]);
        
//        // Controlar la excepción ArrayIndexOutOfBoundsException
//        System.out.println("\n- CONTROLANDO ARRAY INDEX OUT OF BOUNDS EXCEPTION -");
//        try {
//            System.out.println(dias[7]);            
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("Estás intentando acceder a un índice "
//                    + "mayor que la longitud del array");
//        }

        // Intercambiar posiciones en el array
//        System.out.println("\n- INTERCAMBIAR POSICIONES -");
//        System.out.println("Array antes del intercambio:");
//        mostrarVector(edades);
//        
//        int edad2 = edades[2];
//        int edad3 = edades[3];
//        edades[2] = edad3;
//        edades[3] = edad2;
//        
//        System.out.println("Array después del intercambio:");
//        mostrarVector(edades);

    

        // 2. MATRICES
        
        // Declara una matriz
        int[][] ventasMes = new int[4][7];  // 4 semanas de 7 días                        
        
        // Mostrar la matriz
        System.out.println("- MOSTRAR MATRIZ -");
        for(int i = 0; i < ventasMes.length; i++) { // Recorre las filas: de 0 a 4. (VERTICAL)
            for(int j = 0; j < ventasMes[0].length; j++) {  // Recorre las columnas de cada fila: de 0 a 7. (HORIZONTAL)
                System.out.print("[" + ventasMes[i][j] + "] ");  // Muestro las columnas de la fila en la misma línea
            }
            System.out.println(""); // Imprimo un salto de línea por cada fila
        }
        
        // Rellenar la matriz con números aleatorios
        System.out.println("\nRellenando matriz....");
        for(int i = 0; i < ventasMes.length; i++) { 
            for(int j = 0; j < ventasMes[0].length; j++) {  
                ventasMes[i][j] = (int)(Math.random() * 9 + 1);
            }            
        }
        
        // Usar constantes para guardar FILAS y COLUMNAS
        final int FILAS = 4;
        final int COLUMNAS = 7;
        
        // Mostrar la matriz con constantes
        System.out.println("\n- MOSTRAR MATRIZ CON CONSTANTES -");
        for(int i = 0; i < FILAS; i++) { 
            for(int j = 0; j < COLUMNAS; j++) {  
                System.out.print("[" + ventasMes[i][j] + "] ");  
            }
            System.out.println(""); 
        }
        
        // Mostrar la matriz al revés
        System.out.println("\n- MOSTRAR MATRIZ AL REVÉS -");
        for(int j = 0; j < COLUMNAS; j++) { 
            for(int i = 0; i < FILAS; i++) {  
                System.out.print("[" + ventasMes[i][j] + "] ");  
            }
            System.out.println(""); 
        }
    }
    
    public static void mostrarVector(int[] vector) {
        for(int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }

}