
package tema08;

/**
 *
 * @author d3stroya
 */
public class Bateria {
    // ATRIBUTOS
    private boolean encendido;
    private int potencia;

    // CONSTRUCTORES
    public Bateria() {
        this.encendido = false;
        this.potencia = 0;
    }
    
    public Bateria(boolean encendido, int potencia) {
        this.encendido = encendido;
        this.potencia = potencia;
    }

    // GETTERS Y SETTERS
    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Bateria{" + "encendido=" + encendido + ", potencia=" + potencia + '}';
    }        
}
