
package tema08.ejercicios.ej09;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio09 {

    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[3];        
        mostrarMenu(alumnos);
    }
    
    /**
     * Método que recorre el array de alumnos
     * insertando en cada posición un nuevo objeto
     * Alumno con su nombre y, posteriormente,
     * rellena sus notas.
     * 
     * @param alumnos 
     */
    public static void rellenarAlumnos(Alumno[] alumnos) {
        String[] nombresAlumnos = {"Pepe", "Juan", "Marta"};
        
        for(int i = 0; i < alumnos.length; i++) {
            System.out.println("\n- NOTAS DE " + nombresAlumnos[i].toUpperCase());
            alumnos[i] = new Alumno(nombresAlumnos[i]);
            alumnos[i].rellenarNotas();
        }                
    }
    
    /**
     * Método que muestra los alumnos del array,
     * con sus notas.
     * 
     * @param alumnos 
     */
    public static void mostrarAlumnos(Alumno[] alumnos) {
        for(Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }
    
    /**
     * Método que recorre el array de alumnos,
     * calculando la nota media de cada uno de ellos
     * y las compara para encontrar la mejor nota media.
     * Finalmente, imprime el nombre y la nota media del alumno.
     * 
     * @param alumnos 
     */
    public static void alumnoConMejorMedia(Alumno[] alumnos) {
        float mejorMedia = 0;
        Alumno mejorAlumno = null;
        float mediaActual = 0;
        
        for(Alumno alumno : alumnos) {
            mediaActual = alumno.calcularMediaAlumno();
            
            if(mediaActual > mejorMedia) {
                mejorMedia = mediaActual;
                mejorAlumno = alumno;
            }
        }
        
        if(mejorAlumno != null) {
            System.out.println("\n- ALUMNO CON MEJOR MEDIA -");
            System.out.println(mejorAlumno.getNombre() + " -> Media: " + mejorMedia);            
        } else {
            System.out.println("No se ha encontrado alumno con mejor media");
        }
    }
    
    /**
     * Método que recorre el array de alumnos,
     * contando los suspensos de cada uno,
     * y comparando para encontrar quién tiene
     * más suspensos.
     * Finalmente, imprime el nombre y el número de suspensos 
     * de dicho alumno.
     * 
     * @param alumnos 
     */
    public static void alumnoConMasSuspensos(Alumno[] alumnos) {
        int suspensos = 0;
        Alumno peorAlumno = null;
        int suspensosActuales = 0;
        
        for(Alumno alumno : alumnos) {
            suspensosActuales = alumno.contarSuspensos();
            
            if(suspensosActuales > suspensos) {
                suspensos = suspensosActuales;
                peorAlumno = alumno;
            }
        }
        
        if(peorAlumno != null) {
            System.out.println("\n- ALUMNO CON MÁS SUSPENSOS -");
            System.out.println(peorAlumno.getNombre() + " -> Suspensos: " + suspensos);            
        } else {
            System.out.println("No se ha encontrado alumno con más suspensos");
        }
    }
    
    /**
     * Método que calcula la nota media de una asignatura.
     * Recorre el array de alumnos,
     * accediendo a la asignatura del índice j
     * de cada alumno para sumarlas y dividirlas
     * entre el número de alumnos.
     * 
     * @param alumnos
     * @param j
     * @return la nota media de la asignatura
     */
    public static float calcularMediaAsignatura(Alumno[] alumnos, int j) {
        float media = 0;
        
        for(int i = 0; i < alumnos.length; i++) {
            media += alumnos[i].getAsignaturas()[j].getNota();
        }
        
        return media / alumnos.length;
    }
    
    /**
     * Método que calcula cuál es la asignatura con
     * nota media más baja.
     * Recorre el array de asignaturas,
     * calculando la nota media de cada una de ellas.
     * Las compara y se queda con la nota media más baja.
     * Después, imprime el nombre y la nota media de
     * dicha asignatura.
     * 
     * @param alumnos 
     */
    public static void asignaturaConPeorMedia(Alumno[] alumnos) {
        float mediaActual, peorMedia = 99;
        Asignatura peorAsignatura = null;
        
        for(int j = 0; j < alumnos[0].getAsignaturas().length; j++) {
            mediaActual = calcularMediaAsignatura(alumnos, j);
            
            if(mediaActual < peorMedia) {
                peorMedia = mediaActual;
                peorAsignatura = alumnos[0].getAsignaturas()[j];
            }
        }
        
        if(peorAsignatura != null) {
            System.out.println("\n- ASIGNATURA CON PEOR MEDIA -");
            System.out.println(peorAsignatura.getNombre() + " -> Media: " + peorMedia);
        }
    }

    /**
     * Método que muestra el menú del programa.
     * 
     * @param alumnos 
     */
    public static void mostrarMenu(Alumno[] alumnos) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("\n- MENÚ -");
            System.out.println("1. Rellenar notas");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Alumno con mejor media");
            System.out.println("4. Alumno con más suspensos");
            System.out.println("5. Asignatura con peor media");           
            System.out.println("6. Salir");

            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> rellenarAlumnos(alumnos);                    
                case 2 -> mostrarAlumnos(alumnos);
                case 3 -> alumnoConMejorMedia(alumnos);
                case 4 -> alumnoConMasSuspensos(alumnos);
                case 5 -> asignaturaConPeorMedia(alumnos);
                case 6 -> System.out.println("Cerrando programa...");
            }
        } while(opcion != 6);
    }

}
