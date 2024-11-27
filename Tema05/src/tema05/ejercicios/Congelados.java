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
public class Congelados extends Producto {
    private int temperaturaRecom;

    public Congelados() {
        super();  //Llamada al constructor por defecto de la clase padre
        this.temperaturaRecom = 0;
    }
    
    public Congelados(int temperaturaRecom, String fCaducidad, int numLote) {
        super(fCaducidad, numLote);  //Llamada al constructor parametrizado de la clase padre
        this.temperaturaRecom = temperaturaRecom;
    }
    
    //Método para mostrar los atriutos de Frecos
    public void mostrarCongelados(){
        super.toString();  //Llamamos al método mostrarProducto de la clase padre
        System.out.println("Temperatura recomendada: ´"+this.temperaturaRecom);
    }    
}
