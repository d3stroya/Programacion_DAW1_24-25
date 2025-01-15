
package tema06.ejercicios.ejercicio07;

/**
 * Clase Televisor
 * 
 * @author d3stroya
 */
public class Televisor implements ControlRemoto {
    // ATRIBUTOS
    private boolean encendido;
    private int canal;
    private int volumen;

    // CONSTRUCTORES
    public Televisor() {
        this.encendido = false;
        this.canal = 1;
        this.volumen = 10;
    }
    
    public Televisor(int canal, int volumen) {
        this.encendido = false;
        this.canal = canal;
        this.volumen = volumen;
    }

    // GETTERS Y SETTERS
    public float getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
        
    // MÉTODOS
    @Override
    public void apagar() {
        if(encendido) {
            System.out.println("La TV se apagará en 10s");
            encendido = false;
        }
    }
    
    @Override
    public void encender() {
        if(!encendido) {
            encendido = true;
            System.out.println("Estás viendo el canal " + canal);
        }
    }

    @Override
    public void bajarVolumen() {
        if(encendido) {
            volumen--;
            System.out.println("Volumen " + volumen);
        }
    }

    @Override
    public void subirVolumen() {
        if(encendido) {
            volumen++;
            System.out.println("Volumen " + volumen);
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if(encendido) {
            this.canal = (int)canal;
            System.out.println("Estás viendo el canal " + canal);
        }
    }
      
    // TO STRING
    @Override
    public String toString() {
        return "Televisor{" + "encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + '}';
    }
        
}
