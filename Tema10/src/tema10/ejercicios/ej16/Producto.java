
package tema10.ejercicios.ej16;

/**
 * 
 * @author d3stroya
 */

public class Producto {
    // ATRIBUTOS
    private String nombre;
    private float precio;
    private int stock;
    
    // CONSTRUCTORES
    public Producto() {
        this.nombre = "";
        this.precio = 0;
        this.stock = 0;
    }
    
    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // TO STRING
    @Override
    public String toString() {
        return " · " + nombre + " (" + stock + " unidades) - " + precio + "€" ;
    }    
}