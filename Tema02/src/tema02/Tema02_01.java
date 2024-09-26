/* 
    ESTRUCTURA DE UN PROGRAMA EN JAVA
        En Java todo son Clases. Cada archivo .java es una Clase.
        public class Tema02_01 es nuestra clase actual.

        Las clases tienen 2 elementos:
            - Atributos (características, como el COLOR de un coche).
            - Métodos (comportamientos, como ARRANCAR el coche).

        Existe un método especial que es el método main:
            public static void main(String[] args) {

            }
        El método main es la puerta de entrada a la aplicación. 
        Es el que ejecuta las acciones.

        La Clase que contiene el método main es la clase principal, que habitualmente
        llamaremos Main.

        Las Clases se encierran entre llaves. 
        Todo lo que está dentro de las llaves pertenece a la Clase.
        Los métodos también encierran sus funcionalidades dentro de llaves. 
        Todo lo que está dentro de las llaves
        pertenece al método.


        TIPOS DE DATOS SIMPLES
        Al programar, vamos a usar diferentes tipos de datos 
        (números enteros, decimales, caracteres, valores booleanos).
        
        En Java necesitamos indicar el tipo de dato al declarar las variables.
        ¿Por qué? Porque necesitamos indicarle al equipo cuánta memoria tiene que reservar
        para nuestra variable. Cada tipo de dato ocupa un espacio mayor o menor:
            - Números enteros:
                · byte: 8 bits
                · short: 16 bits
                · int: 32 bits
                · long: 64 bits

            - Números decimales
                · float: 32 bits
                · double: 64 bits (mayor precisión)

            - Caracteres
                · char: caracteres del código ASCII
                (¡OJO! Aún no sabemos cómo almacenar más de un caracter en una variable).

            - Booleanos:
                · boolean: true/false


        VARIABLES Y CONSTANTES
        Son cajitas en las que guardamos valores. 
        Esas cajitas tienen un nombre que lo indentifica. 
        Si imprimios por pantalla la variable, se mostrará su valor.

        Las variables pueden cambiar su valor durante la ejecución del programa 
        (por ejemplo, la temperatura actual de una habitación, que va leyendo el sensor constantemente).
        
        Las constantes no cambian su valor durante la ejecución del programa
        (por ejemplo, la temperatura límite que ponemos para que se active la calefacción).

        Al declarar las variables, debemos indicar el tipo de dato:
        int edad; char letra; boolean encontrado;...

        Podemos DECLARAR una variable:
        int edad;

        ...podemos INICIALIZAR la variable:
        edad = 23;

        ...o podemos hacer las dos cosas a la vez:
        int edad = 23;

        También podemos declarar varias variables del mismo tipo en una misma línea:
        int edad, temperatura;

        ...o declarar e inicalizar varias variables del mismo tipo en la misma línea:
        boolean encontrado = false, passValida = true;

        Las variables pueden ser de tipo local (dentro de un método) o global (pertenecen a la clase).

*/


package tema02;

/**
 *
 * @author d3stroya
 */

// 1. CLASE
public class Tema02_01 {
    // 2. ATRIBUTOS
    public static int numeroTema = 2;  // Variable decalarada e inicializada. Ámbito global
    public static float temperatura;   // Variable inicializada. Ámbito global
    final static int TEMPERATURA_LIMITE = 21;   // Constante. Ámbito global
    
    
    // 3. MÉTODOS
    // 3.1. Método sin parámetros
    public static void leerTemperatura() {
        // Sentencia que imprime un mensaje por pantalla
        System.out.println("Este método lee constantemente la temperatura captada por el sensor");
        
        // Inicializamos la variable temperatura
        temperatura = 22;   // Por ahora le daremos un valor a esta variable, aunque en el programa real lo leeríamos del sensor (sería un input)
    }
    
    // 3.2. Método con parámetros
    public static void activarCalefaccion(int temperatura) {
        // Variable de ámbito local (no accesible desde fuera de este método. Fíjate que da error en el main).
        boolean calefaccionActivada = false;
        System.out.println("Cuando la temperatura pasada por parámetro sea "
                + "inferior a TEMPERATURA_LIMITE, activaremos la calefacción");
        System.out.println("El estado de la calefacción es " + calefaccionActivada);
    }

    // 3.3. Método main (principal)
    public static void main(String[] args) {
        // Declaración e inicialización de variable. Ámbito local (no accesible desde fuera del main)
        int temperatura_maxima = 24;
        
        // Llamada a métodos de la clase
        leerTemperatura();
        activarCalefaccion(numeroTema);
        
        // Sentencias
        System.out.println("Este es nuestro programa para termostato");
        System.out.println("\nLa temperatura actual es " + temperatura);
        System.out.println("\nLa temperatura límite es " + TEMPERATURA_LIMITE);
        System.out.println("\nLa temperatura máxima es " + temperatura_maxima);
        //System.out.println("El estado de la calefacción es " + calefaccionActivada);  // Da error porque la variable calefaccionActivada es de ámbito local.
    }

}
