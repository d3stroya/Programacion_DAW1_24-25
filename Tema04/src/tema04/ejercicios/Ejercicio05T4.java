/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04.ejercicios;

import java.util.Scanner;
import tema04.ejercicios.PaqueteParidad_ej6.Paridad;

/**
 *
 * @author admin
 */
public class Ejercicio05T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.print("Introduzca número: ");
        num = teclado.nextInt();
        
        Paridad.comprobarPar(num);
    }
    
}
