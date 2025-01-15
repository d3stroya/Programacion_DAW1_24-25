
package tema06.ejercicios.ejercicio11;

/**
 * Clase abstracta Suscripcion
 * 
 * @author d3stroya
 */
public abstract class Suscripcion {
    // ATRIBUTOS
    private float precioBase;

    // CONSTRUCTORES
    public Suscripcion() {
        this.precioBase = 0f;
    }
    
    public Suscripcion(float precioBase) {
        this.precioBase = precioBase;
    }

    // GETTERS Y SETTERS
    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
    
    // MÉTODOS
    public abstract float calcularPrecio();
    
    // TO STRING
    @Override
    public String toString() {
        return "Suscripción";
    }
    
    
}
