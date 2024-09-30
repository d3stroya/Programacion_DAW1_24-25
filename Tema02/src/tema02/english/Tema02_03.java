/*
    PACKAGES AND IMPORT STATEMENT
    In Java, everything is a class.
    These classes can be grouped together to form packages.
    Packages are sets of interrelated classes.

    An example is the package java.lang, which contains the class
    System, that you have already used to print messages to the screen
    ( System.out.println(); ).

    The package java.lang is imported automatically, but others are not,
    so we must import them manually using the import statement:
        * We can import the whole package: import java.util.*
        * Or just a single class: import java.util.ArrayList.

    This allows us to use all the classes from the package or only the class we import.
    The IDE helps us by giving suggestions to import the packages we need
    and by auto-completing the code.

    DATA INPUT
    We can read data inputted by the user from the keyboard
    using the Scanner class, which belongs to the java.util package,
    and its methods (nextInt(), nextByte(), nextChar(), nextLine(), etc.).
    
    Look at the code for the steps you need to follow (they are always the same).
*/
package tema02.english;

import tema02.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.*;

/**
 *
 * @author d3stroya
 */
public class Tema02_03 {
    public final static float PI = 3.14159f;
    
    public static void main(String[] args) {
        // PACKAGES AND IMPORT STATEMENT
        
        // I can use the ArrayList class because I have imported it
        ArrayList<Integer> numbers = new ArrayList();   
        
        // I cannot use the List class because I haven't imported it
        // I can use the List class if I import the entire java.util package (java.util.*)
        List<Integer> numberList = new ArrayList();   
        
        
        
        
        // DATA INPUT
        
        // 1. We create the scanner to read the data
        Scanner input = new Scanner(System.in);
        
        // 2. We print information to the screen so that the user knows what to do
        System.out.println("What is the diameter of the circumference?: ");
        
        // 3. We read the information entered by the user from the keyboard
        float diameter = input.nextFloat();
        
        // 4. We print the result
        System.out.println("The circumference length with diameter " 
                + diameter + " is: " + diameter * PI);
    }
}