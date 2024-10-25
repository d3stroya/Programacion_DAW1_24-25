/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema03.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        boolean error;
        
        //Recogemos el primer número
        try{
            System.out.print("Operando 1: ");
            n1 = entrada.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error. Ha introducito una letra");
            n1 = 0;
        }
        
        //Recogemos el segundo número        
        do{
            error = false;
            try{
                System.out.print("Operando 2: ");
                n2 = entrada.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Error. Ha introducito una letra");
                n2 = 0;
                error = true;
                entrada.next();
            }
        }while(error);
        System.out.println(n1+" + "+n2+" = "+(n1+n2));
    }
    
}
