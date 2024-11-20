
package tema05;

import java.util.Date;

/**
 *
 * @author d3stroya
 */

// Creamos nuestra clase publicación
public class Publicacion {
    // ATRIBUTOS
    private Date fecha;
    private String descripcion;
    private String urlFoto;
    
    // CONSTRUCTORES
    // Constructor por defecto
    public Publicacion() {
        fecha = new Date();
        descripcion = "";
        urlFoto = "";
    }
    
    // Constructor parametrizado
    public Publicacion(Date f, String descr, String foto) {
        fecha = f;
        descripcion = descr;
        urlFoto = foto;
    }
    
    // GETTER Y SETTER
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date f) {
        fecha = f;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String desc) {
        descripcion = desc;
    }
    
    public String getUrlFoto() {
        return urlFoto;
    }
    
    public void setUrlFoto(String foto) {
        urlFoto = foto;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Publicacion{" + "fecha=" + fecha + ", descripcion=" + descripcion + ", urlFoto=" + urlFoto + '}';
    }

    
     
}
