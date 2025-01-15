
package tema06.ejercicios.ejercicio05;

/**
 * Clase Murcielago
 * 
 * @author Daniel
 */
public class Murcielago extends Mamifero implements Volador {
    
    //Atributos
    private int alturaVuelo;
    
    //Constructores
    public Murcielago() {
        super();
    }

    public Murcielago(String nombre, String sexo, String color, int edad, int alturaVuelo) {
        super(nombre, sexo, color, edad);
        this.alturaVuelo = alturaVuelo;
    }
    
    //Getters / Setters
    public int getAlturaVuelo() {
        return alturaVuelo;
    }

    public void setAlturaVuelo(int alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }   
    
    @Override
    public String obtenerMensajeVolador() {
        return "El murci�lago es un mam�fero volador";
    }

    @Override
    public void aumentarAlturaVuelo() {
        System.out.println("Aumentando altura vuelo...");
        alturaVuelo = alturaVuelo + 5;
    }

    @Override
    public void bajarAlturaVuelo() {
        System.out.println("Bajando altura vuelo...");
        alturaVuelo = alturaVuelo - 5;
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("El murci�lago est� volando a " + alturaVuelo + " metros");
    }
    
    //toString
    @Override
    public String toString() {
        return "Murcielago{" + "alturaVuelo=" + alturaVuelo + '}';
    }
    
}
