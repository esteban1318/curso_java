package POO;

public class Empleado extends Persona {

    int num_legajo;
    String cargo;
    Double Sueldo;

    public Empleado() {
    }

    public Empleado(int num_legajo, String cargo, Double Sueldo, int id, String dni, String Nombre, String Apellidos, String Telefono, String direccion) {
        super(id, dni, Nombre, Apellidos, Telefono, direccion);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.Sueldo = Sueldo;
    }

    public int getNum_legajo() {
        return num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSueldo() {
        return Sueldo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(Double Sueldo) {
        this.Sueldo = Sueldo;
    }
    
}