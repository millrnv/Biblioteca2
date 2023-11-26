package dato;
import java.io.*;
import modelo.Biblioteca;
import modelo.Libro;
import modelo.Usuario;
import modelo.Bibliotecario;


public class GestorDatos {

    public static void leerArchivosLibros(Biblioteca biblioteca, String direccionArchivo) {
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while ((textoArchivo = br.readLine()) != null) {
                String[] data = textoArchivo.split(",");
                biblioteca.getLibros().add(new Libro
                        (data[0], data[1],data[2],data[3]));
            }
        } catch (Exception e) {
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }
    public static void leerArchivosUsuarios(Biblioteca biblioteca, String direccionArchivo){
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(",");
                biblioteca.getUsuarios().add(new Usuario
                        (data[0], data[1], data[2], data[3]));
            }
        } catch (Exception e){
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }
    public static void leerArchivosBibliotecario(Biblioteca biblioteca, String direccionArchivo){
        String textoArchivo = "";
        try {
            File archivo = new File(direccionArchivo);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            while((textoArchivo = br.readLine()) != null){
                String[] data = textoArchivo.split(",");
                biblioteca.getBibliotecarios().add(new Bibliotecario
                        (data[0], data[1], data[2], data[3]));
            }
        } catch (Exception e){
            System.out.println("Documento no disponible, favor contactar con administrador");
        }
    }
    public static boolean registrarDatos(Object objeto, String direccionArchivo) {
        boolean lineaVacia = false;
        try {
            File file = new File(direccionArchivo);
            if (!file.exists()) {
                file.createNewFile();
                lineaVacia = true;
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            if(!lineaVacia){
                bw.newLine();
            }
            bw.write(objeto.toString());
            bw.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al ingresar dato, favor contactar con administrador");
            return false;
        }
    }
}
