package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;        //lista de libros
    private String nombreBiblioteca;
    private String direccion;

    private List<Prestamo> prestamos;
    private List<Usuario> usuarios;
    private List<Bibliotecario> bibliotecarios;


    //constructor insertando parametros de nombreBiblioteca y direccion
    public Biblioteca(String nombreBiblioteca, String direccion) {

        this.nombreBiblioteca = nombreBiblioteca;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.bibliotecarios = new ArrayList<>();


    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public String getNombreBiblioteca() {
        return this.nombreBiblioteca;
    }

    public String getDireccion() {
        return this.direccion;

    }

    public List<Bibliotecario> getBibliotecarios(){
        return this.bibliotecarios;

    }

    public List<Usuario> getUsuarios(){
        return this.usuarios;

    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public void setBibliotecarios(List<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;

    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;

    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public boolean agregarLibro(Libro libro) {
        if (!libroExiste(libro)) {
            this.libros.add(libro);
            return true;
        } else {
            return false;
        }
    }

    public Libro buscarLibro(String nombre) {
        for (Libro libro : this.libros) {
            if (libro.dameNombre().equals(nombre)) {
                return libro;
            }
        }

        return null;
    }

    public List<Libro> buscarLibroPorAutor(String autor) {
        List<Libro> librosAutor = new ArrayList<Libro>();
        for (Libro libro : this.libros) {
            if (libro.dameAutor().equals(autor))
                librosAutor.add(libro);
        }
        return librosAutor;
    }

    public boolean libroExiste(Libro libro) {
        for (Libro l : this.libros) {
            if (libro.getISBN().equals(l.getISBN())) {
                return true;
            }
        }

        return false;

    }

    public void generarPrestamo(Bibliotecario bibliotecario, Usuario usuario, Libro libro, Date fechaInicio, Date fechaTermino) {
        if (!libroExiste(libro)) {
            System.out.println("El libro no existe en la biblioteca.");
            return;
        }
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro)) {
                System.out.println("El libro ya está prestado.");
                return;
            }
        }
        Prestamo nuevoPrestamo = new Prestamo(bibliotecario, usuario, libro, fechaInicio, fechaTermino);
        prestamos.add(nuevoPrestamo);
    }


}












