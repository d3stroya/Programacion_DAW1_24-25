
package tema06.interfaces;

/**
 *
 * @author d3stroya
 */
public class Test {
    public static void main(String[] args) {
        // Polimorfismo
        System.out.println("- MARÍA -");
        Empleable empleado = new Empleado("María", 1200, 950);
        System.out.println("Sueldo aumentado: " + empleado.aumentarSueldo(50));
        System.out.println("Sueldo bruto:" + empleado.calcularSueldoBruto(1250));
        
        System.out.println("\n- JUAN -");
        empleado = new Empleado("Juan", 1150, 920);
        System.out.println("Sueldo aumentado: " + empleado.aumentarSueldo(50));
        System.out.println("Sueldo bruto:" + empleado.calcularSueldoBruto(1200));
        
    }
}
