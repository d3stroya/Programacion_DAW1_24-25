
package recursos.armas;

import recursos.personajes.Personaje;

/**
 *
 * @author d3stroya
 */
public class ArmaLargoAlcance extends Arma {
    
    //ATRIBUTOS
    private double velocidad; // 1.000 - 6.000km/h

    //CONSTRUCTORES
    public ArmaLargoAlcance() {
        super();
        this.velocidad = 0;
        setDanio(10); //Por defecto, danio 10
    }

    //Al crear arma de largo alcance pasarle 10 de danio (no pedirlo al usuario)
    public ArmaLargoAlcance(int diametroBala, double velocidad) {
        super(10, diametroBala);
        this.velocidad = velocidad;
    }

    //GETTERS Y SETTERS
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    } 

    //MÉTODOS
    @Override
    public String toString() {
        return "* * * * * ARMA DE LARGO ALCANCE * * * * *\n" + 
            super.toString() + "\n" + 
            "Velocidad: " + velocidad + "\n" +
            "* * * * * * * * * * * * *";
    }
    
    @Override
    public void disparar(Personaje enemigo) {
        if(enemigo.getVida() > getDanio()) {
            enemigo.setVida(enemigo.getVida() - getDanio());
            System.out.println(enemigo.getNombre() + " |  Vida restante: " + enemigo.getVida());
            System.out.println("Velocidad del disparo realizado: " + velocidad + " km/h");     
        } else {
            enemigo.setVida(0);
            System.out.println("Enemigo: " + enemigo.getNombre() + " abatido" );
        }
        System.out.println("");
    }
       
}
