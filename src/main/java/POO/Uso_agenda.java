package POO;

import java.util.Scanner;
import POO.Agenda;
import POO.Contacto;
public class Uso_agenda {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Agenda operacion = new Agenda();
        int opcion;
        do {
            System.out.println("elija la opcion que desea realizar");
            System.out.println("*****************************");
            System.out.println("1 para registrar contacto");
            System.out.println("2 para ver la lista de contactos");
            System.out.println("3 buscar contacto");
            System.out.println("4 para ver los  espacios disponibles en la agenda");
            System.out.println("5 para salir del programa");
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    operacion.registrarContacto();
                    break;
                case 2:
                    operacion.listarContactos();
                    break;
                case 3:
                    operacion.buscarContacto();
                    break;
                case 4:
                    operacion.contatosDisponibles();

            }
        } while (opcion !=5);

    }
}
