package controller;

import entity.Especialidad;
import model.EspecialidadModel;

import javax.swing.*;
import java.util.List;

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

    public void getAll () {
        String list = this.getAll(this.objEspecialidadModel.findAll());
        JOptionPane.showMessageDialog(null, list);
    }

    public String getAll (List<Object> listObject) {
        String list = "-- Lista de Especialidades --\n \n";
        for(Object obj : listObject) {
            Especialidad objEspecialidad = (Especialidad) obj;

            list += objEspecialidad.toString() + "\n";

        }
        return list;
    }

    public void delete () {
        String listEspecialidades = this.getAll(this.objEspecialidadModel.findAll());
        int confirmacion = 1;
        int isDeleted = Integer.parseInt(JOptionPane.showInputDialog(listEspecialidades + "\nIngresa el identificador de la Especialidad a eliminar"));

        Especialidad objEspecialidad = (Especialidad) this.objEspecialidadModel.findById(isDeleted);

        if(objEspecialidad == null) {
            JOptionPane.showMessageDialog(null, "La especialidad no fue encontrada");
        }else {
            confirmacion = JOptionPane.showConfirmDialog(null, "Esta seguro que quieres eliminar esta especialidad ?\n" + objEspecialidad.toString());

            if (confirmacion == 0){
                this.objEspecialidadModel.delete(objEspecialidad);
            }
        }

    }
}