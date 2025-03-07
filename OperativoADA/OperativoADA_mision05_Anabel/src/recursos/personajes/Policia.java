
package recursos.personajes;

import general.Jugable;
import recursos.armas.Arma;

/**
 *
 * @author d3stroya
 */
public class Policia extends Personaje implements Jugable {
    // ATRIBUTOS
    private int numeroPlaca;
    private String departamento; // Inteligencia, Operaciones o Investigación
    private String permisoArma; // Corto o Largo alcance
    private String rango; // Agente, Inspector/a, Comisario/a

    // CONSTRUCTORES
    public Policia() {
        super();
        this.numeroPlaca = generarNumeroPlaca();
        this.departamento = "";
        this.permisoArma = "";
        this.rango = "";
    }
    
    public Policia(String nombre, Arma arma, char marca, int coordX, int coordY, 
        String departamento, String permisoArma, String rango) {
        
        super(nombre, arma, marca, coordX, coordY);
        this.numeroPlaca = generarNumeroPlaca();
        this.departamento = departamento;
        this.permisoArma = permisoArma;
        this.rango = rango;
    }

    // GETTER Y SETTER
    public int getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(int numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPermisoArma() {
        return permisoArma;
    }

    public void setPermisoArma(String permisoArma) {
        this.permisoArma = permisoArma;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    // MÉTODOS
    public static int generarNumeroPlaca() {
        return (int) Math.floor(Math.random() * 5000);
    }

    @Override
    public String toString() {
        return "\n* * * * * POLICÍA * * * * *\n" + 
                super.toString() +
                "Nº de placa: " + numeroPlaca + "\n" +
                "Rango: " + rango + "\n" +
                "Permiso de armas: " + permisoArma +  "\n" +
                "Dpto: " + departamento + "\n" + 
                "* * * * * * * * * * * * * *\n";
    }   

    @Override
    public void atacar(Personaje enemigo) {
        if(enemigo.getVida() > 0) {
            System.out.println("\n-> Policía: " + getNombre() + " se prepara para atacar...\n");

            Arma armaPoli = getArma();

            if(armaPoli == null) {
                System.out.println("   [x] Policía: " + getNombre() + " no tiene arma asignada \n");
            } else {
                if(armaPoli.obtenerNumeroBalas() < 3) {
                    System.out.println("   [!] El arma del policía: " + getNombre() + " no tiene balas suficientes.");
                    armaPoli.cargarArma();
                }
                
                armaPoli.apuntar(enemigo);
                
                int i = 0;
                while(enemigo.getVida() > 0 && i < 3) {
                    armaPoli.disparar(enemigo);
                    armaPoli.eliminarBala();
                    i++;
                }                                
            }
            
        } else {
            System.out.println("   [!] El enemigo ya está abatido.");
        }
        
    }

    @Override
    public void esquivar() {
        System.out.println("El policía esquiva...");
        //CoordenadaX antes de modificar
        int coordXOld = getCoordX();
        
        //Movimiento aleatorio entre -1 y 1 (0 se queda donde está)
        int movimiento = (int) (Math.random() * 3) - 1;
                
        if(movimiento != 0) {
            actualizarPosicion(getCoordX() + movimiento, getCoordY());
            System.out.println("Policía: " + getNombre() + " se mueve en X de " + coordXOld + " a " + getCoordX() + "\n");
        } else {
            System.out.println("Policía: " + getNombre() + " mantiene su posición en X \n");
        }      
    }

    @Override
    public void defender() {
        System.out.println("El policía se defiende...");
        int escudo = (int) (Math.random() * (15 - 5 + 1)) + 5;
        
        if((getVida() + escudo) <= 100) {
            setVida(getVida() + escudo);
        } else {
            setVida(100);
        }
        
        System.out.println("Policía: " + getNombre() + " crea escudo de: " + escudo + " | Vida: " + getVida() + "\n");
    }  
}
