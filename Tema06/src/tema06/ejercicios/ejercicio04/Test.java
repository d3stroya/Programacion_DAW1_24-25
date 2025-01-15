
package tema06.ejercicios.ejercicio04;

/**
 *
 * @author d3stroya
 */
public class Test {
    public static void main(String[] args) {
        Perro perro = new Perro("Bairon", 7, 20);
        System.out.println(perro);
        
        Lobo lobo = new Lobo("Mauri", 2, 33);
        System.out.println(lobo);
        
        Leon leon = new Leon("Simba", 8, 45);
        System.out.println(leon);
        
        Gato gato = new Gato("Blanquita", 8, 24);
        System.out.println(gato);
        

        // POLIMORFISMO
        Animal animal;
        
        System.out.println("\nINFORMACIÓN DEL PERRO");
        animal = new Perro("Bairon", 7, 20);
        animal.mostrarSonido();
        animal.mostrarHabitat();
        animal.mostrarAlimentacion();
        animal.mostrarNombreCientifico();
        
        System.out.println("\nINFORMACIÓN DEL LOBO");
        animal = new Lobo("Mauri", 2, 33);
        animal.mostrarSonido();
        animal.mostrarHabitat();
        animal.mostrarAlimentacion();
        animal.mostrarNombreCientifico();
        
        System.out.println("\nINFORMACIÓN DEL LEON");
        animal = new Leon("Simba", 8, 45);
        animal.mostrarSonido();
        animal.mostrarHabitat();
        animal.mostrarAlimentacion();
        animal.mostrarNombreCientifico();
        
        System.out.println("\nINFORMACIÓN DEL GATO");
        animal = new Gato("Blanquita", 8, 24);
        animal.mostrarSonido();
        animal.mostrarHabitat();
        animal.mostrarAlimentacion();
        animal.mostrarNombreCientifico();
        
        
    }
}
