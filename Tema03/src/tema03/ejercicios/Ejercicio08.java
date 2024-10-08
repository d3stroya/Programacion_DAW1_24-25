package tema03.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        // Pido al usuario la cantidad de dinero
        int dinero, copiaDinero, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce una cantidad en euros: ");
        dinero = entrada.nextInt();
        copiaDinero = dinero;

        // Calculo los billetes y monedas de cada tipo
        billetes50 = dinero / 50;
        dinero %= 50;
        billetes20 = dinero / 20;
        dinero %= 20;
        billetes10 = dinero / 10;
        dinero %= 10;
        billetes5 = dinero / 5;
        dinero %= 5;
        monedas2 = dinero / 2;
        monedas1 = dinero % 2;

        // Imprimo los billetes y las monedas del resultado (no los que sean 0)
        System.out.println(copiaDinero + " hacen un total de:");
        if (billetes50 > 0) {
            System.out.println(billetes50 + " billetes de 50 euros");
        }
        if (billetes20 > 0) {
            System.out.println(billetes20 + " billetes de 20 euros");
        }
        if (billetes10 > 0) {
            System.out.println(billetes10 + " billetes de 10 euros");
        }
        if (billetes5 > 0) {
            System.out.println(billetes5 + " billetes de 5 euros");
        }
        if (monedas2 > 0) {
            System.out.println(monedas2 + " monedas de 2 euros");
        }
        if (monedas1 > 0) {
            System.out.println(monedas1 + " monedas de 1 euro");
        }
    }
}
