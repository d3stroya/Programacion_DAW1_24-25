
package recursos.armas;

import general.Disparable;
import java.util.UUID;
import recursos.personajes.Personaje;

/**
 *
 * @author d3stroya
 */
public abstract class Arma implements Disparable {
    //ATRIBUTOS
    private String id;
    private int danio;
    private int diametroBala;
    private Bala[] cargador;

    //CONSTRUCTORES
    public Arma() {
        this.id = generarId();
        this.danio = 0;
        this.diametroBala = 0;
        this.cargador = new Bala[10];
    }
    
    public Arma(int danio, int diametroBala) {
        this.id = generarId();
        this.danio = danio;
        this.diametroBala = diametroBala;
        this.cargador = new Bala[10];
    }

    //GETTERS Y SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public int getDiametroBala() {
        return diametroBala;
    }

    public void setDiametroBala(int diametroBala) {
        this.diametroBala = diametroBala;
    }

    public Bala[] getCargador() {
        return cargador;
    }

    public void setCargador(Bala[] cargador) {
        this.cargador = cargador;
    }
             
    //MÉTODOS
    public static String generarId() {
        return UUID.randomUUID().toString();
    }     
 
    @Override
    public String toString() {
        return "Arma ID:" + id + "\n" + 
               "Daño: " + danio + "\n" +
               "Diámetro bala: " + diametroBala + "\n" +
               "Tamaño del cargador: " + cargador.length + "\n" +
               "Nº balas: " + obtenerNumeroBalas();
    }
    
    public abstract void disparar(Personaje enemigo);
    
    @Override
    public void apuntar(Personaje enemigo) {
        System.out.println("\n   [!] Apuntando a enemigo...");
        if (enemigo != null) {
            System.out.println("· El arma con ID: " + id + " está apuntando al enemigo: " + enemigo.getNombre());
            System.out.println("· Coordenadas del enemigo: (" + enemigo.getCoordX() + ", " + enemigo.getCoordY() + ")");            
            System.out.println("· El daño potencial de este disparo es: " + danio);
            
            //Precisi�n del disparo en funci�n del diametroBala del arma
            if(diametroBala < 5) {
                System.out.println("· Diámetro de bala pequeño: " + diametroBala + " mm.  El disparo tiene una probabilidad de acierto baja \n");
            } else if(diametroBala < 15) {
                System.out.println("· Diámetro de bala normal: " + diametroBala + " mm. El disparo tiene una probabilidad de acierto media \n");       
            } else {
                System.out.println("· Diámetro de bala grande: " + diametroBala + " mm. El disparo será más preciso \n"); 
            }
        } else {
             System.out.println("   [x] No hay enemigo al que apuntar \n");
        }  
    }
       
    @Override
    public void cargarArma() {
        System.out.println("\n   [!] Cargando arma...");
        for(int i = 0; i < cargador.length; i++) {
            cargador[i] = new Bala(diametroBala);
        }
        System.out.println("   [v] Arma cargada");        
    }
    
    @Override
    public int obtenerNumeroBalas() {
        System.out.println("\n   [!] Obteneniendo número de balas...");
        int contador = 0;
        
        for(Bala bala : cargador) {
            if(bala != null) {
                contador++;
            }
        }
        return contador;
    }
    
    @Override
    public void eliminarBala() {
        
            System.out.println("   [!] Eliminando bala del arma...");
            boolean enc = false;
            int i = cargador.length - 1;
            int posicion = 0;

            while(!enc && i >= 0) {
                if(cargador[i] != null) {
                    enc = true;
                    posicion = i;
                } else {
                    i--;
                }
            }

            if(enc) {
                cargador[posicion] = null;
            } 
        
        
        else {
            System.out.println("   [x] ¡Ojo! Cargador vacío");
        }            
        
    }
}
