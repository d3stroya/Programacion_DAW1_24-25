
package recursos.personajes;

import java.util.UUID;
import recursos.armas.Arma;
import recursos.armas.ArmaCortoAlcance;

/**
 *
 * @author d3stroya
 */
public class Personaje {
    // ATRIBUTOS
    private String identificador;
    private String nombre;
    private int vida;
    private char caracter;
    private int coordenadaX;
    private int coordenadaY;
    private Arma arma;

    // CONSTRUCTORES
    public Personaje() {
        this.identificador = generarId();
        this.nombre = "";
        this.vida = 100;
        this.caracter = ' ';
        this.coordenadaX = 0;
        this.coordenadaY = 0;
        this.arma = new ArmaCortoAlcance();
    }
    
    public Personaje(String nombre, char caracter, int coordenadaX, int coordenadaY) {
        this.identificador = generarId();
        this.nombre = nombre;
        this.vida = 100;
        this.caracter = caracter;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.arma = new ArmaCortoAlcance();
    }

    // GETTERS Y SETTERS
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    // MÉTODOS
    private String generarId() {
        return UUID.randomUUID().toString();
    }
    
    public void actualizarPosicion(int x, int y) {
        this.coordenadaX = x;
        this.coordenadaY = y;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Personaje{" + "identificador=" + identificador + ", nombre=" + nombre + ", vida=" + vida + ", caracter=" + caracter + ", coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", arma=" + arma + '}';
    }         
    
}
