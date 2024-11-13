
package tema05;

/**
 *
 * @author d3stroya
 */

// Creamos una clase usuario, que será nuestro molde para crear 
// tantos objetos usuario como necesitemos para nuestra red social
public class Usuario {
    
    // 1. ATRIBUTOS: son las características de los objetos de esta clase. 
    // Siempre se declaran como private, seguido del tipo de dato y el nombre del atributo (es una variable) y NUNCA se inicializan
    private String nombre;
    private int edad;
    private String email;
    private Publicacion publicacion;
    
    // 2. CONSTRUCTORES: permite instanciar (crear) objetos. Inicializa TODOS los atributos, 
    // ya sea por defecto o con los valores pasados por parámetro.
    
    // 2.1. Constructor por defecto: inicializa TODOS los atributos por defecto
    public Usuario() {
        nombre = "";
        edad = 0;
        email = "";
        publicacion = new Publicacion();
    }
    
    // 2.2. Constructor parametrizado: inicializa TODOS los atributos con los valores pasados por parámetro
    public Usuario(String nom, int ed, String em, Publicacion publi) {
        nombre = nom;
        edad = ed;
        email = em;
        publicacion = publi;
    }
    
    // 2.3. Otros constructores: inicializan TODOS los atributos 
    // con los valores pasados por parámtros y el resto por defecto
    public Usuario(String nom, int ed, String em) {
        nombre = nom;
        edad = ed;
        email = em;
        publicacion = new Publicacion();    // Por defecto
    }
    
    // 3. GETTER Y SETTER: devuelven y asignan, respectivamente, 
    // los valores actuales de los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int ed) {
        edad = ed;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String em) {
        email = em;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publi) {
        publicacion = publi;
    }
    
    // 4. MÉTODOS: son las funcionalidades de los objetos. Son igual que los métodos que hemos creado hasta ahora.
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    
    public void enviarSolicitudDeAmistad(Usuario otroUsuario) {
        System.out.println(nombre + " ha solicitado seguir a " + otroUsuario.getNombre());
    }
    
    public void notificarNuevaPublicacion(Publicacion publicacion, Usuario otroUsuario) {
        System.out.println(otroUsuario.getNombre() + " ha publicado contendio: " + publicacion);
    }
    
    // 5. TO STRING: permite imprimir los valores de los objetos de manera legible para mostrar los valores de los atributos.
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", email=" + email + ", publicacion=" + publicacion + '}';
    }

    

    
    
}
