
package tema06.ejercicios.ejercicio13;

/**
 * Clase Test
 * 
 * @author Daniel
 */
public class Test {
    
    public static void main(String[] args) {
        
        System.out.println("*** ROBOT ***");
        Robot robot = new Robot(false, true, 15);
        System.out.println("Probando el robot...");
        robot.activar();
        System.out.println(robot.realizarRevision());
        robot.desactivar();

        System.out.println();

        System.out.println("\n*** MICROONDAS ***");
        Microondas microondas = new Microondas(true, true, false);
        System.out.println("Probando el microondas...");
        microondas.activar();
        System.out.println(microondas.realizarRevision());
        microondas.desactivar();
        
        System.out.println("\n----- POLIMORFISMO -----");
        
        System.out.println("\n*** ROBOT ***");
        Operable robotOperable = new Robot(false, true, 15);
        System.out.println("Probando el robot Operable...");
        robotOperable.activar();     
        /* No se puede invocar a este m�todo (definido en la interfaz Revisable)
           System.out.println(robotOperable.realizarRevision()); */
        robotOperable.desactivar();
        
        Revisable robotRevisable = new Robot(false, true, 15);
        System.out.println("Probando el robot Revisable...");
        System.out.println(robotRevisable.realizarRevision());    
        /* No se puede invocar a estos m�todos (definidos en la interfaz Operable)
           robotRevisable.activar(); 
           robotRevisable.desactivar(); */
        
    }

}
