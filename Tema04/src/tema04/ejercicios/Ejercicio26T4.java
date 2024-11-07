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
public class Ejercicio26T4 {

    //Método que pide un número y lo retorna
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.print("Introduzca número ");
        num = teclado.nextInt();
        
        return num;
    }
    
    //Método que, dado un numero, retorna si es primo o no
    public static boolean esPrimo(int num){
        boolean primo = true;
        int i = 2;
        
        while((i < (num / 2))&&(primo == true)){
            if  ((num % i) == 0){  //Si es divisor
                primo = false;
            }
            i++;  //Vamos al divisor siguiente
        }
        
        return primo;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, i; 
        boolean primo;
        
        do{
            n = pedirNumero();
            if  (n < 0){
                System.out.println("Error. El número debe ser positivo.");
            }
        }while(n < 0);
        
        primo = esPrimo(n);
        
        if  (primo){
            System.out.println("El número "+n+" es primo");
        }
        else{
            System.out.println("El número "+n+" no es primo");
        }
    }
    
}
