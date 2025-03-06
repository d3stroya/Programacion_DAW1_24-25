
package tema08;


/**
 *
 * @author d3stroya
 */
public class Tema08 {
    
    public static void main(String[] args) {
        System.out.println("************ VECTOR DE BICIS ************");

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
        
        
        /** MATRICES DE OBJETOS **/
        System.out.println("************ MATRIZ DE BICIS ************");
        
        // Inicializar una matriz de objetos
        System.out.println("- INICIALIZANDO MATRIZ -");
        Bicicleta[][] matrizBicis = new Bicicleta[3][3];
        
        // Rellenar matriz de bicis con array auxiliar
        System.out.println("- RELLENANDO MATRIZ -");
        
        String[] coloresBici = {"Verde", "Rojo", "Blanco"};
        
        for(i = 0; i < matrizBicis.length; i++) {
            for(int j = 0; j < matrizBicis[i].length; j++) {
                // Cada fila tiene una bici verde, otra roja y otra blanca
                // Todas las bicis de la columna 0 son verdes, las de la columna 1 
                // son rojas y las de la columna 2 son blancas
                matrizBicis[i][j] = new Bicicleta(coloresBici[i], 0, new Bateria());    
            }
        }
        
        // Asignando un valor a un atributo de un objeto del array
        matrizBicis[2][2].setBateria(new Bateria(true, 500));
        
        // Mostrar matriz con for-each
        System.out.println("- MOSTRANDO MATRIZ -");
        for(Bicicleta[] aBicis : matrizBicis) {
            for(Bicicleta bicicleta : aBicis) {
                System.out.println(bicicleta);
            }
        }
        
        // Buscar un objeto en una matriz
        System.out.println("- BUSCANDO BICI ENCENDIDA EN LA MATRIZ -");
        enc = false;
        i = 0; 
        int j = 0;
        Bicicleta biciEncendida = null;
        
        while(!enc && i < matrizBicis.length) {
           // Reseteo la j para iterar desde 0 en la siguiente vuelta
           j = 0;
           
            while(!enc && j < matrizBicis[i].length) {
                
                if(matrizBicis[i][j].getBateria().isEncendido()) {
                    biciEncendida = matrizBicis[i][j];
                    enc = true;
                } else {
                    j++;
                }
            }
            
            if(!enc) {
                i++;                                                        
            }
        }
        
        if(enc) {
            System.out.println("Bici encontrada en [" + i + "][" + j + "]: " + biciEncendida);
        }
    }

}
