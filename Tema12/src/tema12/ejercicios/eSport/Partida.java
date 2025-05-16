package tema12.ejercicios.eSport;

/**
 *
 * @author d3stroya
 */
public class Partida {
    // ATRIBUTOS
    private String nombre;
    private String juego;
    private int victorias;
    private int derrotas;
    private int duracion;

    // CONSTRUCTORES
    public Partida() {
        this.nombre = "";
        this.juego = "";
        this.victorias = 0;
        this.derrotas = 0;
        this.duracion = 0;
    }
    
    public Partida(String nombre, String juego, int victorias, int derrotas, int duracion) {
        this.nombre = nombre;
        this.juego = juego;
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.duracion = duracion;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // TO STRING

    @Override
    public String toString() {
        return nombre + ";" + juego + ";" + victorias + ";" + derrotas + ";" + duracion;
    }    
}
