
package tema06.ejercicios.ejercicio12;

/**
 * Clase Test 
 * 
 * @author d3stroya
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Serie mrRobot = new Serie(4, "Sam Esmail", "Mr. Robot", "Trhiller");
        Serie arcane = new Serie(2, "Christian Linke, Alex Yee", "Arcane", "Ciencia ficción");
        Estudio insomniac = new Estudio("Insomniac Games", "Marvel's Spider-Man 2");
        Videojuego ratchet = new Videojuego(80, insomniac, "Ratchet & Clank: Rift Apart", "Aventura");
        
        System.out.println(arcane.getCreador());
        System.out.println(arcane.getNumTemporadas());
        System.out.println(arcane.getTitulo());
        System.out.println(arcane.getGenero());
        arcane.valorar();
        
        System.out.println("");
        
        Contenido contenidoUsuario;
        
        contenidoUsuario = mrRobot;
        System.out.println(contenidoUsuario);
        contenidoUsuario.entregar();
        contenidoUsuario.valorar();
        System.out.println("Entregado: " + contenidoUsuario.esEntregado());
        contenidoUsuario.devolver();
        System.out.println("Entregado: " + contenidoUsuario.esEntregado());
        
        System.out.println("");
        
        contenidoUsuario = ratchet;
        System.out.println(contenidoUsuario);
        contenidoUsuario.entregar();
        contenidoUsuario.valorar();
        System.out.println("Entregado: " + contenidoUsuario.esEntregado());
        contenidoUsuario.devolver();
        System.out.println("Entregado: " + contenidoUsuario.esEntregado());
        
    }
    
}
