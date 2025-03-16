
package tema07.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio220_3EnRaya {
    public static final char[][] TABLERO = new char[3][3];
    public static final char FICHA1 = 'O';
    public static final char FICHA2 = 'X';
    public static int ronda = 1;          
    
    /**
     * Método principal que lanza el juego
     * @param args 
     */
    public static void main(String[] args) {       
        boolean finPartida = false;
        
        System.out.println("- BIENVENIDO/A AL JUEGO 3 EN RAYA -");
        inicializarTablero();
        dibujarTablero();
        
        do {
            System.out.println("\n********* RONDA " + ronda + " *********");
            generarFicha2();
            dibujarTablero();
            finPartida = comprobarTablero();
            if(!finPartida && ronda < 5) {
                pedirFicha1();
                dibujarTablero();
                finPartida = comprobarTablero();                            
            }
            ronda++;
            
        } while(!finPartida && ronda < 6);   
    }
       
    /**
     * Método que rellena la matriz con espacios.
     */
    public static void inicializarTablero() {
        for(int i = 0; i < TABLERO.length; i++) {
            for(int j = 0; j < TABLERO[0].length; j++) {
                TABLERO[i][j] = ' ';
            }
        }
    }
    
    /**
     * Método que dibuja por consola el tablero.
     */
    public static void dibujarTablero() {                
        for(int i = 0; i < TABLERO.length; i++) {
            System.out.println("+---+---+---+");
            for(int j = 0; j < TABLERO[0].length; j++) {
                System.out.print("| " + TABLERO[i][j] + " ");
            }
            System.out.print("|\n");
        }
        System.out.println("+---+---+---+");
    }
    
    /**
     * Método que comprueba si la celda está vacía
     * @param i
     * @param j
     * @return true si la celda está vacía y false en caso contario
     */
    public static boolean estaVacia(int i, int j) {
        return TABLERO[i][j] == ' ';
    }    
    
    
    
    /*** TURNO CPU: ***/
    
    /**     
     * Método que genera una posición aleatoria
     * dentro del tablero y dibuja la ficha X.
     */
    public static void generarFicha2() {
        System.out.println("\n- TURNO DE LA CPU -");
        int i, j;
        
        do {
            i = (int)(Math.random() * 3);
            j = (int)(Math.random() * 3);
        } while(!estaVacia(i, j));    
            
        TABLERO[i][j] = FICHA2; 
    }
    
    
    
    /*** TURNO JUGADOR: ***/
    
    /**
     * Método que pide al usuario una columna
     * para colocar la ficha O.
     * @return la columna
     */
    public static int pedirColumnaFicha1() {
        int col = -1;
        Scanner entrada = new Scanner(System.in);
        
        do {
            
            try {
                System.out.print(" -> Elige COLUMNA: ");
                col = entrada.nextInt();             
            } catch(InputMismatchException e) {
                System.out.println("[x] ERROR: Introduce un número entre 0 y 2");
                entrada.next();
            }
            
        } while(col < 0 || col > 2);
        
        return col;
    }

    /**
     * Método que pide al usuario una fila
     * para colocar la ficha O.
     * @return la fila
     */
    public static int pedirFilaFicha1() {
        int fila = -1;
        Scanner entrada = new Scanner(System.in);
        
        do {
            
            try {
                System.out.print(" -> Elige FILA: ");
                fila = entrada.nextInt();                        
            } catch(InputMismatchException e) {
                System.out.println("[x] ERROR: Introduce un número entre 0 y 2");
                entrada.next();
            }
            
        } while(fila < 0 || fila > 2);
        
        return fila;
    }

    /**
     * Método que pide al jugador una posición
     * de fila y una posición de columna
     * y dibuja la ficha O.
     * Incrementa en 1 la ronda.
     */
    public static void pedirFicha1() {
        System.out.println("\n- TU TURNO -");
        int i, j;
        boolean celdaVacia = false;

        do {
            i = pedirFilaFicha1();
            j = pedirColumnaFicha1();                        
            celdaVacia = estaVacia(i, j);        
            
            if(!celdaVacia) {
                System.out.println("[x] Celda ocupada. Elige otra.");
            }
            
        } while(!celdaVacia);

        TABLERO[i][j] = FICHA1;                     
    }    

    
    
    
    /*** COMPROBAR SI HAY GANADOR ***/
    
    /**
     * Método que comprueba si hay 3 en raya en la misma fila,
     * tomando de referencia TABLERO[i][0]
     * @return true si la fila contiene 3 fichas iguales
     * y false en caso contrario
     */
    public static boolean comprobarFilas() {
        int i = 0;
        boolean enc = false;
        char ref;
        
        while(!enc && i < TABLERO.length) {
            ref = TABLERO[i][0];
            
            if(ref != ' ' && ref == TABLERO[i][1]  && ref == TABLERO[i][2]) {
                enc = true;
                imprimirResultado(ref); 
            } else {
                i++;
            }                     
        }                    

        return enc;
    }
    
    /**
     * Método que comprueba si hay 3 en raya en la misma columna,
     * tomando de referencia TABLERO[0][j]
     * @return true si la columna contiene 3 fichas iguales
     * y false en caso contrario
     */
    public static boolean comprobarColumnas() {
        int j = 0;
        boolean enc = false;
        char ref;
        
        while(!enc && j < TABLERO[0].length) {
            ref = TABLERO[0][j];
            
            if(ref != ' ' && ref == TABLERO[1][j] && ref == TABLERO[2][j]) {
                enc = true;
                imprimirResultado(ref);
            } else {
                j++;
            }

        }

        return enc;
    }
    
    /**
     * Método que comprueba que la diagonal de izquierda a derecha
     * contiene 3 fichas iguales.
     * @return true si la diagonal contiene 3 fichas iguales
     * y false en caso contrario.
     */
    public static boolean comprobarDiagonal1() {
        boolean enc = false;
        char ref = TABLERO[0][0];
        
        if(ref != ' ' && TABLERO[1][1] == ref && TABLERO[2][2] == ref) {
            enc = true;
            imprimirResultado(ref);
        }        
        
        return enc;
    }
    
    /**
     * Método que comprueba que la diagonal de derecha a izquierda
     * contiene 3 fichas iguales.
     * @return true si la diagonal contiene 3 fichas iguales
     * y false en caso contrario.
     */
    public static boolean comprobarDiagonal2() {
        boolean enc = false;
        char ref = TABLERO[0][2];
        
        if(ref != ' ' && TABLERO[1][1] == ref && TABLERO[2][0] == ref) {
            enc = true;
            imprimirResultado(ref);
        }

        return enc;
    }
    
    /**
     * Método que comprueba si hay 3 fichas iguales
     * en filas, columnas o diagonales
     * @return true si hay 3 fichas iguales en fila, columna o diagonales
     */
    public static boolean comprobar3EnRaya() {        
        return comprobarFilas() || comprobarColumnas() || comprobarDiagonal1() || comprobarDiagonal2();
    }
    
    /**
     * Método que comprueba si hay 3 en raya
     * o si el juego termina el tablas.
     * @return true si hay ganador y false si hay tablas.
     */
    public static boolean comprobarTablero() {
        boolean finPartida = false;
        
        if(ronda >= 3 && ronda < 6) {
            finPartida = comprobar3EnRaya();
        } else if(ronda == 5) {
            System.out.println("¡Tablas!");
            finPartida = true;
        }
        
        return finPartida;
    }
    
    /**
     * Método que comprueba la ficha ganadora      
     * @param ref
     */
    public static void imprimirResultado(char ref) {
        if(ref == FICHA2) {
            System.out.println("¡Has perdido! :(");
        } else {
            System.out.println("¡Has ganado! :D");
        }            
    }
    
}
