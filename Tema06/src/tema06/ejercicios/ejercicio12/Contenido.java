
package tema06.ejercicios.ejercicio12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase abstracta Contenido, que implementa Entregable
 * 
 * @author d3stroya
 */
public abstract class Contenido implements Entregable {
    // ATRIBUTOS
    private String titulo;
    protected boolean entregado;
    private String genero;

    // CONSTRUCTORES
    public Contenido() {
        this.titulo = "";
        this.entregado = false;
        this.genero = "";
    }
    
    public Contenido(String titulo) {
        this.titulo = titulo;
        this.entregado = false;
        this.genero = "";
    }
    
    public Contenido(String titulo, String genero) {
        this.titulo = titulo;
        this.entregado = false;
        this.genero = genero;
    }

    // GETTERS Y SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }      

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    // MÉTODOS
    /**
     * Método que pide una valoración del 1 al 5
     * @param categoria
     * @return 
     */
    final protected int pedirValoracion(String categoria) {
        int valoracion = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.print(categoria + ": ");
        try {
            
            do {
                valoracion = entrada.nextInt();
                
                if(valoracion < 0 || valoracion > 5) {
                    System.out.println("Por favor, escribe una valoración del 1 (mínima valoración) al 5 (máxima valoración)");
                }
                                
            } while(valoracion < 0 || valoracion > 5);
            
        } catch(InputMismatchException e) {
            System.out.println("Valor incorrecto. Introduce un número entero");
        }
        
        return valoracion;
    }
    
    public abstract float valorar();

    @Override
    public void entregar() {
        if(!entregado) {
            entregado = true;
        }
    }

    @Override
    public void devolver() {
        if(entregado) {
            entregado = false;
        }
    }

    @Override
    public boolean esEntregado() {
        return entregado;
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Contenido{" + "titulo=" + titulo + ", entregado=" + entregado + ", genero=" + genero + '}';
    }    
}
