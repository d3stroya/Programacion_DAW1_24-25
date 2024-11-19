
package tema05.herencia;

/**
 *
 * @author d3stroya
 */
public class Vehiculo {
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private int velocidad;
    private boolean motorEncendido;
    
    // CONSTRUCTORES
    public Vehiculo() {
        this.marca = "";
        this.modelo = "";
        this.velocidad = 0;
        this.motorEncendido = false;
    }
    
    public Vehiculo(String marca, String modelo, int velocidad, boolean motorEncendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.motorEncendido = motorEncendido;
    }
    
    // GETTERS Y SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }
    
    // MÉTODOS
    public void arrancarMotor() {
        motorEncendido = true;
        velocidad = 10;
    }
    
    public void apagarMotor() {
        motorEncendido = false;
        velocidad = 0;
    }
    
    public void acelerar(int aumento) {
        if(motorEncendido) {
            velocidad += aumento;
        }
    }
    
    public void frenar(int decremento) {
        if(motorEncendido) {
            velocidad -= decremento;
        }
    }
    
    // TO STRING
    @Override
    public String toString() {
        return "Vehiculo " + marca + " " + modelo + "\nvelocidad: " + velocidad + "\nmotorEncendido:" + motorEncendido;
    }
    
}
