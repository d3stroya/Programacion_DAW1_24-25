
package operaciones;

import java.util.Scanner;
import recursos.armas.ArmaCortoAlcance;
import recursos.armas.ArmaLargoAlcance;
import recursos.armas.Bala;
import recursos.personajes.Cyborg;
import recursos.personajes.Policia;
import general.Constantes;
import java.util.InputMismatchException;


/**
 *
 * @author d3stroya
 */
public class Menu {

    //Variable global para almacenar el jugador
    public static Policia jugador = new Policia();
    
    /**
     * Método que pide una contraseña para entrar en el almacén
     * 
     * @return True, si la contraseña introducida es correcta, false en caso contrario
     */
    public static boolean pedirPassword() {
        Scanner entrada = new Scanner(System.in);
        int intentos = 0, pass;
        boolean passOk = false;
        
        do {          
            System.out.println("Introduzca la contraseña: ");
            pass = entrada.nextInt();
            
            if(pass != Constantes.PASSWORD) {
                System.out.println("Contraseña incorrecta. Inténtelo de nuevo.");
                intentos++;
                System.out.println("Restan " + (3 - intentos) + " intentos");
            } else {
                System.out.println("Contraseña correcta. Puerta desbloqueada.");
                passOk = true;
            }        
        } while(intentos < 3 && !passOk);
        
        return passOk;
    }
    
    /**
     * Muestra submenú de almacén
     */
    public static void mostrarSubmenuAlmacen() {     
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {     
            System.out.println("Estamos en el almacén...");
            System.out.println("Elige una opción:");
            System.out.println("1. Elegir arma");
            System.out.println("2. Crear arma");
            System.out.println("3. Mostrar armas");
            System.out.println("4. Modificar arma");
            System.out.println("5. Eliminar arma");
            System.out.println("6. Registrar arma");
            System.out.println("7. Mostrar registro de armas");
            System.out.println("8. Volver al menú principal");
            
            opcion = entrada.nextInt();

            switch(opcion) {

                case 1:
                    System.out.println("Elegir arma");           
                    break;
                case 2:
                    System.out.println("Crear arma");
                    break;
                case 3:
                    System.out.println("Mostrar armas");
                    break;
                case 4:
                    System.out.println("Modificar arma"); 
                    break;
                case 5:
                    System.out.println("Eliminar arma");  
                    break;
                case 6:
                    System.out.println("Registrar arma");
                    break;
                case 7:
                    System.out.println("Mostrar registro de armas");
                    break;
                case 8:
                    System.out.println("Volver al menú principal");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, elige una opción válida.");

            }
            
        } while(opcion != 8);
    }
    
    /**
    * Muestra submenú de comisaría
    */
    public static void mostrarSubmenuComisaria() {     
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do {     
            System.out.println("Estamos en la comisaría...");
            System.out.println("Elige una opción:");
            System.out.println("1. Elegir policía");
            System.out.println("2. Crear policía");
            System.out.println("3. Mostrar policí­as");
            System.out.println("4. Modificar policí­a");
            System.out.println("5. Eliminar policí­a");
            System.out.println("6. Ubicar personaje en el plano");
            System.out.println("7. Descifrar mensaje");
            System.out.println("8. Pasatiempos");
            System.out.println("9. Registrar policías");
            System.out.println("10. Mostrar registro de policías");
            System.out.println("11. Volver al menú principal");
            
            opcion = entrada.nextInt();

            switch(opcion) {

                case 1:
                    System.out.println("Elegir policía");                      
                    break;
                case 2:
                    System.out.println("Crear policía");
                    break;
                case 3:
                    System.out.println("Mostrar policí­as");
                    break;
                case 4:
                    System.out.println("Modificar policí­a"); 
                    break;
                case 5:
                    System.out.println("Eliminar policí­a");
                    break;
                case 6:
                    System.out.println("Ubicar personaje en el plano");
                    break;
                case 7:
                    System.out.println("Descifrar mensaje");
                    break;
                case 8:
                    System.out.println("Pasatiempos");
                    break;
                case 9:
                    System.out.println("Registrar policías");
                    break;
                case 10:
                    System.out.println("Mostrar registro de policías");
                    break;
                case 11:
                    System.out.println("Volver al menú principal");
                    break;
                default:
                    System.out.println("Opción incorrecta. Por favor, elige una opción válida.");

            }
            
        } while(opcion != 11);
    }
    
    
    /**
     * Método principal. Muestra el menú principal de opciones
     * 
     * @param args 
     */
    public static void main(String[] args) {
//        mostrarMenu();
        mision05();  
    }
    
    public static void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        boolean passwordOk = true;
                
