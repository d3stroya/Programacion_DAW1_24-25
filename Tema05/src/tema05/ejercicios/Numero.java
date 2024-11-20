/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05.ejercicios;

/**
 *
 * @author admin
 */
public class Numero {
    // ATRIBUTOS
    private int valor;
    
    // CONSTRUCTORES
    //Constructor por defecto
    Numero(){
        this.valor = 0;
    }

    //Constructor parametrizado
    Numero(int valor){
        this.valor = valor;
    }
    
    // GETTERS Y SETTERS
    public void setValor(int valor){
        this.valor = valor;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    // MÉTODOS
    /**
     * Método que determina si un número es mayor que otro
     * @param n1
     * @param n2
     * @return true si n1 > n2 y false en caso contrario
     */
    public static boolean esMayor(int n1, int n2){
        boolean mayor;
        if  (n1 > n2){
            mayor = true;
        }
        else{
            mayor = false;
        }
        return mayor;
    }
    
    /**
     * Método que imiprime la tabla de multiplicar del valor del número
     */
    public void imprimirTablaMultiplicar() {
        for(int i = 0; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + valor * i);
        }
    }

    // TO STRING
    @Override
    public String toString() {
        return "Numero{" + "valor=" + valor + '}';
    }
    
    
}
