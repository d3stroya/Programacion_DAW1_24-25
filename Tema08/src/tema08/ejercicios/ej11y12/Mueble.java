package tema08.ejercicios.ej11y12;

/**
 *
 * @author d3stroya
 */
public class Mueble {
    private double precio;
    private String descripcion;

    public Mueble() {
        this.precio = 0;
        this.descripcion = "";
    }

    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Mueble{" + "precio=" + precio + ", descripcion=" + descripcion + '}';
    }   
}
