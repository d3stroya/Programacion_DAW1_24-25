/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04.ejercicios;

/**
 *
 * @author Usuario
 */
public class Ejercicio09T4 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3; 
        num1 = Operaciones.pedirNumero();
        num2 = Operaciones.pedirNumero();
        num3 = Operaciones.pedirNumero();
        Operaciones.mostrarMenor(num1, num2, num3);
    }
    
}
