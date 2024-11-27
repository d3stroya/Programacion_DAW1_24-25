
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Servidor extends Ordenador {
    private int tamanioMonitor;
    private String modeloTeclado;
    private String modeloRaton;

    public Servidor() {
        super();
        this.tamanioMonitor = 0;
        this.modeloTeclado = "";
        this.modeloRaton = "";
    }
    
    public Servidor(int tamanioMonitor, String modeloTeclado, String modeloRaton, int ram, int ssd, String procesador, String tarjetaGrafica, float precio) {
        super(ram, ssd, procesador, tarjetaGrafica, precio);
        this.tamanioMonitor = tamanioMonitor;
        this.modeloTeclado = modeloTeclado;
        this.modeloRaton = modeloRaton;
    }

    public int getTamanioMonitor() {
        return tamanioMonitor;
    }

    public void setTamanioMonitor(int tamanioMonitor) {
        this.tamanioMonitor = tamanioMonitor;
    }

    public String getModeloTeclado() {
        return modeloTeclado;
    }

    public void setModeloTeclado(String modeloTeclado) {
        this.modeloTeclado = modeloTeclado;
    }

    public String getModeloRaton() {
        return modeloRaton;
    }

    public void setModeloRaton(String modeloRaton) {
        this.modeloRaton = modeloRaton;
    }

    @Override
    public String toString() {
        return "Servidor{" + "tamanioMonitor=" + tamanioMonitor + ", modeloTeclado=" + modeloTeclado + ", modeloRaton=" + modeloRaton + '}';
    }
        
}   
