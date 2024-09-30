
package tema02.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int aux;
        
        // Valores iniciales
        System.out.println("La variable num1 contiene el valor " + num1 + 
                " y la variable num2 contiene el valor " + num2);
        
        // Guardamos el valor de num1 en aux para no perderlo
        aux = num1; 
        
        // Sobreescribismos num1 guardando en ella el valor de num2
        // (no perdemos el 1 porque lo tenemos guardado en aux).
        num1 = num2;
        
        // Guardamos en num2 el 1 que tenemos guardado en aux y que originalmente tenía num1
        num2 = aux;
        
        // Valores finales
        System.out.println("La variable num1 contiene el valor " + num1 + 
                " y la variable num2 contiene el valor " + num2);
        
        /*
            Si te ayuda, puedes visualizarlo gráficamente así:
        
            aux = num1;
                   /
                  /
                 /
                /
               /
              v
            num1 = num2;
                   /
                  /
                 /
                /
               / 
              v
            num2 = aux;

        */
    }
}
