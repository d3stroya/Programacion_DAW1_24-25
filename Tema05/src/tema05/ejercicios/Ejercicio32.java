
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.println(sumaRecursiva(4, 3));
    }
    
    public static int sumaRecursiva(int num1, int num2) {
        if(num2 == 0) {
            return num1;
        } else {
            return 1 + sumaRecursiva(num1, num2 - 1);
        }
    }
}
