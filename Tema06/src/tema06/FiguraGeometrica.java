
package tema06;

/**
 * CLASES ABSTRACTAS
 * 
 * Clase abstracta que actúa de superclase en la jerarquía de figuras geométricas.
 * 
 *      +------------------+
 *      | FiguraGeometrica |
 *      +------------------+
 *         |            |
 * +-----------+     +----------+   
 * | Triangulo |     |  Circulo |
 * +-----------+     +----------+
 * 
 * 
 * Una clase abstracta es aquella que contiene, al menos, un método abstracto.
 * Un método abstracto es aquel que se declara pero no tiene cuerpo: 
 * public abstract float calcularArea();
 * 
 * Esta clase abstracta decalara un método (o más) abstracto
 * para obligar a las subclases a implementar ese método.
 * En este caso, sabemos que todas las figuras geométricas tienen un área
 * que podemos calcular, pero cada figura geométrica tiene su propia forma
 * de calcular el área (tienen diferentes fórmulas).
 * 
 * FiguraGeometrica obliga a Triangulo y Circulo a implementar
 * el método calcularArea(), pero Triangulo lo hará de una manera ( (base * algura) / 2 )
 * y Circulo lo hará de otra manera (PI * radio al cuadrado).
 * 
 * @author d3stroya
 */

public abstract class FiguraGeometrica {
    // ATRIBUTOS
    private String color;
    
    // CONSTRUCTORES
    public FiguraGeometrica() {
        this.color = "";
    }
    
    public FiguraGeometrica(String color) {
        this.color = color;
    }
    
    // GETTER Y SETTER
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // MÉTODOS
    public abstract float calcularArea();
    
    // La palabra reservada final delante de un método impide que dicho método 
    // sea sobreescrito en una subclase. 
    // mostrarColor() siempre se comportará igual en cualquier figura geométrica.
    final public void mostrarColor() {
        System.out.println("El color de la figura es " + color);
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "FiguraGeometrica{" + "color=" + color + '}';
    }    
    
}
