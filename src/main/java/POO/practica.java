package POO;

import java.util.Scanner;

public class practica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String registro[][] = new String[10][10];

        String Nombre;
        String Fecha;
        int opcion;
        
        for (int i = 0; i < registro.length; i++) {
                for (int j = 0; j < registro.length; j++) {
                  do{  
                    System.out.println("ingrese nombre completo");
                    Nombre = teclado.nextLine();
                    System.out.println("ingrese fecha de registro");
                    Fecha = teclado.nextLine();
                    registro[i][j] = Nombre + Fecha;
                    
                    System.out.println("ingrese 1 para registrar nuevamente");
                    opcion=teclado.nextInt();
                    

                }while(opcion==1);

            }
        }
    
        
     

    }

}
