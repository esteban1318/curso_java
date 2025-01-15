package POO;

import java.util.Scanner;

public class Uso_pila {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Alumno op = new Alumno("", "");
        Alumno.Metodos_Pilas uso = new Alumno.Metodos_Pilas();
        int opcion;
        do {
            System.out.println("elija la opcion que desea realizar\n");
            System.out.println("1 para agregar contenido a la pila");
            System.out.println("2 para eliminar el ultimo elemento ingresado");
            System.out.println("3 para eliminar el primer elemento ingresado");
            System.out.println("4 para ver la imformacion de la pila");
            System.out.println("5 para leer el fichero");
            System.out.println("0 para salir del programa");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    uso.agregarPila();
                    break;
                case 2:
                    uso.eliminarUltimo();
                    break;
                case 3:
                    
                    break;
                case 4:
                    uso.mostrarPila();
                    break;
                case 5:
                    uso.leerArchivoTexto();
                    break;

            }
            

        }while (opcion != 0);
    
    }
}
