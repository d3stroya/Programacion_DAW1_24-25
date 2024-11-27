
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Av. París", 2, "3A", "Plasencia");
        Direccion direccion2 = new Direccion("Av. España", 3, "1B", "Plasencia");
        Direccion direccion3 = new Direccion("Av. Austria", 4, "5C", "Plasencia");
    
        Empleado empleado1 = new Empleado("Celia", 2439.68, direccion1);
        Empleado empleado2 = new Empleado("Mario", 2139.23, direccion2);
        Empleado empleado3 = new Empleado("María", 2942.61, direccion3);
        
        System.out.println("\nEMPLEADO 1\n" + empleado1.toString());
        System.out.println("\nEMPLEADO 2\n" + empleado2.toString());
        System.out.println("\nEMPLEADO 3\n" + empleado3.toString());
    }
}
