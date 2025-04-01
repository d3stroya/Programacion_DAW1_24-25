
package tema10.ejercicios.ej14;

import java.util.ArrayList;
import java.util.Scanner;
import tema10.ejercicios.ej10.Asignatura;


/**
 *
 * @author d3stroya
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        mostrarMenu();
    }
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static void introducirAlumno(ArrayList<Alumno> lAlumnos) {
        System.out.println("Agregando alumno...");
        Alumno alumno = new Alumno(pedirNombre());
        lAlumnos.add(alumno);
    }
    
    public static void mostrarAlumnos(ArrayList<Alumno> lAlumnos) {
        lAlumnos.forEach(System.out::println);
    }
    
    public static void mostrarAlumnoMejorMedia(ArrayList<Alumno> lAlumnos) {
        float media = 0;
        float mediaActual = 0;
        Alumno alumno = lAlumnos.get(0);
        
        for(Alumno a : lAlumnos) {
            mediaActual = a.calcularMedia();
            if(mediaActual > media) {
                alumno = a;
                media = mediaActual;
            }
        }
        System.out.println(alumno);
    }
    
    public static void mostrarAsignaturaMasDificil(ArrayList<Alumno> lAlumnos) {
        Asignatura asigAux = null;
        int suspensos = 0, suspensosRef = 0;
        int numAsignaturas = lAlumnos.get(0).getaAsignaturas().length;

        // Recorremos las columnas (asignaturas)
        for(int j = 0; j < numAsignaturas; j++) {
            
            // Calculamos la media de la asignatura
            suspensos = contarSuspensos(lAlumnos, j);
            
            // Comparamos la media actual con la de referencia y, si es menor, la guardamos
            if(suspensos > suspensosRef) {
                suspensosRef = suspensos;
                asigAux = lAlumnos.get(0).getaAsignaturas()[j];
            }
        } 
        
        // Mostramos la asignatura con media más baja
        if(asigAux != null) {
            System.out.println("La asignatura más difícil es " + asigAux.getNombre() + 
                    " con  " + suspensosRef + " suspensos.");            
        }
    }

    public static int contarSuspensos(ArrayList<Alumno> lAlumnos, int j) {
        int suspensos = 0;
        
        // Recorremos los alumnos de la columna
        // (la nota de cada alumno para la asignatura actual)
        for(int i = 0; i < lAlumnos.size(); i++) {
            if(lAlumnos.get(i).getaAsignaturas()[j].getNota() < 5) {
                suspensos ++;                
            }
        }
        
        // Calculamos la media dividiendo la suma de notas entre los alumnos de la lista                
        return suspensos;
    }
    
    /********** Otra forma de hacer lo mismo **************/
    
    /**
     * Método que recorre los alumnos
     * y, dentro, las asignaturas de cada alumno,
     * incrementando en 1 el número de suspensos
     * de cada asignatura, que se almacenan en 
     * un array auxiliar.
     * 
     * @param lAlumnos 
     */
    public static void asigMasDificil(ArrayList<Alumno> lAlumnos) {
        // Almaceno el número de suspensos: 0 - Lengua, 1 - Mates, 2 - Física
        int[] suspensos = new int[3];
        String[] NOMBRES_ASIGNATURA = {"Lengua", "Mates", "Física"};
        
        // Recorro los alumnos
        for(Alumno alumno : lAlumnos) {
            
            // Recorro las asignaturas del alumno actual
            for(int i = 0; i < alumno.getaAsignaturas().length; i++) {                
                // Si la nota es menor que 5, sumo 1 a su contador
                if(alumno.getaAsignaturas()[i].getNota() < 5) {
                    suspensos[i]++;
                }
            }
                        
        }
        
        
        System.out.print("La asignatura más difícil es ");
        if(suspensos[0] > suspensos[1] && suspensos[0] > suspensos[2]) {
            System.out.println(NOMBRES_ASIGNATURA[0] + " con " + suspensos[0] + " suspensos.");
        } else if(suspensos[1] > suspensos[0] && suspensos[1] > suspensos[2]) {
            System.out.println(NOMBRES_ASIGNATURA[1] + " con " + suspensos[1] + " suspensos.");
        }
        if(suspensos[2] > suspensos[0] && suspensos[2] > suspensos[1]) {
            System.out.println(NOMBRES_ASIGNATURA[2] + " con " + suspensos[2] + " suspensos.");
        }
        
        
    }
    
    
    
    public static void mostrarMenu() {
        ArrayList<Alumno> lAlumnos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("- MENU -");
            System.out.println("1. Introducir un nuevo alumno junto a sus notas.");
            System.out.println("2. Mostrar los alumnos con sus notas");
            System.out.println("3. Alumno con nota media más alta");
            System.out.println("4. Asignatura con nota media más baja");
            System.out.println("5. Salir");

            opcion = entrada.nextInt();

            switch(opcion) {
                case 1 :
                    introducirAlumno(lAlumnos);
                    break;
                case 2:
                    mostrarAlumnos(lAlumnos);
                    break;
                case 3:
                    mostrarAlumnoMejorMedia(lAlumnos);
                    break;
                case 4:
//                    mostrarAsignaturaMasDificil(lAlumnos);
                    asigMasDificil(lAlumnos);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Elige una opción correcta.");
            }
            
        } while(opcion != 5);
    }
}


