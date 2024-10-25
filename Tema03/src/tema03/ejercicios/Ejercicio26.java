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
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, suma = 0;
        
        for(i = 111; i <= 222; i++){
            if  ((i % 2) != 0){  //Si el número es impar
                suma = suma + i;
            }
        }
        
        //Mostramos la suma
        System.out.println("Suma total entre impares: "+suma);
    }
    
}
