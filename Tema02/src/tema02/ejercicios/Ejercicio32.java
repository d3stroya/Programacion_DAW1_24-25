
package tema02.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, indique una cantidad de dinero: ");
        int total = entrada.nextInt();
        
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        billetes50 = total / 50;
        total %= 50;
        billetes20 = total / 20;
        total %= 20;
        billetes10 = total / 10;
        total %= 10;
        billetes5 = total / 5;
        total %= 5;
        monedas2 = total / 2;
        monedas1 = total % 2;
        
        System.out.println(total + "€ se descomponen en " + billetes50 + " billetes de 50€, " + 
                billetes20 + " billetes de 20€, " + billetes10 + " billetes de 10€, " + 
                billetes5 + " billetes de 5€, " + monedas2 + " monedas de 2€ y " +
                monedas1 + " monedas de 1€.");
        
    }
}
