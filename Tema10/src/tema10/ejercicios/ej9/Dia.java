
package tema10.ejercicios.ej9;

/**
 *
 * @author d3stroya
 */
public class Dia {
    private String nombreDia;
    private int temperatura;

    public Dia() {
        this.nombreDia = "";
        this.temperatura = 0;
    }

    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return nombreDia + ": " + temperatura + "ºC";
    }
}
