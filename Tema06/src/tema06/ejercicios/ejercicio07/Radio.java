
package tema06.ejercicios.ejercicio07;

/**
 * Clase Radio
 * 
 * @author d3stroya
 */
public class Radio implements ControlRemoto {
    // ATRIBUTOS
    private boolean encendido;
    private int volumen;
    private float emisora;

    // CONSTRUCTORES
    public Radio() {
        this.encendido = false;
        this.volumen = 12;
        this.emisora = 80.0f;
    }
    
    public Radio(int volumen, float emisora) {
        this.encendido = false;
        this.volumen = volumen;
        this.emisora = emisora;
    }

    // GETTERS Y SETTERS
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }
    
    // MÉTODOS
    @Override
    public void apagar() {
        if(encendido) {
            encendido = false;
        }
    }

    @Override
    public void encender() {
        if(!encendido) {
            encendido = true;
        }
    }

    @Override
    public void bajarVolumen() {
        if(encendido) {
            volumen -= 5;
        }
    }

    @Override
    public void subirVolumen() {
        if(encendido) {
            volumen += 5;
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if(encendido) {
            emisora = canal;
        }
    } 

    // TO STRING
    @Override
    public String toString() {
        return "Radio{" + "encendido=" + encendido + ", volumen=" + volumen + ", emisora=" + emisora + '}';
    }
    
    
    
}
