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
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        int i, num, cont = 0;
        
        //Pedimos el número
        do{
            System.out.print("Introduce un número: ");
            num = entrada.nextInt();
            if  (num < 0){
                System.out.println("Error. El número debe ser positivo");    
            }
        }while(num <= 0);
        
        //Calculamos los múltiplos de 3
        for(i=1;i<=num;i++){
            if  ((i % 3) == 0){  //Si es múltiplo de 3
                System.out.print(i+" - ");
                cont++;
            }
        }
        
        //Mostramos el total de múltiplos de 3 encontrados
        System.out.println("\nEl total multiplos de 3 entre el 1 y el "+num+" es: "+cont);    
    }
}
