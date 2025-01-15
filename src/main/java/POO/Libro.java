
package POO;

public class Libro {
    String Autor;
    String Titulo;
    int Paginas;
    String Autor2;
    String Titulo2;
    int Paginas2;

    public Libro(String Autor, String Titulo, int Paginas) {
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Paginas = Paginas;
    }
    
    public void mostrarLibro(){
        System.out.println("Titulo"+Titulo);
        System.out.println("El autor es: "+Autor);
        System.out.println("cuenta con:"+Paginas+" paginas");
        
    }
    
}
