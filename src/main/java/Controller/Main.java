package Controller;

import modelo.*;

public class Main {



    public static void inicializar() {


        Biblioteca biblioteca1 = new Biblioteca("Biblioteca 1","Temuco");

        Bibliotecario bibliotecario1 = new Bibliotecario("Bibliotecario 1","12456789","","1");

        Usuario usuario1 = new Usuario("Usuario 1","789456123","Temuco","965457458");

        Libro libro1 = new Libro("Libro 1","NN","","Acantilado",Especialidad.ACCION);
        Libro libro2 = new Libro("Libro 2","MN","","Planeta",Especialidad.SUSPENSO);
        Libro libro3 = new Libro("Libro 3","LN","","Anagrama",Especialidad.CIENCIAFICCION);

        biblioteca1.agregarLibro(libro1);
        biblioteca1.agregarLibro(libro2);
        biblioteca1.agregarLibro(libro3);

        biblioteca1.buscarLibro("Libro 1");

        

    }








    public static void main(String[] args) {

        inicializar();


    }


}
