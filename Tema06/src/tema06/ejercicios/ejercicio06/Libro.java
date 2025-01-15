
package tema06.ejercicios.ejercicio06;
/**
 * Clase Libro
 * 
 * @author Daniel
 */
public class Libro implements Transformable {

    //Atributos
    private String titulo;
    private String autor;
    private String genero;
    
    //Constructores
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.genero = "";
    }
    
    public Libro(String titulo, String autor, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
    
    //Getters / Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }  
    
    // Métodos
    @Override
    public String concatenarTodo() {
        return titulo + "#" + autor + "#" + genero;
    }

    @Override
    public String obtenerIniciales() {
        return "" + titulo.charAt(0) + autor.charAt(0) + genero.charAt(0);
    }

    @Override
    public void contarVocales() {
        String datos = concatenarTodo().toLowerCase();
        int contVocales = 0;
        
        for(int i=0; i<datos.length(); i++) {
            if(datos.charAt(i) == 'a'
                    || datos.charAt(i) == 'e' 
                    || datos.charAt(i) == 'i'
                    || datos.charAt(i) == 'o'
                    || datos.charAt(i) == 'u') {
                    contVocales++;
            }
        }
        
        System.out.println("El libro tiene " + contVocales + " vocales");
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String cadenaMasLarga = titulo;
        
        if(autor.length() > cadenaMasLarga.length()) {
            cadenaMasLarga = autor;
        } else if (genero.length() > cadenaMasLarga.length()) {
            cadenaMasLarga = genero;
        }
        
        return cadenaMasLarga;
    }

    @Override
    public boolean buscarCadena(String cadena) {
        boolean enc = false;
        
        if(cadena.equalsIgnoreCase(titulo) 
                || cadena.equalsIgnoreCase(autor)
                || cadena.equalsIgnoreCase(genero)) {
            enc = true;
        }
        
        return enc;      
    }
    
    //toString
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + '}';
    }  
   
}
