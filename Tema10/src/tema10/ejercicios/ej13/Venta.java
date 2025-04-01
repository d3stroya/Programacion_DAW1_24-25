
package tema10.ejercicios.ej13;

/**
 *
 * @author d3stroya
 */
class Venta {
    // ATRIBUTOS
    private String nombreMes;
    private int numVentas;
    
    // CONSTRUCTORES
    public Venta() {
        this.nombreMes = "";
        this.numVentas = 0;
    }

    public Venta(String nombreMes, int numVentas) {
        this.nombreMes = nombreMes;
        this.numVentas = numVentas;
    }
    
    // GETTER Y SETTER
    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }

    public int getNumVentas() {
        return numVentas;
    }

    public void setNumVentas(int numVentas) {
        this.numVentas = numVentas;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return nombreMes + " - " + numVentas + " ventas";
    }
    
}
