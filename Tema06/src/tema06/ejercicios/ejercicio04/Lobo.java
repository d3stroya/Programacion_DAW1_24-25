
package tema06.ejercicios.ejercicio04;

/**
 *
 * @author d3stroya
 */
public class Lobo extends Canido {
    public Lobo() {
        super();
    }
    
    public Lobo(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Auuuuuh!!");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentación: carnívora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat: bosque");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre científico: Canis lupus");
    }

    @Override
    public String toString() {
        return super.toString() + "Lobo{" + '}';
    }
}
