
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Triangulo {
    // ATRIBUTOS
    private double cateto1;
    private double cateto2;

    // CONSTRUCTORES
    public Triangulo() {
        this.cateto1 = 0;
        this.cateto2 = 0;
    }
    
    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    // GETTERS Y SETTERS
    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(int cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(int cateto2) {
        this.cateto2 = cateto2;
    }
    
    // MÉTODOS
    /**
     * Método que calcula la hipotenusa del triángulo a partir de sus lados
     * @return la hipotenusa
     */
    public double calcularHipotenusa() {
        return Math.hypot(cateto1, cateto1);
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Triangulo{" + "cateto1=" + cateto1 + ", cateto2=" + cateto2 + '}';
    }
    
    
}
