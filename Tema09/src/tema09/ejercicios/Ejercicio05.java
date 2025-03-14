
package tema09.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio05 {
    public final static String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    public final static String[] posiciones = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "séptimo"};
    
    public static void main(String[] args) {
        devolverIndiceDia(pedirDia());
    }
    
    public static String pedirDia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe un día de la semana: ");
        return entrada.nextLine();
    }
    
    public static void devolverIndiceDia(String dia) {
        int i = 0;
        boolean enc = false;
        
        while(!enc && i < dias.length) {
            if(dia.equalsIgnoreCase(dias[i])) {
                enc = true;
                System.out.println(dia + " es el " + posiciones[i] + " día de la semana.");
            } else {
                i++;
            }
        }
    }
}
