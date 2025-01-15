
package tema06.ejercicios.ejercicio11;

/**
 * Clase SuscripcionTv, que hereda de Suscripcion
 * 
 * @author d3stroya
 */
public class SuscripcionTv extends Suscripcion {
    // ATRIBUTOS
    private final float IVA_TV = 0.21f;
    
    // CONSTRUCTORES
    public SuscripcionTv() {
        super();
    }
    
    public SuscripcionTv(float precioBase) {
        super(precioBase);
    }

    // MÉTODOS
    @Override
    public float calcularPrecio() {
        return getPrecioBase() * (1 + IVA_TV);
    }       

    // TO STRING
    @Override
    public String toString() {
        return super.toString() + " a TV. Precio total: " + calcularPrecio() + "€";
    }
    
}
