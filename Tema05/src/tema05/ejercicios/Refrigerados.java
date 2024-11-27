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
public class Refrigerados extends Producto {
    private int codOrganismo;

    public Refrigerados() {
        super();  //Llamada al constructor por defecto de la clase padre
        this.codOrganismo = 0;
    }
    
    public Refrigerados(int codOrganismo, String fCaducidad, int numLote) {
        super(fCaducidad, numLote);  //Llamada al constructor parametrizado de la clase padre
        this.codOrganismo = codOrganismo;
    }

    //getters y setters
    public int getCodOrganismo() {
        return codOrganismo;
    }

    public void setCodOrganismo(int codOrganismo) {
        this.codOrganismo = codOrganismo;
    }
    
    //Método para mostrar los atriutos de Frecos
    public void mostrarFrescos(){
        super.toString();  //Llamamos al método mostrarProducto de la clase padre
        System.out.println("Código organismo: ´"+this.codOrganismo);
    }
}
