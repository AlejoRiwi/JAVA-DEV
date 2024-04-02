package model;

import database.CRUD;
import database.ConfigDB;
import entity.Medico;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class MedicoModel implements CRUD {

    @Override
    public Object insert(Object object) {
        Connection objConnection = ConfigDB.openConnection();
        Medico objMedico = new Medico();

        try{
            String sql = "INSERT INTO medico(nombre,apellido, id_especialidad) VALUES(?,?,?);";

            PreparedStatement objPrepare = (PreparedStatement) objConnection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);

            objPrepare.setString(1,objMedico.getNombre());
            objPrepare.setString(2,objMedico.getApellido());
            objPrepare.setInt(3,objMedico.getId_especialidad());

            objPrepare.execute();

            ResultSet objResult = objPrepare.getGeneratedKeys();

            while(objResult.next()){
                objMedico.setId(objResult.getInt(1));
            }

            objPrepare.close();
            JOptionPane.showMessageDialog(null, "Medico Creado correctamente");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error adding coder " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return objMedico;
    }

    @Override
    public List<Object> findAll() {
        return null;
    }

    @Override
    public boolean update(Object object) {
        return false;
    }

    @Override
    public boolean delete(Object object) {
        return false;
    }
}
