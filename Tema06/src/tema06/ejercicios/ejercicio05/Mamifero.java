
package tema06.ejercicios.ejercicio05;

/**
 * Clase Mamifero
 * 
 * @author Daniel
 */
public class Mamifero {
    
    //Atributos
    private String nombre;
    private String sexo;
    private String color;
    private int edad;
    
    //Constructores
    public Mamifero() {
        this.nombre = "";
        this.sexo = "";
        this.color = "";
        this.edad = 0;
    }
    
    public Mamifero(String nombre, String sexo, String color, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.color = color;
        this.edad = edad;
    }
    
    //Getters / Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //toString
    @Override
    public String toString() {
        return "Mamifero{" + "nombre=" + nombre + ", sexo=" + sexo + ", color=" + color + ", edad=" + edad + '}';
    }
      
}
