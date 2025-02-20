
package tema08;

/**
 *
 * @author d3stroya
 */
public class Bicicleta {
    // ATRIBUTOS
    private String color;
    private int velocidad;
    private Bateria bateria;

    // CONSTRUCTORES
    public Bicicleta() {
        this.color = "";
        this.velocidad = 0;
        this.bateria = new Bateria();
    }
    
    public Bicicleta(String color, int velocidad, Bateria bateria) {
        this.color = color;
        this.velocidad = velocidad;
        this.bateria = bateria;
    }

    // GETTERS Y SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Bicicleta{" + "color=" + color + ", velocidad=" + velocidad + ", bateria=" + bateria + '}';
    }        
}
