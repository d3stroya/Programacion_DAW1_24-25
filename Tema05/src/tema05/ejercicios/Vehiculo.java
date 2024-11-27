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
public class Vehiculo {
    private String matricula;
    private String modelo;
    private int potenciaCV;

    public Vehiculo() {
        this.matricula = "";
        this.modelo = "";
        this.potenciaCV = 0;
    }
    
    public Vehiculo(String matricula, String modelo, int potenciaCV) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    
    public void mostrarVehiculo(){
        System.out.println("\nVEHÍCULO");
        System.out.println("Matricula: "+this.matricula);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Potencia: "+this.potenciaCV);
    }
}
