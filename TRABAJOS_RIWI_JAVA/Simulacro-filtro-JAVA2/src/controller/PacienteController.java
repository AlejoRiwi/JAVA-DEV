package controller;

import entity.Paciente;
import model.PacienteModel;

import javax.swing.*;

public class PacienteController {
    public static PacienteModel instanciaModel () {
        return new PacienteModel();
    }

    public static void insert() {
        String nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del paciente");
        String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del paciente");
        String fecha_nacimiento = JOptionPane.showInputDialog(null, "Ingresa la fecha de nacimiento en el formato Año - mes - dia");
        String documento_identidad = JOptionPane.showInputDialog(null, "Ingresa el numero de documento de identidad");

        instanciaModel().insert(new Paciente(nombre,apellido,fecha_nacimiento,documento_identidad));
    }

}
