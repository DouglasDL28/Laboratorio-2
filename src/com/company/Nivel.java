package com.company;

import java.util.List;

public class Nivel {

    private String nombre_nivel;
    private List<Grado> grados;


    public Nivel(String nombre, List<Grado> grados) {
        this.nombre_nivel = nombre;
        this.grados = grados;
    }


    /**
     * Ponerle nombre a un Nivel.
     * @param nombre El nombre que se le desea poner al nivel.
     */
    public void setNombre(String nombre) {
        this.nombre_nivel = nombre;
    }

    /**
     * Obtener los grados que hay en un nivel.
     * @return Los grado que hay en el nivel
     */
    public List<Grado> getGrados() {
        return grados;
    }

    /**
     * Agregar un grado a un nivel.
     * @param grado el grado que se quiere agregar a la lista.
     */
    public void addGrados(Grado grado) {
        grados.add(grado);
    }
}
