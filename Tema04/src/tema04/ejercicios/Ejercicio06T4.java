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
public class Ejercicio06T4 {

    public static void mostrarCalificacion(int nota){
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5:
            case 6:
                System.out.println("Bien");
                break;
            case 7:
            case 8:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        do{
            System.out.println("Introduce nota: ");
            nota = teclado.nextInt();
            if  ((nota < 0)||(nota > 10)){
                System.out.println("Error. La nota debe estar entre 0 y 10.");
            }
        }while((nota < 0)||(nota > 10));
        mostrarCalificacion(nota);
    }
    
}
