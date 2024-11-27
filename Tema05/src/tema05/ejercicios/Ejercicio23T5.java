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
public class Ejercicio23T5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos los objetos con los Constructores parametrizados
        Taxi taxi1 = new Taxi("T-111", "5008", 1900, 1);
        Autobus bus1 = new Autobus("B-111", "GLX", 5000, 52);
        
        //Creamos los objetos utilizando los constructores por defecto
        Taxi taxi2 = new Taxi();
        Autobus bus2 = new Autobus();
        
        //Actualizamos los atributos del objeto taxi2
        taxi2.setMatricula("T-222");
        taxi2.setModelo("Civic");
        taxi2.setPotenciaCV(2100);
        taxi2.setNumeroLicencia(2);
        
        //Actualizamos los atributos del objeto bus2
        bus2.setMatricula("B-222");
        bus2.setModelo("PLX");
        bus2.setPotenciaCV(4200);
        bus2.setNumeroPlazas(16);
        
        //Mostramos la información de cada objeto
        taxi1.mostrarTaxi();
        bus1.mostrarAutobus();
        taxi2.mostrarTaxi();
        bus2.mostrarAutobus();
    }
    
}
