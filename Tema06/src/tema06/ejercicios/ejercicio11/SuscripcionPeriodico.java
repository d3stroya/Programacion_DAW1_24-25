
package tema06.ejercicios.ejercicio11;

/**
 * Clase SuscripcionPeriodico, que hereda de Suscripcion
 * 
 * @author d3stroya
 */
public class SuscripcionPeriodico extends Suscripcion {
    // ATRIBUTOS
    private final float IVA_PERIODICO = 0.10f;
    
    // CONSTRUCTORES
    public SuscripcionPeriodico() {
        super();
    }
    
    public SuscripcionPeriodico(float precioBase) {
        super(precioBase);
    }
    
    // MÉTODOS
    @Override
    public float calcularPrecio() {
        return getPrecioBase() * (1 + IVA_PERIODICO);
    }        

    // TO STRING
    @Override
    public String toString() {
        return super.toString() + " a periódico. Precio total: " + calcularPrecio() + "€";
    }

    
    
}
