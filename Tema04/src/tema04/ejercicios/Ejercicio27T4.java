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
public class Ejercicio27T4 {

    public static int pedirCaraOCruz(){
        Scanner teclado = new Scanner(System.in);
        String caraCruz;
        
        System.out.print("Escriba cara o cruz: ");
        caraCruz = teclado.nextLine();
        
        if  (caraCruz.equalsIgnoreCase("Cara")){
            return 0;  //Retornamos 0 si elige cara
        }
        else{
            return 1;  //Retornamos 1 si es cruz
        }
    }
    
    public static int lanzarMoneda(){
        int caraCruz = (int) Math.floor(Math.random()*2);  //Generamos aleatorios entre 0 y 1
        return caraCruz;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int respuestaUsuario, moneda;
        
        do{
            moneda = lanzarMoneda();
            System.out.println("Moneda: " + moneda);
            respuestaUsuario = pedirCaraOCruz();
            
            if  (moneda != respuestaUsuario){
                System.out.println("Lo sentimos, ha fallado.");
            }
            else{
                System.out.println("¡Enhorabuena!");
            }
            
        }while(moneda != respuestaUsuario);
    }
    
}
