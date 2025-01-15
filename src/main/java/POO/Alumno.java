package POO;

import java.util.Scanner;
import java.io.*;
import java.util.Stack;

public class Alumno {

    private String Nombre;
    private String Universidad;

    public Alumno(String Nombre, String Universidad) {
        this.Nombre = Nombre;
        this.Universidad = Universidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getUniversidad() {
        return Universidad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setUniversidad(String Universidad) {
        this.Universidad = Universidad;
    }

    public static class Metodos_Pilas {

        File informacion;
        Scanner teclado = new Scanner(System.in);
        Stack<String> pila = new Stack<>();

        File miArchivo = new File("informacion.txt");

        public void agregarPila() {
            try {
                System.out.println("ingrese nombre del alumno");
                String Nombre = teclado.nextLine();
                System.out.println("ingrese universidad");
                String Universidad = teclado.nextLine();

                pila.push(Nombre);
                pila.push(Universidad);

                FileWriter escritura = new FileWriter(miArchivo, true);
                BufferedWriter buffer = new BufferedWriter(escritura);

                
                
                buffer.close();
                escritura.close();
            } catch (IOException e){
                System.out.println("error al escribir en el archivo: "+ e.getMessage());
            }
            }
        
        

        public void eliminarUltimo() {
            if (!pila.isEmpty()) {
                pila.pop();
                System.out.println("ultimo elemento eliminado con exito");
            } else {
                System.out.println("la pila esta vacia");
            }

        }
        public void leerArchivoTexto(){
        try {
            FileReader lectura=new FileReader(miArchivo);
            BufferedReader lector=new BufferedReader(lectura);
            
            String Linea;
            while((Linea=lector.readLine())!=null){
                System.out.println(Linea);
            }
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

        public void mostrarPila() {
            System.out.println(pila);

        }

    }
}
