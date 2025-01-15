
package POO;
import java.util.Random;
import java.util.Scanner;

public class Password {
    Scanner teclado=new Scanner(System.in);
    int Longitud;

    public Password(int Longitud) {
        this.Longitud = Longitud;
    }
 
   
     public String Password() {
        Random random=new Random();
        StringBuilder contrasena=new StringBuilder();
        for(int i=0;i<Longitud;i++){
            char caracter=(char)(random.nextInt(91+90+57)+126+65+48);
            contrasena.append(caracter);
        }
       return contrasena.toString();
    }
  
}
