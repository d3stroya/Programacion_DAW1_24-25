
package tema06.ejercicios.ejercicio03;

/**
 *
 * @author d3stroya
 */
public class Rectangulo extends FiguraGeometrica {
    private float base;
    private float altura;

    public Rectangulo() {
        super();
        this.base = 0f;
        this.altura = 0f;
    }
    
    public Rectangulo(float base, float altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return base * altura;
    }

    @Override
    public float calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
        
    @Override
    public String toString() {
        return super.toString() + "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
