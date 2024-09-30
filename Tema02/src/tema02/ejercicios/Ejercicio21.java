
package tema02.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio21 {
    public static void main(String[] args) {
        
        // Creamos el scanner y pedimos los datos al usuario
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un número de segundos: ");
        int total = entrada.nextInt();
        
        // Convertimos el total de segundos a días, horas, minutos y segundos
        int dias, horas, minutos, segundos;
        
        segundos = total % 60;  // Me quedo con los segundos que sobran
        minutos = total / 60;   // Paso el total a minutos enteros
        horas = minutos / 60;   // Paso los minutos enteros a horas enteras
        minutos %= 60;          // Me quedo con los minutos que sobran
        dias = horas / 24;      // Paso las horas a días enteros
        horas %= 24;            // Me quedo con las horas que sobran
        
        System.out.println(
                total + " segundos hacen un total de " + dias + " días, " +
                        horas + " horas, " + minutos + " minutos y " + segundos + " segundos"
        );
    }
}
