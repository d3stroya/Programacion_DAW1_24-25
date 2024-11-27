
package tema05;

/**
 *
 * @author d3stroya
 */



public class Pajaro {
    // ATRIBUTOS
    private String color;
    private int edad;
    
    // CONSTRUCTORES
    // Constructor por defecto
    public Pajaro() {
        this.color = "";
        this.edad = 0;
    }
    
    // Constructor parametrizado
    public Pajaro(String color, int edad) {
        this.color = color;
        this.edad = edad;
    }
    
    // GETTERS Y SETTERS
    public String obtenerColor() {
        return color;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    public int obtenerEdad() {
        return edad;
    }

    public void establecerEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrar() {
        System.out.println(
                "Pájaro: \nColor: " + color +
                "\nEdad: " + edad
        );
    }
    
}
