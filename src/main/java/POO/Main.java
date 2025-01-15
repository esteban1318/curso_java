
package POO;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        casa op=new casa("", "", "", 0, 0, 0);
        Scanner teclado=new Scanner(System.in);
        int opcion;
        do{
            op.registro();
        
        System.out.println("imformacionde residencia");
        System.out.println("ciuada de residencia\n"+op.getCiudad());
        System.out.println("barrio de residencia\n"+op.getBarrio());
        System.out.println("color de la viviendad\n"+op.getColor());
        System.out.println("cuenta con "+op.getPisos()+" pisos");
        System.out.println("cuanta con "+op.getBaños()+" baños");
        System.out.println("cuenta con "+op.getCocinas()+" cocinas");
        
         System.out.println("teclea 1 para ingresar datos nuevamente");
         opcion=teclado.nextInt();
        }while(opcion==1);
        
    }
}
