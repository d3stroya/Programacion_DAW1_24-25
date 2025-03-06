package tema08.ejercicios.ej13y14;

/**
 *
 * @author d3stroya
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    private int edad;
    private double notaMedia;

    // CONSTRUCTORES
    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0;
    }

    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }        

    // GETTER Y SETTER
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

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    // TO STRING
    @Override
    public String toString() {
        return nombre + " (" + edad + " años) - Nota media: " + notaMedia;
    }
           
}
