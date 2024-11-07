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
public class Ejercicio08T4 {

    public static void cambio(int cantidad){
        int bill50, bill20, bill10, bill5, monedas;
        
        bill50 = cantidad / 50;
        cantidad = cantidad % 50;
        
        bill20 = cantidad / 20;
        cantidad = cantidad % 20;
        
        bill10 = cantidad / 10;
        cantidad = cantidad % 10;
        
        bill5 = cantidad / 5;
        cantidad = cantidad % 5;
        
        monedas = cantidad / 2;
        
        System.out.println("Equivale a "+bill50+" billetes de 50\n"+bill20+" billetes de 20\n"+bill10+" bllletes de 10\n"+bill5+" billetes de 5\n"+monedas+" monedas de 2 Euros");
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad;
        System.out.print("Indique cantidad dinero: ");
        cantidad = teclado.nextInt();
        cambio(cantidad);
    }
    
}
