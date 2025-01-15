package tema06.ejercicios.ejercicio08;


/**
 * Clase Test
 * 
 * @author Daniel
 */
public class Test {
    
    public static void procesarVehiculo(Vehiculo vehiculo) {      
        vehiculo.mostrarMovimiento();
        
        if(vehiculo instanceof Coche) {
            Coche coche = (Coche) vehiculo;
            coche.encenderAire();
            coche.mostrarMovimiento();
        } else if(vehiculo instanceof Moto) {
            Moto moto = (Moto) vehiculo;
            moto.hacerCaballito();
            moto.mostrarMovimiento();
        }
    }
    
    public static void main(String[] args) {
        Vehiculo vehiculoCoche = new Coche(80);
        Vehiculo vehiculoMoto = new Moto(50);
        
        procesarVehiculo(vehiculoCoche);
        System.out.println();
        procesarVehiculo(vehiculoMoto);    
    }

}
