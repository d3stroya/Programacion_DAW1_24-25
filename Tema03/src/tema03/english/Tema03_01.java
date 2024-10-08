package tema03.english;

/**
 *
 * @author d3stroya
 */
public class Tema03_01 {

    /**
     * Main method with the program menu
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declaration and initialization of variables
        int a = 3, b = 2;
        
        /*
            1. CONDITIONAL STRUCTURES
        */
        
        // 1.1. A single condition
        System.out.println("IF"); 
        // If the condition is met (true), what is inside the if{} is executed. 
        // If not, nothing happens
        if(a < b) {
            System.out.println(a + " is less than " + b);
        }
        
        System.out.println("IF ELSE");
        // If the condition is met (true), what is inside the if is executed. 
        // If not, what is inside the else{} is executed
//        if(a < b) {
//            System.out.println(a + " is less than " + b);
//        } else {
//            System.out.println(a + " is greater than " + b);
//        }
        
        // 1.2. Double condition
//        System.out.println("IF - ELSE IF - ELSE");        
//        if(a < b) {
//            System.out.println(a + " is less than " + b);
//        } else if(a > b) {
//            System.out.println(a + " is greater than " + b);
//        } else {
//            System.out.println(a + " is equal to " + b);
//        }

        // 1.3. Multiple conditions
        System.out.println("SWITCH");        
        switch(a) {
            // If a = 1
            case 1:
                System.out.println("a is 1");
                System.out.println("(I can execute more than one statement inside the case)");
                break;  // breaks the loop. If we don’t include it, the following cases would be executed
            // If a = 2
            case 2:
                System.out.println("a is 2");
                break;
            // If a = 3
            case 3:
                System.out.println("a is 3");
                break;
                // !!! If the break is not included, the next statement(s) will be executed
            // Any other option
            default:
                System.out.println("a is not 1, 2, or 3");
        }
        
//        // Another way of writing the switch-case
//        switch(a) {
//            case 1 -> System.out.println("a is 1"); //System.out.println("ERROR: I cannot execute more than one statement inside the case without using braces");
//            case 2 -> System.out.println("a is 2");
//            case 3 -> System.out.println("a is 3");
//            default -> System.out.println("a is not 1, 2, or 3");
//        }

    }

}