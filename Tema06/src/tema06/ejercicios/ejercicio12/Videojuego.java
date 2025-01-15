
package tema06.ejercicios.ejercicio12;

/**
 * Clase Videojuego, que hereda de Contenido
 * 
 * @author d3stroya
 */
final public class Videojuego extends Contenido {
    // ATRIBUTOS
    private int horasEstimadas;
    private Estudio estudio;

    // CONSTRUCTORES
    public Videojuego() {
        super();
        this.horasEstimadas = 10;
        this.estudio = new Estudio();
    }
    
    public Videojuego(int horasEstimadas, String titulo) {
        super(titulo);
        this.horasEstimadas = 10;
        this.estudio = new Estudio();
    }

    public Videojuego(int horasEstimadas, Estudio estudio, String titulo, String genero) {
        super(titulo, genero);
        this.horasEstimadas = horasEstimadas;
        this.estudio = estudio;
    }

    // GETTERS Y SETTERS
    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    // MÉTODOS
    @Override
    public float valorar() {
        System.out.println("- VALORA EL CONTENIDO -\n");
        System.out.println("Indica en cada categoría una valoración del 1 (mínima valoración) al 5 (máxima valoración)");
        
        int valoracionExclusivos = pedirValoracion("Contenidos exclusivos");
        int valoracionGameplay = pedirValoracion("Gameplay");
        int valoracionInnovacion = pedirValoracion("Innovacion");
        
        float valoracion = (valoracionExclusivos + valoracionGameplay + valoracionInnovacion) / 3;
        System.out.println("Valoracion: " + valoracion);
        return valoracion;
    }  
    
    @Override
    public void entregar() {
        if(!entregado) {
            entregado = true;
            System.out.println("Has alquilado " + getTitulo() + " de " + estudio.getNombre());
        } else {
            System.out.println(getTitulo() + " no está disponible.");
        }
    }
    
    @Override
    public void devolver() {
        if(entregado) {
            entregado = false;
            System.out.println(getTitulo() + " de " + estudio.getNombre() + " devuelto correctamente");
            System.out.println("Si te ha gustado, puedes probar el último lanzamiento de " + estudio.getNombre() + ": " + estudio.getUltimoLanzamiento());
        } else {
            System.out.println("No puedes devolver este videojuego, porque no lo tienes prestado.");
        }
    }    

    // TO STRING
    @Override
    public String toString() {
        return super.toString() + "Videojuego{" + "horasEstimadas=" + horasEstimadas + ", estudio=" + estudio + '}';
    }
    
}
