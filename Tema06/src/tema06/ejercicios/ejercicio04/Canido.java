
package tema06.ejercicios.ejercicio04;

/**
 *
 * @author d3stroya
 */
public abstract class Canido extends Animal {

    public Canido() {
        super();
    }
    
    public Canido(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }
        
    @Override
    public String toString() {
        return super.toString() +  "Canido{" + '}';
    }

    
}
