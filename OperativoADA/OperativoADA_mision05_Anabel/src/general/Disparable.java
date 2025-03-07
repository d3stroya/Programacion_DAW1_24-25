
package general;

import recursos.personajes.Personaje;

/**
 *
 * @author Daniel
 */
public interface Disparable {
    
    public void apuntar(Personaje enemigo);
    
    public void cargarArma();
    
    public int obtenerNumeroBalas();
    
    public void eliminarBala();

}
