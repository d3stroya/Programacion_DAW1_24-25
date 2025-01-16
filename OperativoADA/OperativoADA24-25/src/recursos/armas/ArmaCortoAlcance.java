
package recursos.armas;

/**
 *
 * @author d3stroya
 */
public class ArmaCortoAlcance extends Arma {
    // ATRIBUTOS
    private int alcance;

    // CONSTRUCTORES
    public ArmaCortoAlcance() {
        super();
        setDanio(15);
        this.alcance = 0;
    }
    
    public ArmaCortoAlcance(int alcance, int diametroBala) {
        super(15, diametroBala);
        this.alcance = alcance;
    }

    // GETTERS Y SETTERS
    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    // TO STRING
    @Override
    public String toString() {
        return super.toString() + "ArmaCortoAlcance{" + "alcance=" + alcance + '}';
    }
    
    
}
