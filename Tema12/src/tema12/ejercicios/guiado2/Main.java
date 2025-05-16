package tema12.ejercicios.guiado2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Main {
    /**
     * Método para pedir datos al usuario
     * @param pregunta
     * @return el dato que introduzca el usuario
     */
    private static String pedirDatos(String pregunta) {
        Scanner entrada = new Scanner(System.in);
        System.out.print(" -> " + pregunta + ": ");
        return entrada.nextLine();
    }
    
    /**
     * Método que añade avistamientos a la lista
     * hasta que el usuario quiera.
     * @param avistamientos 
     */
    public static void agregarAvistamientos(ArrayList<Avistamiento> avistamientos) {
        do {
            System.out.println("\nAgregando nuevo avistamiento:");
            avistamientos.add(
                    new Avistamiento(
                    pedirDatos("Nombre"), 
                    pedirDatos("Especie"), 
                    pedirDatos("Ubicación"), 
                    Integer.parseInt(pedirDatos("Número de animales"))
                    )
            );
        } while(pedirDatos("¿Quieres añadir otro avistamiento? (s/n)").equalsIgnoreCase("s"));
    }        
    
    
    
    /////////////////// Escribir fichero ///////////////////
    
    /**
     * Método que recorre la lista de avistamientos
     * y los escribe en el fichero
     * @param pw
     * @param avistamientos 
     */
    public static void escribirAvistamientos(PrintWriter pw, ArrayList<Avistamiento> avistamientos) {
        for(Avistamiento a : avistamientos) {
            pw.println(a);
        }
        System.out.println("Datos volcados correctamente.");
    }
    
    /**
     * Método que escribe los avistamientos en el fichero
     * @param avistamientos
     * @param fichero 
     */
    public static void escribirFichero(ArrayList<Avistamiento> avistamientos, File fichero) {
        try (
              FileWriter fw = new FileWriter(fichero);
              PrintWriter pw = new PrintWriter(fw);
            ) 
        {
            
            escribirAvistamientos(pw, avistamientos);
            
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch(IOException e) {
            System.out.println("Error al escribir el fichero.");
        }
    }
    
    
    
    
    /////////////////// Leer fichero ///////////////////
    
    /**
     * Método que lee los avistamientos del fichero
     * y los imprime por pantalla.
     * @param br
     * @throws IOException 
     */
    public static void leerAvistamientos(BufferedReader br) throws IOException {
        String linea = br.readLine();
        
        while(linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
        
        System.out.println("\nAvistamientos leídos correctamente.");
    }
    
    /**
     * Método que lee el fichero y 
     * muestra sus datos por pantalla.
     * @param avistamientos
     * @param fichero 
     * @param opcion 
     */
    public static void leerFichero(ArrayList<Avistamiento> avistamientos, File fichero, int opcion) {
        try(
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            ) 
        {
            if(opcion == 1) {
                leerAvistamientos(br);                
            } else if(opcion == 2) {
                importarAvistamientos(br, avistamientos);
            }            
            
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch(IOException e) {
            System.out.println("Error al leer el fichero.");
        }
    }
    
    
    
    
    /////////////////// Importar datos del fichero ///////////////////
    
    /**
     * Método que lee el fichero e importa
     * sus datos al ArrayList.
     * @param avistamientos
     * @param fichero 
     */
    public static void importarDatosFichero(ArrayList<Avistamiento> avistamientos, File fichero) {
        try(
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            ) 
        {
            
            importarAvistamientos(br, avistamientos);
            
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch(IOException e) {
            System.out.println("Error al leer el fichero.");
        }
    }
    
    /**
     * Método que importa cada avistamiento
     * agregándolo al ArrayList.
     * @param br
     * @param avistamientos
     * @throws IOException 
     */
    public static void importarAvistamientos(BufferedReader br, ArrayList<Avistamiento> avistamientos) throws IOException {
        avistamientos.clear();
        
        String linea = br.readLine();
        String[] datos;
        
        while(linea != null) {
            // Divido la línea por los ;
            datos = linea.split(";");
            
            // Creo un objeto con los datos del avistamiento y lo añado a la lista
            avistamientos.add(
                    new Avistamiento(
                            datos[0],
                            datos[1],
                            datos[2],
                            Integer.parseInt(datos[3])
                    )
            );
            
            // Leo la siguiente línea
            linea = br.readLine();
        }
        
        System.out.println("Avistamientos importados correctamente.");                
    }
    
    
    
    
    /////////////////// Calcular total animales observados ///////////////////
    /**
     * Método que importa los datos del fichero
     * y recorre la lista sumando la cantidad
     * de animales observados.
     * @param avistamientos
     * @param fichero 
     */
    public static void totalAnimalesObservados(ArrayList<Avistamiento> avistamientos, File fichero) {
            System.out.println("\nCalculando total de animales observados...");
        avistamientos.clear();
        leerFichero(avistamientos, fichero, 2);
        int total = 0;
                
        for(Avistamiento a : avistamientos) {
            total += a.getNumAnimales();
        }
        
            System.out.println("Animales observados: " + total);
    }

    
    
    
    /**
     * Método principal
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancio el ArrayList donde guardar los avistamientos
        ArrayList<Avistamiento> avistamientos = new ArrayList<>();
        
        // Creo el fichero con el que trabajaremos
        File fichero = new File("avistamientos.txt");
        try {
            fichero.createNewFile();
        } catch(IOException e) {
            System.out.println("[x] Error al crear el fichero");
        }
        
        // Llamo al menú con el que interactuará el usuario
        menu(avistamientos, fichero);
        
    }

    public static void menu(ArrayList<Avistamiento> avistamientos, File fichero) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            try {
                System.out.println("\nElige una opción:");
                System.out.println("[1] Añadir avistamientos");
                System.out.println("[2] Escribir fichero");
                System.out.println("[3] Leer fichero");
                System.out.println("[4] Importar avistamientos");
                System.out.println("[5] Mostrar total de animales observados");
                System.out.println("[6] Salir");

                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1 -> agregarAvistamientos(avistamientos);
                    case 2 -> escribirFichero(avistamientos, fichero);
                    case 3 -> leerFichero(avistamientos, fichero, 1);
                    case 4 -> leerFichero(avistamientos, fichero, 2);
                    case 5 -> totalAnimalesObservados(avistamientos, fichero);
                    case 6 -> System.out.println("Cerrando programa...");
                    default -> System.out.println("Elige una opción válida");
                }
            } catch (InputMismatchException e) {
                e.getMessage();                                                           
            }
        } while (opcion != 6);
    }

}
