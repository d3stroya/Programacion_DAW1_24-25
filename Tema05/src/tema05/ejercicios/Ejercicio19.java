
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio19 {        
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre del/a empleado/a: ");
        return entrada.nextLine();
    }
    
    public static int pedirHoras() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Horas trabajadas: ");
        return entrada.nextInt();
    }
    
    public static double pedirTarifa() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tarifa: ");
        return entrada.nextDouble();
    }
    
    public static void mostrarSueldo(Empleado empleado) {
        int horas = empleado.getHoras();
        double tarifa = empleado.getTarifa();
        double sueldo = 0;
        
        if(horas <= 40) {
            sueldo = horas * tarifa;
        } else {
            sueldo = horas * tarifa;
            sueldo += (horas - 40) * tarifa * 1.5;
        }
        
        empleado.setSalario(sueldo);
        System.out.println("El salario de " + empleado.getNombre() + " es " + sueldo + "€");
        
    }
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(pedirNombre(), pedirHoras(), pedirTarifa());
        Empleado empleado2 = new Empleado(pedirNombre(), pedirHoras(), pedirTarifa());
        Empleado empleado3 = new Empleado(pedirNombre(), pedirHoras(), pedirTarifa());
        
        mostrarSueldo(empleado1);
        mostrarSueldo(empleado2);
        mostrarSueldo(empleado3);
    }
}
