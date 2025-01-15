
package tema06.ejercicios.ejercicio03;

/**
 *
 * @author d3stroya
 */
public abstract class FiguraGeometrica {
    private String color;

    public FiguraGeometrica() {
        this.color = "";
    }
    
    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public abstract float calcularArea();
    
    public abstract float calcularPerimetro();

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }        
}
