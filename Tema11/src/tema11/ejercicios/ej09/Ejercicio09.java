
package tema11.ejercicios.ej09;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author d3stroya
 */
public class Ejercicio09 {
    public static TreeMap<LocalDate, Sorteo> sorteos = new TreeMap<>();
    
    /**
     * Método que crea un nuevo sorteo por defecto,
     * con la fecha del día actual y
     * 4 números aleatorios entre 1 y 100.
     * Inserta el sorteo en el mapa.
     */
    public static void realizarSorteo() {
        LocalDate hoy = LocalDate.now();
        
        if(sorteos.containsKey(hoy)) {
            System.out.println("Ya se ha realizado el sorteo de hoy.");
        } else {
            Sorteo sorteo = new Sorteo();
            sorteos.put(sorteo.getFecha(), sorteo);            
        }
    } 
    
    public static void repetirSorteo() {
        LocalDate hoy = LocalDate.now();
        
        if(sorteos.containsKey(hoy)) {
            Sorteo sorteo = new Sorteo();
            sorteos.put(sorteo.getFecha(), sorteo);            
        } else {
            System.out.println("Aún no se ha realizado el sorteo de hoy.");
        }
    }
    
    /**
     * Método que muestra los sorteos del mes actual
     */
    public static void mostrarSorteosMesActual() {
        LocalDate hoy = LocalDate.now();
        int mes = hoy.getMonthValue();
        
        Iterator<LocalDate> it = sorteos.keySet().iterator();
        while(it.hasNext()) {
            LocalDate clave = it.next();
            if(clave.getMonthValue() == mes) {
                System.out.println(sorteos.get(clave));
            }
        }
    }
    
    /**
     * Método que pide los datos de la fecha,
     * crea una fecha y la devuelve.
     * @return la fecha creada.
     */
    public static LocalDate pedirFecha() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Día: ");
        int dia = entrada.nextInt();
        
        System.out.print("Mes: ");
        int mes = entrada.nextInt();
        
        System.out.print("Año: ");
        int anio = entrada.nextInt();
        
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        
        return fecha;
    }
    
    /**
     * Método que muestra el sorteo
     * realizado en la fecha indicada
     * por el usuario, que se pasa por
     * parámetro.
     * 
     * @param fecha 
     */
    public static void mostrarSorteosPorFecha(LocalDate fecha) {
        if(sorteos.containsKey(fecha)) {
            System.out.println(sorteos.get(fecha));
        } else {
            System.out.println("No hay ningún sorteo con esa fecha");
        }
    }
    
    /**
     * Método que pide una fecha por parámetro,
     * comprueba si existe un sorteo en esa fehca
     * y, si no existe, realiza un nuevo sorteo
     * con la fecha indicada por el usuario
     * y lo añade al mapa.
     * 
     * @param fecha 
     */
    public static void realizarSorteoPorFehca(LocalDate fecha) {
        if(sorteos.containsKey(fecha)) {
            System.out.println("Ya hay un sorteo ese día");
        } else {
            sorteos.put(fecha, new Sorteo(fecha));
        }
    }
    
    /**
     * Método que muestra todos los sorteos del mapa
     */
    public static void mostrarSorteos() {
        for(LocalDate f : sorteos.keySet()) {
            System.out.println(sorteos.get(f));
        }
    }
    
    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        System.out.println(LocalDate.now());
        
        do {
            System.out.println("- MENÚ -");
            System.out.println("1. Realizar sorteo (hoy)");
            System.out.println("2. Repetir sorteo (hoy)");
            System.out.println("3. Mostrar sorteos del mes");
            System.out.println("4. Mostrar sorteos por fecha");
            System.out.println("5. Realizar sorteo por fecha");
            System.out.println("6. Mostrar todos los sorteos");
            System.out.println("7. Salir");

            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> realizarSorteo();
                case 2 -> repetirSorteo();
                case 3 -> mostrarSorteosMesActual();
                case 4 -> mostrarSorteosPorFecha(pedirFecha());
                case 5 -> realizarSorteoPorFehca(pedirFecha());
                case 6 -> mostrarSorteos();
                case 7 -> System.out.println("Cerrando programa...");
            }
        } while(opcion != 7);
    }

}
