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
public class Ejercicio14T4 {
    
    //Pedimos el número al usuario
    public static int pedirNumero(){
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Numero: ");
        n = teclado.nextInt();
        return n;
    }
    
    //Comprueba que el número n sea mayor que 0.
    public static boolean numeroOk(int n){
        boolean numOk;
        if  (n <= 0){
            numOk = false;
        }
        else{
            numOk = true;
        }
        return numOk;
    }
    
    //Muestra los múltiplos de 3 que hay entre 1 y n
    public static int mostrarMultiplosTres(int n){
        int i, cont = 0;  //cont será el contador de múltiplos de 3 que encontramos
        //Bucle for porque sabemos el número de repeticiones de antemano
        for(i = 1;i <= n;i++){
            if  ((i % 3) == 0){  //Si i es múltiplo de 3
                System.out.println(i);
                cont++;
            }
        }
        return cont;
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
                System.out.println("Error. ");
            }
        }while(!numOk);
        System.out.println("Múltiples de 3 mostrados: "+mostrarMultiplosTres(n));
    }
    
}
