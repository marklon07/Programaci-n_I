package org.example;



import javax.swing.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args) {

        int cantidadEstudiantes = 2;
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();


        for (int i = 0; i < cantidadEstudiantes; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            String id = JOptionPane.showInputDialog("Ingrese el ID del estudiante");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
            String genero = JOptionPane.showInputDialog("Ingrese el genero del estudiante");
            String alergias = JOptionPane.showInputDialog("Ingrese las alergias de el estudiante");
            String telefono = JOptionPane.showInputDialog("Ingrese número de telefono del estudiante");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese nombre del acudiente");


            Estudiante newEstudiante =
                    new Estudiante(nombre, id, edad, genero, alergias, telefono, nombreAcudiente);

            listaEstudiantes.add(newEstudiante);

            JOptionPane.showMessageDialog(null, newEstudiante);
        }

    JOptionPane.showMessageDialog(null, listaEstudiantes);






    }




    }


