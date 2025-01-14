
package tema06.interfaces;

import java.io.Serializable;

/**
 *
 * @author d3stroya
 */
public class Empleado implements Empleable, Serializable {
    private String nombre;
    private double sueldoBruto;
    private double sueldoNeto;

    public Empleado() {
        this.nombre = "";
        this.sueldoBruto = 0;
        this.sueldoNeto = 0;
    }
    
    public Empleado(String nombre, double sueldoBruto, double sueldoNeto) {
        this.nombre = nombre;
        this.sueldoBruto = sueldoBruto;
        this.sueldoNeto = sueldoNeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    @Override
    public double aumentarSueldo(double plus) {
        this.sueldoBruto += plus;
        return sueldoBruto;
    }

    @Override
    public double calcularSueldoBruto(double pagaExtra) {
        return sueldoBruto + pagaExtra;
    }        

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldoBruto=" + sueldoBruto + ", sueldoNeto=" + sueldoNeto + '}';
    }
        
}
