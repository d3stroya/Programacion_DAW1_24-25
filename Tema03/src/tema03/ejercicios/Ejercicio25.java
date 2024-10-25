
package tema03.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        // Declaramos las variables
        int NUMERO_1 = 17, NUMERO_2 = 139;
        int suma = 0;
        
        // Calculamos la suma de los números pares entre NUMERO_1 Y NUMERO_2
        for(int i = NUMERO_1; i < NUMERO_2; i++) {
            if(i % 2 == 0) {
                suma += i;
            }
        }
        
        System.out.println(suma);
    }
    
}
