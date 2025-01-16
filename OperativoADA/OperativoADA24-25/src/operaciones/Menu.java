
package operaciones;

import general.Constantes;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Menu {
    
    /**
     * Método que pide al usuario una constraseña y comprueba si es válida.
     * 
     * @return true si la contraseña es válida y false en caso contrario
     */
    public static boolean pedirPassword() {
        Scanner entrada = new Scanner(System.in);
        int intentos = 3;
        boolean passOk = false;
        
        try {
            
            do {
                System.out.print("CONTRASEÑA: ");
                if(entrada.nextLine().equalsIgnoreCase(Constantes.PASSWORD)) {
                    passOk = true;
                    System.out.println("Contraseña correcta. Puerta desbloqueada.");
                } else {
                    intentos--;
                    System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
                    System.out.println("Restan " + intentos + " intentos");
                }
            } while(intentos > 0 && !passOk);
            
        } catch(InputMismatchException e) {
            System.out.println("Entrada no válida");
        }
        
        return passOk;
    }
    
    /**
     * Método que muestra el submenú del almacén
     */
    public static void mostrarSubmenuAlmacen() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            try {
                System.out.println("- SUBMENÚ ALMACÉN -");
                System.out.println("1. Elegir arma");
                System.out.println("2. Crear arma");
                System.out.println("3. Mostrar armas");           
                System.out.println("4. Modificar arma");           
                System.out.println("5. Eliminar arma");           
                System.out.println("6. Registrar arma");           
                System.out.println("7. Mostrar registro de armas");           
                System.out.println("8. Volver al menú principal");

                System.out.print("Elige una opción: ");
                opcion = entrada.nextInt();

                switch(opcion) {
                    case 1 -> System.out.println("Elegir arma");
                    case 2 -> System.out.println("Crear arma");
                    case 3 -> System.out.println("Mostrar armas");
                    case 4 -> System.out.println("Modificar arma");
                    case 5 -> System.out.println("Eliminar arma");
                    case 6 -> System.out.println("Registrar arma");
                    case 7 -> System.out.println("Mostrar registro de armas");
                    case 8 -> System.out.println("Volver al menú principal");
                    default -> System.out.println("Opción inválida");
                }
            } catch(InputMismatchException e) {
                System.out.println("ERROR: Escribe un número del 1 al 11");
                entrada.next();
            }
        } while(opcion != 8);
    }
    
    /**
     * Método que muestra el submenú de la comisaría
     */
    public static void mostrarSubmenuComisaria() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            try {
                System.out.println("- SUBMENÚ COMISARÍA -");
                System.out.println("1. Elegir policía");
                System.out.println("2. Crear policía");
                System.out.println("3. Mostrar policías");           
                System.out.println("4. Modificar policía");           
                System.out.println("5. Eliminar policía");           
                System.out.println("6. Ubicar policía en el plano");           
                System.out.println("7. Descifrar mensaje");      
                System.out.println("8. Pasatiempos");      
                System.out.println("9. Registrar policía");      
                System.out.println("10. Mostrar registro de policías");      
                System.out.println("11. Volver al menú principal");

                System.out.print("Elige una opción: ");
                opcion = entrada.nextInt();

                switch(opcion) {
                    case 1 -> System.out.println("Elegir policía");
                    case 2 -> System.out.println("Crear policía");
                    case 3 -> System.out.println("Mostrar policías");
                    case 4 -> System.out.println("Modificar policía");
                    case 5 -> System.out.println("Eliminar policía");
                    case 6 -> System.out.println("Ubicar policía en el plano");
                    case 7 -> System.out.println("Descifrar mensaje");
                    case 8 -> System.out.println("Pasatiempos");
                    case 9 -> System.out.println("Registrar policía");
                    case 10 -> System.out.println("Mostrar registro de policías");
                    case 11 -> System.out.println("Volver al menú principal");
                    default -> System.out.println("Opción inválida");
                }
            } catch(InputMismatchException e) {
                System.out.println("ERROR: Escribe un número del 1 al 11");
                entrada.next();
            }
        } while(opcion != 11);
    }

    /**
     * Método main con el menú del programa
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
                
        do {
            try {
                System.out.println("- MENÚ PRINCIPAL -");
                System.out.println("1. Entrar al almacén");
                System.out.println("2. Entrar a la comisaría");
                System.out.println("3. Intervenir en el refugio");           
                System.out.println("4. Salir");

                System.out.print("Elige una opción: ");
                opcion = entrada.nextInt();

                switch(opcion) {
                    case 1:
                        if(pedirPassword()) {
                            mostrarSubmenuAlmacen();
                        } else {
                            opcion = 4;
                        }
                        break;
                    case 2:
                        mostrarSubmenuComisaria();
                        break;
                    case 3:
                        System.out.println("Intervenir en el refugio");
                        break;
                    case 4:
                        System.out.println("Cerrando programa...");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }
            } catch(InputMismatchException e) {
                System.out.println("ERROR: Escribe un número del 1 al 4");
                entrada.next();
            }
        } while(opcion != 4);
    }

}
