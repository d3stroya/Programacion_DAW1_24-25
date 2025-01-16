
package otros;

/**
 *
 * @author d3stroya
 */
public class ContarVocales {
    public static final String MENSAJE1 = "Hnbh. Zoylt. Lzah ahykl myltal hr yov jvtahsothkv.";
    public static final String MENSAJE2 = "Hnbh. ¿Lzaát rozavz rvz clñíjbrvz kl lzjhwl? Tljlzoahsvz hzlnbyhytvz kl altly bth cíh kl zhrokh yáwokh.";
    public static final String MENSAJE3 = "Hnbh. Rhz sbtojovtlz lzaát ihphz. ¿Hrnbolt wblkl ayhly hrnbthz sáz?";
    public static final String MENSAJE4 = "Hnbh. Tljlzoahsvz sáz lewrvzocvz. ¿Hrnbolt wblkl jvtzlnboy hrnbtvz sáz?";
    public static final String MENSAJE5 = "Hnbh. Lzav tv chrl whyh thkh, ¿kótkl j*** rv ñhz jvswyhkv, Rvnht?";
    
    public static void main(String[] args) {
        System.out.println(contarVocales(MENSAJE1));
        System.out.println(contarVocales(MENSAJE2));
        System.out.println(contarVocales(MENSAJE3));
        System.out.println(contarVocales(MENSAJE4));
        System.out.println(contarVocales(MENSAJE5));
    }
    
    public static int contarVocales(String mensaje) {
        int contador = 0;
        mensaje = mensaje.toLowerCase();
        
        for(int i = 0; i < mensaje.length() - 1; i++) {
            char letraActual = mensaje.charAt(i);
            
            switch(letraActual) {
                case 'a':
                case 'á':
                case 'e':
                case 'é':
                case 'i':
                case 'í':
                case 'o':
                case 'ó':
                case 'u':
                case 'ú':
                    contador++;
                    break;                    
            }
        }
        
        return contador;
    }
}
