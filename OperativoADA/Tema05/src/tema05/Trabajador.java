
package tema05;

/**
 *
 * @author d3stroya
 */
class Trabajador {
    // ATRIBUTOS
    private String nombre;
    private int codigo;

    // CONSTRUCTORES
    public Trabajador() {
        this.nombre = "";
        this.codigo = 0;
    }
    
    public Trabajador(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }
    
}
