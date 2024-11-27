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
public class CuentaClave extends Cuenta {
    private int clave;
    
    public CuentaClave(){
        super();
        this.clave = 0;
    }
    
    public CuentaClave(float saldo){
        super(saldo);
        this.clave = 0;
    }

    public CuentaClave(float saldo, int clave){
        super(saldo);
        this.clave = clave;
    }
    
    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    @Override
    public void extraer(float cantidad) {
        if  (getSaldo() >= cantidad){
            setSaldo(getSaldo() - cantidad);
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    
    public void mostrar(){
        System.out.println("Saldo: "+ getSaldo());
        System.out.println("Clave: "+ this.clave);
    }
}
