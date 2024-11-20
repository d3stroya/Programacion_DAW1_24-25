
package tema05;

import java.time.LocalDate;

/**
 *
 * @author d3stroya
 */
class Prestamo {
    // ATRIBUTOS
    private LocalDate fechaSalida;
    private LocalDate fechaFin;

    // CONSTRUCTORES
    public Prestamo() {
        this.fechaSalida = LocalDate.now(); // Asigna la fecha actual
        this.fechaFin = fechaSalida.plusDays(15);   // Le suma 15 días a la fecha de salida
    }
    
    public Prestamo(int tiempo, LocalDate fechaSalida, LocalDate fechaFin) {
        this.fechaSalida = fechaSalida;
        this.fechaFin = fechaFin;
    }

    // GETTER Y SETTER
    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    
    // TO STRING
    @Override
    public String toString() {
        return "Prestamo: " + fechaSalida + " - " + fechaFin;
    }
    
}
