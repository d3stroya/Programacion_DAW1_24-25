package tema12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * LECTURA Y ESCRITURA DE FICHEROS DE TEXTO
 * Java trabaja con flujos (streams) de información,
 * lo que le da un nivel de abstracción que no distingue
 * de dónde viene la información y a dónde sale:
 * lo trata todo igual.
 * 
 * Usamos 2 flujos (clases) tanto para lectura como para escritura:
 * 
 * ESCRITURA:
 *    - FileWriter: abre el archivo y escribe en él. Lanza IOException y FileNotFoundException.
 *    - PrintWriter: envuelve a FileWriter y aporta funcionalidades.
 * 
 * LECTURA: 
 *    - FileReader: flujo que lee caracteres. Lanza FileNotFoundException.
 *    - BufferedReader: crea un buffer para leer líneas.
 *       -> Tiene el método .readLine() para leer una línea. Lanza IOException.
 * @author d3stroya
 */
public class FicherosDeTexto {
    public static final String[] ALUMNOS = {"Paca", "Juan", "Pepe", "Lucía"};
    
    /********** ESCRITURA **********/
    
    /**
     * Método que escribe líneas en un fichero.
     * @param pw 
     */
    public static void escribir(PrintWriter pw) {
        for(String alumno : ALUMNOS) {
            pw.println(alumno);
        }        
    }
    
    /**
     * Método que escribe un fichero pasado por parámetro.
     * (Forma clásica)
     * @param ruta 
     */
    public static void escribirFichero(String ruta) {
        System.out.println("\nEscribiendo fichero...");
        
        // Inicializo a null los flujos de escritura
        FileWriter fw = null;
        PrintWriter pw = null;
        
        // 1. Intento escribir el fichero
        try {
            // Instancio los flujos de escritura
            fw = new FileWriter(ruta);
            pw = new PrintWriter(fw);
            
            // Escribo el fichero
            escribir(pw);
            System.out.println("\nFichero escrito correctamente.");
            
        // 2. Capturo las exceptiones    
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch(IOException e) {
            System.out.println("Error en la escritura del archivo.");
            
        // 3. Cierro los flujos de escritura    
        } finally {
            if(pw != null) {
                pw.close();
            }
            
            if(fw != null) {
                try {
                    fw.close();                                    
                } catch(IOException e) {
                    System.out.println("Error al cerrar el flujo de escritura.");
                }
            }
        }        
        
    }
    
    /**
     * Método que escribe un fichero pasado por parámetro
     * utilizando try-with-resources.
     * (Forma más moderna)
     * @param ruta 
     */
    public static void escribirFicheroTryWithResources(String ruta) {
        System.out.println("\nEscribiendo fichero...");
        
        // 1. Declaro los recursos (flujos de escritura). Se cerrarán automáticamente.
        try(
            FileWriter fw = new FileWriter(ruta, true);
            PrintWriter pw = new PrintWriter(fw);
        ) {
            
            // Intento escribir el fichero
            escribir(pw);
            System.out.println("\nFichero escrito correctamente.");
            
        // 2. Caputro las excepciones.
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch(IOException e) {
            System.out.println("Error en la escritura del archivo.");
        }
        
    }
    
    
    /********** LECTURA **********/
    
    /**
     * Método que lee las líneas de un fichero
     * @param br
     * @throws IOException 
     */
    public static void leer(BufferedReader br) throws IOException {
        String linea;
        
        linea = br.readLine();
        while(linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
    }
    
    /**
     * Método que lee un fichero.
     * (Forma clásica)
     * @param ruta 
     */
    public static void leerFichero(String ruta) {
        System.out.println("\nLeyendo fichero...");
        
        FileReader fr = null;
        BufferedReader br = null;
        
        
        try {
            fr = new FileReader(ruta);    
            br = new BufferedReader(fr);
            
            leer(br);                        
            
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch(IOException e) {
            System.out.println("Error de entrada/salida al leer el fichero.");
        } finally {
            try {
                if(br != null) {
                    br.close();                    
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el búfer de lectura");
            }
            
            try {
                if(fr != null) {
                    fr.close();                    
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el flujo de lectura");
            }
        }
        
        System.out.println("\nFichero leído correctamente.");
    }
    
    /**
     * Método que lee un fichero
     * utilizando try-whith-resources.
     * (Forma más moderna)
     * @param ruta 
     */
    public static void leerFicheroTryWithResources(String ruta) {
        System.out.println("\nLeyendo fichero...");
                
        try(
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
        ) {
            leer(br);
            
        } catch(FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
        } catch(IOException e) {
            System.out.println("Error al leer el archivo.");
        }
        
        System.out.println("\nFichero leído correctamente.");
    }
    
    
    /**
     * Método principal
     * @param args 
     */
    public static void main(String[] args) {
        String ruta = "Informatica/CFGS/DAW/1/Programacion/alumnos.txt";
        escribirFicheroTryWithResources(ruta);
        leerFicheroTryWithResources(ruta);
    }
}
