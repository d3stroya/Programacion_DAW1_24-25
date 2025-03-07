
package general;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class DescifrarMensaje {
    public static String pedirMensajeCifrado() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Qué mensaje quieres descifrar? ");
        return entrada.nextLine();
    }
    
    public static int pedirDesplazamiento() {
        Scanner entrada = new Scanner(System.in);
        int desplazamiento = 0;
        do {
            System.out.println("¿Cuál es el desplazamiento? ");
            desplazamiento = entrada.nextInt();
            if(desplazamiento <= 0) {
                System.out.println("Escribe un número positivo");
            } 
        } while(desplazamiento <= 0);
        return desplazamiento;
    }
    
    public static void descifrarMensaje(String mensaje, int desplazamiento) {
        System.out.println("Descifrando mensaje...");
        
        String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String mensajeDescifrado = "";
        mensaje = mensaje.toUpperCase();
        char caracter;
        int posicion = 0;
        
        for(int i = 0; i < mensaje.length(); i++) {
            caracter = mensaje.charAt(i);
            posicion = letras.indexOf(caracter);
            if(letras.indexOf(caracter) != -1) {
                caracter = letras.charAt((posicion + desplazamiento) % letras.length());
            }
            mensajeDescifrado += caracter;
        }
        
        System.out.println("Mensaje descifrado correctamente: ");
        System.out.println(mensajeDescifrado);
    }
    
    public static void main(String[] args) {
        String mensaje = pedirMensajeCifrado();
        int desplazamiento = pedirDesplazamiento();
        descifrarMensaje(mensaje, desplazamiento);
    }
}
