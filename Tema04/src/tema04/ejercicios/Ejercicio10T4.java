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
public class Ejercicio10T4 {

    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Introduca número: ");
        n = teclado.nextInt();
        return n;
        
    }
    
    public static void tablaMultiplicar(int n){
        int i;
        for(i=0;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        n = pedirNumero();
        tablaMultiplicar(n);
    }
    
}
