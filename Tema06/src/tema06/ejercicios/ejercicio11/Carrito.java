
package tema06.ejercicios.ejercicio11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase Carrito, que implementa Pagable y Descontable
 * @author d3stroya
 */
public class Carrito implements Pagable, Descontable {
    // ATRIBUTOS
    private float total;
    
    // CONSTRUCTORES
    public Carrito() {
        this.total = 0f;
    }
    
    public Carrito(float total) {
        this.total = total;
    }

    // GETTERS Y SETTERS
    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    // MÉTODOS
    @Override
    public void aplicarDescuento(float descuento) {
        setTotal(total - descuento);
    }
    
    @Override
    public float pagoTarjeta() {
        float precioFinal;
        System.out.println("Procesando pago con tarjeta...");
        System.out.println("Comisión: 5€");
        precioFinal = total + COMISION_TARJETA;
        System.out.println("Pago de " + precioFinal + "€ procesado correctamente");
        return precioFinal;
    }

    @Override
    public float pagoEfectivo() {
        System.out.println("Procesando pago en efectivo...");
        System.out.println("Pago de " + total + "€ procesado correctamente");
        return total;        
    }

    @Override
    public float pagoPaypal() {
        float precioFinal;
        System.out.println("Procesando pago con Paypal...");
        System.out.println("Comisión: 3%");
        precioFinal = total * (1 + COMISION_PAYPAL);
        System.out.println("Pago de " + precioFinal + "€ procesado correctamente");
        return precioFinal;
    }
    
    private int pedirTipoPago() {
        int opcion = 0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n- SISTEMA DE PAGO -");
        System.out.println("1. Tarjeta");
        System.out.println("2. Efectivo");
        System.out.println("3. Paypal");
        System.out.print("Elige un sistema de pago: ");
        
        try {
            do {
                opcion = entrada.nextInt();
            } while(opcion < 1 || opcion > 3);
        } catch(InputMismatchException e) {
            System.out.println("Opción inválida. Escribe un número entrero entre 1 y 3");
        }
        
        return opcion;
    }

    @Override
    public void procesarPago() {
        int tipoPago = 0;
        
        if(total > 50) {
            aplicarDescuento(0.10f);            
        }
        
        tipoPago = pedirTipoPago();
        
        switch(tipoPago) {
            case 1 -> pagoTarjeta();
            case 2 -> pagoEfectivo();
            case 3 -> pagoPaypal();
            default -> System.out.println("Opción no válida");
        }
        
        System.out.println("Gracias por su compra");
    }

    // TO STRING
    @Override
    public String toString() {
        return "Carrito{" + "total=" + total + '}';
    }
        
}
