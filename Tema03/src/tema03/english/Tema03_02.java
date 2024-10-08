/*
    REPETITIVE STRUCTURES (LOOPS)
    Loops allow us to control the program flow 
    to repeat actions a certain number of times (known or unknown).
    For example:
        - I lose my keys -> I search until I find them
        - A clock that chimes every hour
        - An irrigation system that waters while the soil's moisture percentage is
        below a preset amount.

    * While loops: actions are executed while a condition is met.
    The condition is evaluated at the beginning.
    * Do-while loops: actions are executed while a condition is met. Actions
    always happen at least once. The condition is evaluated at the end.
    * For loops: actions are executed a known number of times.
*/
package tema03;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Tema03_02 {
    public static void main(String[] args) {
        int a = 0;  // If a = 0, while and do-while apparently do the same,
                    // but if a = 5, while doesn't print anything, whereas do-while does
        
        // WHILE
        System.out.println("WHILE LOOP");
        while(a < 5) {
            System.out.println(a);
            a++;
        }
        
        // DO-WHILE
        System.out.println("\nDO-WHILE LOOP");
        a = 0;
        do {
            System.out.println(a);
            a++;
        } while(a < 5);
        
        // FOR
        System.out.println("\nFOR LOOP");
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
//        // We will use do-while loops often to create option menus
//        int option = 0;
//        Scanner input = new Scanner(System.in);
//        
//        do {
//            // Display the options
//            System.out.println("\n1. Park car");
//            System.out.println("2. Search car by license plate");
//            System.out.println("3. Pay");
//            System.out.println("4. Exit");
//            
//            // Ask the user for an option
//            System.out.print("Choose an option: ");            
//            option = input.nextInt();
//            
//            // Execute an action depending on the user's option
//            switch (option) {
//                case 1:
//                    System.out.println("\nPark");
//                    break;
//                case 2: 
//                    System.out.println("\nSearch");
//                    break;
//                case 3:
//                    System.out.println("\nPay");
//                    break;
//                case 4:
//                    System.out.println("\nExit");
//                    break;
//                default:
//                    System.out.println("\nEnter a valid option");
//            }
//            
//        } while(option != 4);   
//        // 4 is the value to exit the menu (the loop). 
//        // As long as another number is entered, we will stay in the loop
//        // (interacting with the program)
        
    }
}