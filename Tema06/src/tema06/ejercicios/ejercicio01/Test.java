
package tema06.ejercicios.ejercicio01;

/**
 *
 * @author d3stroya
 */
public class Test {
    public static void main(String[] args) {
        // OBJETOS DE CADA CLASE
        Suma suma = new Suma(2, 3);
        suma.realizarOperacion();
        
        Multiplicacion multiplicacion = new Multiplicacion(2, 3);
        multiplicacion.realizarOperacion();
        
        Potencia potencia = new Potencia(2, 3);
        potencia.realizarOperacion();
        
        System.out.println("");
        
        // POLIMORFISMO
        Calculadora calculadora;    // No puedo instanciar un objeto de tipo Calculadora porque es una clase abstracta
        
        calculadora = new Suma(2, 3);
        calculadora.realizarOperacion();
        
        calculadora = new Multiplicacion(2, 3);
        calculadora.realizarOperacion();
        
        calculadora = new Potencia(2, 3);
        calculadora.realizarOperacion();
    }
}
