
package algoritmos;

import java.util.Arrays;

/**
 *
 * @author d3stroya
 */
public class OrdenacionPorBurbuja {
    public static void burbuja(int[] array) {
        int temp;
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    
    public static void main(String[] args) {
        int[] array = {5,2,4,8,1,3,9};
        burbuja(array);
        System.out.println(Arrays.toString(array));
    }
}
