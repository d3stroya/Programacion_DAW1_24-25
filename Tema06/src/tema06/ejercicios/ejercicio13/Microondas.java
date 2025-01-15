
package tema06.ejercicios.ejercicio13;

/**
 * Clase Microondas
 * 
 * @author Daniel
 */
public class Microondas implements Operable, Revisable {

    //Atributos
    private boolean activo;
    private boolean estadoCalentador;
    private boolean puertaCerrada;
    
    //Constructores
    public Microondas() {
        this.activo = false;
        this.estadoCalentador = false;
        this.puertaCerrada = false;
    }
    
    public Microondas(boolean activo, boolean estadoCalentador, boolean puertaCerrada) {
        this.activo = activo;
        this.estadoCalentador = estadoCalentador;
        this.puertaCerrada = puertaCerrada;
    }
    
    //Getters / Setters
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isEstadoCalentador() {
        return estadoCalentador;
    }

    public void setEstadoCalentador(boolean estadoCalentador) {
        this.estadoCalentador = estadoCalentador;
    }

    public boolean isPuertaCerrada() {
        return puertaCerrada;
    }

    public void setPuertaCerrada(boolean puertaCerrada) {
        this.puertaCerrada = puertaCerrada;
    }
    
    //M�todos
    @Override
    public void activar() {
        if(!activo) {
            if(estadoCalentador && puertaCerrada) {
                activo = true;
                System.out.println("El microondas est� activado");
            } else if (!estadoCalentador) {
                System.out.println("El microondas tiene fallos en el calentador y no se puede activar");
            } else {
                System.out.println("La puerta est� abierta. No se puede activar el microondas");
            }
        } else {
            System.out.println("El microondas ya estaba activado");
        }
    }

    @Override
    public void desactivar() {
        if(activo) {
            activo = false;
            System.out.println("El microondas est� desactivado");
        } else {
           System.out.println("El microondas ya estaba desactivado"); 
        }
    }

    @Override
    public String realizarRevision() {
        if (!estadoCalentador) {
            return "Fallos detectados en el calentador del microondas";
        } else if (!puertaCerrada) {
            return "La puerta est� abierta. Por favor, ci�rrela";
        } else {
            return "El calentador funciona correctamente y la puerta est� cerrada";
        }
    }
    
    //toString
    @Override
    public String toString() {
        return "Microondas{" + "activo=" + activo + ", estadoCalentador=" + estadoCalentador + ", puertaCerrada=" + puertaCerrada + '}';
    }   
    
}
