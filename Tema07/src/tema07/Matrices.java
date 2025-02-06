
package tema07;

/**
 * MATRICES (Arrays bidimensionales).
 * 
 * Las matrices son arrays que tienen filas y columnas;
 * son como un tablero (3 en raya, sudoku,...).
 * 
 * Se declaran como los vectores pero con 2 pares de corchetes:
 * uno para las filas (i) y otro para las columnas(j).
 * 
 *           columna 1  columna 2  columna 3
 *               |          |          |
 *               v          v          v
 * fila 0 ->    [ ]        [ ]        [ ]
 * fila 1 ->    [ ]        [ ]        [ ]
 * fila 2 ->    [ ]        [ ]        [ ]
 * 
 * 
 * 
 * @author d3stroya
 */
public class Matrices {
    // Filas y columnas de la matriz
    public final static int FILAS = 4;
    public final static int COLUMNAS = 7;
    
    public static void main(String[] args) {
        
        // Declarar una matriz
        int[][] matriz = new int[FILAS][COLUMNAS];
        
        System.out.println("- RELLENANDO MATRIZ -");
        rellenar(matriz);
        
        System.out.println("\n- MOSTRAR MATRIZ");
        mostrar(matriz);
        
        System.out.println("\n- MOSTRAR MATRIZ AL REVÉS -");
        mostrarAlReves(matriz);

    }
    
    // Rellenar una matriz con números aleatorios del 1 al 9
    public static void rellenar(int[][] matriz) {
        for(int i = 0; i < FILAS; i++) {
            for(int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = (int)(Math.random() * 9 + 1);
            }
        }
    }
        
    // Mostrar la matriz
    public static void mostrar(int[][] matriz) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }        
    
    // Mostrar la matriz al revés
    public static void mostrarAlReves(int[][] matriz) {
        for(int j = 0; j < COLUMNAS; j++) {
            for(int i = 0; i < FILAS; i++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }
    
}