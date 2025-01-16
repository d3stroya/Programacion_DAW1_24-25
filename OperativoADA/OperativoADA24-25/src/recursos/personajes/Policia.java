
package recursos.personajes;

/**
 *
 * @author d3stroya
 */
public class Policia extends Personaje {
    // ATRIBUTOS
    private int numPlaca;
    private String dpto;
    private String permisoArma;
    private String rango;

    // CONSTRUCTORES
    public Policia() {
        super();
        this.numPlaca = generarNumeroPlaca();
        this.dpto = "";
        this.permisoArma = "";
        this.rango = "";
    }
    
    public Policia(String dpto, String permisoArma, String rango, String nombre, char caracter, int coordenadaX, int coordenadaY) {
        super(nombre, caracter, coordenadaX, coordenadaY);
        this.numPlaca = generarNumeroPlaca();
        this.dpto = dpto;
        this.permisoArma = permisoArma;
        this.rango = rango;
    }
    
    // GETTERS Y SETTERS
    public int getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(int numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getPermisoArma() {
        return permisoArma;
    }

    public void setPermisoArma(String permisoArma) {
        this.permisoArma = permisoArma;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }    
    
    // MÉTODOS
    public final int generarNumeroPlaca() {
        return (int)(Math.random() * 5001);
    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString() + "Policia{" + "numPlaca=" + numPlaca + ", dpto=" + dpto + ", permisoArma=" + permisoArma + ", rango=" + rango + '}';
    }
    
}
