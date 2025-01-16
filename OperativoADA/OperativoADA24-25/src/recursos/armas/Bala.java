
package recursos.armas;

/**
 *
 * @author d3stroya
 */
public class Bala {
    // ATRIBUTOS
    private int diametro;

    // CONSTRUCTORES
    public Bala() {
        this.diametro = 0;
    }
    
    public Bala(int diametro) {
        this.diametro = diametro;
    }

    // GETTERS Y SETTERS
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Bala{" + "diametro=" + diametro + '}';
    }
        
}
