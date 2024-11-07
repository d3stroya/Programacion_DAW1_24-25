/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio21T4 {

    public static int pedirNum1(){
        Scanner teclado = new Scanner(System.in);
        int num1;
        System.out.print("Numero 1: ");
        num1 = teclado.nextInt();
        return num1;
    }
    
    public static int pedirNum2(int num1){
        Scanner teclado = new Scanner(System.in);
        int num2 = num1 - 1;
        while(num2 < num1){
            System.out.print("Numero 2: ");
            num2 = teclado.nextInt();
            if  (num2 < num1){
                System.out.println("El segundo número debe ser mayor que el primero. ");
            }
        }
        return num2;
    }
    
    public static void mostrarResultado(int n1, int n2){
        int suma = 0;
        for(int i = n1;i < n2;i++){
            if  (i % 2 == 0){  //Si es par
                suma = suma + i;
            }
        }
        System.out.println("La suma entre "+n1+" y "+n2+" es: "+suma);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2;
        n1 = pedirNum1();
        n2 = pedirNum2(n1);
        mostrarResultado(n1, n2);
    }
    
}
