
package recursos.personajes;

import general.Jugable;
import recursos.armas.Arma;

/**
 *
 * @author d3stroya
 */
public class Cyborg extends Personaje implements Jugable {
    // ATRIBUTOS
    private String habilidad;
    private String paisOrigen;

    // CONSTRUCTORES
    public Cyborg() {
        super();
        this.habilidad = "";
        this.paisOrigen = "";
    }

    public Cyborg(String nombre, Arma arma, char marca, int coordX, int coordY, String habilidad, String paisOrigen) {
        super(nombre, arma, marca, coordX, coordY);
        this.habilidad = habilidad;
        this.paisOrigen = paisOrigen;
    }

    // GETTER Y SETTER
    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
      
    //MÉTODOS
    @Override
    public String toString() {
        return "* * * * * CYBORG * * * * *\n" + 
                super.toString() + "\n" + 
                "País de origen: " + paisOrigen + "\n" +
                "Habilidad: " + habilidad + "\n" +
                "* * * * * * * * * * * * *";
    }

    @Override
    public void atacar(Personaje enemigo) {
        if(enemigo.getVida() > 0) {
            System.out.println("\n-> Cyborg: " + getNombre() + " se prepara para atacar...\n");

            Arma armaCyborg = getArma();

            if(armaCyborg == null) {
                System.out.println("   [x] Cyborg: " + getNombre() + " no tiene arma asignada \n");
            } else {
                if(armaCyborg.obtenerNumeroBalas() == 0) {
                    System.out.println("   [!] El arma del cyborg: " + getNombre() + " está vacía.");
                    armaCyborg.cargarArma();
                }
                
                armaCyborg.apuntar(enemigo);                
                armaCyborg.disparar(enemigo);
                armaCyborg.eliminarBala();                
            }
            
        } else {
            System.out.println("   [!] El enemigo ya está abatido.");
        }
    }

    @Override
    public void esquivar() {
        System.out.println("El cyborg esquiva...");
        //CoordenadaY antes de modificar
        int coordYOld = getCoordY();
        
        //Movimiento aleatorio entre -1 y 1 (0 se queda donde está)
        int movimiento = (int) (Math.random() * 3) - 1;
                
        if(movimiento != 0) {
            actualizarPosicion(getCoordX(), getCoordY() + movimiento);
            System.out.println("Cyborg: " + getNombre() + " se mueve en Y de " + coordYOld + " a " + getCoordY() + "\n");
        } else {
            System.out.println("Cyborg: " + getNombre() + " mantiene su posición en Y \n");
        }      
    }

    @Override
    public void defender() {
        System.out.println("El cyborg se defiende...");
        int escudo = (int) (Math.random() * (30 - 10 + 1)) + 10;
        
        if((getVida() + escudo) <= 100) {
            setVida(getVida() + escudo);
        } else {
            setVida(100);
        }
        
        System.out.println("Cyborg: " + getNombre() + " crea escudo de: " + escudo + " | Vida: " + getVida() + "\n");
    }  
}
