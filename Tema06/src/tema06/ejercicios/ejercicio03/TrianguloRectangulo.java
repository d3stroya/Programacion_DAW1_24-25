
package tema06.ejercicios.ejercicio03;

/**
 *
 * @author d3stroya
 */
public class TrianguloRectangulo extends Triangulo {

    public TrianguloRectangulo() {
        super();
    }
    
    public TrianguloRectangulo(float base, float altura, String color) {
        super(base, altura, color);
    }
    
    private double calcularHipotenusa() {
        return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
    }

    @Override
    public float calcularPerimetro() {
        float hipotenusa = (float) calcularHipotenusa();
        return getBase() + getAltura() + hipotenusa;
    }    
    
    public void muestraTipo() {
        float hipotenusa = (float) calcularHipotenusa();
        
        if(hipotenusa == getBase()) {
            System.out.println("Es un triángulo equilátero");
        } else if(getBase() == getAltura() && getBase() != hipotenusa) {
            System.out.println("Es un triángulo isósceles");
        } else {
            System.out.println("Es un triángulo escaleno");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "TrianguloRectangulo{" + '}';
    }
    
    
}