        do {      
            System.out.println("Elige una opción:");
            System.out.println("1. Entrar al almacén");
            System.out.println("2. Entrar en la comisaría");
            System.out.println("3. Intervenir el refugio");
            System.out.println("4. Salir");
           
            try {
                opcion = entrada.nextInt();

                switch(opcion) {

                    case 1:
                        passwordOk = pedirPassword();
                        if(passwordOk) {
                            System.out.println("Entrando en el almacén...");
                            mostrarSubmenuAlmacen();
                        } else {
                            System.out.println("Saliendo...");
                        }               
                        break;
                    case 2:
                        System.out.println("Entrando en la comisaría...");
                        mostrarSubmenuComisaria();
                        break;
                    case 3:
                        System.out.println("Intervenir el refugio");
                        break;
                    case 4: 
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción incorrecta. Por favor, elige una opción válida.");
                
                }
            
            } catch (InputMismatchException e) {
                  System.out.println("Error: la opción seleccionada no puede ser una letra.");
                  entrada.next();
                  opcion=0;
            }
            
        } while(opcion != 4 && passwordOk);
    }
    
    private static void mision03() {
        ArmaCortoAlcance armaLiberacion = new ArmaCortoAlcance(16, 10);
        Cyborg nexus = new Cyborg("Kai Patel (Nexus)", armaLiberacion, 'N', 0, 0, "liderazgo", "Francia");
        Cyborg siren = new Cyborg("??? (Siren)", armaLiberacion, 'S', 0, 0, "log�stica", "Francia"); 
        
        // POLIC�A
        Policia lunaCastillo = new Policia("Luna Castillo", new ArmaLargoAlcance(20, 2000), 
                'L', 0, 0, "Operaciones", "Largo alcance", "Comisaria");
        jugador = lunaCastillo;
    }
    
    private static void mision04() {
        //GRUPO LIBERACIÓN
        ArmaCortoAlcance armaLiberacion1 = new ArmaCortoAlcance(12, 10);
        ArmaCortoAlcance armaLiberacion2 = new ArmaCortoAlcance(12, 10);
        
        Cyborg nexus = new Cyborg("Kai Patel (Nexus)", armaLiberacion1, 'N', 5, 5, "liderazgo", "Francia");
        Cyborg siren = new Cyborg("??? (Siren)", armaLiberacion2, 'S', 5, 6, "log�stica", "Francia");
        
        //POLICÍA
        Policia lunaCastillo = new Policia("Luna Castillo", new ArmaLargoAlcance(20, 2000), 
                'L', 8, 5, "Operaciones", "Largo alcance", "Comisaria");
        jugador = lunaCastillo;
        
        //SIMULACI�N     
        //Nexus ataca a Luna Castillo
        System.out.println("**********************************");
        System.out.println("***** GRUPO LIBERACI�N ATACA *****");
        System.out.println("**********************************");
        nexus.getArma().apuntar(jugador);
        for(int i=0; i<3; i++) {
            nexus.getArma().disparar(jugador);
        }
        jugador.esquivar();
        jugador.defender();
        
        //Luna Castillo ataca al Grupo Liberación
        System.out.println("*******************************");
        System.out.println("***** LUNA CASTILLO ATACA *****");
        System.out.println("*******************************");
        jugador.getArma().apuntar(nexus);
        for(int i=0; i<10; i++) {
            jugador.getArma().disparar(nexus);
        }       
        jugador.getArma().apuntar(siren);
        for(int i=0; i<3; i++) {
            jugador.getArma().disparar(siren);
        }     
        siren.esquivar();
        siren.defender();
    }
    
    private static void mision05() {
        ArmaCortoAlcance armaLiberacion1 = new ArmaCortoAlcance(12, 10);
        ArmaCortoAlcance armaLiberacion2 = new ArmaCortoAlcance(12, 10);
        
        Cyborg nexus = new Cyborg("Kai Patel (Nexus)", armaLiberacion1, 'N', 5, 5, "liderazgo", "Francia");
        Cyborg siren = new Cyborg("??? (Siren)", armaLiberacion2, 'S', 5, 6, "log�stica", "Francia");
        
        //POLICÍA
        Policia lunaCastillo = new Policia("Luna Castillo", new ArmaLargoAlcance(20, 2000), 
                'L', 8, 5, "Operaciones", "Largo alcance", "Comisaria");
        jugador = lunaCastillo;
        
        //Nexus ataca a Luna Castillo
        System.out.println("**********************************");
        System.out.println("***** GRUPO LIBERACI�N ATACA *****");
        System.out.println("**********************************");
        nexus.atacar(jugador);
        jugador.esquivar();
        jugador.defender();
        
        //Luna Castillo ataca al Grupo Liberaci�n
        System.out.println("*******************************");
        System.out.println("***** LUNA CASTILLO ATACA *****");
        System.out.println("*******************************");
        jugador.atacar(nexus);       
        jugador.atacar(nexus);       
        jugador.atacar(nexus);       
        jugador.atacar(nexus);       
        jugador.atacar(siren);       
        siren.esquivar();
        siren.defender();
    }

}
