
package tema08;

/**
 *
 * @author d3stroya
 */
public class Bicicleta implements Comparable<Bicicleta> {
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

    // MÉTODOS
    /**
     * Método que compara la velocidad de dos bicis.
     * Lo usamos para ordenar cualquier estructura de datos
     * de menor a mayor en función de la velocidad.
     * 
     * Si queremos ordenarlo de mayor a menor basta
     * con cambiar el '>' por '<'.
     * 
     * @param bici
     * @return 1 si la velocidad de this es mayor que la de bici 
     *         0 si las velocidades son iguales
     *         y -1 si la velocidad de this es menor que la de bici.
     */
    @Override
    public int compareTo(Bicicleta bici) {
        if(this.velocidad < bici.getVelocidad()) {
            return 1;
        } else if(this.velocidad == bici.getVelocidad()) {
            return 0;
        } else {
            return -1;
        }
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Bicicleta{" + "color=" + color + ", velocidad=" + velocidad + ", bateria=" + bateria + '}';
    }        

}
