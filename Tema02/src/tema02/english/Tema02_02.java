/*
    TYPES OF OPERATORS
    Operators allow us to perform operations such as addition and subtraction, but also value assignment or relational operations between two values.

    - Arithmetic Operators
        Addition: +
        Subtraction: -
        Multiplication: *
        Division: /
        Module: % -> Gives us the remainder of a division. It is often used to determine if a number is even or odd.

    - Relational Operators
        Greater than: >
        Less than: <
        Equal to: == -> Be careful! To COMPARE two values, we use ==. A single = is used to ASSIGN a value.
        Not equal to: !=
        Greater than or equal to: >=
        Less than or equal to: <=

    - Logical Operators
        And: && -> True if both conditions are met
        Or: || -> True if either one or both conditions are met
        Not: ! -> If it's true, it becomes false, and vice versa
        Xor: ^ -> True if only one of the two conditions is met

    - Unary Operators
        Increment by one: ++
        Decrement by one: --

    - Assignment Operators
        Assignment: =
        Addition and assignment: += -> Equivalent to num1 = num1 + num2
        Subtraction and assignment: -= -> Equivalent to num1 = num1 - num2
        Multiplication and assignment: *= -> Equivalent to num1 = num1 * num2
        Division and assignment: /= -> Equivalent to num1 = num1 / num2
        Modulo and assignment: %= -> Equivalent to num1 = num1 % num2

    TYPE CONVERSION (CASTING)
    Sometimes, we will work with different data types that need to be combined. Remember that Java needs to allocate memory space for the data, 
    and depending on the data type, it will need more or less space.
        * Implicit type conversion: the destination variable is larger than the source (e.g., int <- short)
        * Explicit type conversion: the destination variable is smaller, and we must explicitly specify the type change byte <- (byte)int
*/


package tema02.english;

import tema02.*;

/**
 *
 * @author d3stroya
 */


public class Tema02_02 {
    public static void main(String[] args) {
        
        // OPERADORATORS
        int num1 = 3;
        int num2 = 4;
        int num3 = 3;
                
        // Arithmetics
        System.out.println("\nOPERADORES ARITMÉTICOS");
        System.out.println("Addition: " + num1 + num2);
        System.out.println("Substraction: " + (num1 - num2));
        System.out.println("Multiplication: " + num1 * num2);
        System.out.println("Division: " + num1 / num2);
        System.out.println("Module: " + num1 % num2);
        
        // Relacionals
        System.out.println("\nOPERADORES RELACIONALES");
        System.out.print("¿Are they equals? ");
        System.out.println(num1 == num2);
        
        System.out.print("¿Are the different? ");
        System.out.println(num1 != num2);
        
        System.out.println("¿num1 is greater than num2? ");        
        System.out.println(num1 > num2);
        
        System.out.println("¿num1 is less than or equals to num2? ");
        System.out.println(num1 <= num2);
        
        // Logical
        System.out.println("\nOPERADORES LÓGICOS");
        System.out.println("¿num1 is greater than num2 and num2 is greater than num3?");
        System.out.println(num1 > num2 && num2 > num3);
        
        // Unary
        System.out.println("\nOPERADORES UNITARIOS");
        num1++;
        System.out.println("num1 incremented by 1: " + num1);
        num1--;
        System.out.println("num1 decremented by 1: " + num1);
        
        // Assignment
        System.out.println("\nOPERADORES DE ASIGNACIÓN");        
        num3 += num1;
        System.out.println("num3 += num1: " + num3);        
        
        num3 -= num1;
        System.out.println("num3 -= num1: " + num3);
        
        num3 *= num1;
        System.out.println("num3 *= num1: " + num3);
        
        num3 /= num1;
        System.out.println("num3 /= num1: " + num3);        
        
        num3 %= num1;
        System.out.println("num3 %= num1: " + num3);

        // TYPE CONVERSION
        
        // Implicit type conversion: a short (16 bits) fits in an int (32 bits)
        short dato1 = 88;
        int dato2;
        
        dato2 = dato1;
        System.out.println(dato2);
        
        // Explicit type conversion: a int (32 bits) doesn't fit in a byte (8 bits)
        int dato3 = 88;
        byte dato4;
        
        //dato4 = dato3;  // Compilation error: "Incompatible types"
        dato4 = (byte)dato3;    // SOLUTION: We convert the int into a byte
        System.out.println(dato4);
    }
}
