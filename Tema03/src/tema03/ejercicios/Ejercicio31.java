
package tema03.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Ejercicio31 {

    public static void main(String[] args) {
        int intentos = 0, limite = 0, numAleatorio;
        
        while(limite < 3) {
            // Generamos un número aleatorio
            numAleatorio = (int)(Math.random() * 100 + 1);

            // Comprobamos si numAleatorio es impar y si lo es incrementamos limite en 1 e imprimimos el valor
            if(numAleatorio % 2 != 0) {
                System.out.println(numAleatorio);
                limite++;
            }
            
            // Incrementamos intentos en 1 en cada iteración
            intentos++;
        }
        
        System.out.println("Han sido necesarios " + intentos + " intentos");
    }
    
}
