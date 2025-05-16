package tema12.ejercicios.eSport;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Main {
    // Pedir datos usuarios
    public static String pedirString(String pregunta) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(" -> " + pregunta + ": ");
        return entrada.nextLine();
    }
    
    public static int pedirInt(String pregunta) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(" -> " + pregunta + ": ");
        return entrada.nextInt();
    }
    
    /**
     * Método que añade partidas al ArrayList
     * hasta que el usuario quiera.
     * @param partidas 
     */
    public static void agregarPartidas(ArrayList<Partida> partidas) {
        do {
           partidas.add(
                   new Partida(
                           pedirString("Equipo"), 
                           pedirString("Juego"),
                           pedirInt("Victorias"),
                           pedirInt("Derrotas"),
                           pedirInt("Duración")
                   )
           ); 
        } while(pedirString("¿Quieres añadir otra partida? (s/n)").equalsIgnoreCase("s"));
    }
    
    
    
    
    ////////////////// Escribir fichero //////////////////
    
    /**
     * Método que escribe el fichero
     * @param partidas
     * @param fichero 
     */
    public static void escribirFichero(ArrayList<Partida> partidas, File fichero) {
        try(
               FileWriter fw = new FileWriter(fichero);
               PrintWriter pw = new PrintWriter(fw);
            ) 
        {
            
            escribirPartidas(partidas, pw);
            
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch(IOException e) {
            System.out.println("Error al escribir el fichero.");
        }
    }
    
    /**
     * Método que escribe en el fichero
     * todas las partidas guardadas en la lista.
     * @param partidas
     * @param pw 
     */
    public static void escribirPartidas(ArrayList<Partida> partidas, PrintWriter pw) {
        System.out.println("\nEscribiendo fichero...");
        
        
        for(Partida partida : partidas) {
            pw.println(partida);
        }
        
        System.out.println("Archivo escrito correctamente.");
    }
    
    
    ////////////////// Leer fichero //////////////////
    
    /**
     * Método que lee el fichero
     * @param fichero 
     */
    public static void leerFichero(File fichero, ArrayList<Partida> partidas, int opcion) {
        try(
               FileReader fr = new FileReader(fichero);
               BufferedReader br = new BufferedReader(fr);
            ) 
        {
            if(opcion == 1) {
                leerPartidas(br);                
            } else if(opcion == 2) {
                importarPartidas(partidas, br);                
            }
            
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch(IOException e) {
            System.out.println("Error al leer el fichero.");
        }
    }
    
    /**
     * Método que lee las partidas y
     * las muestra por pantalla.
     * @param br
     * @throws IOException 
     */
    public static void leerPartidas(BufferedReader br) throws IOException {
        System.out.println("\nLeyendo fichero...");
        String linea = br.readLine();
        
        while(linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
        
        System.out.println("Archivo leído correctamente.");
    }
    
    ////////////////// Importar partidas //////////////////
    
    /**
     * Método que importa las partidas
     * del fichero al ArrayList
     * @param partidas
     * @param br
     * @throws IOException 
     */
    public static void importarPartidas(ArrayList<Partida> partidas, BufferedReader br) throws IOException {
        partidas.clear();
        
        String linea = br.readLine();
        String[] datos;
        
        while(linea != null) {
            // Separamos cada dato (atributo)
            datos = linea.split(";");
            
            // Creamos un objeto de tipo Partida
            Partida partida = new Partida(
                    datos[0], 
                    datos[1], 
                    Integer.parseInt(datos[2]),
                    Integer.parseInt(datos[3]), 
                    Integer.parseInt(datos[4])
            );
            
            // Añadimos la partida al ArrayList
            partidas.add(partida);
            
            linea = br.readLine();
        }
    }
    
    /**
     * Método que calcula la duración media de todas
     * las partidas guardadas y la muestra por pantalla.
     * @param partidas 
     */
    public static void calcularDuracionMedia(ArrayList<Partida> partidas) {
        System.out.println("\nCalculando duración media...");
        
        float media = 0;
        
        for(Partida partida : partidas) {
            media += partida.getDuracion();
        }
        
        media /= partidas.size();
        
        System.out.println("Duración media de todas las partidas: " + media);
    }

    /**
     * Método principal
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo el fichero donde guardar las partidas
        File fichero = new File("eSport.txt");
        try {
            fichero.createNewFile();            
        } catch(IOException e) {
            System.out.println("Error al crear el fichero.");
        }
        
        // Creo el ArrayList auxiliar
        ArrayList<Partida> partidas = new ArrayList<>();
        
        // Llamo al menú con el que interactuará el usuario
        menu(partidas, fichero);
    }

    /**
     * Método que crea un menú con el que interactúa el usuario.
     * @param partidas
     * @param fichero 
     */
    public static void menu(ArrayList<Partida> partidas, File fichero) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("\nElige una opción:");
                System.out.println("[1] Agregar partidas");
                System.out.println("[2] Escribir fichero");
                System.out.println("[3] Leer fichero");
                System.out.println("[4] Importar partidas");
                System.out.println("[5] Calcular duración");
                System.out.println("[6] Salir");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 -> agregarPartidas(partidas);
                    case 2 -> escribirFichero(partidas, fichero);
                    case 3 -> leerFichero(fichero, partidas, 1);
                    case 4 -> leerFichero(fichero, partidas, 2);
                    case 5 -> calcularDuracionMedia(partidas);
                    case 6 -> System.out.println("Cerrando programa...");
                    default -> System.out.println("Elige una opción válida");
                }
            } catch (InputMismatchException e) {
                e.getMessage();
            }
        } while (opcion != 5);
    }

}
