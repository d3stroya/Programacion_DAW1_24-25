
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio30 {
    public static int pedirDia() {
        Scanner entrada = new Scanner(System.in);
        int dia = 0;
        do {
            System.out.print("\nDía: ");
            dia = entrada.nextInt();
            
            if(dia <= 0 || dia > 31) {
                System.out.println("\n[!]Error: el valor de Día debe estar entre 1 y 31");
            }
        } while (dia <= 0 || dia > 31);
        
        return dia;
    }
    
    public static int pedirMes() {
        Scanner entrada = new Scanner(System.in);
        int mes = 0;
        do {
            System.out.print("\nMes: ");
            mes = entrada.nextInt();
            
            if(mes <= 0 || mes > 12) {
                System.out.println("\n[!]Error: el valor de Mes debe estar entre 1 y 12");
            }
        } while (mes <= 0 || mes > 12);
        
        return mes;
    }
    
    public static int pedirAnio() {
        Scanner entrada = new Scanner(System.in);
        int anio = 0;
        do {
            System.out.print("\nAño: ");
            anio = entrada.nextInt();
            
            if(anio < 1900 || anio > 2024) {
                System.out.println("\n[!]Error: el valor de Año debe estar entre 1900 y 2024");
            }
        } while (anio < 1900 || anio > 2024);
        
        return anio;
    }
    
    public static int pedirHora() {
        Scanner entrada = new Scanner(System.in);
        int hora = 0;
        do {
            System.out.print("\nHora: ");
            hora = entrada.nextInt();
            
            if(hora < 0 || hora > 23) {
                System.out.println("\n[!]Error: el valor de Hora debe estar entre 0 y 23");
            }
        } while (hora < 0 || hora > 23);
        
        return hora;
    }
    
    public static int pedirMinuto() {
        Scanner entrada = new Scanner(System.in);
        int min = 0;
        do {
            System.out.print("\nMinuto: ");
            min = entrada.nextInt();
            
            if(min < 0 || min > 59) {
                System.out.println("\n[!]Error: el valor de Minuto debe estar entre 0 y 59");
            }
        } while (min < 0 || min > 59);
        
        return min;
    }
    
    public static int pedirAula() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Aula: ");
        return entrada.nextInt();
    }
    
    public static String pedirAsignatura() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Asignatura: ");
        return entrada.nextLine();
    }

    public static void main(String[] args) {
        Examen examenProg = new Examen(
                pedirAsignatura(), 
                pedirAula(), 
                new Fecha(pedirDia(), pedirMes(), pedirAnio()),
                new Hora(pedirHora(), pedirMinuto())
        );
        
        Examen examenBBDD = new Examen(
                pedirAsignatura(), 
                pedirAula(), 
                new Fecha(pedirDia(), pedirMes(), pedirAnio()),
                new Hora(pedirHora(), pedirMinuto())
        );
        
        Examen examenLM = new Examen(
                pedirAsignatura(), 
                pedirAula(), 
                new Fecha(pedirDia(), pedirMes(), pedirAnio()),
                new Hora(pedirHora(), pedirMinuto())
        );
        
        System.out.println(examenProg);
        System.out.println(examenBBDD);
        System.out.println(examenLM);
    }
    
}
