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
public class Ejercicio20T5 {

    public static float pedirSaldo(){
        Scanner entrada = new Scanner(System.in);
        float saldo;
        System.out.print("Introduzca saldo: ");
        saldo = entrada.nextFloat();
        return saldo;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc;
        float saldo;
        boolean cuentaCreada = false;
        Cuenta cuenta = new Cuenta();
        
        do{
            System.out.println("1. Crear cuenta vacía");
            System.out.println("2. Crear cuenta con saldo");
            System.out.println("3. Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Ver saldo");
            System.out.println("6. Salir");
            System.out.print("   Opción: ");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    //Creamos la Cuenta al ppio del main
                    cuentaCreada = true;
                    break;
                case 2:
                    saldo = pedirSaldo();
                    cuenta.setSaldo(saldo);
                    cuentaCreada = true;
                    break;
                case 3:
                    if(cuentaCreada){
                        saldo = pedirSaldo();
                        cuenta.ingresar(saldo);
                    }
                    else{
                        System.out.println("Debe crear una cuenta");
                    }
                    break;
                case 4:
                    if(cuentaCreada){
                        saldo = pedirSaldo();
                        cuenta.extraer(saldo);
                    }
                    else{
                        System.out.println("Debe crear una cuenta");
                    }
                    break;
                case 5:
                    if(cuentaCreada){
                        System.out.println("Saldo: "+cuenta.getSaldo());
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
