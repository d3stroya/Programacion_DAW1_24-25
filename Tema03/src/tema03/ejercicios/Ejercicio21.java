/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema03.ejercicios;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;
        float resul=0F;
        
        System.out.print("num1: ");
        num1 = teclado.nextInt();
        System.out.print("num2: ");        
        num2 = teclado.nextInt();
        
        try{
            resul = (float)(num1 / num2);
        }
        catch(ArithmeticException e){
            resul = 0;
            System.out.print("\nError: "+e.getMessage());
        }
        finally{
            System.out.print("\nResultado de la ejecución: "+resul);
        }
    }
    
}
