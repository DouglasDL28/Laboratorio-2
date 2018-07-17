package com.company;

import java.util.*;


public class Nivel {

    private String nombre_nivel;
    private static HashMap<String, Grado> grados= new HashMap<String, Grado>();


    public Nivel(String nombre) {
        this.nombre_nivel = nombre;
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

    public static HashMap<String, Grado> getGrados() {
        return grados;
    }

    /**
     * Agregar un grado a un nivel.
     * @param grado el grado que se quiere agregar a la lista.
     */
    public void addGrados(String nombre, Grado grado) {
        grados.put(nombre, grado);
    }

    @Override
    public String toString(){
        return "Nivel: " + ",Nombre: " + nombre_nivel + ",Grados: " + grados;
    }
}
