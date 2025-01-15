
package tema06.ejercicios.ejercicio11;

/**
 * Interfaz Pagable
 * 
 * @author d3stroya
 */
public interface Pagable {
    final int COMISION_TARJETA = 5;
    final float COMISION_PAYPAL = 0.03f;
    
    float pagoTarjeta();
    float pagoEfectivo();
    float pagoPaypal();
    void procesarPago();
}
