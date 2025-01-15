
package tema06.ejercicios.ejercicio07;

/**
 * Clase Test
 * 
 * @author d3stroya
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.encender();
        System.out.println(radio);
        radio.subirVolumen();
        radio.subirVolumen();
        radio.subirVolumen();
        System.out.println(radio.getVolumen());
        radio.cambiarCanal(90.3f);
        radio.bajarVolumen();
        System.out.println(radio.getVolumen());
        radio.apagar();
        System.out.println(radio);
        
        System.out.println("");
        
        Televisor tv = new Televisor();
        tv.encender();
        System.out.println(tv);
        tv.subirVolumen();
        tv.subirVolumen();
        tv.subirVolumen();
        System.out.println(tv.getVolumen());
        tv.cambiarCanal(7);
        tv.bajarVolumen();
        System.out.println(tv.getVolumen());
        tv.apagar();
        System.out.println(tv);
    }
    
}
