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
public class Ejercicio01T4 {
        
    //Comprueba si es positivo o negativo
    public static void positivoONegativo(int n){
        if (n > 0){
            System.out.println("Positivo");
        }
        else{
            System.out.println("Negativo");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Número: ");
        num = teclado.nextInt();
        
        //Comprobamos si es positivo o negativo
        positivoONegativo(num);
    }
    
}
