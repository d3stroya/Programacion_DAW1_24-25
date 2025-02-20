
package tema08;


/**
 *
 * @author d3stroya
 */
public class Tema08 {
    
    public static void main(String[] args) {
        // Inicializar un vector de objetos
        Bicicleta[] stockBicis = new Bicicleta[10];
        
        
        /** RECORRER VECTOR DE OBJETOS **/
        // Recorrer un vector de objetos e imprimir sus objetos por pantalla
        System.out.println("\n- MOSTRAR VECTOR -");
        for(int i = 0; i < stockBicis.length; i++) {
            System.out.println("[" + i + "] " + stockBicis[i]);
        }
        
        // Recorrer un vector con for-each
        System.out.println("\n- RECORRER VECTOR CON FOR-EACH CONTROLANDO NULOS -");
        for(Bicicleta bici : stockBicis) {
            System.out.println(bici);
        }
        
        
        /** NULL POINTER EXCEPTION **/
        // OJO: NullPointerException
//        System.out.println(stockBicis[0].getColor());
        
        // ¡¡IMPORTANTE!!: Control de nulos
//        if(stockBicis[0] != null) {
//            System.out.println(stockBicis[0].getColor());
//        } else {
//            System.out.println("No hay bici en la posición 1");
//        }
        
        /** TRABAJO CON OBJETOS DEL ARRAY **/
        System.out.println("\n- TRABAJO CON OBJETOS DEL ARRAY -");
        // Asignar un objeto a una posición del array
        stockBicis[0] = new Bicicleta("rojo", 0, new Bateria(false, 500));
        stockBicis[3] = new Bicicleta("verde", 50, new Bateria(true, 600));
        stockBicis[9] = new Bicicleta("azul", 20, new Bateria(false, 400));
        
        // Acceder a un objeto del array a través de su índice
        System.out.println("Guardamos la primera bici");
        Bicicleta temp = stockBicis[0];
        
        // Acceder a un atributo de un objeto del array
        System.out.print("\nColor:");
        System.out.println(stockBicis[0].getColor());
        
        // Acceder al atributo de un atributo de un objeto del vector
        System.out.print("\nPotencia de la batería:");
        System.out.println(stockBicis[0].getBateria().getPotencia());
        
        // Asignar un valor a un atributo de un objeto del array
        System.out.println("\nCambiamos su color a negro");
        stockBicis[0].setColor("negro");
        
        // Incrementar el valor de un atributo de un objeto del array
        System.out.println("\nIncrementamos la velocidad en 10km/h");
        stockBicis[0].setVelocidad(stockBicis[0].getVelocidad() + 10);
        
        // Lo mismo más fácil
        System.out.println("\nIncrementamos la velocidad en 10km/h");
        temp = stockBicis[0];
        temp.setVelocidad(temp.getVelocidad() + 10);
        
        System.out.println("\nImprimos la bici por pantalla");
        System.out.println(stockBicis[0]);
        
        System.out.println("\nLo mismo, pero con la variable auxiliar");
        System.out.println(temp);
        
        
        // Recorrer el array controlando los nulos
        System.out.println("\n- RECORRER VECTOR CONTROLANDO NULOS -");
        for(int i = 0; i < stockBicis.length; i++) {
            if(stockBicis[i] != null) {
                System.out.println("[" + i + "] Bicicleta de color " + stockBicis[i].getColor());
            }
        }
        
        // Recorrer el vector con for-each
        System.out.println("\n- RECORRER VECTOR CON FOR-EACH CONTROLANDO NULOS -");
        for(Bicicleta bici : stockBicis) {
            if(bici != null)
                System.out.println("Bicicleta de color " + bici.getColor());
        }
        
        // BUENA PRÁCTICA: Rellenar vector con objetos por defecto
        System.out.println("\n- RELLENAR VECTOR CON OBJETOS POR DEFECTO -");
        for(int i = 0; i < stockBicis.length; i++) {
            stockBicis[i] = new Bicicleta();
            System.out.println(stockBicis[i]);
        }        
        
        // Rellenar el array con objetos con distintos valores de atributos
        System.out.println("\n- RELLENAR OBJETOS CON ARRAY AUXILIAR -");
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Negro", "Blanco", "Rosa", "Morado", "Marrón", "Magenta"};
        
        for(int i = 0; i < stockBicis.length; i++) {
            stockBicis[i] = new Bicicleta(colores[i], 0, new Bateria());
        }
        
        for(Bicicleta bici : stockBicis) {
            System.out.println(bici);
        }
        
        // Búsqueda de un objeto en el vector
        System.out.println("\n- BÚSQUEDA DE LA BICI NEGRA -");
        boolean enc = false;
        int i = 0;
        Bicicleta bici = null;
        
        while(i < stockBicis.length && !enc) {
            if(stockBicis[i].getColor().equalsIgnoreCase("Negro")) {
                bici = stockBicis[i];
                enc = true;
            } else {
                i++;
            }
        }
        
        if(bici != null) {
            System.out.println("Bici encontrada: " + bici);            
        }
    }

}
