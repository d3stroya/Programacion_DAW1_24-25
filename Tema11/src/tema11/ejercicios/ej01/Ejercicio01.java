
package tema11.ejercicios.ej01;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio01 {
    public final static int DIAS_MES = 31;
/**
     * Método que calcula una temperatura aleatoria entre -10 y 20 grados.
     *
     * @return
     */
    public static int generarTemperaturaAleatoria() {
        return (int) Math.floor(Math.random() * 31 - 10);
    }

    /**
     * Método que rellena el mapa con una clave 1-31 y un valor Dia con el
     * nombre del día de la semana y una temperatura que se genera
     * aleatoriamente. El primer día de la semana se calcula aleatoriamente, ya
     * que no tiene por qué ser el lunes.
     *
     * @param mapa
     */
    public static void rellenarTemperaturas(HashMap<Integer, Dia> mapa) {
        if(mapa.isEmpty()) {
            System.out.println("\nRellenando mapa de temperaturas...");
            String[] nombreDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
            int indicePrimerDia = (int) Math.floor(Math.random() * 7);

            for (int i = 1; i <= DIAS_MES; i++) {
                mapa.put(i, new Dia(nombreDias[indicePrimerDia % 7], generarTemperaturaAleatoria()));
                indicePrimerDia++;
            }            
        } else {
            System.out.println("El mapa ya está relleno.");
        }
    }

    /**
     * Método que recorre el mapa y muestra cada día con su nombre, número y
     * temperatura.
     *
     * @param mapa
     */
    public static void mostrarTemperaturas(HashMap<Integer, Dia> mapa) {
        System.out.println("\nMostrando temperaturas...");
        Integer clave = 0;
        Dia dia;
        Iterator<Integer> iterador = mapa.keySet().iterator();
        
        while (iterador.hasNext()) {
            clave = iterador.next();
            dia = mapa.get(clave);
            System.out.println(dia.getNombre() + " día " + clave + ": " + dia.getTemperatura() + " grados.");
        }
    }

    /**
     * Método que calcula la temperatura media de los días que contiene el mapa
     *
     * @param mapa
     * @return la temperatura media
     */
    public static float calcularTemperaturaMedia(HashMap<Integer, Dia> mapa) {
        float media = 0;
        Iterator<Integer> iterador = mapa.keySet().iterator();
        Integer clave;
        Dia dia;

        while (iterador.hasNext()) {
            clave = iterador.next();
            dia = mapa.get(clave);
            media += dia.getTemperatura();
        }
        
        return media / mapa.size();
    }
    
    /**
     * Método que calcula de manera funcional
     * la temperatura media del mes.
     * 
     * Convierte el mapa a flujo de datos,
     * mapea todos los valores de temperatura a double,
     * calcula media y, si no, devuelve un 0.
     * 
     * @param mapa
     * @return la temperatura media
     */
    public static double calcularTemperaturaMediaFuncional(HashMap<Integer, Dia> mapa) {
        return mapa.values().stream().mapToDouble(Dia::getTemperatura).average().orElse(0);
    }

    /**
     * Método que recorre el mapa en busca del día con la temperatura más alta y
     * lo muestra por pantalla. Después lo vuelve a recorres para encontrar, si
     * los hay, días con la misma temperatura, y los muestra por pantalla.
     *
     * @param mapa
     */
    public static void buscarDiasMasCalurosos(HashMap<Integer, Dia> mapa) {
        System.out.println("\nMostrando día(s) más caluroso(s)...");

        Iterator<Integer> iterador = mapa.keySet().iterator();
        Integer clave = 1;

        Dia diaMasCaluroso = (Dia) mapa.get(clave);
        Dia diaActual = new Dia();

        int numeroDia = 0;

        while (iterador.hasNext()) {
            clave = iterador.next();
            diaActual = mapa.get(clave);

            if (diaActual.getTemperatura() > diaMasCaluroso.getTemperatura()) {
                diaMasCaluroso = diaActual;
                numeroDia = clave;
            }

        }
        System.out.println("El " + diaMasCaluroso.getNombre() + " día "
                + numeroDia + " con " + diaMasCaluroso.getTemperatura() + " grados.");

        while (iterador.hasNext()) {
            clave = iterador.next();
            diaActual = mapa.get(clave);

            if (clave != numeroDia && diaActual.getTemperatura() == diaMasCaluroso.getTemperatura()) {
                System.out.println("El " + diaActual.getNombre() + " día "
                        + clave + " con " + diaActual.getTemperatura() + " grados.");
            }
        }
    }

    public static void lanzarEjercicio1() {
        HashMap mapa = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("\nElige una opción:");
                System.out.println("[1] Rellenar temperaturas");
                System.out.println("[2] Mostrar temperaturas");
                System.out.println("[3] Visualizar temperatura media del mes");
                System.out.println("[4] Mostrar días más calursosos");
                System.out.println("[5] Salir");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 ->
                        rellenarTemperaturas(mapa);
                    case 2 ->
                        mostrarTemperaturas(mapa);
                    case 3 -> {
                        System.out.println("Temperatura media del mes: " + calcularTemperaturaMedia(mapa) + " grados.");
                        System.out.println("Temperatura media del mes: " + calcularTemperaturaMediaFuncional(mapa) + " grados.");
                        }
                    case 4 ->
                        buscarDiasMasCalurosos(mapa);
                    case 5 ->
                        System.out.println("Cerrando programa...");
                    default ->
                        System.out.println("Elige una opción válida");
                }
            } catch (InputMismatchException e) {
                e.getMessage();
            }
        } while (opcion != 5);

    }
    
    public static void main(String[] args) {
        lanzarEjercicio1();
    }
}
