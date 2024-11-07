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
public class Ejercicio20T4 {
    //Declaración de constantes
    final static String RESP1 = "Madrid";
    final static String RESP2 = "Colon";
    
    //Método que realiza la primera pregunta y retorna si la ha acertado o no
    public static boolean preguntaUno(){
        Scanner teclado = new Scanner(System.in);
        boolean respOk = false;
        System.out.print("¿Capital España? ");
        String r = teclado.nextLine();
        if  (r.equals(RESP1)){
            respOk = true;
        }
        return respOk;
    }
    
    //Método que realiza la segunda pregunta y retorna si la ha acertado o no
    public static boolean preguntaDos(){
        Scanner teclado = new Scanner(System.in);
        boolean respOk = false;
        System.out.print("¿Quién descubrió América? ");
        String r = teclado.nextLine();
        if  (r.equals(RESP2)){
            respOk = true;
        }
        return respOk;
    }
    
    //Muestra si la respuesta es acertada o no
    public static void mostrarRespuesta(String cadResp, boolean resp){
        if  (resp){
            System.out.println("Muy bien. Respuesta correcta");
        }
        else{
            System.out.println("No es correcto. La respuesta correcta sería "+cadResp);
        }
    }
    
    public static void main(String[] args) {
        int nota = 0;
        boolean resp1, resp2;
        //Pregunta 1
        resp1 = preguntaUno();
        mostrarRespuesta(RESP1, resp1);
        if  (resp1){  //if  (resp1 == true){
            nota += 5; //nota = nota + 5
        }

        //Pregunta 2
        resp2 = preguntaDos();
        mostrarRespuesta(RESP2, resp2);
        if  (resp2){ //if  (resp2 == true){
            nota += 5; //nota = nota + 5
        }
        
        //Mostramos la nota del examen
        System.out.println("NOTA DEL EXAMEN: "+nota);
    }
    
}
