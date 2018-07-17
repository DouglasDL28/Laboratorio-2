package com.company;

public class Estudiante {
    private String Nombre_Estudiante;
    private Integer Codigo_Estudiante;

    public Estudiante(String nombre_Estudiante, Integer codigo_Estudiante) {
        Nombre_Estudiante = nombre_Estudiante;
        Codigo_Estudiante = codigo_Estudiante;
    }

    /**
     * Obtener el nombre del estudiante.
     * @return El nombre del estudiante.
     */
    public String getNombre_Estudiante() {
        return Nombre_Estudiante;
    }

    /**
     * Ponerle nombre al estudiante.
     * @param nombre_Estudiante
     */
    public void setNombre_Estudiante(String nombre_Estudiante) {
        Nombre_Estudiante = nombre_Estudiante;
    }

    /**
     * Obtener el código del estudiante.
     * @return El código del estudiante.
     */
    public Integer getCodigo_Estudiante() {
        return Codigo_Estudiante;
    }

    /**
     * Asignarle código al estudiante.
     * @param codigo_Estudiante El código que se desea asignarle al estudiante.
     */
    public void setCodigo_Estudiante(Integer codigo_Estudiante) {
        Codigo_Estudiante = codigo_Estudiante;
    }
}