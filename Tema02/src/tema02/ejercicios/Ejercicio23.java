
package tema02.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Cuál es precio del producto? ");
        float precio = entrada.nextFloat();
        
        System.out.println("¿Cuántas unidades quieres comprar? ");
        float unidades = entrada.nextFloat();
        
        float total = precio * unidades;
        
        System.out.println("El precio total de su compra es " + total + "€");
    }
}
