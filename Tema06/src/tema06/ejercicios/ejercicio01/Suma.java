
package tema06.ejercicios.ejercicio01;

/**
 *
 * @author d3stroya
 */
public class Suma extends Calculadora {

    private int sumando;

    public Suma() {
        super();
        this.sumando = 0;
    }
    
    public Suma(int sumando, int numero) {
        super(numero);
        this.sumando = sumando;
    }

    public int getSumando() {
        return sumando;
    }

    public void setSumando(int sumando) {
        this.sumando = sumando;
    }

    @Override
    public void realizarOperacion() {
        int resultado = sumando + super.getNumero();
        System.out.println(sumando + " + " + getNumero() + " = " + resultado);
    }        

    @Override
    public String toString() {
        return super.toString() + "Suma{" + "sumando=" + sumando + '}';
    }
    
    
}
