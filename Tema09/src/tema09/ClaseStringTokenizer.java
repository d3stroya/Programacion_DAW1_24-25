
package tema09;

import java.util.StringTokenizer;

/**
 * STRINGTOKENIZER permite dividir cadenas en tokens que se encuentren entre caracteres separadores.
 * 
 * @author d3stroya
 */
public class ClaseStringTokenizer {
    public static void main(String[] args) {
        // Dada una cadena con datos separados por separadores...
        String datos = "dato1#dato2#dato3#dato4";
        
        // ...podemos dividirla en tokens con StringTokenizer:
        // 1. Instanciación
        StringTokenizer datosTokens = new StringTokenizer(datos, "#");
        
        // 2. Recorrer los tokens
        String datoActual;
        
//        while(datosTokens.hasMoreTokens()) {
//            System.out.println(datosTokens.nextToken());
//        }
        
        while(datosTokens.hasMoreTokens()) {
            datoActual = datosTokens.nextToken();
            
            if(datoActual.equalsIgnoreCase("dato2")) {
                System.out.println("Este es el dato 2");
            }
        }
        
    }
}
