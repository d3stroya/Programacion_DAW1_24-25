
package tema06.ejercicios.ejercicio10;

/**
 * Clase Electrodomestico, que implementa ConsumoEnergetico
 * 
 * @author d3stroya
 */
public class Electrodomestico implements ConsumoEnergetico {
    // ATRIBUTOS
    private float kwh;
    private float precioKwh;
    private String eficiencia;

    // CONSTRUCTORES
    public Electrodomestico() {
        this.kwh = 0f;
        this.precioKwh = 0f;
        this.eficiencia = "";
    }
    
    public Electrodomestico(float kwh, float precioKwh, String eficiencia) {
        this.kwh = kwh;
        this.precioKwh = precioKwh;
        this.eficiencia = eficiencia;
    }

    // GETTERS Y SETTERS
    public float getKwh() {
        return kwh;
    }

    public void setKwh(float kwh) {
        this.kwh = kwh;
    }

    public float getPrecioKwh() {
        return precioKwh;
    }

    public void setPrecioKwh(float precioKwh) {
        this.precioKwh = precioKwh;
    }

    public String getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(String eficiencia) {
        this.eficiencia = eficiencia;
    }
    
    // MÉTODOS
    private float obtenerFactorEficiencia() {
        switch (eficiencia.toUpperCase()) {
            case "A++":
                return 0.5f;
            case "A+":
                return 0.7f;
            case "A":
                return 1.0f;
            case "B":
                return 1.2f;
            default:
                return 1.0f;
        }
    }

    @Override
    public float calcularConsumo(float horasDeUso) {
        return horasDeUso * kwh * obtenerFactorEficiencia();
    }

    @Override
    public float calcularFactura(float horasDeUso) {
        return calcularConsumo(horasDeUso) * precioKwh;
    }       

    // TO STRING
    @Override
    public String toString() {
        return "Electrodomestico{" + "kwh=" + kwh + ", precioKwh=" + precioKwh + ", eficiencia=" + eficiencia + '}';
    }
    
    
}
