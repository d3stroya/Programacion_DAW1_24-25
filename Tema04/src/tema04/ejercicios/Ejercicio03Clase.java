/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import tema04.ejercicios.Salida_ej3.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio03Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Número 1: ");
        num1 = teclado.nextInt();
        System.out.println("Número 2: ");
        num2 = teclado.nextInt();
        System.out.println("Número 3: ");
        num3 = teclado.nextInt();
        Ordenar.imprimirMayor(num1, num2, num3);
    }
    
}
