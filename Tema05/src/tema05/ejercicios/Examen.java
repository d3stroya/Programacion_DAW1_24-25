
package tema05.ejercicios;

/**
 *
 * @author d3stroya
 */
public class Examen {
    private String nombreAsignatura;
    private int aula;
    private Fecha fecha;
    private Hora hora;

    public Examen() {
        this.nombreAsignatura = "";
        this.aula = 0;
        this.fecha = new Fecha();
        this.hora = new Hora();
    }
    public Examen(String nombreAsignatura, int aula, Fecha fecha, Hora hora) {
        this.nombreAsignatura = nombreAsignatura;
        this.aula = aula;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Examen{" + "nombreAsignatura=" + nombreAsignatura + ", aula=" + aula + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
        
}
