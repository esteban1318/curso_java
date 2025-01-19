package POO;

public class GestionDeRestaurante {

    public String nombrePlato;
    public double precioPlato;
    public double precioTotal;

    public GestionDeRestaurante(String nombrePlato, double Precio) {
        this.nombrePlato = nombrePlato;
        this.precioPlato = Precio;

    }

    public GestionDeRestaurante() {
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public void setPrecio(double Precio) {
        this.precioPlato = Precio;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getPrecio() {
        return precioPlato;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return nombrePlato + "- $" + precioPlato;
    }

}
