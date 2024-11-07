/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04.ejercicios;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio04T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, n3;
        
        //Pedimos los números
        System.out.print("Primer número: ");
        n1 = teclado.nextInt();
        System.out.print("Segundo número: ");
        n2 = teclado.nextInt();
        System.out.print("Tercer número: ");
        n3 = teclado.nextInt();

        //Llamada método
        Ejjercicio04T4Menor.imprimirMenor(n1, n2, n3);
    }
    
}
