
package tema06.ejercicios.ejercicio13;

/**
 * Clase Robot
 * 
 * @author Daniel
 */
public class Robot implements Operable, Revisable {

    //Atributos
    private boolean activo;
    private boolean estadoSistemas;
    private int nivelBateria;
    
    //Constructores
    public Robot() {
        this.activo = false;
        this.estadoSistemas = false;
        this.nivelBateria = 0;
    }
    
    public Robot(boolean activo, boolean estadoSistemas, int nivelBateria) {
        this.activo = activo;
        this.estadoSistemas = estadoSistemas;
        this.nivelBateria = nivelBateria;
    }
    
    //Getters / Setters
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isEstadoSistemas() {
        return estadoSistemas;
    }

    public void setEstadoSistemas(boolean estadoSistemas) {
        this.estadoSistemas = estadoSistemas;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
    
    //M�todos
    @Override
    public void activar() {
        if(!activo) {
            if(estadoSistemas && nivelBateria > 20) {
                activo = true;
                System.out.println("El robot est� activado");
            } else if (!estadoSistemas) {
                System.out.println("El robot tiene fallos en los sistemas y no se puede activar");
            } else {
                System.out.println("El nivel de bater�a es insuficiente para activar el robot");
            }
        } else {
            System.out.println("El robot ya estaba activado"); 
        }   
    }

    @Override
    public void desactivar() {
        if(activo) {
            activo = false;
            System.out.println("El robot est� desactivado");
        } else {
           System.out.println("El robot ya estaba desactivado"); 
        }
    }

    @Override
    public String realizarRevision() {
        if (!estadoSistemas) {
            return "Fallos detectados en los sistemas del robot";
        } else if (nivelBateria <= 20) {
            return "La bater�a del robot est� baja. Nivel de bater�a: " + nivelBateria + "%";
        } else {
            return "Todos los sistemas est�n operativos y el nivel de bater�a es adecuado";
        }
    }
    
    //toString
    @Override
    public String toString() {
        return "Robot{" + "activo=" + activo + ", estadoSistemas=" + estadoSistemas + ", nivelBateria=" + nivelBateria + '}';
    }
    
}
