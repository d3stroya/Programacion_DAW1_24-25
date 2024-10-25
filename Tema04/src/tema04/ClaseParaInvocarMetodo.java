
package tema04;

// Importo el paquete calculadora y su clase Calculadora
import calculadora.Calculadora;

// También puedo importar el paquete completo
//import calculadora.*;

/**
 *
 * @author d3stroya
 */
public class ClaseParaInvocarMetodo {
    public static void main(String[] args) {
        
        // Invoco el método muestraEdadyAltura de la clase Tema04
        Tema04.muestraEdadyAltura((byte)55, 1.75f);
        
        // Intento invocar el método meustraEdad, pero da error de compilación
        // porque el método muestraEdad es privado (private)
//         Tema04.muestraEdad((byte)55);   

        // Invoco el método suma de la clase Calculadora
        Calculadora.suma(3, 7);
        Calculadora.suma(4, 7);
        Calculadora.suma(5, 7);
        Calculadora.suma(7, 7);
        Calculadora.suma(9, 7);
    }
}
