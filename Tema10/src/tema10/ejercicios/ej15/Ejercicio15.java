
package tema10.ejercicios.ej15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Clase con manejo de ArrayList de empresas
 * @author d3stroya
 */
public class Ejercicio15 {
    /**
     * Método que pide el nombre de la empresa
     * @return 
     */
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    /**
     * Crea una empresa y le pregunta al usuario si quiere añadir otra
     * @param lEmpresas 
     */
    public static void insertarEmpresa(ArrayList<Empresa> lEmpresas) {
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("\nCreando empresa...");
                    
            // Creamos la empresa con el nombre e insertamos los empleados
            Empresa aux = new Empresa(pedirNombre());
            aux.insertarEmpleados();
            
            // Insertamos la empresa en la lista
            lEmpresas.add(aux);
            
            System.out.print("¿Desea añadir más empresas? (s/n) ");
        } while(entrada.nextLine().equalsIgnoreCase("s"));
    }
    
    /**
     * Imprime por pantalla las empresas que hay en la lista.
     * Aprovecha el método toString de la clase Empresa para
     * mostrar el valor de los atributos de cada objeto.
     * @param lEmpresas 
     */
    public static void mostrarEmpresas(ArrayList<Empresa> lEmpresas) {
        lEmpresas.forEach(System.out::println);
    }
    
    /**
     * Filtra la lista por nombres que contengan la A y muestra
     * las empresas resultantes
     * @param lEmpresas 
     */
    public static void mostrarEmpresasConA(ArrayList<Empresa> lEmpresas) {
        lEmpresas.stream()
                .filter(e -> e.getNombre().toUpperCase().contains("A"))
                .forEach(System.out::println);
    }
    
    /**
     * Guardamos todos los empleados de todas las empresas en una nueva lista.
     * Ordenamos esa lista y mostramos por pantalla los empleados
     * @param lEmpresas 
     */
    public static void mostrarTodosLosEmpleadosPorSueldo(ArrayList<Empresa> lEmpresas) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        for(Empresa empresa : lEmpresas) {
            for(Empleado empleado : empresa.getlEmpleados()) {
                empleados.add(empleado);
            }
        }
        // Hay varias formas:        
        // 1. El método de la burbuja
//        Empleado aux;
//        for(int i = 0; i < empleados.size() - 1; i++) {
//            for(int j = i + 1; j < empleados.size(); j++) {
//                if(empleados.get(i).getSueldo() < empleados.get(j).getSueldo()) {
//                    aux = empleados.get(i);
//                    empleados.set(i, empleados.get(j));
//                    empleados.set(j, aux);
//                }
//            }
//        }
        
        // 2. Usando .sort() e Integer.compare(o1, o2)
        empleados.sort((e1, e2) -> Integer.compare(e1.getSueldo(), e2.getSueldo()));
        
        // 3. Usando Collections.sort. Es necesario implementar la interfaz Comparable en Empleado
        Collections.sort(empleados);        
        
        empleados.forEach(System.out::println);
    }
    
    /**
     * Menú con el que interacciona el usuario
     */
    public static void mostrarMenu() {
        ArrayList<Empresa> lEmpresas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("- MENU -");
            System.out.println("1. Introducir empresa con sus empleados");
            System.out.println("2. Mostrar empresas y sus empleados");
            System.out.println("3. Mostrar empresas cuyo nombre contenga la 'A'");
            System.out.println("4. Mostrar todos los empleados por sueldo");
            System.out.println("5. Salir");

            opcion = entrada.nextInt();

            switch(opcion) {
                case 1 :
                    insertarEmpresa(lEmpresas);
                    break;
                case 2:
                    mostrarEmpresas(lEmpresas);
                    break;
                case 3:
                    mostrarEmpresasConA(lEmpresas);
                    break;
                case 4:
                    mostrarTodosLosEmpleadosPorSueldo(lEmpresas);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Elige una opción correcta.");
            }
            
        } while(opcion != 5);
    }
    
    /**
     * Método main
     * @param args 
     */
    public static void main(String[] args) {
        mostrarMenu();
    }
}




