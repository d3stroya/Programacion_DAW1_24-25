
package tema06;


/**
 * Dada la jerarquía
 *      +------------------+
 *      | FiguraGeometrica |
 *      +------------------+
 *         |            |
 * +-----------+     +----------+   
 * | Triangulo |     |  Circulo |
 * +-----------+     +----------+
 * 
 * sabemos que triángulo y círculo son figuras geométricas,
 * así que podemos guardar objetos de tipo Triangulo y de tipo Circulo
 * en variables de tipo FiguraGeometrica. 
 * Sin embargo, no podemos guardar un círculo en un triángulo.
 * 
 * Al instanciar un nuevo objeto de tipo Triangulo y guardarlo en una variable de tipo
 * FiguraGeometrica, podemos acceder a los métodos de la superclase, pero no a los que sólo
 * tiene la subclase.
 * 
 * @author d3stroya
 */
public class Tema06 {

    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiguraGeometrica figura;
        
        // Al instanciar un nuevo objeto de tipo Triangulo 
        // y guardarlo en una variable de tipo FiguraGeometrica        
        figura = new Triangulo(5, 7, "rojo");
        
        // y acceder a los métodos de la superclase
        figura.mostrarColor();
        
        // pero no a los métodos que sólo tiene la subclase
        //figura.getBase(); ERROR
        
        
        // POLIMORFISMO
        // La misma expresión permite invocar a diferentes versiones del mismo método
        figura = new Triangulo(3, 4, "rojo");
        System.out.println("El área del triángulo es " + figura.calcularArea());
        
        figura = new Circulo(6, "rojo");
        System.out.println("El área del círculo es " + figura.calcularArea());
        
        System.out.println("");
        
        // OPERADOR INSTANCE OF
        if(figura instanceof Triangulo) {
            System.out.println("La figura es un triángulo");
        } else if(figura instanceof Circulo) {
            System.out.println("La figura es un círculo");
        }
    }

}
