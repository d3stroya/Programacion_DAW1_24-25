
package tema06.ejercicios.ejercicio09;

/**
 * Clase Persona
 * 
 * @author d3stroya
 */
public class Persona implements Gravable {
    // ATRIBUTOS
    private String dni;
    private float ingresosAnuales;

    // CONSTRUCTORES
    public Persona() {
        this.dni = "";
        this.ingresosAnuales = 0f;
    }
    
    public Persona(String dni, float ingresosAnuales) {
        this.dni = dni;
        this.ingresosAnuales = ingresosAnuales;
    }

    // GETTERS Y SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public float getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(float ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    // MÉTODOS
    @Override
    public float calcularImpuesto() {
        float impuesto = 0;
        
        if(ingresosAnuales <= 12450f) {
            impuesto = ingresosAnuales * 19 / 100;
        } else if(ingresosAnuales <= 20200f) {
            impuesto = ingresosAnuales * 24 / 100;
        } else if(ingresosAnuales <= 35200f) {
            impuesto = ingresosAnuales * 30 / 100;
        } else if(ingresosAnuales <= 60000f) {
            impuesto = ingresosAnuales * 37 / 100;
        } else if(ingresosAnuales <= 300000f) {
            impuesto = ingresosAnuales * 45 / 100;
        } else if(ingresosAnuales > 300000) {
            impuesto = ingresosAnuales * 47 / 100;
        } else {
            impuesto = 0;
        }
        
        return impuesto;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", ingresosAnuales=" + ingresosAnuales + '}';
    }        
    
    
}
