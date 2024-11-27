
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio26_27 {
    public static void main(String[] args) {
        Almacen restaurante1 = new Almacen(2, 0.5);
        System.out.println("Pueden comer: " + restaurante1.getComensales() + " comensales");        
        
        System.out.println("\nAñadimos 1kg de chocos y 1kg de papas");
        restaurante1.addChocos(1);
        restaurante1.addPapas(1);        
        System.out.println("Pueden comer: " + restaurante1.getComensales() + " comensales");
        
        System.out.println("\nMateria en el almacén:");
        restaurante1.showChocos();
        restaurante1.showPapas();
    }
}
