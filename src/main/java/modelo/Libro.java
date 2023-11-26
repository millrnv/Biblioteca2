package modelo;

public class Libro {

    private String nombre;
    private String autor;
    private String editorial;
    private String ISBN;
    private Especialidad especialidad;


    public Libro(String nombre, String autor, String editorial, String ISBN, Especialidad especialidad) {

        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.especialidad = especialidad;

    }


    public String dameNombre() {
        return this.nombre;

    }

    public String getISBN(){
        return this.ISBN;
    }

    public void setISBN(){
        this.ISBN = ISBN;

    }

    public String dameAutor() {
        return this.autor;

    }

    public String dameEditorial() {
        return this.editorial;

    }

    public void setNombre(){
        this.nombre = nombre;

    }


    public void setAutor(){
        this.autor = autor;

    }

    public void setEditorial(){
        this.editorial = editorial;

    }

    public String toString(){
        return "Nombre: " +nombre+ "\n Autor: " +autor+ "\n Editorial: " +editorial;

    }
}


