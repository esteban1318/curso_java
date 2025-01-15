
package POO;
import java.util.Scanner;

public class Herencia extends Agenda{
    String Nombre;
    String Numero;
    Scanner teclado=new Scanner(System.in);

    public Herencia(String Nombre, String Numero) {
        this.Nombre = Nombre;
        this.Numero = Numero;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNumero() {
        return Numero;
    }

    
    
}
