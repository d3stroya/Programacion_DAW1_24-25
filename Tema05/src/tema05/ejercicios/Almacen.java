
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Almacen {
    // ATRIBUTOS
    private double kgPapas;
    private double kgChocos;
    
    // CONSTRUCTORES
    public Almacen() {
        this.kgPapas = 0;
        this.kgChocos = 0;
    }
    
    public Almacen(double kgPapas, double kgChocos) {
        this.kgPapas = kgPapas;
        this.kgChocos = kgChocos;
    }

    // GETTERS Y SETTERS
    public double getKgPapas() {
        return kgPapas;
    }

    public void setKgPapas(double kgPapas) {
        this.kgPapas = kgPapas;
    }

    public double getKgChocos() {
        return kgChocos;
    }

    public void setKgChocos(double kgChocos) {
        this.kgChocos = kgChocos;
    }
    
    // MÉTODOS
    public int getComensales() {
        // Calculo los kg de papas y chocos que necesita cada comensal
        double kgPapasPorComensal = 1.0 / 3;
        double kgChocosPorComensal = 0.5 / 3;               
        
        // Creo una variable para llevar la cuenta de los comensales
        int numComensales = 0;
        
        // Hago una copia de los kg de papas y chocos para poder ir restando en cada iteración la ración de 1 comensal
        double kgP = kgPapas;
        double kgC = kgChocos;
        
        // Mientras haya más kg de papas y de chocos de los que necesita 1 comensal
        // incremento en 1 los comensales que pueden comer
        while(kgP >= kgPapasPorComensal && kgC >= kgChocosPorComensal) {
            // Agrego un comensal y resto la ración de papas y chocos de 1 comensal
            numComensales++;
            kgP -= kgPapasPorComensal;
            kgC -= kgChocosPorComensal;            
        }        
        
        return numComensales;
    }
    
    public void addChocos(double kg) {
        this.kgChocos += kg;
    }
    
    public void addPapas(double kg) {
        this.kgPapas += kg;
    }
    
    public void showChocos() {
        System.out.println("Kg de chocos: " + kgChocos);
    }
    
    public void showPapas() {
        System.out.println("Kg de papas: " + kgPapas);
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "MrFajitas{" + "kgPapas=" + kgPapas + ", kgChocos=" + kgChocos + '}';
    }
    
}
