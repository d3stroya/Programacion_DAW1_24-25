package tema03.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        int num = 11;

        do {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        } while (num < 133);
    }
}
