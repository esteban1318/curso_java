package POO;

import java.util.Scanner;

public class Horario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String lunes;
        String martes;
        String miercoles;
        String jueves;
        String viernes;
        int opcion;
        do {
            System.out.println("ingrse horario del dia lunes");
            lunes = teclado.nextLine();
            System.out.println("ingrese el  horario del martes");
            martes = teclado.nextLine();
            System.out.println("ingrese el  horario del miercoles");
            miercoles = teclado.nextLine();
            System.out.println("ingrese el  horario del jueves");
            jueves = teclado.nextLine();
            System.out.println("ingrese el  horario del viernes");
            viernes = teclado.nextLine();

            System.out.println("el  horaio es:\n");
            System.out.println("lunes:\n" + lunes);
            System.out.println("martes\n" + martes);
            System.out.println("miercoles\n" + miercoles);
            System.out.println("jueves\n" + jueves);
            System.out.println("viernes\n" + viernes);
            
            System.out.println("ingrese 1 para repetir el programa");
            opcion=teclado.nextInt();

        }while(opcion!=2);
    }

}
