package modelo;

public enum Especialidad {

    AUTOAYUDA("AutoAyuda"),
    SUSPENSO("Suspenso"),
    CIENCIAFICCION("Ciencia Ficción"),
    ACCION("Acción");

    private String especialidad;


    Especialidad(String especialidad) {

        this.especialidad = especialidad;

    }

    public String getEspecialidad(){
        return especialidad;
    }



}
