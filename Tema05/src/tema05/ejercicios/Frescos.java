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
public class Frescos extends Producto {
    private String fEnvasado;
    private String paisOrigen;
    
    //Constructor por defecto
    public Frescos(){
        super();  //Llamada al constructor por defecto de la clase padre
        this.fEnvasado = "";
        this.paisOrigen = "España";
    }
    
    //Constructor parametrizado
    public Frescos(String fEnvasado, String paisOrigen, String fCaducidad, int numLote) {
        super(fCaducidad, numLote);  //Llamada al constructor parametrizado de la clase padre
        this.fEnvasado = fEnvasado;
        this.paisOrigen = paisOrigen;
    }

    //Getters y setters
    public String getfEnvasado() {
        return fEnvasado;
    }

    public void setfEnvasado(String fEnvasado) {
        this.fEnvasado = fEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    //Método para mostrar los atriutos de Frecos
    public void mostrarFrescos(){
        super.toString();  //Llamamos al método mostrarProducto de la clase padre
        System.out.println("Fecha envasado: ´"+this.fEnvasado);
        System.out.println("Pais Origen: ´"+this.paisOrigen);
    }
}
