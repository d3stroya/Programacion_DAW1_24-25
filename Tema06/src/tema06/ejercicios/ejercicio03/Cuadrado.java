
package tema06.ejercicios.ejercicio03;

/**
 *
 * @author d3stroya
 */
public class Cuadrado extends FiguraGeometrica {
    private float lado;

    public Cuadrado() {
        super();
        this.lado = 0f;
    }
    
    public Cuadrado(float lado, String color) {
        super(color);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return lado * lado;
    }

    @Override
    public float calcularPerimetro() {
        return 4 * lado;
    }
        
    @Override
    public String toString() {
        return super.toString() + "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
}
