
package POO;

import java.util.Scanner;
public class Uso_Tienda{
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        
       Producto.MetodosTienda op=new Producto.MetodosTienda();
        
        System.out.println("este programa te ayuda a llevar un inventario");
        int opcion;
        do{
            
            System.out.println("MENU");
            System.out.println("**********************");
            System.out.println("1 agregar un articulo a la lista");
            System.out.println("2 eliminar algun producto de la lista");
            System.out.println("3 mostrar productos en lista");
            System.out.println("4 ver el precio total de la lista de productos");
            System.out.println("0 para salir del programa");
            System.out.println("ingresa la  opcion que desesa realizar");
            opcion=teclado.nextInt();
            
            
            switch(opcion){
                case 1:
                    op.agregarArt();
                    break;
                case 2:
                    op.eliminarProducto();
                    break;
                case 3:
                    op.mostarProductos();
                    break;
                case 4:
                    System.out.println("precio total de lista de inventario:");
                    System.out.println(op.totalPrecio());
            }
            
        }while(opcion!=0);
    }
    
}
