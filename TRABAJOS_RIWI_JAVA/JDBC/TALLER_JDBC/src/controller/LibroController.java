package controller;

import entity.Libro;
import model.AutorModel;
import model.LibroModel;

import javax.swing.*;
import java.util.Date;

public class LibroController {
    LibroModel objLibroModel;
    public  LibroController (){
        objLibroModel = new LibroModel();
    }

    public void insert(){
        AutorModel autorController = new AutorModel();

        Libro objLibro = new Libro();
        String title = JOptionPane.showInputDialog("Insert Title");
        String age = JOptionPane.showInputDialog("Insert year");

        double price = Double.parseDouble(JOptionPane.showInputDialog("Insert price "));
        int idAutor = Integer.parseInt(JOptionPane.showInputDialog(null, "-- Selecciona el identificador del Autor -- \n" + autorController.findAll() + "\n"));


        objLibro.setTitle(title);
        objLibro.setAge(age);
        objLibro.setPrice(price);
        objLibro.setIdAutor(idAutor);

        objLibro = (Libro) this.objLibroModel.insert(objLibro);
        JOptionPane.showMessageDialog(null, objLibro.toString());
    }
}
