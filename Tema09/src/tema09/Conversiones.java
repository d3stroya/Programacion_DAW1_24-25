
package tema09;

/**
 * CLASES ENVOLTORIO: Nos permiten "envolver" un tipo de dato simple en un objeto.
 * Por ejemplo, un int en un Integer, que contiene un atributo con el valor.
 * 
 * int -> Integer
 * long -> Long
 * float -> Float
 * double -> Double
 * char -> Character
 * boolean -> Boolean
 * 
 * @author d3stroya
 */
public class Conversiones {
    public static void main(String[] args) {
        int edad = 5;
        
        
        // AUTOBOXING: envolver un dato simple en una clase envoltorio
        Integer edad2 = edad;
        Integer edad02 = new Integer(edad); // Obsoleto
        
        // AUTOUNBOXING: recuperar un dato simple a partir de una clase envoltorio
        int edad3 = edad2;   
        int edad03 = edad2.intValue();  // Innecesario
        
        // CONVERSIONES entre distintos tipos de dato
        String dni = "123456";
        
        // Convertir String a int
        int numDni = Integer.parseInt(dni);         
        
        // Convertir int a String (2 formas de hacer lo mismo)
        String strDni = Integer.toString(numDni);
        strDni = String.valueOf(numDni);
        
        System.out.println(strDni);
        
    }
}
