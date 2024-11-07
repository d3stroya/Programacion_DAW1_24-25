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
public class Ejercicio13T4 {

    //Pedimos el número al usuario
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Numero: ");
        n = teclado.nextInt();
        return n;
    }
    
    //Comprueba que el número n sea mayor o igual a 1.
    public static boolean numeroOk(int n){
        boolean numOk;
        if  (n < 1){
            numOk = false;
        }
        else{
            numOk = true;
        }
        return numOk;
        //return (!(n < 1));
    }
    
    //Muestra los números que hay entre 1 y n
    public static void mostrarNumeros(int n){
        int i;
        //Bucle for porque sabemos el número de repeticiones de antemano
        for(i = 0;i < n;i++){
            System.out.println(i);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        boolean numOk;
        do{
            n = pedirNumero();
            numOk = numeroOk(n);
            if  (!numOk){  //if  (numOk == false){
                System.out.println("Error. El número debe ser mayor que 1.");
            }
        }while(!numOk);
        mostrarNumeros(n);
    }
    
}
