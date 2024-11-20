
package tema05.herencia;

/**
 *
 * @author d3stroya
 */
public class Coche extends Vehiculo {
    // ATRIBUTOS
    private int numPuertas;
    
    // CONSTRUCTORES
    public Coche() {
        super();
        numPuertas = 0;
    }

    public Coche(int numPuertas, String marca, String modelo, int velocidad, boolean motorEncendido) {
        super(marca, modelo, velocidad, motorEncendido);
        this.numPuertas = numPuertas;
    }
    
    // GETTERS Y SETTERS
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString() +
               "\nCoche con " + numPuertas + " puertas";
    }
}
