package model;

import database.CRUD;
import database.ConfigDB;
import entity.Paciente;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class PacienteModel implements CRUD {

    @Override
    public Object insert(Object object) {
        Connection objConnection = ConfigDB.openConnection();
        Paciente objPaciente = (Paciente) object;

        try{
            String sql = "INSERT INTO paciente (nombre,apellido,fecha_nacimiento,documento_identidad) VALUES(?,?,?,?)";
            PreparedStatement objPrepare = objConnection.prepareStatement(sql, PreparedStatement.NO_GENERATED_KEYS);

            objPrepare.setString(1, objPaciente.getNombre());
            objPrepare.setString(2, objPaciente.getApellido());
            objPrepare.setString(3,objPaciente.getFecha_nacimiento());
            objPrepare.setString(4, objPaciente.getDocumento_identidad());

            objPrepare.executeQuery();
            ResultSet objResult = objPrepare.getGeneratedKeys();
            while (objResult.next()){
                objPaciente.setId(objResult.getInt(1));
            }

            JOptionPane.showMessageDialog(null, "El paciente fue creado correctamente");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error > " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return objPaciente;
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
