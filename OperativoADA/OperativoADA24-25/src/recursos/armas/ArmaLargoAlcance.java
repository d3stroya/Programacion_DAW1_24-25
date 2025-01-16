
package recursos.armas;

/**
 *
 * @author d3stroya
 */
public class ArmaLargoAlcance extends Arma {
    // ATRIBUTOS
    private double velocidad;
    
    // CONSTRUCTORES
    public ArmaLargoAlcance() {
        super();
        setDanio(10);
        this.velocidad = 0;
    }
    
    public ArmaLargoAlcance(double velocidad, int diametroBala) {
        super(10, diametroBala);
        this.velocidad = velocidad;
    }
    
    // GETTERS Y SETTERS
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    // TO STRING
    @Override
    public String toString() {
        return "ArmaLargoAlcance{" + "velocidad=" + velocidad + '}';
    }        
    
}
