package programaDonaciones;


// import donacionesdana.*;
// import donacionesdana.Constantes;
// import donacionesdana.Entrega;
// import donacionesdana.PuntoRecogida;
// import donacionesdana.Usuario;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author d3stroya
 */
public class DonacionesDana {
    
    /**
     * Método que pide al usuario un email por teclado
     * @return el email dado por el usuario
     */
    public static String pedirEmail() {
        // TODO        
    }
      
    /**
     * Método que comprueba que el email es correcto:
     * contiene @ y termina con .com o .es
     * @param email
     * @return true si cumple los requisitos y false en caso contrario
     */
    public static boolean comprobarEmail(String email) {
        // TODO
    }
    
    /**
     * Método que pide al usuario una contraseña por teclado
     * @return la contraseña
     */
    public static String pedirContrasenia() {
        // TODO
    }

    /**
     * Método que comprueba que la contraseña contenga 8 o más caracteres
     * @param contrasenia
     * @return true si la contraseña contiene 8 o más caracteres y false en caso contrario
     */
    public static boolean comprobarLongitudContrasenia(String contrasenia) {
        // TODO
    }

    /**
     * Método que comprueba si la contraseña contiene alguna mayúscula.
     * Mayúsculas: Entre 65 y 90
     * @param contrasenia
     * @return true si la contraseña contiene alguna mayúscula y false en caso contrario
     */
    public static boolean contieneMayuscula(String contrasenia) {
        // TODO
    }

    /**
     * Método que comprueba si la contraseña contiene alguna minúscula
     * Minúsculas: Entre 97 y 122
     * @param contrasenia
     * @return true si la contraseña contiene alguna minúscula y false en caso contrario
     */
    public static boolean contieneMinuscula(String contrasenia) {
        // TODO
    }

    /**
     * Método que comprueba si la contraseña contiene algún número
     * Números: Entre 48 y 57
     * @param contrasenia
     * @return true si la contraseña contiene algún número y false en caso contrario
     */
    public static boolean contieneNumero(String contrasenia) {
        // TODO
    }

    /**
     * Método que comprueba si la contraseña contiene algún caracter especial.
     * Caracteres especiales: 32 - 47; 58 - 64; 91 - 96; > 123
     * @param contrasenia
     * @return true si contiene un caracter espeical
     */
    public static boolean contieneCaracterEspecial(String contrasenia) {
        // TODO
    }

    /**
     * Método que devuelve true si todos los requisitos se cumplen
     * @param contrasenia
     * @return true si la contraseña es correcta y false en caso contrario
     */
    public static boolean comprobarContrasenia(String contrasenia) {
        // TODO
    }

    /**
     * Método que crea un objeto usuario con el email 
     * y la contraseña dada por el usuario.
     * 
     * Tiene 5 intentos para escribir bien el email
     * y otros 5 para escribir una contraseña correcta.
     * El programa pedirá el email y la contraseña hasta que sean
     * correctos o se agoten los intentos.
     * Si el usuario supera esos 5 intentos, el programa se cierra.
     * 
     * El método pide el email al usuario y comprueba que sea correcto.
     * Si es correcto, pide la contraseña al usuario.
     * El programa comprueba que la contraseña sea válida.
     * Si lo es, crea el objeto usuario con el email y la contraseña dadas.
     * 
     * @return el usuario creado o null si se agotan los 5 intentos
     * sin crear correctamente el email o la contraseña.
     */
    public static Usuario registrarUsuario() {
        // TODO
    }
    
    /**
     * Método que pide al usuario una opción de selección en el menú.
     * 
     * @return la opción seleccionada
     */
    public static int pedirOpcion() {
        // TODO
    }
    
    /**
     * Método que pide una cantidad para donar en €.
     * 
     * @return la cantidad introducida por el usuario.
     */
    public static float pedirCantidad() {
        // TODO
    }
    
    /**
     * Método que muestra las opciones de donación monetaria
     * y pregunta al usuario cuál quiere elegir. 
     * 
     * @return devuelve la cantidad donada.
     */
    public static float donarDinero() {
        // TODO
    }
    
    /**
     * Método que pide al usuario la hora a la que
     * quiere entregar su donación.
     * 
     * @return la hora dada por el usuario.
     */
    public static int pedirHora() {
        // TODO
    }
    
    /**
     * Método que pide al usuario el producto que quiere donar.
     * 
     * @return el nombre del producto para donar
     */
    public static String pedirProducto() {
        // TODO
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
    public static PuntoRecogida pedirPuntoEntrega(int hora) {
        // TODO
    }
    
    /**
     * Método que crea un objeto de tipo Entrega.
     * Pide los datos al usuario y devuelve el objeto entrega creado.
     * 
     * @param email
     * @return el objeto de la clase Entrega creado con los datos dados por el usuario.
     */
    public static Entrega donarProducto(String email) {        
        // TODO
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
     * @param email 
     */
    public static void menuPrincipal(String email) {        
        // TO DO
    }

    /**
     * Método main con el menú del programa
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // TODO
    }

}
