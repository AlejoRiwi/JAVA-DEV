package model;

import controller.AutorController;
import database.CRUD;
import database.ConfigDB;
import entity.Autor;
import entity.Libro;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class LibroModel implements CRUD {
    Autor objAutor = new Autor();
    AutorModel autorController = new AutorModel();

    @Override
    public Object insert(Object object) {
        Connection objConnection = ConfigDB.openConnection();
        Libro objLibro = (Libro)  object;

        try {
            String sql = "INSERT INTO libros (title, age, price, id_autor) VALUES(?, ?, ?,?);";
            PreparedStatement objPrepare = (PreparedStatement) objConnection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);

            objPrepare.setString(1, objLibro.getTitle());
            objPrepare.setString(2, objLibro.getAge());
            objPrepare.setDouble(3, objLibro.getPrice());
            objPrepare.setInt(4, objLibro.getIdAutor());

            objPrepare.execute();

            ResultSet objResult = objPrepare.getGeneratedKeys();

            while(objResult.next()){
                objLibro.setId(objResult.getInt(1));
            }
            objPrepare.close();
            JOptionPane.showMessageDialog(null, "Libro creado correctamente");

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error adding Libro " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return objLibro;
    }

    @Override
    public List<Object> findAll() {
        return null;
    }

    @Override
    public Object findById(int id) {
        return null;
    }

    @Override
    public Object findAutor(Object object) {
        return null;
    }

    @Override
    public boolean update(Object autor) {
        return false;
    }

    @Override
    public boolean delete(Object autor) {
        return false;
    }
}
