package model;

import database.CRUD;

import database.ConfigDB;
import entity.Autor;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AutorModel implements CRUD {

    @Override
    public Object insert(Object object) {
        // Se abre conexion
        Connection objConnection = ConfigDB.openConnection();

        // Se crea el opjeto
        Autor objAutor = (Autor) object;

        try{
            // Sentencia SQL
            String sql = "INSERT INTO autores(name, country) VALUE (?, ?);";

            PreparedStatement objPrepare = (PreparedStatement) objConnection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);

            // Se asignan valores al Autor
            objPrepare.setString(1,objAutor.getName());
            objPrepare.setString(2,objAutor.getCountry());

            // Se ejecuta el Query
            objPrepare.execute();

            // Obtenemos el resultado
            ResultSet objResult = objPrepare.getGeneratedKeys();
            while (objResult.next()){
                objAutor.setId(objResult.getInt(1));
            }

            objPrepare.close();
            JOptionPane.showMessageDialog(null, "Author added successfully");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Conexion" + e.getMessage());
        }
        ConfigDB.closeConnection();
        return objAutor;
    }

    @Override
    public List<Object> findAll() {
        Connection objConnection = ConfigDB.openConnection();
        List<Object> listAutor = new ArrayList<>();

        try{
            String sql = "SELECT * FROM autores ORDER BY autores.id ASC;";

            PreparedStatement objPrepareStatement = (PreparedStatement) objConnection.prepareStatement(sql);

            ResultSet objResult = objPrepareStatement.executeQuery();

            while(objResult.next()){
                Autor objAutor = new Autor();
                objAutor.setId(objResult.getInt("id"));
                objAutor.setName(objResult.getString("name"));
                objAutor.setCountry(objResult.getString("Country"));

                listAutor.add(objAutor);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error Conexion" + e.getMessage());
        }

        ConfigDB.closeConnection();
        return listAutor;
    }

    @Override
    public Object findById(int id) {
        Connection objConnection = ConfigDB.openConnection();
        Autor objAutor = null;
        try{
            String sql = "SELECT * FROM autores WHERE id = ?;";
            PreparedStatement objPrepare = objConnection.prepareStatement(sql);
            objPrepare.setInt(1,id);
            ResultSet objResult = objPrepare.executeQuery();

            while(objResult.next()){
                objAutor = new Autor();
                objAutor.setId(objResult.getInt("id"));
                objAutor.setName(objResult.getString("name"));
                objAutor.setCountry(objResult.getString("country"));
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        ConfigDB.closeConnection();
        return objAutor;
    }

    @Override
    public Object findAutor(Object object) {
        return null;
    }

    @Override
    public boolean update(Object autor) {
        Connection objConnection  = ConfigDB.openConnection();
        Autor objAutor = (Autor) autor;

        boolean isUpdate = false;

        try {

            String sql = "UPDATE autores SET name =?, country = ? WHERE id = ?";
            PreparedStatement objPrepare = objConnection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            objPrepare.setString(1,objAutor.getName());
            objPrepare.setString(2,objAutor.getCountry());
            objPrepare.setInt(3,objAutor.getId());

            int rowAffected = objPrepare.executeUpdate();

            if (rowAffected > 0) {
                isUpdate = true;
                JOptionPane.showMessageDialog(null, "Se actualizo Correctamente!");
            }

        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " No se cual es el error de actualizacion");
        }
        ConfigDB.closeConnection();
        return isUpdate;
    }

    @Override
    public boolean delete(Object autor) {
        return false;
    }
}
