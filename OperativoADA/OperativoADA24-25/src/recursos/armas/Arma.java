
package recursos.armas;

import java.util.UUID;

/**
 *
 * @author d3stroya
 */
public class Arma {
    // ATRIBUTOS
    private String identificador;
    private int danio;
    private int diametroBala;

    // CONSTRUCTORES
    public Arma() {
        this.identificador = generarId();
        this.danio = 0;
        this.diametroBala = 0;
    }
    
    public Arma(int danio, int diametroBala) {
        this.identificador = generarId();
        this.danio = danio;
        this.diametroBala = diametroBala;
    }

    // GETTERS Y SETTERS
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getDiametroBala() {
        return diametroBala;
    }

    public void setDiametroBala(int diametroBala) {
        this.diametroBala = diametroBala;
    }

    // MÉTODOS
    private String generarId() {
        return UUID.randomUUID().toString();
    }

    // TO STRING
    @Override
    public String toString() {
        return "Arma{" + "identificador=" + identificador + ", danio=" + danio + ", diametroBala=" + diametroBala + '}';
    }

        
}
