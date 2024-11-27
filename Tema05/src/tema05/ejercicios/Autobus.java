/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23t5;

/**
 *
 * @author Usuario
 */
public class Autobus extends Vehiculo{
    private int numeroPlazas;
    
    public Autobus(){
        super();  //Llamamos al constructor por defecto de la clase padre
        this.numeroPlazas = 0;
    }
    
    public Autobus(String matricula, String modelo, int potenciaCV, int numeroPlazas) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    
    public void mostrarAutobus(){
        mostrarVehiculo();  //Mostramos la información de la clase padre
        System.out.println("Numero plazas: "+this.numeroPlazas);
    }
    
}
