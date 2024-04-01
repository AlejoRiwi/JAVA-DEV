package controller;

import entity.Especialidad;
import model.EspecialidadModel;

import javax.swing.*;

public class EspecialidadController {

    EspecialidadModel objEspecialidadModel;

    public EspecialidadController() {
        this.objEspecialidadModel = new EspecialidadModel();
    }

    public void insert () {
        Especialidad objEspecialidad = new Especialidad();
        String nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre de la Especialización");
        String descripcion = JOptionPane.showInputDialog(null, "Ingresa la descripcion de la Especialización");

        objEspecialidad.setNombre(nombre);
        objEspecialidad.setDescripcion(descripcion);

        objEspecialidad = (Especialidad) this.objEspecialidadModel.insert(objEspecialidad);

        JOptionPane.showMessageDialog(null, objEspecialidad.toString());

    }
}
