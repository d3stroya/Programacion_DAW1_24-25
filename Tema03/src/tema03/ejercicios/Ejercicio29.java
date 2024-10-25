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
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aleatorio = (int)(Math.floor((Math.random()*10)+1));
        int num = 0, intentos = 0;
        boolean enc = false;
        
        do{
            System.out.print("\nAdivina el número: ");
            
            try{
                num = entrada.nextInt();    
            }
            catch(Exception e){
                System.out.print("Error. Debes introducir un número válido: "+e.getMessage());
                entrada.nextLine();
            }
            finally{
                if  (num > aleatorio){
                    System.out.print("\nEl número a adivinar es más pequeño");
                }
                else if  (num < aleatorio){
                        System.out.print("\nEl número a adivinar es más grande");
                } else{
                    enc = true;
                }
                
                intentos++;
            }
            
        } while(!enc);
        
        System.out.print("\n¡Enhorabuena! Has necesitado "+intentos+" intentos");
    }
    
}
