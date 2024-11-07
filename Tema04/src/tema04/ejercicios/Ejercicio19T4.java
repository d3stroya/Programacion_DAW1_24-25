
package tema04.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio19T4 {
    /**
     * Método que pide un día de la semana al usuario
     * @return 
     */
    public static String pedirDia(){
        Scanner entrada = new Scanner(System.in);
        String dia;
        System.out.print("Introduzca un día de la semana: ");
        dia = entrada.nextLine();
        return dia.toLowerCase();
    }    
    
    /**
     * Método que muestra por pantalla la posición 
     * del día de la semana pasado por parámetro
     * @param dia 
     */
    public static void posicionDiaSemana(String dia){
        switch(dia) {
            case "lunes":
                System.out.println("El " + dia + " es el primer día de la semana");
                break;
            case "martes":
                System.out.println("El " + dia + " es el segundo día de la semana");
                break;
            case "miercoles":
                System.out.println("El " + dia + " es el tercer día de la semana");
                break;
            case "miércoles":
                System.out.println("El " + dia + " es el tercer día de la semana");
                break;
            case "jueves":
                System.out.println("El " + dia + " es el cuarto día de la semana");
                break;
            case "viernes":
                System.out.println("El " + dia + " es el quinto día de la semana");
                break;
            case "sabado":
                System.out.println("El " + dia + " es el sexto día de la semana");
                break;
            case "sábado":
                System.out.println("El " + dia + " es el sexto día de la semana");
                break;
            case "domingo":
                System.out.println("El " + dia + " es el séptimo día de la semana");
                break;
        }   
    }
    
    /**
     * Método que comprueba si el día pasado por parámetro
     * es un día de la semana correcto (que existe)
     * @param dia
     * @return true si el día es uno de la semana y false si no lo es
     */
    public static boolean esValido(String dia) {
        boolean valido = false;
        if(
                dia.equals("lunes") || 
                dia.equals("martes") || 
                dia.equals("miercoles") || 
                dia.equals("miércoles") || 
                dia.equals("jueves") || 
                dia.equals("viernes") || 
                dia.equals("sabado") || 
                dia.equals("sábado") || 
                dia.equals("domingo") 
        ) {
            valido = true;
        } else {
            System.out.println("Introduce un día válido");
        }
        
        return valido;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pido un día al usuario
        // (Opcional)Si introduce un día incorrecto, se vuelve a pedir
        String dia;
        do {
            dia = pedirDia();
        } while(!esValido(dia));
        
        // Muestro el número del día escrito por el usuario
        posicionDiaSemana(dia);
    }
}
