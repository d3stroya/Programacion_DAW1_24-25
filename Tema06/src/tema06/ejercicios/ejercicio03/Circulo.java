
package tema06.ejercicios.ejercicio03;

/**
 *
 * @author d3stroya
 */
public class Circulo extends FiguraGeometrica {
    private float radio;

    public Circulo() {
        super();
        this.radio = 0f;
    }
    
    public Circulo(float radio, String color) {
        super(color);
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (float)(Math.PI * Math.pow(radio, 2));
    }

    @Override
    public float calcularPerimetro() {
        return (float)(2 * Math.PI * radio);
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "radio=" + radio + '}';
    }        
}
