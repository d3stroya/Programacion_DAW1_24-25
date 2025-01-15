
package tema06.ejercicios.ejercicio10;


/**
 * Clase Test
 * 
 * @author d3stroya
 */
public class Test {

    /**
     * Método main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico lavadora = new Electrodomestico(0.5f,0.24f, "A++"); 
        Electrodomestico frigorifico = new Electrodomestico(0.2f,0.24f,  "A+");
        Electrodomestico horno = new Electrodomestico(1.2f,0.24f,  "B");   

        System.out.println(lavadora);
        System.out.println("Consumo: " + lavadora.calcularConsumo(5));
        System.out.println("Precio: " + lavadora.calcularFactura(5) + "€");
        
        System.out.println(frigorifico);
        System.out.println("Consumo: " + lavadora.calcularConsumo(720));
        System.out.println("Precio: " + lavadora.calcularFactura(720) + "€");
        
        System.out.println(horno);
        System.out.println("Consumo: " + lavadora.calcularConsumo(2));
        System.out.println("Precio: " + lavadora.calcularFactura(2) + "€");
    }
}
