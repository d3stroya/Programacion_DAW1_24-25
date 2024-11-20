/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio10T5 {

    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Introduzca número: ");
        n = entrada.nextInt();
        return n;
    }
    
    public static void burbuja(Numero num1, Numero num2, Numero num3, Numero num4){
        int i, aux;
        for(i = 0;i < 3;i++){
            //Comparamos num1 con num2
            if  (num1.getValor() > num2.getValor()){
            //if (Numero.esMayor(num1.getValor(), num2.getValor())){
                aux = num2.getValor();
                num2.setValor(num1.getValor());
                num1.setValor(aux);
            }
            
            //Comparamos num2 con num3
            if (Numero.esMayor(num2.getValor(), num3.getValor())){
                aux = num3.getValor();
                num3.setValor(num2.getValor());
                num2.setValor(aux);
            }
            
            //Comparamos num3 con num4
            if (Numero.esMayor(num3.getValor(), num4.getValor())){
                aux = num3.getValor();
                num3.setValor(num4.getValor());
                num4.setValor(aux);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos los 4 números, los ordenamos y los imprimimos
        Numero num1 = new Numero(pedirNumero());
        Numero num2 = new Numero(pedirNumero());
        Numero num3 = new Numero(pedirNumero());
        Numero num4 = new Numero(pedirNumero());
        
        burbuja(num1, num2, num3, num4);
        
        System.out.print("Orden: "+num1.getValor()+" - "+num2.getValor()+" - "+num3.getValor()+" - "+num4.getValor());
    }
    
}
