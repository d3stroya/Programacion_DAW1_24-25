
package tema06.ejercicios.ejercicio01;

/**
 *
 * @author d3stroya
 */
public class Potencia extends Calculadora {
    private int exponente;

    public Potencia() {
        super();
        this.exponente = 0;
    }
    
    public Potencia(int exponente, int numero) {
        super(numero);
        this.exponente = exponente;
    }

    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    @Override
    public void realizarOperacion() {
        int resultado = (int)Math.pow(getNumero(), exponente);
        System.out.println(getNumero() + " ^ " + exponente + " = " + resultado);
    }

    @Override
    public String toString() {
        return "Potencia{" + "exponente=" + exponente + '}';
    }        
}
