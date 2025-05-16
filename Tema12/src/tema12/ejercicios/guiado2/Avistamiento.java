package tema12.ejercicios.guiado2;

/**
 *
 * @author d3stroya
 */
public class Avistamiento {
    // ATRIBUTOS
    private String nombreAvistador;
    private String especie;
    private String ubicacion;
    private int numAnimales;

    // CONSTRUCTORES
    public Avistamiento() {
        this.nombreAvistador = "";
        this.especie = "";
        this.ubicacion = "";
        this.numAnimales = 0;
    }
    
    public Avistamiento(String nombreAvistador, String especie, String ubicacion, int numAnimales) {
        this.nombreAvistador = nombreAvistador;
        this.especie = especie;
        this.ubicacion = ubicacion;
        this.numAnimales = numAnimales;
    }

    // GETTERS Y SETTERS
    public String getNombreAvistador() {
        return nombreAvistador;
    }

    public void setNombreAvistador(String nombreAvistador) {
        this.nombreAvistador = nombreAvistador;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumAnimales() {
        return numAnimales;
    }

    public void setNumAnimales(int numAnimales) {
        this.numAnimales = numAnimales;
    }


    // MÉTODOS


    // TO STRING
    @Override
    public String toString() {
        return nombreAvistador + ";" + especie + ";" + ubicacion + ";" + numAnimales;
    }
   
}
