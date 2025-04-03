package tema10.ejercicios.ej15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author d3stroya
 */
class Empresa {
    // ATRIBUTOS
    private String nombre;
    private ArrayList<Empleado> lEmpleados;

    // CONSTRUCTORES
    public Empresa() {
        this.nombre = pedirNombre();
        this.lEmpleados = new ArrayList<>();
    }
    
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.lEmpleados = new ArrayList<>();
    }
    
    public Empresa(String nombre, ArrayList<Empleado> lEmpleados) {
        this.nombre = nombre;
        this.lEmpleados = lEmpleados;
    }

    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getlEmpleados() {
        return lEmpleados;
    }

    public void setlEmpleados(ArrayList<Empleado> lEmpleados) {
        this.lEmpleados = lEmpleados;
    }
    
    // MÉTODOS
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static Integer pedirSueldo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Sueldo (€): ");
        return entrada.nextInt();
    }
    
    /**
     * Crea un arrayList en el que va insertando nuevos empleados.
     * Esos empleados se crean con el constructor parametrizado
     * usando los métodos pedirNombre() y pedirSueldo().
     * Sigue añadiendo empleados mientras el usuario escriba "sí"
     * @return 
     */
    public final void insertarEmpleados() {
        Scanner entrada = new Scanner(System.in);        
        int index = 1;  // Leva la cuenta de los empleados
        
        do {
            System.out.println("\nCreando empleado " + index + "...");
            lEmpleados.add(new Empleado(pedirNombre(), pedirSueldo()));
            index++;            
            
            System.out.print("¿Desea añadir más empleados? (s/n) ");
        } while(entrada.nextLine().equalsIgnoreCase("s"));
        
    }

    @Override
    public String toString() {
        return "Empresa " + nombre + " -  Empleados" + lEmpleados.toString();
    }        
}