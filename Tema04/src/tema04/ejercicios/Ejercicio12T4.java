/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema04.ejercicios;

import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Ejercicio12T4 {
    final static int CONTRASENIA = 1234;
    
    /*Pide la contraseña al usuario*/
    public static int pedirPassword(){
        Scanner teclado = new Scanner(System.in);
        int pass;
        System.out.print("Introduzca contraseña: ");
        pass = teclado.nextInt();
        return pass;
    }
    
    /*Comprueba que la contraseña (variable por parámetros) sea igual que la 
    contraseña predefinida (CONSTANTE)*/
    public static boolean comprobarContrasenia(int pass){
        boolean acierto;
        if  (pass == CONTRASENIA){  
            acierto = true;
        }
        else{
            acierto = false;
        }
        return acierto;
        //Otra forma: return (pass == CONTRASENIA);
    }
    
    /*Comprueba que la contraseña (variable por parámetros) sea igual que la 
    contraseña predefinida (CONSTANTE)*/
    public static void mostrarResultado(boolean acierto){
        if  (acierto){  //if  (acierto == true){
            System.out.println("¡Enhorabuena!");
        }
        else{
            System.out.println("Contraseña incorrecta");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intentos = 0;  //Contador de intentos
        boolean acierto;
        int pass;
        do{
            pass = pedirPassword();
            acierto = comprobarContrasenia(pass);
            mostrarResultado(acierto);
            intentos++;  //Incrementamos en uno los intentos
        }while((intentos < 3)&&(!acierto));
        //Si ha consumido los 3 intentos, le damos el error de acceso
        if (intentos == 3){  
            System.out.println("¡Error de acceso!");
        }
        else{
            System.out.println("El número de intentos es: "+intentos);
        }
    }
    
}
