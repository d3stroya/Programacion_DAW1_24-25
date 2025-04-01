package tema10.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/*
    Pide al usuario números positivos y los añade a una lista
    hasta que el usuario introduzca un número negativo.
    Muestra los elementos de la lista.
    Muestra el mayor, el menor y la suma de todos los números de la lista.
*/

public class Ejercicio02 {
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        rellenarLista(numeros);
        mostrarLista(numeros);
        
        System.out.println("\n(Funcional) - El número mayor es: " + buscarMayorFuncional(numeros));
        System.out.println("(Imperativa) - El número mayor es: " + buscarMayorImperativo(numeros));
        
        System.out.println("\n(Funcional) - El número menor es: " + buscarMenorFuncional(numeros));
        System.out.println("(Imperativa) - El número menor es: " + buscarMenorImperativo(numeros));
        
        System.out.println("\n(Funcional) - La suma total es: " + sumarTodosFuncional(numeros));
        System.out.println("(Imperativa) - La suma total es: " + sumarTodosImperativo(numeros));
    }
    
    /**
     * Método que pide al usuario un número entero
     * @return el número
     */
    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que indica si un número es positivo
     * @param numero
     * @return true si el número es mayor o igual que 0 y false si es negativo
     */
    public static boolean esPositivo(int numero) {
        return numero >= 0;
    }
    
    /**
     * Método que rellena la lista de números enteros
     * hasta que el usuario quiera parar.
     * 
     * @param numeros 
     */
    public static void rellenarLista(ArrayList<Integer> numeros) {
        int numero = 0;
        boolean esPositivo = false;
        do {
            numero = pedirNumero();
            esPositivo = esPositivo(numero);
            if(esPositivo) {
                numeros.add(numero);
            } else {
                System.out.println("El número es negativo. No se agregarán nuevos valores.");
            }
        } while(esPositivo);
    }
    
    /**
     * Método que muestra la lista
     * @param numeros 
     */
    public static void mostrarLista(ArrayList<Integer> numeros) {
        System.out.println("\nMostrando lista...");
        numeros.forEach(System.out::println);
    }
    
    // 2 formas de hacerlo
    /**
     * Método que busca el número mayor en la lista
     * utilizando la programación funcional
     * 
     * @param numeros
     * @return el número mayor
     */
    public static int buscarMayorFuncional(ArrayList<Integer> numeros) {
        return numeros.stream().max((a,b) -> a - b).get();
    }
    
    /**
     * Método que busca el número mayor en la lista
     * utilizando la programación imperativa
     * 
     * @param numeros
     * @return el número mayor
     */
    public static int buscarMayorImperativo(ArrayList<Integer> numeros) {
        int mayor = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if(numeros.get(i) > mayor) {
                mayor = numeros.get(i);
            }            
        }
        return mayor;
    }
    
    // 2 formas de hacerlo
    /**
     * Método que busca el número menor en la lista
     * utilizando la programación funcional
     * 
     * @param numeros
     * @return el número menor
     */
    public static int buscarMenorFuncional(ArrayList<Integer> numeros) {
        return numeros.stream().min((a,b) -> a - b).get();
    }
    
    /**
     * Método que busca el número mayor en la lista
     * utilizando la programación imperativa
     * 
     * @param numeros
     * @return el número menor
     */
    public static int buscarMenorImperativo(ArrayList<Integer> numeros) {
        int menor = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            if(numeros.get(i) < menor) {
                menor = numeros.get(i);
            }            
        }
        return menor;
    }
    
    // 2 formas de hacerlo
    /**
     * Método que suma todos los números de la lista
     * y lo devuelve, utilizando la programación funcional
     * 
     * @param numeros
     * @return la suma de todos los números de la lista
     */
    public static int sumarTodosFuncional(ArrayList<Integer> numeros) {
        return numeros.stream().reduce(0, (a, b) -> a + b);
    }
    
    /**
     * Método que suma todos los números de la lista
     * y lo devuelve, utilizando la programación imperativa
     * 
     * @param numeros
     * @return la suma de todos los números de la lista
     */
    public static int sumarTodosImperativo(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);           
        }
        return suma;
    }
}
