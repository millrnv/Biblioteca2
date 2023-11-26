package modelo;

public abstract class Persona {

    protected String nombre;
    protected String rut;
    protected String direccion;


    public Persona(String nombre, String rut, String direccion){

        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public abstract String getTipo();


}
