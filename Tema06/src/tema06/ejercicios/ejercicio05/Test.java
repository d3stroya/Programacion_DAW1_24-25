
package tema06.ejercicios.ejercicio05;

/**
 * Clase Test
 * 
 * @author Daniel
 */
public class Test {
    
    public static void main(String[] args) {
        
        System.out.println("*** ORNITORRINCO ***");
        Ornitorrinco ornitorrinco = new Ornitorrinco("Blaqui", "macho", "marr�n", 8, 6);
        System.out.println(ornitorrinco.obtenerMensajeOviparo());
        ornitorrinco.mostrarNumHuevos();
        ornitorrinco.ponerHuevo();
        ornitorrinco.mostrarNumHuevos();
        ornitorrinco.incubarHuevo();
        ornitorrinco.mostrarNumHuevos();
        
        System.out.println("\n*** MURCI�LAGO ***");
        Murcielago murcielago = new Murcielago("Pelusa", "hembra", "negro", 20, 10);
        System.out.println(murcielago.obtenerMensajeVolador());
        murcielago.mostrarAlturaVuelo();
        murcielago.aumentarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();
        murcielago.bajarAlturaVuelo();
        murcielago.mostrarAlturaVuelo();    
        
        System.out.println("\n----- POLIMORFISMO -----");
        
        System.out.println("\n*** ORNITORRINCO ***");
        Oviparo ornitorrincoOviparo = new Ornitorrinco("Blaqui", "macho", "marr�n", 8, 6);
        System.out.println(ornitorrincoOviparo.obtenerMensajeOviparo());
        ornitorrincoOviparo.mostrarNumHuevos();
        ornitorrincoOviparo.ponerHuevo();
        ornitorrincoOviparo.mostrarNumHuevos();
        ornitorrincoOviparo.incubarHuevo();
        ornitorrincoOviparo.mostrarNumHuevos();
        
        System.out.println("\n*** MURCI�LAGO ***");
        Volador murcielagoVolador = new Murcielago("Pelusa", "hembra", "negro", 20, 10);
        System.out.println(murcielagoVolador.obtenerMensajeVolador());
        murcielagoVolador.mostrarAlturaVuelo();
        murcielagoVolador.aumentarAlturaVuelo();
        murcielagoVolador.mostrarAlturaVuelo();
        murcielagoVolador.bajarAlturaVuelo();
        murcielagoVolador.mostrarAlturaVuelo();  
               
    }

}
