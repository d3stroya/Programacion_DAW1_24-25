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
public class Operaciones {
    //Método multiplicar
    public static void multiplicar(int n1, int n2){
        int resultado;
        resultado = n1 * n2;
        System.out.println(n1+" * "+n2+" = "+resultado);
    }
    
    //Método sumar
    public static void sumar(int n1, int n2){
        int resultado;
        resultado = n1 + n2;
        System.out.println(n1+" + "+n2+" = "+resultado);
        
    }
    public static void dividir(int n1, int n2){
        int resultado;
        try{
            resultado = n1 / n2;
        }
        catch(ArithmeticException e){
            resultado = 0;
        }
        
        System.out.println(n1+" * "+n2+" = "+resultado);
    }
    
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Introduzca un número: ");
        num = teclado.nextInt();
        return num;
    }  
    
    public static void mostrarMenor(int n1, int n2, int n3){
        if  ((n1 < n2)&&(n1 < n3)){
            System.out.println("El menor es "+n1);
        }
        else{
            if  ((n2 < n1)&&(n2 < n3)){
                System.out.println("El menor es "+n2);
            }
            else{
                System.out.println("El menor es "+n3);
            }
        }
    }
}
