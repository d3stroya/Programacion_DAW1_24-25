
package tema06.interfaces;

/**
 * Una interfaz es una herramienta de Java que nos permite 
 * establecer qué hay que hacer, pero no cómo.
 * 
 * Es parecida a una clase abstracta, pero llevada al extremo.
 * Todos sus métodos son abstractos.
 * Puede definir constantes.
 * 
 * Las clases que implementan la interfaz están obligadas a implementar todos sus métodos. 
 * Si no lo hacemos, nos dará error de compilación.
 * 
 * Una clase puede implementar varias interfaces.
 * 
 * Podemos declarar variables del tipo de la interfaz, pero no podemos instanciar objetos.
 * Instanciaremos objetos de las clases que implementan la interfaz. Esto nos permite 
 * usar el polimorfismo, igual que con las clases abstractas.
 * 
 * A diferencia de las clases abstractas, con las interfaces no es necesaria la herencia.
 * Podemos implementar una misma interfaz en clases que no tienen ninguna relación:
 *  - Interfaz GPS
 *      -> Movil implementa GPS
 *      -> Portátil implementa GPS
 *      -> Reloj implementa GPS
 * 
 * @author d3stroya
 */
public interface Empleable {
    public final int DIAS_ASUNTOS_PROPIOS = 5;
    
    public double aumentarSueldo(double plus);
    public double calcularSueldoBruto(double pagaExtra);    
}
