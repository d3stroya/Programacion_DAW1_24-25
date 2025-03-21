
package tema10.ejercicios.ej9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author d3stroya
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        mostrarMenu();
    }
    
    public static ArrayList<Dia> crearLista() {
        ArrayList<Dia> dias = new ArrayList<>();
        for(int i = 0; i < 31; i++) {
            dias.add(new Dia());
        }
        return dias;
    }
    
    public static void rellenarTemperaturas(ArrayList<Dia> dias) {
        for(Dia dia : dias) {
            dia.setTemperatura((int) (Math.random() * 15 - 5));
        }
    }
    
    public static void rellenarNombreDia(ArrayList<Dia> dias) {
        String[] nombresDias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int indice = (int)(Math.random() * nombresDias.length);

        for(Dia dia : dias) {
            dia.setNombreDia(nombresDias[indice % 7]);
            indice++;
        }        
    }
    
    public static void mostrarTemperaturas(ArrayList<Dia> dias) {
        dias.forEach(System.out::println);
    }
    
    public static void mostrarTemperaturaMedia(ArrayList<Dia> dias) {
        int suma = 0;
        for(Dia dia : dias) {
            suma += dia.getTemperatura();
        }
        System.out.println("Temperautra media: " + suma / dias.size() + "ºC");
    }
    
    public static void mostrarDiasMasCalurosos(ArrayList<Dia> dias) {
        Dia diaMasCaluroso = dias.stream().max((a, b) -> a.getTemperatura() - b.getTemperatura()).get();
        int numeroDia = 1;
        
        for(Dia dia : dias) {
            if(dia.getTemperatura() == diaMasCaluroso.getTemperatura()) {
                System.out.println("El " + dia.getNombreDia() + " " + numeroDia + " con " + dia.getTemperatura() + "ºC");
            }
            numeroDia++;
        }
    }
    
    public static void mostrarMenu() {
        ArrayList<Dia> dias = crearLista();
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("- MENU -");
            System.out.println("1. Rellenar temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Visualizar temperatura media");
            System.out.println("4. Días más calurosos");
            System.out.println("5. Salir");

            opcion = entrada.nextInt();

            switch(opcion) {
                case 1 -> {
                    rellenarNombreDia(dias);
                    rellenarTemperaturas(dias);
                }
                case 2 -> mostrarTemperaturas(dias);
                case 3 -> mostrarTemperaturaMedia(dias);
                case 4 -> mostrarDiasMasCalurosos(dias);
                case 5 -> {
                }
                default -> System.out.println("Elige una opción correcta.");
            }
            
        } while(opcion != 5);
        
    }
}

