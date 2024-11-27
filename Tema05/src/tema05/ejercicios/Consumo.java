
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Consumo {
    private float kms;
    private float litros;
    private float velMedia;
    private float precioGasolina;

    public Consumo() {
        this.kms = 0f;
        this.litros = 0f;
        this.velMedia = 0f;
        this.precioGasolina = 0f;
    }
    public Consumo(float kms, float litros, float velMedia, float precioGasolina) {
        this.kms = kms;
        this.litros = litros;
        this.velMedia = velMedia;
        this.precioGasolina = precioGasolina;
    }

    public float getKms() {
        return kms;
    }

    public void setKms(float kms) {
        this.kms = kms;
    }

    public float getLitros() {
        return litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public float getVelMedia() {
        return velMedia;
    }

    public void setVelMedia(float velMedia) {
        this.velMedia = velMedia;
    }

    public float getPrecioGasolina() {
        return precioGasolina;
    }

    public void setPrecioGasolina(float precioGasolina) {
        this.precioGasolina = precioGasolina;
    }
    
    // Métodos
    public float getTiempo() {
        return kms / velMedia;
    }
    
    public float consumoMedio() {
        // litros / 100kms
        return (litros / kms) * 100;
    }   
    
    public float consumoEuros() {
        // Consumo en € cada 100kms
        return consumoMedio() * precioGasolina;
    }

    @Override
    public String toString() {
        return "Consumo{" + "kms=" + kms + ", litros=" + litros + ", velMedia=" + velMedia + ", precioGasolina=" + precioGasolina + '}';
    }
        
}
