
package tema06.ejercicios.ejercicio04;

/**
 *
 * @author d3stroya
 */
public class Gato extends Felino {
    public Gato() {
        super();
    }
    
    public Gato(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Miaaauu :)");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentación: ratones");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat: doméstico");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre científico: Felis silvestris catus");
    }
    
    @Override
    public String toString() {
        return super.toString() + "Gato{" + '}';
    }
}
