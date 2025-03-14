
package tema09.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio04 {
    public static final String[] RESPUESTAS = {"Madrid", "Cristóbal Colón"};
    public static final String[] PREGUNTAS = {"¿Cuál es la capital de España?", "Nombre y apellido del personaje que colonizó América"};

    
    public static int preguntar(String pregunta, String respuesta, int nota) {
        System.out.println(pregunta);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine().equalsIgnoreCase(respuesta) ? nota : 0;
    }
    
    public static void realizarExamen() {
        int nota = 0;
        
        for(int i = 0; i < RESPUESTAS.length; i++) {
            nota += preguntar(PREGUNTAS[i], RESPUESTAS[i], 5);            
        }
                
        System.out.print("Nota final: " + nota + "\n");
    }

    public static void main(String[] args) {
        realizarExamen();
    }

}
