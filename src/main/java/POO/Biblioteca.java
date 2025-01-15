package POO;
import java.util.HashMap;

public class Biblioteca {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar libros
        HashMap<String, String> libros = new HashMap<>();

        // Agregar libros al HashMap
        libros.put("Cien años de soledad", "Gabriel García Márquez");
        libros.put("Don Quijote de la Mancha", "Miguel de Cervantes");
        libros.put("El Principito", "Antoine de Saint-Exupéry");

        // Buscar un libro por su título
        String autor = libros.get("El Principito");
        System.out.println("El autor de 'El Principito' es: " + autor);

        // Verificar si un libro está en la colección
        System.out.println("¿La colección contiene 'Don Quijote de la Mancha'? " + libros.containsKey("Don Quijote de la Mancha"));

        // Imprimir toda la colección
        for (String titulo : libros.keySet()) {
            System.out.println("Título: " + titulo + ", Autor: " + libros.get(titulo));
        }
    }
}
