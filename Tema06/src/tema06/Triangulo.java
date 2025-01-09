
package tema06;

/**
 * CLASES FINALES
 * 
 * Una clase final impide que otra clase herede de ella. En la jerarquía,
 * queremos que Triangulo herede de FiguraGeometrica, pero no vamos a permitir
 * que ninguna otra clase herede de triángulo.
 * 
 * @author d3stroya
 */
final public class Triangulo extends FiguraGeometrica {
    // ATRIBUTOS
    private int base;
    private int altura;
    
    // CONSTRUCTORES
    public Triangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }
    
    public Triangulo(int base, int altura, String color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }
    
    // GETTER Y SETTER
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    // MÉTODOS
    @Override
    public float calcularArea() {
        return (base * altura) / 2;
    }
    
    // mostrarColor() es un método final de la superclase, 
    // por lo que no podemos sobreescribirlo en la subclase
//    @Override
//    public void mostrarColor() {  ERROR
//        System.out.println(super.getColor());
//    }
    
    // TO STRING
    @Override
    public String toString() {
        return super.toString() + "Triangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
