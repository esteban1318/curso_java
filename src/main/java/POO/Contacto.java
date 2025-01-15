
package POO;


public class Contacto {
    private String Nombre;
    private String Numero;

    public Contacto(String Nombre, String Numero) {
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
    @Override
    public String toString(){
        return Nombre+"-"+Numero;
    }
}
