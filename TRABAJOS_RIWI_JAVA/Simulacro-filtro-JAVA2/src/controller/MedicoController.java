package controller;

import entity.Especialidad;
import entity.Medico;
import model.EspecialidadModel;
import model.MedicoModel;

import javax.swing.*;

public class MedicoController {
    EspecialidadController objEspeController = new EspecialidadController();
    Especialidad objEspecialidad = new Especialidad();
     EspecialidadModel objEspecialidadModel = new EspecialidadModel();
    MedicoModel objMedicoModel;

    public MedicoController() {
        objMedicoModel = new MedicoModel();
    }

    public void create () {
        Medico objMedico = new Medico();


        String nombre = JOptionPane.showInputDialog(null, "Escribe el nombre del medico");
        String apellido = JOptionPane.showInputDialog(null, "Escribe el apellido del medico");
        int id_especialidad = Integer.parseInt(JOptionPane.showInputDialog(objEspeController.getAll(this.objEspecialidadModel.findAll()) + "Ingresa el identificador de la especialidad"));

        objMedico.setNombre(nombre);
        objMedico.setApellido(apellido);
        objMedico.setId_especialidad(id_especialidad);

        objMedico = (Medico) this.objMedicoModel.insert(objMedico);
        JOptionPane.showMessageDialog(null, objMedico.toString());
    }
}
