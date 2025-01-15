package POO;
//necesario importar la clase para poder usar ArrayList
import java.util.ArrayList;

import java.util.Scanner;

public class Producto {

    String nombreProducto;
    double Precio;

    public Producto(String nombreProducto, double Precio) {
        this.nombreProducto = nombreProducto;
        this.Precio = Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return Precio;
    }

    @Override
    public String toString() {
        return nombreProducto + "- $" + Precio;
    }

    /*clase anidada
     */
    public static class MetodosTienda {

        private final Scanner teclado = new Scanner(System.in);
        private ArrayList<Producto> lista = new ArrayList();

        public void agregarArt() {
            System.out.println("ingrese nombre del producto");
            String nombreProducto = teclado.nextLine();
            System.out.println("ingrese precio del producto");
            double Precio = teclado.nextDouble();
            teclado.nextLine();
            Producto nuevoProduct = new Producto(nombreProducto, Precio);
            lista.add(nuevoProduct);

        }

        public void eliminarProducto() {
            System.out.println("lista de productos");
            for (Producto producto : lista) {
                System.out.println(producto);
            }
            System.out.println("ingrese nombre del producto a eliminar");
            String Eliminar = teclado.nextLine();

            boolean encontrado = false;
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).getNombreProducto().equals(Eliminar)) {
                    lista.remove(i);
                    encontrado = true;
                    break;
                }
            }
            System.out.println("lista actualizada");

            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }

        }

        public void mostarProductos() {
            System.out.println("lista de productos");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }

        public double totalPrecio() {
            double total = 0;
            for (Producto producto : lista) {
                total += producto.getPrecio();
               
                
            }
            return total;
            
        }

    }
}
