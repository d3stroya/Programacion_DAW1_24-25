/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05.ejercicios;

/**
 *
 * @author Usuario
 */
public class Ejercicio24T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frescos f = new Frescos("18/11/2020", "Marruecos", "22/11/2020", 1);
        Refrigerados r = new Refrigerados(101, "01/01/2021", 2);
        Congelados c = new Congelados(-25, "31/21/2021", 3);
        
        f.mostrarFrescos();
        r.mostrarFrescos();
        c.mostrarCongelados();
    }
    
}
