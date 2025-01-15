
package tema06.ejercicios.ejercicio04;

/**
 *
 * @author d3stroya
 */
public class Perro extends Canido {

    public Perro() {
        super();
    }
    
    public Perro(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Guau!!");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentación: carnívora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat: doméstico");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre científico: Canis lupus familiaris");
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + '}';
    }
    
    
    
}
