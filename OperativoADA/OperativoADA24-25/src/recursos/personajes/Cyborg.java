
package recursos.personajes;

/**
 *
 * @author d3stroya
 */
public class Cyborg extends Personaje {
    // ATRIBUTOS
    private String habilidad;
    private String paisOrigen;
    
    // CONSTRUCTORES
    public Cyborg() {
        super();
        this.habilidad = "";
        this.paisOrigen = "";
    }
    
    public Cyborg(String habilidad, String paisOrigen, String nombre, char caracter, int coordenadaX, int coordenadaY) {
        super(nombre, caracter, coordenadaX, coordenadaY);
        this.habilidad = habilidad;
        this.paisOrigen = paisOrigen;
    }

    // GETTERS Y SETTERS
    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    // TO STRING
    @Override
    public String toString() {
        return super.toString() + "Cyborg{" + "habilidad=" + habilidad + ", paisOrigen=" + paisOrigen + '}';
    }
        
}
