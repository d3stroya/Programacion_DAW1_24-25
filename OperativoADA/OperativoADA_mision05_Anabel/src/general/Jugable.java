
package general;

import recursos.personajes.Personaje;

/**
 *
 * @author Daniel
 */
public interface Jugable {
    
    public void atacar(Personaje enemigo);
    
    public void esquivar();
    
    public void defender();

}
