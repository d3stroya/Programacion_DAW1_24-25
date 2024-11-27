/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema05.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio22T5 {

    //Método para mostrar el menú de la tienda. Retorna la opción elegida por el usuario
    public static int menu(Producto producto1, Producto producto2, Producto producto3){
        Scanner teclado = new Scanner(System.in);
        int opc;
        System.out.println("  -- Bienvenido a mi Tienda de Mascotas --");
        System.out.println("Pulsa 1 para comprar "+producto1.getNombre()+" cuyo precio es de "+producto1.getPrecio()+" y el stock es de "+producto1.getStock()+" unidades");
        System.out.println("Pulsa 2 para comprar "+producto2.getNombre()+" cuyo precio es de "+producto2.getPrecio()+" y el stock es de "+producto2.getStock()+" unidades");
        System.out.println("Pulsa 3 para comprar "+producto3.getNombre()+" cuyo precio es de "+producto3.getPrecio()+" y el stock es de "+producto3.getStock()+" unidades");
        System.out.print("Opción: ");
        opc = teclado.nextInt();
        switch(opc){
            case 1:
                System.out.println("Ha elegido comprar "+producto1.getNombre());
                break;
            case 2:
                System.out.println("Ha elegido comprar "+producto2.getNombre());
                break;
            case 3:
                System.out.println("Ha elegido comprar "+producto3.getNombre());
                break;
            default:
                System.out.println("El ejercicio supone que el usuario NUNCA se va a confundir");
        }
        return opc;
    }
    
    //Método para pedir Unidades del producto y retornarla
    public static int pedirUnidades(){
        Scanner teclado = new Scanner(System.in);
        int unidades;
        System.out.println("¿Cuántas unidades desea?");
        unidades = teclado.nextInt();
        return unidades;
    }
    
    //Método para pedir Unidades del producto y retornarla
    public static boolean seguirComprando(){
        Scanner teclado = new Scanner(System.in);
        String resp;
        System.out.println("¿Desea comprar otro producto?");
        resp = teclado.nextLine();
        return resp.equalsIgnoreCase("SI");
      
    }
    
    public static boolean comprobarStock(Producto producto1, Producto producto2, Producto producto3, int opc, int unidades){
        boolean stockOk = true;
        switch(opc){
            case 1:
                if  (producto1.getStock() < unidades){
                    System.out.println("Lo sentimos, sólo tenemos "+producto1.getStock()+" unidades disponibles.");
                    stockOk = false;
                }
                break;
            case 2:
                if  (producto2.getStock() < unidades){
                    System.out.println("Lo sentimos, sólo tenemos "+producto2.getStock()+" unidades disponibles.");
                    stockOk = false;
                }
                break;
            case 3:
                if  (producto3.getStock() < unidades){
                    System.out.println("Lo sentimos, sólo tenemos "+producto3.getStock()+" unidades disponibles.");
                    stockOk = false;
                }
                break;
            default:
                stockOk = false;
        }
        return stockOk;
    }
    
    //
    public static float formalizarCompra(Producto producto1, Producto producto2, Producto producto3, int opc, int unidades){
        float precioCompra;
        switch(opc){
            case 1:
                precioCompra = producto1.getPrecio() * unidades;
                producto1.setStock(producto1.getStock() - unidades);
                break;
            case 2:
                precioCompra = producto2.getPrecio() * unidades;
                producto2.setStock(producto2.getStock() - unidades);
                break;
            case 3:
                precioCompra = producto3.getPrecio() * unidades;
                producto3.setStock(producto3.getStock() - unidades);
                break;
            default:
                precioCompra = 0;
        }
        System.out.println("Venta realizada con éxito.");
        return precioCompra;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir, stockOk;
        Producto producto1 = new Producto("Peces", 10, 40);
        Producto producto2 = new Producto("Tortugas", 4, 8);
        Producto producto3 = new Producto("Canarios", 5, 4);
        int opc, unid;
        float precioTotal = 0;
        do{
            opc = menu(producto1, producto2, producto3);
            unid = pedirUnidades();
            stockOk = comprobarStock(producto1, producto2, producto3, opc, unid);
            if  (stockOk){  //Si hay stock suficiente
                precioTotal = precioTotal + formalizarCompra(producto1, producto2, producto3, opc, unid);
            }
            seguir = seguirComprando();
        }while(seguir);
        System.out.println("El total de la compra asciende a "+precioTotal+" euros.");
        System.out.println("Muchas gracias. Vuelva cuando quiera.");
    }
    
}
