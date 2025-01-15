package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrys {

    public static void main(String[] args) {

        ArrayList<String> Nombres = new ArrayList();
        Scanner teclado = new Scanner(System.in);

        Nombres.add("brayan");
        Nombres.add("Esteban");
        Nombres.add("Lizeth");

        for (int i = 0; i < Nombres.size(); i++) {
            System.out.println("Elemento en índice " + i + ": " + Nombres.get(i));
        }

        int opcion;
        do {
            System.out.println("MENU");
            System.out.println("****************************");
            System.out.println("1 para cambiar algun nombre a la lista?");
            System.out.println("2 para eliminar algun nombre de la lista por indice");
            System.out.println("3 para eliminar por elemento");
            System.out.println("7 para salir del programa");
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("ingresa el indice a modificar");
                    int index = teclado.nextInt();
                    teclado.nextLine();
                    if (index >= 0 && index < Nombres.size()) {
                        System.out.println("ingresa el nombre");
                        String elemento = teclado.nextLine();
                        Nombres.set(index, elemento);

                        System.out.println("lista actualizadad");
                        for (int i = 0; i < Nombres.size(); i++) {
                            System.out.println(Nombres.get(i));

                        }
                    } else {
                        System.out.println("posicion a modificar no existe");
                    }
                    break;
                case 2:
                    System.out.println("ingrece el indice a eliminar");
                    index = teclado.nextInt();
                    teclado.nextInt();
                    teclado.nextLine();
                    if (index <=0 && index< Nombres.size()) {
                        Nombres.remove(index);
                    }
                    for (int i = 0; i < Nombres.size(); i++) {
                        System.out.println(Nombres.get(i));
                    }

                    break;
                case 3:
                    System.out.println("ingrese elemento(texto) a eliminar");
                    String Elemento = teclado.nextLine();

                    for (int i = 0; i < Nombres.size(); i++) {
                        System.out.println(Nombres.get(i));
                        if (Nombres.get(i).equals(Elemento)) {
                            Nombres.remove(Elemento);
                            System.out.println("lista actualizada");
                            for (int j = 0; j < Nombres.size(); j++) {
                                System.out.println(Nombres.get(j));
                            }
                        } else {
                            System.out.println("el elemento " + Elemento + " no se encontro");
                        }
                    }

                    break;

            }

        } while (opcion != 7);

    }

}
