
package tema06.ejercicios.ejercicio06;
/**
 * Clase persona
 * 
 * @author Daniel
 */
public class Persona implements Transformable {
    
    //Atributos
    private String nombre;
    private String apellidos;
    private String alias;
    
    //Constructor
    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.alias = "";
    }
    
    public Persona(String nombre, String apellidos, String alias) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    }
    
    //Getters / Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    // Métodos
    @Override
    public String concatenarTodo() {
        return nombre + "#" + apellidos + "#" + alias;
    }

    @Override
    public String obtenerIniciales() {
        return "" + nombre.charAt(0) + apellidos.charAt(0) + alias.charAt(0);
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
        
        System.out.println("La persona tiene " + contVocales + " vocales");
    }

    @Override
    public String obtenerCadenaMasLarga() {
        String cadenaMasLarga = nombre;
        
        if(apellidos.length() > cadenaMasLarga.length()) {
            cadenaMasLarga = apellidos;
        } else if (alias.length() > cadenaMasLarga.length()) {
            cadenaMasLarga = alias;
        }
        
        return cadenaMasLarga;
    }

    @Override
    public boolean buscarCadena(String cadena) {
        boolean enc = false;
        
        if(cadena.equalsIgnoreCase(nombre) 
                || cadena.equalsIgnoreCase(apellidos)
                || cadena.equalsIgnoreCase(alias)) {
            enc = true;
        }
        
        return enc;      
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", alias=" + alias + '}';
    }     

}
