package tema12;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FICHEROS
 * Para leer y escribir ficheros, recurrimos siempre
 * al mismo proceso:
 *    - Abrir flujo de datos
 *    - Leer/escribir mientras haya información
 *    - Cerrar flujo de datos
 * 
 * Ahora bien, pueden suceder EXCEPCIONES,
 * como que el fichero que intentamos leer
 * no exista.
 * 
 * Además, SIEMPRE nos saltará una excepción
 * (EOFException: End Of File Exception), que debemos manejar.
 * Esta excepción salta cuando llegamos al final del fichero,
 * porque siempre vamos a leer mientras haya más información.
 * Terminamos de leer cuando ya no hay más información,
 * y es entonces cuando salta EOFException.
 * 
 * Como ya sabes, para controlar las excepciones
 * usamos el bloque try-catch-finally.
 * Pero también tenemos una nueva sentencia,
 * throws, que pasa la excepción al método de arriba
 * para que él la maneje. Esto es útil cuando
 * hay alguna excepción que se repite en varios métodos.
 * Lanzándola al método superior la capturamos sólo una vez
 * en lugar de repetir código.
 * 
 * 
 * Vamos a trabajar con FICHEROS creando objetos
 * que representen a directorios y ficheros del sistema.
 * Lo haremos con la clase File, que nos permite:
 *    - Crear y eliminar archvos
 *    - Crear y eliminar directorios
 * 
 * @author d3stroya
 */
public class Tema12 {
    
    /**************** TRY-CATCH-FINALLY Y THROWS ****************/
    
    /**
     * Método que pide al usuario un número entero
     * y lanza InputMismatchException.
     * @return el número entero.
     */
    public static int pedirNumero() throws InputMismatchException {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Número: ");
        return entrada.nextInt();
    }
    
    /**
     * Métod que pide al usuario un número
     * y captura la excepción InputMismatchException.
     */
    public static void pedirNumeroConExcepciones() {
        int num;
        // 1. Intento pedir los datos al usuario. 
        try {
            num = pedirNumero();
            System.out.println("Número guardado correctamente.");
            System.out.println("El número es " + num);
            
            // 2. Capturo las excepciones lanzadas por los métodos.
        } catch(InputMismatchException e) {
            System.out.println("Has introducido un tipo de dato no válido.");
            
            // 3. Bloque que siempre se ejecuta.
        } finally {
            System.out.println("Fin de bloque.");
        }
    }                     
    
    /**
     * Método principal
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        pedirNumero();
//        pedirNumeroConExcepciones();
        
        /**************** LA CLASE FILE ****************/
        
        // Crear un directorio
        File dir = new File("DAW");
        if(!dir.exists()) {
            dir.mkdir();             
        } else {
            System.out.println("El directorio DAW ya existe");
        }        
        
//      Crear un fichero en el directorio creado previamente
        File archivoEnDAW = new File("DAW/alumnos.txt");
        
        try {
            archivoEnDAW.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida al crear el archivo");
        }
        
        // Crear un fichero en la raíz
        File archivoRaiz = new File("alumnos.txt");
        try {
            archivoRaiz.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida al crear el archivo");
        }
        
        
        
        // Crear directorios
        File dirs = new File("Informatica/CFGS/DAW/1/Programacion");
        dirs.mkdirs();
        
        // Crear fichero en una ruta específica
        File arch = new File("Informatica/CFGS/DAW/1/Programacion/alumnos.txt");
        
        try {
            arch.createNewFile();
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida al crear el archivo");
        }
        
        
        
        // Propiedades de los archivos
        System.out.println("¿Se puede leer el directorio DAW? " + dir.canRead());
        System.out.println("¿Se puede escribir el directorio DAW? " + dir.canWrite());
        
        System.out.println("\nRuta del directorio DAW: " + dir.getAbsolutePath());
        System.out.println("Nombre del directorio DAW: " + dir.getName());
        
        System.out.println("\n¿DAW es un directorio? : " + dir.isDirectory());
        System.out.println("¿DAW es un fichero? : " + dir.isFile());
        
        System.out.println("\nTamaño en bytes de DAW : " + dir.length() + "bytes");
        System.out.println("\nArchivos dentro de DAW : " + Arrays.toString(dir.list()));        
        
        
        
               
        // Renombrar un archivo
        File archivoRenombrado = new File("DAW/estudiantes.txt");
        System.out.println("\nRenombrando el archivo " + archivoEnDAW.getName() + 
                ": " + archivoEnDAW.renameTo(archivoRenombrado));
        System.out.println("Nombre del archivo " + archivoRenombrado.getName());                
        
        
        
        // Eliminar un fichero
        archivoRaiz.delete();
        
        // Eliminar un directorio (debe estar vacío)
//        dir.delete();   // No lo elimina porque no está vacío        
       
        archivoEnDAW.delete();  // Es el objeto que referencia al archivo renombrado. 
                                // No se elimina, tengo que hacer referencia al nuevo objeto archivoRenombrado
                                
        archivoRenombrado.delete();     // Ahora sí se borra                            
        dir.delete();                   // Ahora sí se borra
        
    }    

}
