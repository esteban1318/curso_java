package POO;


import java.util.Scanner;
import java.util.ArrayList;

public class Uso_restaurante {

    public static void main(String[] args) {
        int opcion;
        boolean platoEncontrado=true;
        String orden;
        Scanner lector = new Scanner(System.in);
        GestionMenu uso = new GestionMenu("", 0, 0);
        GestionMenu.gestionPedidos operacion = new GestionMenu.gestionPedidos();

        String Rol_cliente = "C";
        String Rol_empleado = "E";
        String Rol_admin = "A";
        System.out.println("ingrese rol: ");
        System.out.println("C=cliente\n E=empleado\n A=administrador\n");
        String Rol = lector.nextLine();

        if (Rol.equals(Rol_empleado)) {
            do {
                System.out.println("1 establecer la cantidad de mesas");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        // Dentro del bloque `case 1` para realizar pedido

                        break;
                }
            } while (opcion != 0);

        }

        if (Rol.equalsIgnoreCase(Rol_cliente)) {

            do {
                System.out.println("Menu cliente");
                System.out.println("1 realizar pedido");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("ingrese nombre del plato");
                        orden = lector.nextLine();
                        for (int i = 0; i < uso.lista.size(); i++) {
                            if (uso.lista.get(i).getNombrePlato().equalsIgnoreCase(orden)) {
                                platoEncontrado = true;

                                // Crear un nuevo pedido como ArrayList<String>
                                ArrayList<String> pedido = new ArrayList<>();
                                pedido.add("Plato: " + uso.lista.get(i).getNombrePlato());
                                pedido.add("Precio: " + uso.lista.get(i).getPrecio());

                                // Agregar el pedido a la mesa
                                operacion.mesas.add(pedido);

                                System.out.println("Pedido agregado correctamente.");
                                break;
                            }
                            if (!platoEncontrado) {
                                System.out.println("El plato ingresado no está en el menú.");
                            }
                            break;
                        }

                }

            } while (opcion != 0);

        }

        if (Rol.equals(Rol_admin)) {
            do {
                System.out.println("opciones de administrador\n");
                System.out.println("1 para crear Menu");
                System.out.println("2 para ver Mneu");
                System.out.println("3 para actualizar Menu");
                System.out.println("4 para eliminar plato del Menu");
                opcion = lector.nextInt();

                switch (opcion) {
                    case 1:
                        uso.crearMenu();
                        break;
                    case 2:
                        uso.verMenu();
                        break;
                    case 3:
                        uso.actualizarMenu();
                        break;
                    case 4:
                        uso.eliminarPlato();
                        break;
                }
            } while (opcion != 0);

        }
    }
}
