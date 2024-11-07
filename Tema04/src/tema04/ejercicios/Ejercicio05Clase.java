/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04.ejercicios;

import java.util.Scanner;
import tema04.ejercicios.nPaquete_ej5.Util;

/**
 *
 * @author Usuario
 */
public class Ejercicio05Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.println("Número 1: ");
        num1 = teclado.nextInt();
        Util.parOImpar(num1);
    }
    
}
