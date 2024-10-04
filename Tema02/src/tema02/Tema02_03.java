/*
    PAQUETES Y SENTENCIA IMPORT
    En Java todo son clases.
    Esas clases pueden agruparse formando paquetes.
    Los paquetes son conjuntos de clases interrelacionadas.

    Un ejemplo es el paquete java.lang, que contiene la clases
    System, que ya has usado para imprimir mensajes por pantalla
    ( System.out.println(); ).

    El paquete java.lang se importa automáticamente, pero otros no,
    así que debemos importarlos manualmente usando la sentencia import:
        * Podemos importar todo el paquete: import java.util.*
        * O sólo una clase: import java.util.ArrayList.

    Esto nos permite usar todas las clases del paquete o solamente la clase que importemos.
    El IDE nos ayuda con avisos para que importemos los paquetes que necesitamos
    y autocompleta el código.
    
    ENTRADA DE DATOS
    Podemos leer datos que introduzca el usuario por teclado
    usando la clase Scanner, perteneciente al paquete java.util,
    y sus métodos (nextInt(), nextByte(), nextChar(), nextLine(),...).
    
    Mira en el código los pasos que debes seguir (siempre son los mismos).
*/
package tema02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author d3stroya
 */
public class Tema02_03 {
    public final static float PI = 3.14159f;
    
    public static void main(String[] args) {
        // PAQUETES Y SENTENCIA IMPORT
        
        // Puedo usar la clase ArrayList porque la he importado
        ArrayList<Integer> numeros = new ArrayList();   
        
        // No puedo usar la clase List porque no la he importado
        // Puedo usar la clase List si importo el paquete java.util completo (java.util.*)
        List<Integer> listaNumeros = new ArrayList();   
        
        
        
        
        // ENTRADA DE DATOS
        float diametro, altura;
        
        // 1. Creamos el escáner que lea los datos
        Scanner entrada = new Scanner(System.in);
        
        // 2. Imprimimos información por pantalla para que el usuario sepa qué tiene que hacer
        System.out.println("¿Cuál es el diámetro de la circunferencia (en cm)?: ");
        
        // 3. Leemos la información introducida por teclado por el usuario
        diametro = entrada.nextFloat();
        
        // 4. Imprimimos el resultado
        System.out.println("La longitud de la circunferencia de diámetro " 
                + diametro + " es: " + diametro * PI + "cm");
        
        // 5. Puedo seguir pidiendo datos con el mismo scanner
        System.out.println("¿Cuál es la altura del cilindro (en cm)?");
        altura = entrada.nextFloat();
        
        System.out.println("El volumen del cilindro es " + 
                PI * (diametro/2) * (diametro/2) * altura + "cm3"
        );
    }
}
