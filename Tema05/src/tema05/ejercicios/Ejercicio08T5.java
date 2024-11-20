/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio08T5 {

    public static boolean esPar(Numero N){
        boolean par;
        if  ((N.getValor() % 2) == 0){
            par = true;
        }
        else{
            par = false;
        }
        return par;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        Numero N;
        //Pedimos un número
        System.out.println("Introduce número: ");
        num = teclado.nextInt();
        
        //Creamos un objeto
        N = new Numero();
        N.setValor(num);
        if  (esPar(N)){
            System.out.println("El número "+N.getValor()+" es par");
        }
        else{
            System.out.println("El número "+N.getValor()+" es impar");
        }
    }
    
}
