
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
    private String id;
    private String nombre;
    private int vida; // 0 - 100
    private Arma arma;
    //Marca del personaje en el plano (nombre.charAt(0))
    private char marca;
    //Coordenadas del personaje en el plano
    private int coordX; //fila
    private int coordY; //columna

    // CONSTRUCTORES
    public Personaje() {
        this.id = generarId();
        this.nombre = "";
        this.vida = 100;       
        this.marca = ' ';
        this.coordX = 0;
        this.coordY = 0;
        //Por defecto, creamos al personaje con un arma de corto alcance 
        //(no se pueden instanciar clases abstractas (Arma))
        this.arma = new ArmaCortoAlcance();
    }
    
    public Personaje(String nombre, Arma arma, char marca, int coordX, int coordY) {
        this.id = generarId();
        this.nombre = nombre;
        this.vida = 100;
        this.marca = marca;
        this.coordX = coordX;
        this.coordY = coordY;
        this.arma = arma;
    }
    
    // GETTER Y SETTER
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }
    
    
    // MÉTODOS
    public static String generarId() {
        return UUID.randomUUID().toString();
    }
    
    //Actualiza la posición del personaje en el mapa
    public void actualizarPosicion(int coordX, int coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }
    @Override
    public String toString() {
        return nombre + "  |  " + vida + "\n" +
                "Id: " + id + "\n" + 
                "Arma: " + arma + "\n" +
                "Marca: " + marca + "\n" + 
                "CoordX: " + coordX + "\n" +
                "CoordY: " + coordY;
    }
}
