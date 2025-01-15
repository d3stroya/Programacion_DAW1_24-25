
package tema06.ejercicios.ejercicio04;

/**
 *
 * @author d3stroya
 */
public class Leon extends Felino {

    public Leon() {
        super();
    }
    
    public Leon(String nombre, int edad, float peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido: Grrrrr!!");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentación: carnívora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Hábitat: sabana");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre científico: Panthera leo");
    }
    
    @Override
    public String toString() {
        return super.toString() + "Leon{" + '}';
    }
   
}
