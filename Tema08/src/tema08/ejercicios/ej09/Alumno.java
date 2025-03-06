
package tema08.ejercicios.ej09;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Alumno {
    // ATRIBUTOS
    private String nombre;
    private Asignatura[] asignaturas;
    private final static String[] nombresAsignaturas = {"Lengua", "Matemáticas", "Historia", "Física"};

    // CONSTRUCTORES
    public Alumno() {
        this.nombre = "";
        this.asignaturas = new Asignatura[4];
        
        // Inicializo el array por defecto con los nombres de las asignaturas
        for(int i = 0; i < asignaturas.length; i++) {
            asignaturas[i] = new Asignatura(nombresAsignaturas[i], 0);
        }
    }
    
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new Asignatura[4];
        
        for(int i = 0; i < asignaturas.length; i++) {
            asignaturas[i] = new Asignatura(nombresAsignaturas[i], 0);
        }
    }

    public Alumno(String nombre, Asignatura[] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }
        
    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Asignatura[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(Asignatura[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    // MÉTODOS
    /**
     * Método que pide al usuario la nota
     * @param nombreAsignatura
     * @return la nota
     */
    private float pedirNota(String nombreAsignatura) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(" · Nota de " + nombreAsignatura + ": ");
        return entrada.nextFloat();
    }
    
    /**
     * Método que recorre el array de asignaturas
     * asignando a cada asignatura
     * la nota que nos da el usuario.      
     */
    public void rellenarNotas() {
        for(int i = 0; i < asignaturas.length; i++) {
            asignaturas[i].setNota(pedirNota(nombresAsignaturas[i]));
        }
    }
    
    /**
     * Método que recorre el array de asignaturas
     * mostrando su nombre y nota.
     */
    public void mostrarNotas() {
        System.out.println("\n- NOTAS -");
        for(Asignatura asignatura : asignaturas) {
            System.out.println(asignatura.getNombre() + ": " + asignatura.getNota());
        }
    }
    
    /**
     * Método que calcula la nota media del alumno,
     * recorriendo el array de asignaturas,
     * obteniendo sus notas y dividiéndolas entre
     * el número de asignaturas.
     * 
     * @return la nota media del alumno
     */
    public float calcularMediaAlumno() {
        float media = 0;
        
        for(Asignatura asignatura : asignaturas) {
            media += asignatura.getNota();
        }
        
        return media / asignaturas.length;
    }
    
    /**
     * Método que recorre el array de asignaturas
     * del alumno y cuenta las notas inferiores a 5.
     * 
     * @return el número de suspensos.
     */
    public int contarSuspensos() {
        int contador = 0;
        
        for(Asignatura asignatura : asignaturas) {
            if(asignatura.getNota() < 5) {
                contador++;
            }
        }
        
        return contador;
    }    

    // TO STRING
    @Override
    public String toString() {
        return nombre + ": \n" + Arrays.toString(asignaturas);
    }        
}
