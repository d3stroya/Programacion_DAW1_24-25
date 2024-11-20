package tema05.ejercicios;

public class Saludo {
    // ATRIBUTOS
    private String frase;
    
    // CONSTRUCTORES
    public Saludo() {
        frase = "";
    }
    
    public Saludo(String frase) {
        this.frase = frase;
    }
    
    // GETTER Y SETTER
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    
    // MÉTODOS
    /**
     * Método que imprime la frase del saludo las veces que el usuario indique por parámetro
     * @param veces 
     */
    public void saludar(int veces) {
        for(int i = 0; i < veces; i++) {
            System.out.println(frase);
        }
    }
    
    // TO STRING    
    @Override
    public String toString() {
        return "Saludo{" + "frase=" + frase + '}';
    }
    
}
