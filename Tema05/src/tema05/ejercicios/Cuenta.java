/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05.ejercicios;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private float saldo;
    
    public Cuenta(){
        this.saldo = 0;
    }

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void ingresar(float c){
        this.saldo += c;
    }
    
    public void extraer(float c){
        this.saldo -= c;    
    }
}
