/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema03.ejercicios;

/**
 *
 * @author admin
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aleatorio = (int)(Math.floor((Math.random()*100)+1));
        
        if  ((aleatorio % 2) == 0){
            System.out.print("El número "+aleatorio+" es par");
        }
        else{
            System.out.print("El número "+aleatorio+" es impar");
        }
        
    }
    
}
