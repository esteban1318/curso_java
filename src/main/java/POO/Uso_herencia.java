package POO;

import java.util.Scanner;

public class Uso_herencia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Herencia op = new Herencia("", "");
        int opcion;
        do{
            System.out.println("ingrese la opcion que desea realizar");
            System.out.println("1 para registrar contacto");
            System.out.println("2 para registrar contacto en agenda laboral");
            System.out.println("3 para ver la lista de contactos");
            System.out.println("4 para buscar contacto");
            System.out.println("5 para ver la disponibilidad de la agenda general");
            System.out.println("0 para salir del programa");
            opcion=teclado.nextInt();
            
            switch(opcion){
                case 1:
                    op.registrarContacto();
                    break;
                case 2:
                    op.contactoLaboral();
                    break;
                case 3:
                    op.listarContactos();
                    break;
                case 4:
                    op.buscarContacto();
                    break;
                case 5:
                    op.contatosDisponibles();
                    break;
            }
        
        }while(opcion!=0);
    }
}
