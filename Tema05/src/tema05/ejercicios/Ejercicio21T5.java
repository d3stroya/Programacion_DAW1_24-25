/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio21T5 {

    public static float pedirCantidad(){
        Scanner teclado = new Scanner(System.in);
        float saldo;
        System.out.print("Introduzca cantidad: ");
        saldo = teclado.nextFloat();
        return saldo;
    }
    
    public static int pedirClave(){
        Scanner teclado = new Scanner(System.in);
        int clave;
        System.out.print("Introduzca clave: ");
        clave = teclado.nextInt();
        return clave;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        float saldo;
        int clave;
        boolean cCreada = false;
        CuentaClave C = new CuentaClave();
        do{
            System.out.println("1. Crear cuenta vacía");
            System.out.println("2. Crear cuenta con saldo");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Ver saldo");
            System.out.println("6. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    //Creamos la Cuenta al ppio del main
                    clave = pedirClave();
                    C.setClave(clave);
                    cCreada = true;
                    break;
                case 2:
                    clave = pedirClave();
                    C.setClave(clave);
                    saldo = pedirCantidad();
                    C.setSaldo(saldo);
                    cCreada = true;
                    break;
                case 3:
                    if  (cCreada){
                        saldo = pedirCantidad();
                        C.ingresar(saldo);
                    }
                    else{
                        System.out.println("Debe crear una cuenta");
                    }
                    break;
                case 4:
                    if  (cCreada){
                        saldo = pedirCantidad();
                        C.extraer(saldo);
                    }
                    else{
                        System.out.println("Debe crear una cuenta");
                    }
                    break;
                case 5:
                    if  (cCreada){
                        System.out.println("Saldo: "+C.getSaldo());
                    }
                    else{
                        System.out.println("Debe crear una cuenta");
                    }
                    break;
                case 6:
                    System.out.println("Gracias");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opc != 6);
    }
    
}
