
package tema02;

/**
 *
 * @author d3stroya
 */

// CLASE
public class Vehiculo {
    
    // ATRIBUTOS
    int ruedas;
    private int velocidad;
    String nombre;
    
    // MÉTODOS
    public void arrancar() {
        velocidad = 0;
    }
    
    public void acelerar(int cantidad) {
        velocidad = velocidad + cantidad;
    }
    
    public void frenar(int cantidad) {
        velocidad = velocidad - cantidad;
    }
    
    public int obtenerVelocidad() {
        return velocidad;
    }
    
    // Método main
    public static void main(String[] args) {
        Vehiculo miCoche = new Vehiculo();
        
        // Llamada a métodos
        miCoche.arrancar();
        miCoche.acelerar(50);
        miCoche.frenar(20);
        
        // Sentencia que imprime la velocidad por pantalla
        System.out.println(miCoche.obtenerVelocidad());
    }
}
