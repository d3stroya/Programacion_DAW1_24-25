/*
    EXCEPTION HANDLING
    It is a technique that allows the programmer to control
    the execution of the program, preventing it from stopping
    unexpectedly due to errors.

    try {
        block of code that we attempt to execute and may cause an error
    } catch(Exception we catch e) {
        block of code that executes if the error in parentheses occurs
    } finally {
        block of code that always executes
    }
*/
package tema03.english;

/**
 *
 * @author d3stroya
 */
public class Tema03_3 {
    public static void main(String[] args) {
        int a, b, c;
        a = 3;
        b = 0;
        
        // Without exception handling
//        c = a / b;  // Throws the exception java.lang.ArithmeticException: / by zero
//        System.out.println("The result of dividing " + a + " by " + b + " is " + c);    // Does not execute because the program stops at the previous line
        
        // With exception handling
        try {
            c = a / b;
        } catch(ArithmeticException e) {
            System.out.println("You cannot divide by 0");
            c = 0;
        } 
        
        System.out.println("The result of dividing " + a + " by " + b + " is " + c);    // Executes after exception is handled
    }
}