package POO;

import java.util.Scanner;

public class Uso_contraseña {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese la longitud de la contraseña");
        int Longitud = teclado.nextInt();
        Password op = new Password(Longitud);
        
        String contrasena = op.Password();
        System.out.println("su contraseña es " +contrasena);
    }
}
