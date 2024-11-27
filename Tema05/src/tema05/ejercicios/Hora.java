
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Hora {
    private int hora;
    private int minuto;

    public Hora() {
        this.hora = 0;
        this.minuto = 0;
    }
    
    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto;
    }
    
    
}
