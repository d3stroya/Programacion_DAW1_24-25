
package tema10;

import java.util.ArrayList;

/**
 *
 * @author d3stroya
 */
public class ListaDeListas {    
    /*
            LISTAS DE LISTAS
             i
            / \          /  \   /  \   /  \   /  \     
           | 0 |  --> j | 00 | | 01 | | 02 | | 03 |
            \ /          \  /   \  /   \  /   \  /

            / \          /  \   /  \   /  \   /  \     
           | 1 |  --> j | 10 | | 11 | | 12 | | 13 |
            \ /          \  /   \  /   \  /   \  /

    */
    
    // Declarar e instanciar un ArrayList de ArrayList de Integer
    public static ArrayList<ArrayList<Integer>> notas = new ArrayList();
    
    
    public static void main(String[] args) {
        // Para hacerlo más manejable, lo divido en sublistas:

        // Creo dos listas con las notas de 2 alumnos
        /* ALUMNO 1 */
        ArrayList<Integer> notasAlumno1 = new ArrayList();
        
        // Comprobar que la lista tiene elementos, para recorrerla
        if(!notasAlumno1.isEmpty()) {
            for(int i = 0; i < notasAlumno1.size(); i++) {
                System.out.println(notasAlumno1.get(i));
            }            
        }
//        notasAlumno1.add(3);
//        notasAlumno1.add(5);
//        notasAlumno1.add(2);
//        notasAlumno1.add(8);

        /* ALUMNO 2 */
//        ArrayList<Integer> notasAlumno2 = new ArrayList();
//        for(int i = 0; i < 4; i++) {
//            notasAlumno2.add((int)(Math.random() * 10 + 1));
//            
//        }

       
        // Creo una lista para almacenar las listas anteriores
//        ArrayList<ArrayList<Integer>> alumnos = new ArrayList();        
//        alumnos.add(notasAlumno1);
//        alumnos.add(notasAlumno2);

        // Recorro la lista de listas (igual que una matriz)
        // FOR
//        System.out.println("\n- NOTAS CON FOR -");
//        for(int i = 0; i < alumnos.size(); i++) {
//            System.out.println("\nAlumno " + (i + 1));
//            
//            for(int j = 0; j < alumnos.get(0).size(); j++) {
//                System.out.println("Nota " + (j + 1) + ": " + alumnos.get(i).get(j));                
//            }
//            
//        }
        
        // FOR-EACH
//        System.out.println("\n- NOTAS CON FOR-EACH -");
//        int cuenta = 1;
//        
//        for(ArrayList<Integer> notas : alumnos) {
//            System.out.println("Alumno " + cuenta + ":");
//            
//            for(Integer nota : notas) {
//                System.out.println("Nota " + cuenta + ": " + nota);
//            }
//            
//        }
//        
        // FOR CON ARRAY AUXILIAR PARA EL NOMBRE DE LAS ASIGNATURAS
//        System.out.println("\n- NOTAS CON ARRAY AUXILIAR -");
//        String[] nombreAsignaturas = {"PROG", "BBDD", "LMSGI", "SI", "ED", "IPE I", "IP"};
//        
//        for(int i = 0; i < alumnos.size(); i++) {
//            System.out.println("\nAlumno " + (i + 1));
//            
//            for(int j = 0; j < alumnos.get(0).size(); j++) {
//                System.out.println("Nota de " + nombreAsignaturas[j] + ": " + 
//                        alumnos.get(i).get(j));
//            } 
//            
//        }
    }
}
