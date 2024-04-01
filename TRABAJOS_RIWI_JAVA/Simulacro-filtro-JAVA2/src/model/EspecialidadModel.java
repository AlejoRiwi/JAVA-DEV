package model;

import database.CRUD;
import database.ConfigDB;
import entity.Especialidad;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EspecialidadModel implements CRUD {
    public Object insert (Object object) {
        Connection objConnection = ConfigDB.openConnection();
        Especialidad objEspecialidad = (Especialidad) object;
        try{
            String sql = "Insert into especialidad(nombre,descripcion) value (?,?);";

            PreparedStatement objPrepare = (PreparedStatement) objConnection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            objPrepare.setString(1,objEspecialidad.getNombre());
            objPrepare.setString(2,objEspecialidad.getDescripcion());

            objPrepare.execute();

            ResultSet objResult = objPrepare.getGeneratedKeys();
            while (objResult.next()) {
                objEspecialidad.setId(objResult.getInt(1));
            }
            objPrepare.close();
            JOptionPane.showMessageDialog(null, "Especialidad creada correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Conexion" + e.getMessage());
        }

        ConfigDB.closeConnection();
        return objEspecialidad;
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
