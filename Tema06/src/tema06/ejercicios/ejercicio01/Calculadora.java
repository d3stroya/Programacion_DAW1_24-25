
package tema06.ejercicios.ejercicio01;

/**
 *
 * @author d3stroya
 */
public abstract class Calculadora {
    // ATRIBUTO
    private int numero;
    
    // CONSTRUCTORES
    public Calculadora() {
        this.numero = 0;
    }
    
    public Calculadora(int numero) {
        this.numero = numero;
    }
    
    // GETTER Y SETTER
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    // MÉTODO
    public abstract void realizarOperacion();
    
    // TO STRING
    @Override
    public String toString() {
        return "Calculo{" + "numero=" + numero + '}';
    }
    
}
