package POO;

import java.util.Scanner;
import java.util.ArrayList;

public class Agenda {

    private Scanner teclado = new Scanner(System.in);
    ArrayList<String> agendaLaboral = new ArrayList();
    private Contacto[] contactos = new Contacto[10];
    private int contador = 0;

    public void registrarContacto() {
        if (contador < contactos.length) {
            System.out.println("Ingrese nombre del contacto");
            String Nombre = teclado.nextLine();

            System.out.println("ingrese numero");
            String Numero = teclado.nextLine();

            contactos[contador] = new Contacto(Nombre, Numero);
            contador++;

            System.out.println("contacto registrado con exito");
        } else {
            System.out.println("agenda llena, no se pueden registrar mas contactos");
        }

    }

    public void contactoLaboral() {
        System.out.println("este contacto se guardara en agenda laboral");
        System.out.println("ingrese nombre");
        String Nombre = teclado.nextLine();
        agendaLaboral.add(0, Nombre);
        System.out.println("ingrse numero de telefono");
        String telefono = teclado.nextLine();
        agendaLaboral.add(0, telefono);
        System.out.println("contacto guardado con exito");

    }

    public void listarContactos() {
        System.out.println("lista de contactos\n");
        System.out.println("General\n");
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + "." + contactos[i].toString());
        }
        if (contador == 0) {
            System.out.println("no hay contactos registrados");
        }
        teclado.nextLine();

        System.out.println("Agenda laboral");

        if (agendaLaboral.isEmpty()) {
            System.out.println("no hay contacto registrados");
        } else {
            for (int i = 0; i < agendaLaboral.size(); i++) {

                System.out.println(agendaLaboral.get(i));
            }
        }
    }

    public void buscarContacto() {
        if (contador > 0) {
            System.out.println("ingrese el nombre del contacto para ver la imformacio");
            String buscar = teclado.nextLine();
            boolean encontrado = false;

            for (int i = 0; i < contador; i++) {
                if (contactos[i].getNombre().equalsIgnoreCase(buscar)) {
                    System.out.println("imformacion del contacto " + contactos[i].toString());
                    encontrado = true;
                    break;
                } else {
                    System.out.println("imformacion incorrecta");
                }

            }
        } else {
            System.out.println("aun no hay contactos registrados");
        }

    }

    public void contatosDisponibles() {
        int disponible = contactos.length - contador;
        System.out.println("la agenda cuenta con " + disponible + " espacios disponibles");
    }
}
