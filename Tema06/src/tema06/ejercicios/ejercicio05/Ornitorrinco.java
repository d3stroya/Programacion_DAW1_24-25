
package tema06.ejercicios.ejercicio05;

/**
 * Clase Ornitorrinco
 * 
 * @author Daniel
 */
public class Ornitorrinco extends Mamifero implements Oviparo {

    //Atributos
    private int numHuevos;
    
    //Constructores
    public Ornitorrinco() {
        super();
    }

    public Ornitorrinco(String nombre, String sexo, String color, int edad, int numHuevos) {
        super(nombre, sexo, color, edad);
        this.numHuevos = numHuevos;
    }
    
    //Getters / Setters
    public int getNumHuevos() {
        return numHuevos;
    }

    public void setNumHuevos(int numHuevos) {
        this.numHuevos = numHuevos;
    }

    //Metodos
    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mam�fero ov�paro";
    }

    @Override
    public void ponerHuevo() {
        System.out.println("Poniendo huevo...");
        numHuevos++;
    }

    @Override
    public void incubarHuevo() {
        System.out.println("Incubando huevo...");
        numHuevos--;
    }
    
    @Override
    public void mostrarNumHuevos() {
        System.out.println("El ornitorrinco tiene " + numHuevos + " huevos");
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + ". Ornitorrinco{" + "numHuevos=" + numHuevos + '}';
    } 
    
}
