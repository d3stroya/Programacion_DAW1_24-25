
package tema08;

/**
 *
 * @author d3stroya
 */
public class ArraysDeObjetos {
    public static void main(String[] args) {
        // Inicializar un vector de objetos
        Bicicleta[] stockBicis = new Bicicleta[5];
        
        
        
        /** RECORRER VECTOR DE OBJETOS **/
        // 1. For
        for(int i = 0; i < stockBicis.length; i++) {
            System.out.println("[" + i + "] " + stockBicis[i]);
        }
        
        // 2. For-each
        for(Bicicleta bici : stockBicis) {
            System.out.println(bici);            
        }        
        
        
        
        /** NULL POINTER EXCEPTION **/
        // Acceder a un atributo de un objeto
//        System.out.println(stockBicis[0].getColor());
        
        // Control de nulos
        if(stockBicis[0] != null) {
            System.out.println(stockBicis[0].getColor());
        } else {
            System.out.println("No hay bici aquí");
        }
        
        
        
        
        /** TRABAJO CON OBJETOS DEL ARRAY **/
        // Asignar un objeto a una posición del array
        stockBicis[0] = new Bicicleta("blanco", 40, new Bateria(true, 500));
        stockBicis[2] = new Bicicleta("negro", 50, new Bateria(false, 300));
        stockBicis[3] = new Bicicleta("rojo", 10, new Bateria(true, 250));
        
        // Acceder a un objeto del array a través de su índice
//        System.out.println(stockBicis[0]);
        
        // Acceder a un atributo de un objeto del array
//        System.out.println(stockBicis[0].getColor());

        // Acceder al atributo de un atributo de un objeto del vector
//        System.out.println(stockBicis[0].getBateria().isEncendido());
        
        // Asignar un valor a un atributo de un objeto del array
//        stockBicis[0].setColor("azul");
//        System.out.println(stockBicis[0]);
        
        // Incrementar el valor de un atributo de un objeto del array
//        stockBicis[0].setVelocidad(stockBicis[0].getVelocidad() + 10);
        
        // Lo mismo más fácil con variable temporal para guardar el objeto
//        Bicicleta temp = stockBicis[0];
//        temp.setVelocidad(temp.getVelocidad() + 10);
        
        // Recorrer el array y mostrar el color de las bicis controlando los nulos        
        for(int i = 0; i < stockBicis.length; i++) {
            if(stockBicis[i] != null) {
                System.out.println("[" + i + "] " + stockBicis[i].getColor());
            }
        }
       
        // Lo mismo con for-each
        for(Bicicleta bici : stockBicis) {
            if(bici != null) {
                System.out.println(bici.getColor());
            }
        }
        
        
        
        
        /** RELLENAR VECTOR **/
        // BUENA PRÁCTICA: Rellenar vector con objetos por defecto
//        System.out.println("\n- MOSTRANDO BICIS POR DEFECTO -");
//        for(int i = 0; i < stockBicis.length; i++) {
//            stockBicis[i] = new Bicicleta();
//        }
//        
//        for(Bicicleta bici : stockBicis) {
//            System.out.println(bici);
//        }
        
        // Rellenar el array con objetos con distintos valores de atributos
        String[] colores = {"Rojo", "Verde", "Azul", "Amarillo", "Negro"};
        
//        for(int i = 0; i < stockBicis.length; i++) {
////            stockBicis[i] = new Bicicleta(colores[i], 40, new Bateria());
//            stockBicis[i].setColor(colores[i]);
//        }        
                
        
        /** BÚSQUEDAS **/
        // Búsqueda de un objeto en el vector
        System.out.println("\n- BÚSQUEDA DE BICI VERDE - ");
        boolean enc = false;
        int i = 0;
        Bicicleta bici = null;
        
        while(!enc && i < stockBicis.length) {
            if(stockBicis[i] != null) {
                if(stockBicis[i].getColor().equalsIgnoreCase("verde")) {
                    bici = stockBicis[i];
                    enc = true;
                }
                
            }
            i++;
            
            if(enc) {
                System.out.println("Bici encontrada!!: " + bici);            
            }
        }
        
    }
}
