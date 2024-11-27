
package tema05.ejercicios;


/**
 *
 * @author d3stroya
 */
public class Ordenador {
    private int ram;
    private int ssd;
    private String procesador;
    private String tarjetaGrafica;
    private float precio;    

    public Ordenador() {
        this.ram = 0;
        this.ssd = 0;
        this.procesador = "";
        this.tarjetaGrafica = "";
        this.precio = 0f;
    }
    
    public Ordenador(int ram, int ssd, String procesador, String tarjetaGrafica, float precio) {
        this.ram = ram;        
        this.ssd = ssd;        
        this.procesador = procesador;        
        this.tarjetaGrafica = tarjetaGrafica;        
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "ram=" + ram + ", ssd=" + ssd + ", procesador=" + procesador + ", tarjetaGrafica=" + tarjetaGrafica + ", precio=" + precio + '}';
    }  
    
}
