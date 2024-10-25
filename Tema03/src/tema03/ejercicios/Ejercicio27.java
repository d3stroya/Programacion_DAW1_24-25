
package tema03.ejercicios;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, opc, res;
        
        //Pedimos los dos operandos
        System.out.println("    MI PRIMERA CALCULADORA ");
        System.out.print("Número 1: ");
        num1 = entrada.nextInt();
        System.out.print("Número 2: ");
        num2 = entrada.nextInt();
        
        do{
            //Mostramos el menú
            System.out.println("\n       MENÚ ");
            System.out.println("1. Sumar ");
            System.out.println("2. Restar ");
            System.out.println("3. Multiplicar ");
            System.out.println("4. Dividir ");
            System.out.println("5. Salir ");
            System.out.print("   Opción:  ");
            opc = entrada.nextInt();
            
            //Evaluamos la opción elegida
            switch(opc){
                case 1:
                    res = num1 + num2;
                    System.out.println("\n"+num1+" + "+num2+" = "+res);
                    break;
                case 2:
                    res = num1 - num2;
                    System.out.println("\n"+num1+" - "+num2+" = "+res);
                    break;
                case 3:
                    res = num1 * num2;
                    System.out.println("\n"+num1+" * "+num2+" = "+res);
                    break;
                case 4:
                    try{
                        res = num1 / num2;
                    }
                    catch(ArithmeticException e){
                        res = 0;
                    }
                    System.out.println("\n"+num1+" / "+num2+" = "+res);
                    break;
                case 5:
                    System.out.println("¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }while(opc != 5);      
    }
}
