
package tema05.herencia;

/**
 *
 * @author d3stroya
 */
public class Concesionario {
    public static void main(String[] args) {
        // Creamos un vehículo (superclase) por defecto        
        Vehiculo vehiculoPorDefecto = new Vehiculo();
        
        // Creamos un vehículo (superclase) con todos los atributos inicializados por parámetro
        Vehiculo vehiculoParametrizado = new Vehiculo("Renauls", "Clio", 120, true);
        
        // Creamos un coche (subclase) por defecto
        Coche cochePorDefecto = new Coche();
        
        // Creamos un coche (subclase) con todos los atributos inicializados por parámetro
        Coche cocheParametrizado = new Coche(5, "Volkswagen", "Polo", 130, true);
        
        // Usamos los métodos de vehículo en los coches
        cocheParametrizado.acelerar(0);
        cochePorDefecto.arrancarMotor();
        
        // Imprimos por pantalla todos los vehículos
        System.out.println("\nVEHÍCLOS");
        System.out.println(vehiculoPorDefecto);
        System.out.println("\n" + vehiculoParametrizado);
        
        System.out.println("\nCOCHES");
        System.out.println(cochePorDefecto);
        System.out.println("\n" + cocheParametrizado);
    }
}
