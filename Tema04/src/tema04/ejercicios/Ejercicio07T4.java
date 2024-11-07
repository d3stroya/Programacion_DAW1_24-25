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
public class Ejercicio07T4 {

    /**
     * @param args the command line arguments
     */
    public static void metodoBurbuja(int n1, int n2, int n3, int n4){
        int i, aux;
        for(i = 0;i < 3;i++){
            if (n1 > n2){
                aux = n1;
                n1 = n2;
                n2 = aux;
            }
            if (n2 > n3){
                aux = n2;
                n2 = n3;
                n3 = aux;
            }
            if (n3 > n4){
                aux = n3;
                n3 = n4;
                n4 = aux;
            }    
        }
        System.out.print("El orden de los números introducidos es: "+n1+" - "+n2+" - "+n3+" - "+n4);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3, num4;
        System.out.println("Primer número: ");
        num1 = teclado.nextInt();
        System.out.println("Segundo número: ");
        num2 = teclado.nextInt();
        System.out.println("Tercer número: ");
        num3 = teclado.nextInt();
        System.out.println("Cuarto número: ");
        num4 = teclado.nextInt();
        metodoBurbuja(num1, num2, num3, num4);
        System.out.println(num1);
    }    
}
