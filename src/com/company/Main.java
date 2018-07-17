package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static HashMap<String, Nivel> niveles = new HashMap<String, Nivel>();
    public static List<Estudiante> estudiantes = new ArrayList<>();

    public static String menu = "Menú: \n" +
            "\t1. Agrear nivel. \n" +
            "\t2. Agregar grado. \n" +
            "\t3. Agregar estudiante. \n" +
            "\t4. Ver grados en un nivel. \n" +
            "\t5. Ver asignaciones en un grado. \n" +
            "\t6. Salir.";


    public static void main(String[] args) {
        boolean continuar = true;

        do {
            System.out.println(menu);
            System.out.print("Seleccione una opción: ");
            Scanner input = new Scanner(System.in);
            int opcion = input.nextInt();

            switch (opcion) {
                /**
                 * Agregar un nivel nuevo.
                 */
                case 1:
                    System.out.print("Cuál es el nombre para el nivel? ");
                    Scanner in_nombre = new Scanner(System.in);
                    String nombre = in_nombre.next();

                    Nivel crear_nivel = new Nivel(nombre);
                    niveles.put(nombre, crear_nivel);
                    break;

                /**
                 * Agregar un grado nuevo.
                 */
                case 2:
                    //Pedir nombre del grado nuevo.
                    System.out.print("Cuál es el nombre para el grado? ");
                    Scanner INnombre_grado = new Scanner(System.in);
                    String nombre_grado = INnombre_grado.next();

                    //Preguntar a que nivel se desea agregar el grado nuevo.
                    System.out.println("A qué nivel desea agregarlo? ");
                    Scanner input_nivel = new Scanner(System.in);
                    String nivel = input_nivel.next();

                    Grado nuevo_grado = new Grado(nombre_grado);

                    niveles.get(nivel).addGrados(nombre_grado, nuevo_grado);

                    break;

                /**Agregar un estudiante
                 *
                 */
                case 3:
                    /*
                    System.out.print("Cuál es el nombre para el estudiante? ");
                    Scanner input_nombre_estudiante = new Scanner(System.in);
                    String nombre_estudiante = input_nombre_estudiante.next();

                    System.out.print("Cuál es el código del estudiante? ");
                    Scanner codigo_estudiante = new Scanner(System.in);
                    Integer codigo = codigo_estudiante.nextInt();

                    Estudiante crear_estudiante = new Estudiante(nombre_estudiante, codigo);
                    estudiantes.add(crear_estudiante);

                    System.out.println("A qué grado desea agregarlo? ");
                    Scanner input_grado = new Scanner(System.in);
                    String agregar_a_grado = input_grado.next();

                    grados.get(agregar_a_grado).addEstudiantes(crear_estudiante); */

                    break;

                //Ver grados en un nivel.
                case 4:
                    /*System.out.print("De que nivel desea ver los grados? ");
                    Scanner VerGrados_enNivel = new Scanner(System.in);
                    String*/
                    break;


                //Ver asignaciones en un grado.
                case 5:
                    break;

                //Salir.
                case 6:
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}
