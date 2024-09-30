
package tema02.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        int tiempoTotal = 10000;
        int segundos, minutos, horas;
        
        minutos = tiempoTotal / 60;     // Paso los segundos a minutos enteros
        segundos = tiempoTotal % 60;    // Lo que me sobra son los segundos
        horas = minutos / 60;           // Paso los minutos a horas enteras
        minutos = minutos % 60;         // Lo que me sobra son los minutos
        
        System.out.println(tiempoTotal + " segundos hacen un total de " + 
                horas + " horas " + minutos + " minutos y " + segundos + " segundos");
        
        
        
    }
}
