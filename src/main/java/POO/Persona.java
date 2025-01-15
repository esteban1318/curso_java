package POO;

public class Persona{
    int id;
    String dni;
    String Nombre;
    String Apellidos;
    String Telefono;
    String direccion;

    public Persona(int id, String dni, String Nombre, String Apellidos, String Telefono, String direccion) {
        this.id = id;
        this.dni = dni;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.direccion = direccion;
    }

    public Persona() {
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}