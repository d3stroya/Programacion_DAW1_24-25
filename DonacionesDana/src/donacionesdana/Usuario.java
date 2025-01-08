
 package donacionesdana;

/**
 *
 * @author d3stroya
 */
public class Usuario {
    private String email;
    private String contrasenia;

    public Usuario() {
        this.email = "";
        this.contrasenia = "";
    }
    public Usuario(String email, String contrasenia) {
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Usuario: " + email + "\nContraseña: " + contrasenia;
    }
        
}
