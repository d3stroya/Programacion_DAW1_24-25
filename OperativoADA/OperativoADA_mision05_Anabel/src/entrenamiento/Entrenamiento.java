package entrenamiento;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Entrenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("EJERCICIO 1");
        
         // Perímetro de la ZE1 (arriba izquierda)
        float ze1Base = 20f;
        float ze1Alto = 63f;
        float ze1Perimetro = 2 * ze1Base + 2 * ze1Alto;

        // Perímetro de la ZE2 (arriba derecha) -> ESTÁ MAL SEGÚN EL ENUNCIADO FINAL (ESTA ZE TIENE MÁS DE CUATRO LADOS)
        float ze2Base1 = 10.3f;
        float ze2Base2 = 32.7f;
        float ze2AlturaIzq = 63.2f;
        float ze2AlturaDer = 51.83f;
        float ze2Perimetro = ze2Base1 + ze2Base2 + ze2AlturaIzq + ze2AlturaDer;

        // Perimetro de la ZE3 (izquierda de la plaza)
        float ze3Lado = 17.71f;
        float ze3Perimetro = 4 * ze3Lado;

        // Perimetro de la ZE4 (abajo derecha)
        float ze4Base = 12.8f;
        float ze4LadoIzq = 25.29f;
        float ze4LadoDer = 20.5f;
        float ze4Top = 15f;
        float ze4Perimetro = ze4Base + ze4LadoIzq + ze4LadoDer + ze4Top;
        
        // Imprimimos los resultados por pantalla
        System.out.println("ZE1 - rectangulo: " + ze1Base + " x " + ze1Alto + " → Perímetro: " + ze1Perimetro);
        System.out.println("ZE2 - irregular: " + ze2Base1 + " x " + ze2Base2 + " x " + ze2AlturaIzq + " x " + ze2AlturaDer + " → Perímetro: " + ze2Perimetro);
        System.out.println("ZE3 - cuadrado: " + ze3Lado + " → Perímetro: " + ze3Perimetro);
        System.out.println("ZE4 - irregular: " + ze4Base + " x " + ze4LadoIzq + " x " + ze4LadoDer + " x " + ze4Top + " → Perímetro: " + ze4Perimetro);      
        
        System.out.println("\nEJERCICIO 2");
        
        // Guardamos las velocidades en variables
        // También podrían ser constantes
        float velocidadAndando = 5.0f;
        float velocidadCorriendo = 10.0f;
        float velocidadCoche = 50.0f;
        
        // Guardamos las distancias en variables
        // (horizontal1, 2 y 3 no se utilizan para calcular las distancias)
        float horizontal1 = 3.4f;
        float horizontal2 = 1.8f;
        float horizontal3 = 4.0f;
        float horizontal4a = 1.3f;
        float horizontal4b = 0.8f;
        float horizontal4c = 1.3f;
        
        float vertical1 = 5.23f;
        float vertical2 = 2.6f;
        float vertical3 = 2.9f;
        
        // Calculamos la distancia total y las velocidades, y lo imprimimos por pantalla
        float distanciaComisariaPalacio = vertical2 + horizontal4a + vertical1;
        float tiempoAndandoComisariaPalacio = distanciaComisariaPalacio / velocidadAndando;
        float tiempoCorriendoComisariaPalacio = distanciaComisariaPalacio / velocidadCorriendo;
        float tiempoCocheComisariaPalacio = distanciaComisariaPalacio / velocidadCoche;
        
        System.out.println("El tiempo que se tarda en ir: ");
        System.out.println("· De la Comisaría al Palacio de Congresos es:");
        System.out.println("    - Andando: " + tiempoAndandoComisariaPalacio + " horas.");
        System.out.println("    - Corriendo: " + tiempoCorriendoComisariaPalacio + " horas.");
        System.out.println("    - En coche: " + tiempoCocheComisariaPalacio + " horas.");
        
        float distanciaComisariaZE2 = vertical2 + horizontal4a;
        float tiempoAndandoComisariaZE2 = distanciaComisariaZE2 / velocidadAndando;
        float tiempoCorriendoComisariaZE2 = distanciaComisariaZE2 / velocidadCorriendo;
        float tiempoCocheComisariaZE2 = distanciaComisariaZE2 / velocidadCoche;
        
        System.out.println("· De la Comisaría a la ZE2 es:");
        System.out.println("    - Andando: " + tiempoAndandoComisariaZE2 + " horas.");
        System.out.println("    - Corriendo: " + tiempoCorriendoComisariaZE2 + " horas.");
        System.out.println("    - En coche: " + tiempoCocheComisariaZE2 + " horas.");
        
        float distanciaComisariaZE4 = vertical3 + horizontal4c;
        float tiempoAndandoComisariaZE4 = distanciaComisariaZE4 / velocidadAndando;
        float tiempoCorriendoComisariaZE4 = distanciaComisariaZE4 / velocidadCorriendo;
        float tiempoCocheComisariaZE4 = distanciaComisariaZE4 / velocidadCoche;
        
        System.out.println("· De la Comisaría a la ZE4:");
        System.out.println("    - Andando: " + tiempoAndandoComisariaZE4 + " horas.");
        System.out.println("    - Corriendo: " + tiempoCorriendoComisariaZE4 + " horas.");
        System.out.println("    - En coche: " + tiempoCocheComisariaZE4 + " horas.");
        
        float distanciaPlazaPalacio = horizontal4b + horizontal4a + vertical1;
        float tiempoAndandoPlazaPalacio = distanciaPlazaPalacio / velocidadAndando;
        float tiempoCorriendoPlazaPalacio = distanciaPlazaPalacio / velocidadCorriendo;
        float tiempoCochePlazaPalacio = distanciaPlazaPalacio / velocidadCoche;
        
        System.out.println("· De la Plaza al Palacio de Congresos:");
        System.out.println("    - Andando: " + tiempoAndandoPlazaPalacio + " horas.");
        System.out.println("    - Corriendo: " + tiempoCorriendoPlazaPalacio + " horas.");
        System.out.println("    - En coche: " + tiempoCochePlazaPalacio + " horas.");     
        
        System.out.println("EJERCICIO 3");
        
        System.out.print("Introduce la distancia que quieres recorrer (con decimales expresados con coma):");
        Scanner entrada = new Scanner(System.in);
        double distancia;
        distancia = entrada.nextDouble();
        double tiempoAndando = distancia / velocidadAndando;
        double tiempoCorriendo = distancia / velocidadCorriendo;
        double tiempoCoche = distancia / velocidadCoche;
        
        System.out.println("El tiempo que se tarda en recorrer " + distancia + "km es:");
        System.out.println(tiempoAndando + " horas si vas andando.");
        System.out.println(tiempoCorriendo + " horas si vas corriendo.");
        System.out.println(tiempoCoche + " horas si vas en coche.");
    }
    
}
