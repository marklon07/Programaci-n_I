package org.example;

import java.util.ArrayList;

public class Guarderia{
    //Atributos de la Clase
    private String nombre;
    private String nit;
    private ArrayList<Estudiante> listEstudiantes;

    //Metodos propios de la clase
    public void agregarEstudiante(Estudiante newEstudiante) {
        listEstudiantes.add(newEstudiante);
    }

    public void eliminarEstudiante(Estudiante estudianteEliminar) {
        listEstudiantes.remove(estudianteEliminar);
    }

    public void actualizarEstudiante(Estudiante estudianteActualizar) {


        for (Estudiante indexEstudiante : listEstudiantes) {

            if (indexEstudiante.getid().
                    equals(estudianteActualizar.getid())) {

                indexEstudiante.setnombre(estudianteActualizar.getnombre());
                indexEstudiante.setedad(estudianteActualizar.getedad());
                indexEstudiante.setgenero(estudianteActualizar.getgenero());
                indexEstudiante.setnombreAcudiente(estudianteActualizar.getnombreAcudiente());
                indexEstudiante.settelefono(estudianteActualizar.gettelefono());
                indexEstudiante.setalergias(estudianteActualizar.getalergias());
                break;
            }
        }
    }

    public void listarEstudiantes() {

        for (Estudiante estudiante : listEstudiantes) {
            System.out.println("Estudiante "+listEstudiantes.indexOf(estudiante)+" "+estudiante);
        }
    }

    //Metodo Constructor
    public Guarderia(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    //Metodos Setter y Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(ArrayList<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }
}

