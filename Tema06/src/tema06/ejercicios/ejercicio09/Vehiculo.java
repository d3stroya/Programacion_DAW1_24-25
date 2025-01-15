
package tema06.ejercicios.ejercicio09;

/**
 * Clase Vehiculo
 * 
 * @author d3stroya
 */
public class Vehiculo implements Gravable {
    // ATRIBUTOS
    private int cc;
    private String matricula;
    private String dni;

    // CONSTRUCTORES
    public Vehiculo() {
        this.cc = 0;
        this.matricula = "";
        this.dni = "";
    }
    
    public Vehiculo(int cc, String matricula, String dni) {
        this.cc = cc;
        this.matricula = matricula;
        this.dni = dni;
    }

    // GETTERS Y SETTERS
    public int getCaballos() {
        return cc;
    }

    public void setCaballos(int cc) {
        this.cc = cc;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    // MÉTODOS
    @Override
    public float calcularImpuesto() {
        float impuesto = 0;
        
        if(cc < 1000f) {
            impuesto = 12f;
        } else if(cc < 1500f) {
            impuesto = 34f; 
        } else if(cc < 2000f) {
            impuesto = 71f;         
        } else if(cc < 3000f) {
            impuesto = 122f;
        } else if(cc > 3000f) {
            impuesto = 152f;
        } else {
            impuesto = 0;
        }
        
        return impuesto;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Vehiculo{" + "cc=" + cc + ", matricula=" + matricula + ", dni=" + dni + '}';
    }
    
    
}
