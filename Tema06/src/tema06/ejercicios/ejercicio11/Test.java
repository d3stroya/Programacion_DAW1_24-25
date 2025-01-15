
package tema06.ejercicios.ejercicio11;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Clase Test
 * 
 * @author d3stroya
 */
public class Test {

    /**
     * Método main que crea dos suscripciones, pide al usuario elegir una,
     * calcula el precio y procesa el pago.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuscripcionPeriodico suscripcionPeriodico = new SuscripcionPeriodico(2f);
        SuscripcionTv suscripcionTv = new SuscripcionTv(8f);
        
        Suscripcion suscripcion = pedirTipoSuscripcion(suscripcionPeriodico, suscripcionTv);
        
        Carrito carrito = new Carrito(suscripcion.calcularPrecio());
        carrito.procesarPago();
    }
    
    /**
     * Método que pide al usuario la suscripción que quiere seleccionar
     * 
     * @param suscripcionPeriodico
     * @param suscripcionTv
     * 
     * @return la suscripción seleccionada
     */
    public static Suscripcion pedirTipoSuscripcion(SuscripcionPeriodico suscripcionPeriodico, SuscripcionTv suscripcionTv) {
        int opcion = 0;
        Suscripcion suscripcionElegida = new SuscripcionPeriodico();
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("- SUSCRIPCIONES DISPONIBLES -");
        System.out.println(suscripcionPeriodico);
        System.out.println(suscripcionTv);
        
        System.out.println("\n1. Periódico");
        System.out.println("2. TV");
        
        System.out.print("\nElige una opción: ");
        System.out.println("");
        
        try {
            do {
                opcion = entrada.nextInt();
            } while(opcion < 1 || opcion > 2);
        } catch(InputMismatchException e) {
            System.out.println("Opción inválida. Escribe un número entrero entre 1 y 3");
        }
        
        switch(opcion) {
            case 1 -> suscripcionElegida = suscripcionPeriodico;
            case 2 -> suscripcionElegida = suscripcionTv;
        }
        
        return suscripcionElegida;
    }

}
