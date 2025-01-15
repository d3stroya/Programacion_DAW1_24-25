
package tema06.ejercicios.ejercicio01;

/**
 *
 * @author d3stroya
 */
public class Multiplicacion extends Calculadora {
    private int multiplicador;

    public Multiplicacion() {
        super();
        this.multiplicador = 0;
    }
    
    public Multiplicacion(int multiplicador, int numero) {
        super(numero);
        this.multiplicador = multiplicador;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    @Override
    public void realizarOperacion() {
        int resultado = multiplicador * getNumero();
        System.out.println(multiplicador + " x " + getNumero() + " = " + resultado);
    }
    
    

    @Override
    public String toString() {
        return super.toString() + "Multiplicacion{" + "multiplicador=" + multiplicador + '}';
    }            
}
