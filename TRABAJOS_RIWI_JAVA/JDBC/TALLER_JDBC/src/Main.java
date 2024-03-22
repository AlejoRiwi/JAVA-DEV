import controller.AutorController;
import controller.LibroController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Probando Conexion");
        LibroController objControllerLibro = new LibroController();
        AutorController objControllerAutor = new AutorController();

        String option;

        do {
            option = JOptionPane.showInputDialog("1. List Autores\n" +
                    "2. Insert Autor\n" +
                    "4. Get by id\n" +
                    "4. Update Autor\n" +
                    "5. Delet Autor\n" +
                    "9. Exit\n" +
                    "Choose an option");

            switch (option){
                case "1":
                    objControllerAutor.getAll();
                    break;
                case "2":
                    objControllerAutor.create();
                    break;
                case "3":
                    objControllerAutor.findById();
                    break;
                case "4" :
                    objControllerAutor.update();
                    break;
                case "10":
                    objControllerLibro.insert();
                    break;
            }
        }while(!option.equals("9"));

    }
}