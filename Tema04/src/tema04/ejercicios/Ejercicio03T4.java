/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04.ejercicios;

import java.util.Scanner;
import tema04.ejercicios.nPaquete_ej4.Ejercicio03T4bis;

/**
 *
 * @author admin
 */
public class Ejercicio03T4 {

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

        Ejercicio03T4bis.mostrarMayor(n1, n2, n3);
    }
    
}
