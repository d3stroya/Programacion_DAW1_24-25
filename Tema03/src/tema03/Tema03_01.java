package tema03;


/**
 *
 * @author d3stroya
 */
public class Tema03_01 {

    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaración e inicialización de variables
        int a = 3, b = 2;
        
        /*
            1. ESTRUCTURAS CONDICIONALES
        */
        
        // 1.1. Una condición
//        System.out.println("IF"); 
//        // Si se cumple la condición (true), se ejecuta lo que hay dentro del if{}. 
//        // Si no, no pasa nada
//        if(a < b) {
//            System.out.println(a + " es menor que " + b);
//        }
        
//        System.out.println("IF ELSE");
//        // Si se cumple la condición (true), se ejecuta lo que hay dentro del if. 
//        // Si no, se ejecuta lo que hay dentro del else{}
//        if(a < b) {
//            System.out.println(a + " es menor que " + b);
//        } else {
//            System.out.println(a + " es mayor que " + b);
//        }
        
//        // 1.2. Doble condición
//        System.out.println("IF - ELSE IF - ELSE");        
//        if(a < b) {
//            System.out.println(a + " es menor que " + b);
//        } else if(a > b) {
//            System.out.println(a + " es mayor que " + b);
//        } else {
//            System.out.println(a + " es igual que " + b);
//        }

        // 1.3. Múltiples condiciones
        System.out.println("SWITCH");        
        switch(a) {
            // Si a = 1
            case 1:
                System.out.println("a es 1");
                System.out.println("(Puedo ejecutar más de una sentencia dentro del case)");
                break;  // rompe el bucle. Si no lo ponemos, pasaría a los siguientes casos
            // Si a = 2
            case 2:
                System.out.println("a es 2");
                break;
            // Si a = 3
            case 3:
                System.out.println("a es 3");
                // !!! Si no pongo el break, se ejecuta(n) la(s) sentencia(s) siguiente(s)
            // Cualquier otra opción
            default:
                System.out.println("a no es 1 ni 2 ni 3");
        }
        
//        // Otra forma de escribir el swith-case
//        switch(a) {
//            case 1 -> System.out.println("a es 1"); //System.out.println("ERROR: No puedo ejecutar más de 1 sentencia dentro del case");
//            case 2 -> System.out.println("a es 2");
//            case 3 -> System.out.println("a es 3");
//            default -> System.out.println("a no es 1 ni 2 ni 3");
//        }

    }

}
