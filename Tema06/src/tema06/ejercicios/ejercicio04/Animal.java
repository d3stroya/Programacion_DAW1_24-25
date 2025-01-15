
package tema06.ejercicios.ejercicio04;

/**
 *
 * @author d3stroya
 */
public abstract class Animal {
    private String nombre;
    private int edad;
    private float peso;

    public Animal() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0f;
    }
    
    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public abstract void mostrarSonido();
    
    public abstract void mostrarAlimentacion();
    
    public abstract void mostrarHabitat();
    
    public abstract void mostrarNombreCientifico();    

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
}
