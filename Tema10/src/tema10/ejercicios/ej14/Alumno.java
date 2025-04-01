
package tema10.ejercicios.ej14;

import java.util.Arrays;
import java.util.Scanner;
import tema10.ejercicios.ej10.Asignatura;

/**
 *
 * @author d3stroya
 */
final class Alumno {
    // ATRIBUTOS
    private final String[] NOMBRES_ASIGNATURA = {"Lengua", "Mates", "Física"};
    private String nombre;
    private Asignatura[] aAsignaturas;

    // CONSTRUCTORES
    public Alumno() {
        this.nombre = "";
        this.aAsignaturas = new Asignatura[3];
    }
    // Creo un constructor que pide el nombre 
    // del alumno, rellena los nombres de las asignaturas
    // y pide la nota de cada asignatura
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.aAsignaturas = new Asignatura[3];
        
        for(int i = 0; i < aAsignaturas.length; i++) {            
            aAsignaturas[i] = new Asignatura();
            aAsignaturas[i].setNombre(NOMBRES_ASIGNATURA[i]);
            System.out.println(NOMBRES_ASIGNATURA[i]);
            aAsignaturas[i].setNota(pedirNota());
            
        }
    }    
    
    public Alumno(String nombre, Asignatura[] aAsignaturas) {
        this.nombre = nombre;
        this.aAsignaturas = aAsignaturas;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getaAsignaturas() {
        return aAsignaturas;
    }

    public void setaAsignaturas(Asignatura[] aAsignaturas) {
        this.aAsignaturas = aAsignaturas;
    }
    
    // MÉTODOS  
    public int pedirNota() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nota: ");
        return entrada.nextInt();
    }
    
    public float calcularMedia() {
        float suma = 0;
        for(int i = 0; i < aAsignaturas.length; i++) {
            suma += aAsignaturas[i].getNota();
        }
        return suma / aAsignaturas.length;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return nombre.toUpperCase() + "\n" + Arrays.toString(aAsignaturas) + " - Media: " + calcularMedia();
    }        
}
