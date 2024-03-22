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
        int confirm = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el ID que quieres buscar"));
        Autor objAutor = (Autor) this.autorController.findById(confirm);
        if (objAutor == null){
            JOptionPane.showMessageDialog(null, "Autor no encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Autor: " + objAutor);
        }

    }

    public void update() {
        String listAutor = this.getAll(this.autorController.findAll());
        JOptionPane.showMessageDialog(null, listAutor);
        int idUpdate = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Id del usuario"));
        Autor objAutor = (Autor)  this.autorController.findById(idUpdate);

        if (objAutor == null) {
            JOptionPane.showMessageDialog(null,"El usuario no existe");
        } else {
            String newName = JOptionPane.showInputDialog(null, "Ingresa el nombre actualizado",objAutor.getName());
            String newCountry = JOptionPane.showInputDialog(null, "Ingresa el nombre actualizado",objAutor.getCountry());

            objAutor.setName(newName);
            objAutor.setCountry(newCountry);

            this.autorController.update(objAutor);
        }
    }
}
