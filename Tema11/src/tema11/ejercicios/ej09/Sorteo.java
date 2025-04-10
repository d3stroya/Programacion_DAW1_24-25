
package tema11.ejercicios.ej09;

import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author d3stroya
 */
public class Sorteo {
    private LocalDate fecha;
    private int[] numeros;

    public Sorteo() {
        this.fecha = LocalDate.now();
        this.numeros = new int[4];
        generarNumeros();
        ordenarNumeros();
    }
    
    public Sorteo(LocalDate fecha) {
        this.fecha = fecha;
        this.numeros = new int[4];
        generarNumeros();
        ordenarNumeros();
    }
    
    public Sorteo(LocalDate fecha, int[] numeros) {
        this.fecha = fecha;
        this.numeros = numeros;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
    
    private int[] generarNumeros() {
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 99 + 1);
        }
        return numeros;
    }
    
    private void ordenarNumeros() {
        Arrays.sort(numeros);
//        int aux;
//        
//        for(int i = 0; i < numeros.length -1; i++) {
//            for(int j = 1; j < numeros.length; j++) {
//                if(numeros[j] < numeros[i]) {
//                    aux = numeros[i];
//                    numeros[i] = numeros[j];
//                    numeros[j] = aux;
//                }
//            }
//        }
    }

    @Override
    public String toString() {
        return "Sorteo realizado el día " + fecha + 
                "\n  Combinación ganadora: " + Arrays.toString(numeros);
    }
    
    
}
