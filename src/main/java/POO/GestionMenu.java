
package POO;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class GestionMenu extends GestionDeRestaurante {

    Scanner teclado = new Scanner(System.in);
    boolean encontrado;

    ArrayList<GestionDeRestaurante> lista = new ArrayList<>();
    GestionDeRestaurante op = new GestionDeRestaurante();

    public GestionMenu(String nombrePlato, double precioPlato, double precioTotal) {
        super(nombrePlato, precioPlato);
        this.precioTotal = precioTotal;

    }

    public void crearMenu() {
        System.out.println("ingrese el nombre que tendra el plato");
        nombrePlato = teclado.nextLine();
        System.out.println("ingrese el precio que tendra el plato");
        precioPlato = teclado.nextDouble();
        teclado.nextLine();

        GestionDeRestaurante nuevoPlato = new GestionDeRestaurante(nombrePlato, precioPlato);
        lista.add(nuevoPlato);

        System.out.println("Menu actualizado" + lista);
    }

    public void verMenu() {
        if (!lista.isEmpty()) {
            System.out.println("Carta");
            System.out.println(lista);
        } else {
            System.out.println("lista vacia");
        }

    }

    public void actualizarMenu() {
        System.out.println("Menu" + lista);

        System.out.println("ingrese el plato que desea modificar");
        String modificar = teclado.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombrePlato().equals(modificar)) {
                encontrado=true;
                System.out.println("ingrese nuevo nombre");
                String nuevoNombre = teclado.nextLine();

                lista.get(i).setNombrePlato(nuevoNombre);

                System.out.println("si deseas modificar el precio ingresa 1");
                int opcion = teclado.nextInt();
                teclado.nextLine();
                if (opcion == 1) {
                    System.out.println("ingrese nuevo precio");
                    precioPlato = teclado.nextDouble();
                    op.setPrecio(precioPlato);
                } else {
                    System.out.println("plato actualizado con exito");
                    break;
                }

            }
            if(!encontrado){
                System.out.println("no se ha encontrado en plato");
                
            
            }

        }
        

    }

    public void eliminarPlato() {
        System.out.println(lista + "\n");

        System.out.println("ingrese el nombre del plato a eliminar ");
        String eliminar = teclado.nextLine();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombrePlato().equals(eliminar)) {
                lista.remove(i);

                System.out.println("plato eliminado con exito");
                break;
            } else {
                System.out.println("nombre incorrecto, no se encuentra en el Menu");
            }
        }
    }

    public static class gestionPedidos {

        ArrayList<ArrayList<String>> mesas = new ArrayList<>();
        GestionMenu op = new GestionMenu("", 0, 0);
        Scanner teclado = new Scanner(System.in);
        int tamaño;

        public void crearMesas() {

            System.out.println("ingrese la cantida de mesas");
            tamaño = teclado.nextInt();
            teclado.nextLine();
            for (int i = 0; i < this.tamaño; i++) {
                mesas.add(new ArrayList<>());
            }
        }

        public void valorCuenta() {
            

        }

    }

}
