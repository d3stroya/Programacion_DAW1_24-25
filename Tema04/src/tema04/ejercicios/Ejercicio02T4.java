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
public class Ejercicio02T4 {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, resultado;
        System.out.print("Primer número: ");
        n1 = teclado.nextInt();
        System.out.print("Segundo número: ");
        n2 = teclado.nextInt();
        if  (n1 > 10){
            Operaciones.multiplicar(n1, n2);
        }
        else{
            Operaciones.sumar(n1, n2);
        }
    }
    
}
