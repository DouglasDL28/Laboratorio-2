package com.company;

import java.util.List;

public class Grado {
    private List<Estudiante> estudiantes;
    private String nombre_grado;

    public Grado(String nombre_grado) {
        this.nombre_grado = nombre_grado;
    }

    /**
     * Ver asignaciones en el grado.
     * Muestra todos los estudiante que hay en un grado.
     * @return los estudiantes que hay en el grado.
     */
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * Agrega un estudiante al grado.
     * @param estudiante El estudiante que se quiere agregar al grado.
     */
    public void addEstudiantes(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    /**
     * Ponerle nombre al grado.
     * @param nombre_grado El nombre que se le quiere poner al grado.
     */
    public void setNombre_grado(String nombre_grado) {
        this.nombre_grado = nombre_grado;
    }
}



