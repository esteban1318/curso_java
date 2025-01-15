
package POO;
import java.util.Scanner;

public class casa {
    Scanner teclado=new Scanner(System.in);
    String Ciudad;
    String Barrio;
    String Color;
    int Pisos;
    int Baños;
    int Cocinas;

    public casa(String Ciudad, String Barrio, String Color, int Pisos, int Baños, int Cocinas) {
        this.Ciudad = Ciudad;
        this.Barrio = Barrio;
        this.Color = Color;
        this.Pisos = Pisos;
        this.Baños = Baños;
        this.Cocinas = Cocinas;
    }
    public void registro(){
        System.out.println("ingrese ciuadad de residencia");
        Ciudad=teclado.nextLine();
        System.out.println("ingrese barrio de residencia");
        Barrio=teclado.nextLine();
        System.out.println("ingrese color de la viviendad");
        Color=teclado.nextLine();
        System.out.println("cuantos pisos tiene la viviendad");
        Pisos=teclado.nextInt();
        System.out.println("con cuantos baños cuentan");
        Baños=teclado.nextInt();
        System.out.println("con cuantas cocinas cuenta");
        Cocinas=teclado.nextInt();
        
        
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getBarrio() {
        return Barrio;
    }

    public String getColor() {
        return Color;
    }

    public int getPisos() {
        return Pisos;
    }

    public int getBaños() {
        return Baños;
    }

    public int getCocinas() {
        return Cocinas;
    }
   


    
    
}
