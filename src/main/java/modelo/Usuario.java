package modelo;

public class Usuario extends Persona {

    private String nTelefonico;



    public Usuario(String nombre, String rut, String direccion, String nTelefonico){

        super(nombre, rut, direccion);
        this.nTelefonico = nTelefonico;

    }


    public String getnTelefonico(){
        return nTelefonico;
    }

    public void setnTelefonico(String nTelefonico){
        this.nTelefonico = nTelefonico;
    }

    public String getTipo(){
        return "Usuario";

    }


}
