/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05.ejercicios;

/**
 *
 * @author Quique Pineda
 */
public class Producto {
    private String fCaducidad;
    private int numLote;
    
    private String nombre;
    private float precio;
    private int stock;

    //Constructor por defecto
    public Producto(){
        this.fCaducidad = "";
        this.numLote = 0;
        this.nombre = "";
        this.precio = 0;
        this.stock = 0;
    }
    
    //Constructor parametrizado
    public Producto(String fCaducidad, int numLote) {
        this.fCaducidad = fCaducidad;
        this.numLote = numLote;
    }

    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }        

    public Producto(String fCaducidad, int numLote, String nombre, float precio, int stock) {
        this.fCaducidad = fCaducidad;
        this.numLote = numLote;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }        

    //getters y setters
    public String getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(String fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // To String
    @Override
    public String toString() {
        return "Producto{" + "fCaducidad=" + fCaducidad + ", numLote=" + numLote + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }
    
}
