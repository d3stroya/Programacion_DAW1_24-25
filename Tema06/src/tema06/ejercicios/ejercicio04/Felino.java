
package tema06.ejercicios.ejercicio04;

/**
 *
 * @author d3stroya
 */
public abstract class Felino extends Animal {
    public Felino() {
        super();
    }
    
    public Felino(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }       

    @Override
    public String toString() {
        return super.toString() +  "Felino{" + '}';
    }
}
