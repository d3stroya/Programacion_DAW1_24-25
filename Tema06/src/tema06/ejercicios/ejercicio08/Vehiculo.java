
package tema06.ejercicios.ejercicio08;

/**
 * Clase Vehiculo
 * 
 * @author Daniel
 */
public abstract class Vehiculo {
    
    //Atributos
    private int velocidad;
    
    //Constructores
    public Vehiculo() {
        this.velocidad = 0;
    }
    
    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }
    
    //Getters / Setters
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    //Metodos
    public abstract void mostrarMovimiento();
    
    //toString
    @Override
    public String toString() {
        return "Vehiculo{" + "velocidad=" + velocidad + '}';
    }    

}
