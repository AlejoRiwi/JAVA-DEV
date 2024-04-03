package controller;

import entity.Especialidad;
import entity.Medico;
import model.EspecialidadModel;
import model.MedicoModel;

import javax.swing.*;
import java.util.List;

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
        // JOptionPane.showMessageDialog(null, objMedico.toString());
    }

    public void findAll() {
        String list = this.getAll(this.objMedicoModel.findAll());
        JOptionPane.showMessageDialog(null, list);
    }

    public String getAll (List<Object> listObject){
        String list = "-- Lista de Medicos --\n";
        for (Object obj : listObject) {
            Medico objMedico = (Medico) obj;

            list += objMedico.toString() + "\n";
        }
        return list;
    }

    public void findName () {
        String listMedicos = "--- Lista de Medicos ---\n";
        String isName = JOptionPane.showInputDialog(null, "Ingresa el nombre de la especialidad");
        String list = this.getAll(this.objMedicoModel.findName(isName));

        JOptionPane.showMessageDialog(null, list);
    }
    /* public void findById() {
        String listaMedicos = this.getAll(this.objMedicoModel.findAll());
        int isId;
        int confirmacion = 1;
        isId = Integer.parseInt(JOptionPane.showInputDialog(listaMedicos + "Ingresa el id de la especialidad a buscar"));

        Medico objMedico = (Medico) this.objMedicoModel.findById(isId);

        if (objMedico == null) {
            JOptionPane.showMessageDialog(null, "La especialidad no fue encontrada");
        } else {
            confirmacion = JOptionPane.showConfirmDialog(null, "La especialidad que estas buscando es: " + objEspecialidad.getNombre());
            if (confirmacion == 0) {
                this.objMedicoModel.findById(isId));
            }
        }
    }*/
}
