
package tema07.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio14 {
    /**
     * Método que pide al usuario por teclado una temperatura
     * 
     * @return la temperatura
     */
    public static float pedirTemperatura() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tº: ");
        return entrada.nextFloat();
    }
    
    /**
     * Método que rellena la matriz con las temperatuas
     * indicadas por el usuario.
     * 
     * @param temperaturas 
     */
    public static void rellenar(float[][] temperaturas) {
        for(int i = 0; i < temperaturas.length; i++) {
            for(int j = 0; j < temperaturas[i].length; j++) {
                temperaturas[i][j] = pedirTemperatura();
//                temperaturas[i][j] = (float)(Math.random() * 50 - 10);
            }
        }
    }
    
    /**
     * Método que muestra la matriz de temperaturas
     * 
     * @param temperaturas
     * @param dias 
     */
    public static void mostrar(float[][] temperaturas, String[] dias) {
        int numDia = 0;
        for(int i = 0; i < temperaturas.length; i++) {
            System.out.println("\nSemana " + (i + 1));
            for(int j = 0; j < temperaturas[i].length; j++) {
                numDia++;
                System.out.println(dias[j] + " " + numDia + ": " + temperaturas[i][j]);
            }
        }
    }
    
    /**
     * Método que calcula la temperatura media de la matriz
     * 
     * @param temperaturas 
     */
    public static void media(float[][] temperaturas) {
        float media = 0;
        
        for(int i = 0; i < temperaturas.length; i++) {
            for(int j = 0; j < temperaturas[i].length; j++) {
                media += temperaturas[i][j];
            }
        }
        
        System.out.println("\nTª media: " + (media / (temperaturas.length * temperaturas[0].length)));
    }
    
    /**
     * Método que busca la temperatura mayor
     * y muestra los días con esa temperatura.
     * 
     * @param temperaturas
     * @param dias 
     */
    public static void diasMasCalurosos(float[][] temperaturas, String[] dias) {
        float diaMasCaluroso = temperaturas[0][0];
        
        for(int i = 0; i < temperaturas.length; i++) {
            for(int j = 0; j < temperaturas[i].length; j++) {
                if(temperaturas[i][j] > diaMasCaluroso) {
                    diaMasCaluroso = temperaturas[i][j];
                }
            }
        }
        
        System.out.println("Día(s) más caluroso(s)");
        for(int i = 0; i < temperaturas.length; i++) {
            for(int j = 0; j < temperaturas[i].length; j++) {
                if(temperaturas[i][j] == diaMasCaluroso) {
                    System.out.println("\n" + dias[j] + " de la semana " + (i + 1) + " con " + diaMasCaluroso + "ºC");
                }
            }
        }
    }
       
    /**
     * Método principal
     * 
     * @param args 
     */
    public static void main(String[] args) {
        float[][] temperaturas = new float[4][7];
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        
        rellenar(temperaturas);
        mostrar(temperaturas, dias);
        media(temperaturas);
        diasMasCalurosos(temperaturas, dias);
    }
}
