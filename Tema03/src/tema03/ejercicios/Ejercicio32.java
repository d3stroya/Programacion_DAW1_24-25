/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema03.ejercicios;

import java.util.Scanner;
import java.time.*;

/**
 *
 * @author admin
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        LocalDateTime fActual = LocalDateTime.now();
        int diaAct, mesAct, anioAct;
        int dia, mes, anio, anios, meses, dias;
        
        //Pedimos las fechas
        System.out.print("Día cumpleaños: ");
        dia = entrada.nextInt();
        System.out.print("Mes cumpleaños: ");
        mes = entrada.nextInt();
        System.out.print("Año cumpleaños: ");
        anio = entrada.nextInt();
        
        diaAct = fActual.getDayOfMonth();
        mesAct = fActual.getMonthValue();
        anioAct = fActual.getYear();
        
        anios = anioAct - anio;  
        meses = mesAct - mes;    
        dias = diaAct - dia;     
        
        if  (dias < 0){
            dias = dias + 30;
            meses = meses - 1;
        }
        
        if  (meses < 0){
            meses = meses + 12;
            anios = anios - 1;
        }
        
        if  (anios < 0){
            System.out.println("Error. Fecha introducida incorrecta");
        }
        else{
            System.out.println("Su edad exacta es "+anios+" años, "+meses+" meses y "+dias+" dias");
        }
    }
    
}
