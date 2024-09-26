/* 
    STRUCTURE OF JAVA PROGRAM - /ESTRUCTURA DE UN PROGRAMA EN JAVA/
        In Java we work with Classes. Each file .java is a Class.
        public class Tema02_01 is our class now.

        Classes have 2 elements:
            - Attributes (properties, as the car COLOR) - /Atributos/
            - Methods (behaviors, as START the car) - /Métodos/

        There is a special method called main:
            public static void main(String[] args) {

            }
        This method is the entry gate to our Java aplications,
        because it executes the orders we write.

        The Class than contains the main method is the Main Class,
        and we usually call it Main.

        Classes are enclosed between keys { } .
        Everything inside those keys belong to the Class.

        Methods are also enclosed between keys { }.
        Everything inside those keys belong to the method.


        SIMPLE DATA TYPE - /TIPOS DE DATOS SIMPLES/  
        Programming, we will be using different types of data
        (whole numers, decimals, characters, booleans...).

        In Java we have to indicate the data type when we declare a variable.
        ¿Why? Because the program needs to reserve memory space for our variable.
        Each data type needs more or less space.
        
            - Whole numers - /Números enteros/:
                · byte: 8 bits
                · short: 16 bits
                · int: 32 bits
                · long: 64 bits

            - Decimals numbers - /Números decimales/
                · float: 32 bits
                · double: 64 bits (greater precision)

            - Characters - /Caracteres/
                · char: characters in ASCII code
                (¡WARNING! Right now, we don't know how to save words in variables).

            - Booleans - /Booleanos/
                · boolean: true/false


        VARIABLES AND CONSTANTS - /VARIABLES Y CONSTANTES/
        They are boxes in which we save values.
        These boxes have a name.
        If we print the variable, the program will show it value.

        VARIABLES can change their value during program execution
        (for example, the current temperature of the room, which the sensor is constantly reading, so the value of the variable can change).

        CONSTANTS don't change their value during program execution
        (for example, the limit temperature we set for the heating to activate).
      
        When declaring a variable, we have to indicate the data type:
        int age; char letter; boolean found;...

        We can DECLARE a variable:
        int age;

        ...INITIALIZE the variable:
        age = 23;

        ...or both at the same time:
        int age = 23;

        We also can declare more than 1 variable at the same time in the same line:        
        int age, temperature;

        ...or declare and initialize more than 1 variable at the same time in the same line:
        boolean found = false, passValid = true;

        SCOPE
        Variables can be local (inside a method) or global (belongs to the Class).

*/


package tema02.english;

import tema02.*;

/**
 *
 * @author d3stroya
 */

// 1. CLASS
public class Tema02_01 {
    // 2. ATTRIBUTS
    public static int unitNumber = 2;  // Declared and initialized variable. Global scope
    public static float temperature;   // Initialized variable. Global scope
    final static int LIMIT_TEMPERATURE = 21;   // Declared and initialized constant. Global scope
    
    
    // 3. METHODS
    // 3.1. Method whitout parameters
    public static void readTemperature() {
        // Sentence that print a message by screen, in the console (Output window)
        System.out.println("Este método lee constantemente la temperatura captada por el sensor");
        
        // We inicialize the variable temperature
        temperature = 22;  
    }
    
    // 3.2. Method whit parameters
    public static void activateHeating(int temperature) {
        // Local scope variable (not accesible from outside of this method. See the error in the main method).
        boolean heatingActivated = false;
        System.out.println("Cuando la temperatura pasada por parámetro sea "
                + "inferior a TEMPERATURA_LIMITE, activaremos la calefacción");
        System.out.println("El estado de la calefacción es " + heatingActivated);
    }

    // 3.3. main method
    public static void main(String[] args) {
        // Declared and initialized variable. Local scope (not accesible from outside of main method)
        int max_temperature = 24;
        
        // Call to class methods
        readTemperature();
        activateHeating(unitNumber);
        
        // Sentences that print messages by screen
        System.out.println("Este es nuestro programa para termostato");
        System.out.println("\nLa temperatura actual es " + temperature);
        System.out.println("\nLa temperatura límite es " + LIMIT_TEMPERATURE);
        System.out.println("\nLa temperatura máxima es " + max_temperature);
        //System.out.println("El estado de la calefacción es " + heatingActivated);  // Error because variable heatingActivated is local scope.
    }

}
