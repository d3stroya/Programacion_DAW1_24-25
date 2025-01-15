package tema06.ejercicios.ejercicio09;


/**
 * Clase Test
 * 
 * @author d3stroya
 */
public class Test {

    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("11111111A", 25000);
        System.out.println(persona.calcularImpuesto());
        
        Vehiculo vehiculo = new Vehiculo(20000, "0000AAA", "11223344B");
        System.out.println(vehiculo.calcularImpuesto());
    }

}
