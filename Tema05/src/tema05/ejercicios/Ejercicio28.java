
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio28 {
    public static float pedirKms() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Kms: ");
        return entrada.nextFloat();
    }
    public static float pedirLitros() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Litros: ");
        return entrada.nextFloat();
    }
    public static float pedirVelMedia() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Velocidad Media: ");
        return entrada.nextFloat();
    }
    public static float pedirPrecioGasolina() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Precio combustible: ");
        return entrada.nextFloat();
    }
    
    public static void main(String[] args) {
        System.out.println("CREANDO VIAJE...");
        Consumo consumo = new Consumo(pedirKms(), pedirLitros(), pedirVelMedia(), pedirPrecioGasolina());
        System.out.println("\nPROCESANDO DATOS DEL VIAJE...");
        
        System.out.println("\n- DATOS DEL VIAJE -");
        System.out.println("Tiempo: " + consumo.getTiempo() + " h");
        System.out.println("Consumo medio: " + consumo.consumoMedio() + " l/100");
        System.out.println("Consumo en €: " + consumo.consumoEuros() + " €/100");
    }
}
