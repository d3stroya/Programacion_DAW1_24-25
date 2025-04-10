
package tema11.ejercicios.ej03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author d3stroya
 */
public class Autobus {
    private String matricula;
    private HashMap<String, String> mConductores;

    public Autobus() {
        this.matricula = "";
        this.mConductores = new HashMap();
    }
    
    public Autobus(String matricula, HashMap<String, String> mConductores) {
        this.matricula = matricula;
        this.mConductores = mConductores;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public HashMap<String, String> getmConductores() {
        return mConductores;
    }

    public void setmConductores(HashMap<String, String> mConductores) {
        this.mConductores = mConductores;
    }
    
    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        return entrada.nextLine();
    }
    
    public static String pedirDni() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("DNI: ");
        return entrada.nextLine();
    }
    
    public void agregarConductores() {
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("\n-> Creando conductor/a...");
            String nombre = pedirNombre();
            String dni = pedirDni();
            mConductores.put(dni, nombre);
            
            System.out.print("¿Quieres añadir otro/a conductor/a? (s/n): ");
        } while(entrada.nextLine().equalsIgnoreCase("s"));
    }
    
    public boolean buscarConductor() {
        String dni = pedirDni();        
        boolean enc = false;
        
        Iterator<String> it = mConductores.keySet().iterator();
                
        while(it.hasNext() && !enc) {
            String clave = it.next();
                    
            if(clave.equalsIgnoreCase(dni)) {                        
                enc = true;
            }
        }
                
        return enc;
    }

    @Override
    public String toString() {
        return "Autobus{" + "matricula=" + matricula + ", mConductores=" + mConductores + '}';
    }        
}
