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
public class Taxi extends Vehiculo{
    private int numeroLicencia;
    
    public Taxi(){
        super();  //Llamamos al constructor por defecto de la clase padre
        this.numeroLicencia = 0;
    }

    public Taxi(String matricula, String modelo, int potenciaCV, int numeroLicencia) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    
    public void mostrarTaxi(){
        mostrarVehiculo();  //Mostramos la información de la clase padre
        System.out.println("Numero licencia: "+this.numeroLicencia);
    }
}
