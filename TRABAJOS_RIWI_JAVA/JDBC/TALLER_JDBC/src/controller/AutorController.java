package controller;

import com.mysql.cj.x.protobuf.MysqlxSession;
import entity.Autor;
import model.AutorModel;

import javax.swing.*;
import java.util.List;
import java.util.Objects;

public class AutorController {
    AutorModel autorController;

    public AutorController() {
        this.autorController = new AutorModel();
    }

    public void getAll() {
        String list = this.getAll(this.autorController.findAll());
        JOptionPane.showMessageDialog(null, list);
    }

    public String getAll (List<Object> listAutor) {
        String list = "--- List Autor ---\n";
        for (Object obj : listAutor) {
            Autor objAutor = (Autor) obj;

            list += objAutor.toString() + "\n";

        }
        return list;
    }

    public void create() {
        Autor objAutor = new Autor();
        String name = JOptionPane.showInputDialog("Insert name ");
        String country = JOptionPane.showInputDialog("Insert country ");

        objAutor.setName(name);
        objAutor.setCountry(country);


        objAutor = (Autor) this.autorController.insert(objAutor);
        JOptionPane.showMessageDialog(null, objAutor.toString());
    }

    public void findById(){
        String listAutor= this.getAll(this.autorController.findAll());
        JOptionPane.showMessageDialog(null, listAutor);

        int confirm = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el ID que quieres buscar"));

        String list = this.findById(this.autorController.findById(confirm));

    }
}
