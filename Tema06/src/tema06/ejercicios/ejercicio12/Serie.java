
package tema06.ejercicios.ejercicio12;

/**
 * Clase Serie, que hereda de Contenido
 * 
 * @author d3stroya
 */
final public class Serie extends Contenido {
    // ATRIBUTOS
    private int numTemporadas;
    private String creador; 

    // CONSTRUCTORES
    public Serie() {
        super();
        this.numTemporadas = 3;
        this.creador = "";
    }
    
    public Serie(String creador, String titulo) {
        super(titulo);
        this.numTemporadas = 3;
        this.creador = creador;
    }
    
    public Serie(int numTemporadas, String creador, String titulo, String genero) {
        super(titulo, genero);
        this.numTemporadas = numTemporadas;
        this.creador = creador;
    }

    // GETTERS Y SETTERS
    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    // MÉTODOS
    /**
     * Método que pide al usuario una valoración en las categorías:
     *  - Guion
     *  - Interpretación
     *  - Fotografía
     * y devuelve la media de las 3.
     * @return 
     */
    @Override
    public float valorar() {
        System.out.println("- VALORA EL CONTENIDO -\n");
        System.out.println("Indica en cada categoría una valoración del 1 (mínima valoración) al 5 (máxima valoración)");
        
        int valoracionGuion = pedirValoracion("Guion");
        int valoracionInterpretacion = pedirValoracion("Interpretación");
        int valoracionFoto = pedirValoracion("Fotografía");
        
        float valoracion = (valoracionGuion + valoracionInterpretacion + valoracionFoto) / 3;
        System.out.println("Valoracion: " + valoracion);
        
        return valoracion;
    }  

    @Override
    public void entregar() {
        if(!entregado) {
            entregado = true;
            System.out.println("Has alquilado " + getTitulo() + " de " + creador);
        } else {
            System.out.println(getTitulo() + " no está disponible.");
        }
    }
    
    @Override
    public void devolver() {
        if(entregado) {
            entregado = false;
            System.out.println(getTitulo() + " de " + creador + " devuelta correctamente");
        } else {
            System.out.println("No puedes devolver esta serie, porque no la tienes prestada.");
        }
    }

    // TO STRING
    @Override
    public String toString() {
        return super.toString() + "Serie{" + "numTemporadas=" + numTemporadas + ", creador=" + creador + '}';
    }
    
    
}
