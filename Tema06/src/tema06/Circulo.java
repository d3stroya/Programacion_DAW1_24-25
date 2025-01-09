
package tema06;

/**
 *
 * @author d3stroya
 */
final public class Circulo extends FiguraGeometrica {
    // ATRIBUTOS    
    private int radio;
    
    // CONSTRUCTORES
    public Circulo() {
        super();
        this.radio = 0;
    }
    
    public Circulo(int radio, String color) {
        super(color);
        this.radio = radio;
    }
    
    // GETTER Y SETTER
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    // MÉTODOS

    @Override
    public float calcularArea() {
        return (float)(Math.PI * Math.pow(radio, 2));
    }    
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString() + "Circulo{" + "radio=" + radio + '}';
    }
    
}
