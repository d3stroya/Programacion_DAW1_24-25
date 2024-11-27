
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Portatil extends Ordenador {
    private String marca;
    private int tamanioPantalla;
    private float peso;


    public Portatil() {
        super();
        this.marca = "";
        this.tamanioPantalla = 0;
        this.peso = 0f;
    }
    public Portatil(String marca, int tamanioPantalla, float peso, int ram, int ssd, String procesador, String tarjetaGrafica, float precio) {
        super(ram, ssd, procesador, tarjetaGrafica, precio);
        this.marca = marca;
        this.tamanioPantalla = tamanioPantalla;
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Portatil{" + "marca=" + marca + ", tamanioPantalla=" + tamanioPantalla + ", peso=" + peso + '}';
    }        
    
}
