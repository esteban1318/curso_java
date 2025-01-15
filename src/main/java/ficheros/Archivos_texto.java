package ficheros;

import java.io.*;


public class Archivos_texto {

    File Archivo;

    private void crearArchivoexto() {
        Archivo = new File("Archivo.txt");

        try {
            if (Archivo.createNewFile()) {
                System.out.println(Archivo + " creeado con exito");
            } else {
                System.out.println(Archivo + " no fue posible crear");
            }

        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
    }

    private void eliminarAchivoTexto() {
        
            if (Archivo.delete()) {
                System.out.println(Archivo + " eliminado con exito");
            }
            else {
                System.out.println(Archivo + " no se pudo eliminar el archivo");
            }

        }
    
    private void escribirArchivoTexto(){
        try{
            FileWriter escritura=new FileWriter(Archivo);
            escritura.write("mi nomnre es esteban poveda");
            
            escritura.close();
            System.out.println("texto añadido con exito");
            
        }catch(IOException exception){
            exception.printStackTrace(System.out);
            
        }
    }
    private void leerArchivoTexto(){
        try {
            FileReader lectura=new FileReader(Archivo);
            BufferedReader lector=new BufferedReader(lectura);
            
        } catch (IOException exception) {
            exception.printStackTrace(System.out);
        }
    }
    public static void main(String[] args) {
        Archivos_texto miArchivo=new Archivos_texto();
        miArchivo.crearArchivoexto();
        miArchivo.escribirArchivoTexto();
        
    }
    }


