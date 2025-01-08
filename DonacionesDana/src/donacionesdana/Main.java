package donacionesdana;

import static donacionesdana.Donacion.donarDinero;
import static donacionesdana.Donacion.donarProducto;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author d3stroya
 */
public class Main {
  
    /**
     * Método que pide al usuario una opción de selección en el menú.
     * 
     * @return la opción seleccionada
     */
    public static int pedirOpcion() {
        int opcion = 0;

        try {
            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();
        } catch(InputMismatchException e) {
            System.out.println("Entrada no válida. Introduce un número entre 1 y 5");
        }

        return opcion;
    }
    
    /**
     * Método que muestra al usuario las opciones disponibles: donar dinero, donar producto y salir.
     * Mientras el usuario no pulse 3, el menú se seguirá mostrando.
     * La opción 1 permitirá al usuario donar dinero.
     * La opción 2 permitirá al usuario donar un producto.
     * 
     * Si el usuario vuelve a seleccionar la opción 1, se suma la nueva cantidad 
     * a lo que ya ha donado previamente.
     * 
     * Si el usuario vuelve a seleccionar la opción 2, el producto donado se sobreescribe,
     * es decir, sólo se puede donar 1 producto.
     * 
     * Cuando el usuario pulsa la opción 3, el programa muestra un resumen
     * del dinero y el producto donado y después finaliza.
     * 
     * @param usuario
     */
    public static void menuPrincipal(Usuario usuario) {
        int opcion;
        float total = 0;
        Entrega entrega = null;
        Donacion donacion = null;
        
        do {
            System.out.println("\n- MENÚ PRINCIPAL -");
            System.out.println("1. Donar dinero");
            System.out.println("2. Donar producto");
            System.out.println("3. Salir");

            System.out.print("Elige una opción: ");
            opcion = pedirOpcion();

            switch(opcion) {
                case 1:
                    total += Donacion.donarDinero();
                    break;
                case 2:
                    entrega = Donacion.donarProducto(usuario.getEmail());
                    break;
                case 3:
                    System.out.println("\n¡Gracias por participar!");                    
                    donacion = new Donacion(usuario, total, entrega);
                    
                    System.out.println("Estos son los detalles de tu donación:\n");
                    donacion.mostrarDonacion();
                                            
                    break;
                default:
                    System.out.println("\nElige una opción entre 1 y 3");
            }
        } while(opcion != 3);
        
    }

    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Usuario usuario = Registro.registrarUsuario();;
        
        if(usuario != null) {
            menuPrincipal(usuario);
        }

    }

}
