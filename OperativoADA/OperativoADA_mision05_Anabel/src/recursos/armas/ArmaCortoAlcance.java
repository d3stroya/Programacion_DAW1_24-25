
package recursos.armas;

import recursos.personajes.Personaje;

/**
 *
 * @author d3stroya
 */
public class ArmaCortoAlcance extends Arma {
    
    // ATRIBUTOS
    private int alcance; // 10 - 30 metros

    // CONSTRUCTORES
    public ArmaCortoAlcance() {
        super();
        this.alcance = 0;
        setDanio(15); //Por defecto, danio 15
    }

    //Al crear arma de largo alcance pasarle 15 de danio (no pedirlo al usuario)
    public ArmaCortoAlcance(int diametroBala, int alcance) {
        super(15, diametroBala);
        this.alcance = alcance;
    }

    // GETTER Y SETTER
    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    //MÉTODOS
    @Override
    public String toString() {
        return "* * * * * ARMA DE CORTO ALCANCE * * * * *\n" + 
            super.toString() + "\n" + 
            "Alcance: " + alcance + "\n" +
            "* * * * * * * * * * * * *";
    }

    @Override
    public void disparar(Personaje enemigo) {
        System.out.println("Disparando a enemigo...");
        if(enemigo.getVida() > getDanio()) {
            enemigo.setVida(enemigo.getVida() - getDanio());
            System.out.println(enemigo.getNombre() + " |  Vida restante: " + enemigo.getVida());
            System.out.println("Alcance del disparo realizado: " + alcance + " metros");     
        } else {
            enemigo.setVida(0);
            System.out.println("Enemigo: " + enemigo.getNombre() + " abatido" );
        }      
        System.out.println("");
    }
    
}