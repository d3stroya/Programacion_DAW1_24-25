
package donacionesdana;

import static donacionesdana.Main.pedirOpcion;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Donacion {
    // ATRIBUTOS
    private Usuario usuario;
    private float dinero;
    private Entrega entrega;
    
    // CONSTRUCTORES
    public Donacion() {
        this.usuario = new Usuario();
        this.dinero = 0;
        this.entrega = new Entrega();
    }
    
    public Donacion(Usuario usuario, float dinero, Entrega entrega) {
        this.usuario = usuario;
        this.dinero = dinero;
        this.entrega = entrega;
    }
    
    // GETTER Y SETTER    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public Entrega getEntrega() {
        return entrega;
    }

    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
    
    // MÉTODOS
    /**
     * Método que pide una cantidad para donar en €.
     * 
     * @return la cantidad introducida por el usuario.
     */
    private static float pedirCantidad() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("  -> Introduce una cantidad: ");
        return entrada.nextFloat();
    }
    
    /**
     * Método que muestra las opciones de donación monetaria
     * y pregunta al usuario cuál quiere elegir. 
     * 
     * @return devuelve la cantidad donada.
     */
    public static float donarDinero() {
        int opcion = 0;
        float total = 0;
        
            try {
                System.out.println("\n- Donaciones -");
                System.out.println("1. 1€");
                System.out.println("2. 20€");
                System.out.println("3. 50€");
                System.out.println("4. Otra cantidad");
                System.out.println("5. Volver atrás");
                System.out.print("\n  -> Elige una opción: ");

                opcion = pedirOpcion();

                switch(opcion) {
                    case 1: 
                        total += 1;
                        System.out.println("\n¡Gracias! Con tu donación podemos comprar 1L de leche");
                        break;
                    case 2: 
                        total += 20;
                        System.out.println("\n¡Gracias! Con tu donación podemos alimentar a una familia por un día");
                        break;
                    case 3:
                        total += 50;
                        System.out.println("\n¡Gracias! Con tu donación podemos alimentar a una familia durante 1 semana"
                                + "y comprar 5 mantas");
                        break;
                    case 4:
                        total += pedirCantidad();
                        System.out.println("\n[√]¡Gracias! Con tu donación podemos seguir ayudando a los damnificados por la dana.");
                        break;
                    case 5: 
                        break;
                    default:
                        System.out.println("\n[x] Error. Escribe un número entre 1 y 5");
                }

            } catch(InputMismatchException e) {
                System.out.println("\n[x] Entrada no válida. Introduce un número entre 1 y 5");
            }
                
        return total;
    }
    
    /**
     * Método que pide al usuario la hora a la que
     * quiere entregar su donación.
     * 
     * @return la hora dada por el usuario.
     */
    private static int pedirHora() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("  -> Introduce una hora de entrega: ");
        return entrada.nextInt();
    }
    
    /**
     * Método que pide al usuario el producto que quiere donar.
     * 
     * @return el nombre del producto para donar
     */
    private static String pedirProducto() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("  -> ¿Qué producto quieres donar?: ");
        return entrada.nextLine();
    }
    
    /**
     * Método que muestra los puntos de recogida disponibles
     * en el horario que ha indicado el usuario.
     * Luego, le pide al usuario que seleccione uno de ellos.
     * Si no hay ninguno disponible, el programa vuelve al menú anterior.
     * 
     * @param hora
     * @return el punto de entrega seleccionado
     */
    private static PuntoRecogida pedirPuntoEntrega(int hora) {
        int opcion;
        boolean hayPuntoEntrega = false;
        PuntoRecogida puntoEntrega = null;
        
                System.out.println("\n- Puntos de entrega disponibles en tu horario - ");

                if(
                        Constantes.avPlasencia20.getHorarioApertura() <= hora &&
                        Constantes.avPlasencia20.getHorarioCierre() >= hora
                ) {
                    System.out.println("1. " + Constantes.avPlasencia20);
                    hayPuntoEntrega = true;
                } 
                
                if(
                        Constantes.avSalamanca3.getHorarioApertura() <= hora &&
                        Constantes.avSalamanca3.getHorarioCierre() >= hora
                ) {
                    System.out.println("2. " + Constantes.avSalamanca3);
                    hayPuntoEntrega = true;
                } 
                
                if(
                        Constantes.calleParra12.getHorarioApertura() <= hora &&
                        Constantes.calleParra12.getHorarioCierre() >= hora
                ) {
                    System.out.println("3. " + Constantes.calleParra12);
                    hayPuntoEntrega = true;
                } 
                
                if(!hayPuntoEntrega) {
                    System.out.println("No hay puntos de recogida disponibles a esa hora.");
                    opcion = 4;
                } else {
                    System.out.print("Elige un punto de entrega: ");
                    opcion = pedirOpcion();                    
                }                 

                switch(opcion) {
                    case 1:
                        puntoEntrega = Constantes.avPlasencia20;
                        break;
                    case 2: 
                        puntoEntrega = Constantes.avSalamanca3;
                        break;
                    case 3: 
                        puntoEntrega = Constantes.calleParra12;
                        break;
                    case 4: 
                        break;
                    default:
                        System.out.println("Elige una opción válida (1-3)");
                }
            
        
        return puntoEntrega;
    }
    
    /**
     * Método que crea un objeto de tipo Entrega.
     * Pide los datos al usuario y devuelve el objeto entrega creado.
     * 
     * @param email
     * @return el objeto de la clase Entrega creado con los datos dados por el usuario.
     */
    public static Entrega donarProducto(String email) { 
        Entrega entrega = null;       
        String producto = pedirProducto();
        int hora = pedirHora();
        PuntoRecogida puntoEntrega = pedirPuntoEntrega(hora);
        
        if(puntoEntrega != null) {
            entrega = new Entrega(producto, hora, email, puntoEntrega);
            System.out.println("\n[√] ¡Gracias! Tu donación se ha procesado correctamente.");
        }
        
        return entrega;
    }       

    // TO STRING / MOSTRAR
    public void mostrarDonacion() {
        System.out.println("Donación de " + usuario.getEmail());
        
        if(dinero > 0) {
            System.out.println("Dinero: " + dinero + "€");
        }
        
        if(entrega != null) {
            System.out.println(entrega.toString());
        }
    }    
    
}
