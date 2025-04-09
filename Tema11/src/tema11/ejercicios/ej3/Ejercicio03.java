
package tema11.ejercicios.ej3;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio03 {
    public static Autobus[] estacion = new Autobus[6];
    
    public static int pedirPosicion() {
        Scanner entrada = new Scanner(System.in);
        int posicion = -1;
        
        do {
            try {
                System.out.println("¿En qué posición quieres aparcar?");
                posicion = entrada.nextInt();                
            } catch(InputMismatchException e) {
                System.out.println("Introduce un número del 1 al 6");
                System.out.println(e.getMessage());
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("No existe esa posición");
                System.out.println(e.getMessage());
            }
        } while(posicion < 1 || posicion > 6);
        
        return posicion - 1;
    }   
    
    public static String pedirMatricula() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Matrícula: ");
        return entrada.nextLine();
    }
    
    
    
    /**
     * Método que crea un autobús por defecto,
     * le pide la matrícula al usuario y la settea.
     * Luego, rellena el mapa de conductores.
     * 
     * @return el autobús con los valores indicados por el usuario
     */
    public static Autobus crearAutobus() {
        System.out.println("\n-> Creando autobús...");
        Scanner entrada = new Scanner(System.in);
        
        Autobus autobus = new Autobus();
        autobus.setMatricula(pedirMatricula());
        autobus.agregarConductores();
        
        return autobus;
    }
    
    public static void aparcar() {
        System.out.println("\n-> Aparcando autobús...");
        Autobus autobus = crearAutobus();
        boolean enc = false;
        
        do {
            int posicion = pedirPosicion();

            if(estacion[posicion] == null) {
                estacion[posicion] = autobus; 
                enc = true;
                System.out.println("Autobús aparcado en dársena [" + (posicion + 1) + "]");
            } else {
                System.out.println("Dársena ocupada, elige otra.");
            }
            
        } while(!enc);
    }
    
    public static void mostrarDarsenasLibres() {
        System.out.println("\n-> Mostrando dársenas libres...");
        for(int i = 0; i < estacion.length; i++) {
            if(estacion[i] == null) {
                System.out.print("[" + (i + 1) + "]");
            }
        }
        System.out.println("");
    }
    
    /**
     * Método que busca un autobús en el vector
     * por su matrícula y muestra toda su información.
     * 
     * @return el autobús encontrado o null si no lo encuentra.
     */
    public static Autobus buscarAutobusPorMatricula() {
        System.out.println("\n-> Buscando autobús...");
        Autobus autobus = null;
        int i = 0;
        boolean enc = false;
        String matricula = pedirMatricula();
        
        while(i < estacion.length && !enc) {
            if(estacion[i] != null && estacion[i].getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println(estacion[i]);
                enc = true;
                autobus = estacion[i];
            } else {
                i++;                
            }
        }
        
        if(!enc) {
            System.out.println("Ese autobús no está aquí");
        }
        return autobus;
    }
    
    public static void buscarConductorYMostrarSuMatricula() {
        System.out.println("\n-> Buscando conductor/a...");
        int i = 0;
        boolean enc = false;
        
        while(i < estacion.length && !enc) {
            if(estacion[i] != null) {
                estacion[i].buscarConductor();                
            }            
            i++;                            
        }
        
        if(!enc) {
            System.out.println("Ese conductor no trabaja aquí");
        } else {
            System.out.println("Tu autobús tiene la matrícula " + estacion[i].getMatricula());
        }
    }
    
    /**
     * Método que cuenta el número de conductos que tiene cada autobús
     * y lo guarda en un vector, en la misma posición en la que está aparcado
     * el autobús. Si no hay autobús en esa posición, no se cuenta.
     * @return 
     */
    public static int[] contarConductoresPorBus() {
        int[] vNumConductores = new int[6];
        
        for(int i = 0; i < estacion.length; i++) {
            if(estacion[i] != null) {
                vNumConductores[i] = estacion[i].getmConductores().size(); 
            }
        }
        
        return vNumConductores;
    }
    
    public static void mostrarPosicionBusConMasConductores(int[] vNumConductores) {
        int mayor = -1, posicion = -1;
        
        for(int i = 0; i < vNumConductores.length; i++) {
            if(vNumConductores[i] > mayor) {
                mayor = vNumConductores[i]; 
                posicion = i;
            }
        }
        
        System.out.println("[" + (posicion + 1) + "]");
    }

    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;     
        
        do {
            System.out.println("- MENÚ -");
            System.out.println("1. Aparcar autobús");
            System.out.println("2. Mostrar dársenas libres");
            System.out.println("3. Buscar bus por matrícula");
            System.out.println("4. Buscar conductor por DNI y mostrar su matrícula");           
            System.out.println("5. Mostrar posición del bus con más coductores");
            System.out.println("6. Salir");

            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1 -> aparcar();
                case 2 -> mostrarDarsenasLibres();
                case 3 -> buscarAutobusPorMatricula();
                case 4 -> buscarConductorYMostrarSuMatricula();
                case 5 -> mostrarPosicionBusConMasConductores(contarConductoresPorBus());
                case 6 -> System.out.println("Cerrando programa...");
                default -> System.out.println("Elige una opción válida");
            }
        } while(opcion != 6);
    }

}
