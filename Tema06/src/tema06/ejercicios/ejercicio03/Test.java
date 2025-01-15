
package tema06.ejercicios.ejercicio03;

/**
 *
 * @author d3stroya
 */
public class Test {
    public static void main(String[] args) {
        FiguraGeometrica figura;
        
        figura = new Circulo(3, "rojo");
        System.out.println(figura.calcularArea());
        System.out.println(figura.calcularPerimetro());
        
        figura = new Rectangulo(3, 2, "azul");
        System.out.println(figura.calcularArea());
        System.out.println(figura.calcularPerimetro());
        
        figura = new Cuadrado(4, "amarillo");
        System.out.println(figura.calcularArea());
        System.out.println(figura.calcularPerimetro());
        
        figura = new TrianguloRectangulo(3, 3, "verde");
        System.out.println(figura.calcularArea());
        System.out.println(figura.calcularPerimetro());
        
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(3, 3, "verde");
        trianguloRectangulo.muestraTipo();
        
        trianguloRectangulo = new TrianguloRectangulo(3, 5, "verde");
        trianguloRectangulo.muestraTipo();

        
    }
}
