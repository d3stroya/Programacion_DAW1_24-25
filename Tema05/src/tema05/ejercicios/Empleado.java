/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema05.ejercicios;

/**
 *
 * @author anabel
 */
public class Empleado {
    // ATRIBUTOS
    private String nombre;
    private double salario;
    private Direccion direccion;
    private int horas;
    private double tarifa;
    
    // CONSTRUCTORES

    public Empleado() {
        this.nombre = "";
        this.salario = 0.0;
        this.direccion = new Direccion();
        this.horas = 0;
        this.tarifa = 0.0;
    }

    // Constructor para el ejercicio 15
    public Empleado(String nombre, double salario, Direccion direccion) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
    }        

    // Constructor para el ejercicio 19
    public Empleado(String nombre, int horas, double tarifa) {
        this.nombre = nombre;
        this.horas = horas;
        this.tarifa = tarifa;
    }        

    public Empleado(String nombre, double salario, Direccion direccion, int horas, double tarifa) {
        this.nombre = nombre;
        this.salario = salario;
        this.direccion = direccion;
        this.horas = horas;
        this.tarifa = tarifa;
    }
    
    // GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }    

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nSalario: " + salario +
                "\nHoras: " + horas +
                "\nTarifa: " + tarifa +
                "\nDireccion: " + direccion;
    }
    
}
