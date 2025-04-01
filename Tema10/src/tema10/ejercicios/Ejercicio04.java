package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anabel
 */
public class Ejercicio04 {
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        rellenarLista(lista);
        mostrarListaAntesYDespues(lista);
        recorrerLista(lista);
        System.out.println("");
        mostrarListaAntesYDespues(lista);
        System.out.println("");
    }
    
    /**
     * Método que pide al usuario un número
     * @return el número
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);        
        System.out.println("[·] Escribe un número mayor que 0");
        System.out.println("[·] Escribe un número negativo para salir del programa");

        return entrada.nextInt();
    }
     
    /**
     * Método que rellena la lista con números
     * introducidos por el usuario
     * hasta que el usuario decida parar.
     * 
     * @param lista 
     */
    public static void rellenarLista(ArrayList<Integer> lista) {
        int numero = pedirNumero();
        while (numero > 0) {       
            lista.add(numero);
            numero = pedirNumero();
        }
    }
    
    /************** DOS FORMAS DE SABER SI UN NÚMERO ESTÁ REPETIDO *********************/
     
    /**
     * Método que busca si la lista contiene algún número
     * igual al pasado por parámetro.
     * 
     * @param lista
     * @param numero
     * @param posicion
     * 
     * @return true si encuentra un número repetido y false en caso contrario
     */
    public static boolean esRepetido(ArrayList<Integer> lista, int numero, int posicion) {
        boolean encontrado = false;
        int i = posicion;
        
        while(i < lista.size() && !encontrado) {
            int numeroActual = lista.get(i);
            if(numeroActual == numero) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return encontrado;
    }
    
    /**
     * Método que comprueba si un número está repetido en la lista
     * accediendo a sus índices. 
     * 
     * @param lista
     * @param numero
     * 
     * @return true si el primer índice y el último son distintos y false si son iguales.
     */
    public static boolean esRepetidoIndex(ArrayList<Integer> lista, int numero) {
        return lista.indexOf(numero) != lista.lastIndexOf(numero);
    }
    
    
    
    /************ DOS FORMAS DE SUSTITUIR LOS NÚMEROS REPETIDOS ************/
    /**
     * Método que sustituye los números repetidos por 0.
     * Recorre la lista desde el primer número repetido
     * hasta el último comprobando si es igual al número 
     * pasado por parámetros y, en su caso, lo sustituye por 0.
     * 
     * @param lista
     * @param numero 
     */
    public static void sustituirRepetidos(ArrayList<Integer> lista, int numero) {
        int indicePrimero = lista.indexOf(numero);
        int indiceUltimo = lista.lastIndexOf(numero);
        
        for(int i = indicePrimero; i <= indiceUltimo; i++) {
            if(lista.get(i) == numero) {
                lista.set(i, 0);
            }
        }
    }
    
    /**
     * Método que recorre la lista comprobando si el número
     * está repetido y, si es así, lo sustituye.
     * 
     * @param lista 
     */
    public static void recorrerLista(ArrayList<Integer> lista) {
        int numeroActual = 0;
        
        for(int i = 0; i < lista.size(); i++) {
            numeroActual = lista.get(i);
            if(numeroActual != 0) {
                if(esRepetido(lista, numeroActual, i+1)) {
                    sustituirRepetidos(lista, numeroActual);
                }
            }
        }
    }
    
    /**
     * Método que muestra la lista
     * @param lista 
     */
    public static void mostrarListaAntesYDespues(ArrayList<Integer> lista) {
        lista.forEach(System.out::print);
    }
}
