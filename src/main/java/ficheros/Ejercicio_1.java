package ficheros;
import java.io.IOException;
import java.io.File;
public class Ejercicio_1 {
    public static void main(String[] args){
        //cree archivo en i 
       File miArchivo=new File("miarchivo1318.txt");
       // esta linea crea el archivo si la linea anterior no la creo
       if(!miArchivo.exists()){
           try{
               miArchivo.createNewFile();
               System.out.println(miArchivo.getName()+" ha sido creado.");
               
           }catch(IOException ex){//cree el objeto IOException
               ex.printStackTrace();
               
           }
       }
        System.out.println("¿se puede leer? "+  miArchivo.canRead());
        System.out.println("¿se puede escribir? "+  miArchivo.canWrite());
        System.out.println("¿se puede ejecutar? "+  miArchivo.canExecute());
        System.out.println("¿es un directorio? "+  miArchivo.isDirectory());
        System.out.println("¿fecha de actualizacion? "+  miArchivo.lastModified());
        System.out.println("¿tamaño: ?"+  miArchivo.length());
    }



 }
