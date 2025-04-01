package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        rellenarLista(nombres);
        mostrarLista(nombres);
    }
    
    /**
     * Método que pregunta al usuario si quiere seguir agregando nombres
     * @return true si el usuario escribe sí y false en caso contrario
     */
    public static boolean seguirAgrgandoNombres() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Quieres guardar más nombres?");
        return entrada.nextLine().equalsIgnoreCase("sí");
    }

    /**
     * Método que pide al usuario un nombre
     * @return el nombre
     */
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe el nombre que quieres guardar: ");        
        return entrada.nextLine();
    }
    
    /**
     * Método que rellena la lista con nombres
     * aportados por el usuario hasta que este
     * decida parar.
     * 
     * @param listaNombres 
     */
    public static void rellenarLista(ArrayList<String> listaNombres) {
        System.out.println("\n*** Rellenando lista ***");
        boolean seguirRellenando = true;
        
        do {
            listaNombres.add(pedirNombre());            
            seguirRellenando = seguirAgrgandoNombres();            
        } while(seguirRellenando);           
    }
    
    /**
     * Método que muestra los nombres de la lista
     * @param lista 
     */
    public static void mostrarLista(ArrayList<String> lista) {
        System.out.println("\n*** Lista de nombres ***");
        for(String nombre : lista) {
            System.out.println("- " + nombre);
        }
    }
}
