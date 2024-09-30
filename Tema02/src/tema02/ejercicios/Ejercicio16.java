
package tema02.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        int billetes50;
        int billetes10;
        int total = 130;
        
        billetes50 = total / 50;    // Billetes de 50 enteros
        total %= 50;                // Sigo operando con el resto
        billetes10 = total / 10;    // Billetes de 20 enetros
        
        System.out.println(total + " euros hacen un total de " + billetes50 + 
                " billetes de 50€ y " + billetes10 + " billetes de 10€");
        
    }
}
