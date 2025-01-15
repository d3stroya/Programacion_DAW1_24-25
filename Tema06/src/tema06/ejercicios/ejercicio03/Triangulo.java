
package tema06.ejercicios.ejercicio03;

/**
 *
 * @author d3stroya
 */
public abstract class Triangulo extends FiguraGeometrica {
    private float base;
    private float altura;

    public Triangulo() {
        super();
        this.base = 0f;
        this.altura = 0f;
    }
    
    public Triangulo(float base, float altura, String color) {
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
        return base * altura / 2;
    }

    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
