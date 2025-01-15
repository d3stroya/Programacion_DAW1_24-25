
package tema06.ejercicios.ejercicio08;

/**
 * Clase Moto
 * 
 * @author Daniel
 */
public class Moto extends Vehiculo {

    //Atributos
    private boolean haciendoCaballito;
    
    //Constructores
    public Moto() {
        super();
    }

    public Moto(int velocidad) {
        super(velocidad);
        this.haciendoCaballito = false;
    }
    
    //Getters / Setters
    public boolean isHaciendoCaballito() {
        return haciendoCaballito;
    }

    public void setHaciendoCaballito(boolean haciendoCaballito) {
        this.haciendoCaballito = haciendoCaballito;
    }
    
    //M�todos
    @Override
    public void mostrarMovimiento() {
        System.out.println("La moto est� circulando a " + getVelocidad() + "km/h.");
    }
    
    public void hacerCaballito() {
        if(!haciendoCaballito) {
            haciendoCaballito = true;
            System.out.println("La moto est� haciendo un caballito. La velocidad aumenta.");
            setVelocidad(getVelocidad() + 15);
        } else {
            System.out.println("La moto ya est� haciendo un caballito");
        }
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Moto{" + "haciendoCaballito=" + haciendoCaballito + '}';
    }
    
}
