package Menu;

import controller.EspecialidadController;
import controller.MedicoController;

import javax.swing.*;

public class Menu {
    EspecialidadController objEspeController = new EspecialidadController();
    MedicoController objMedicoController = new MedicoController();
    public  void mostrarMenu() {
        String[] opciones = {"Nueva especialidad", "Nuevo Medico", "Salir"};
        int seleccion;
        do {
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Bienvenido al sistema",
                    "Menú de Inicio",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (seleccion) {
                case 0:
                    // Lógica para crear una especialidad nueva

                    int option = 0;
                    do {
                        option = Integer.parseInt(JOptionPane.showInputDialog("""
                            0. para crear una especialidad nueva
                            1. para mostrar todas las especialidades
                            2. para eliminar una especialidad
                            3. para volver al menu principal
                            """));

                        switch (option){
                            case 0:
                                objEspeController.insert();
                                break;
                            case 1 :
                                objEspeController.getAll();
                                break;
                            case 2:
                                objEspeController.delete();
                                break;
                        }
                    }while(option != 3);
                    break;
                case 1:
                    // Lógica para crear un Medico
                    do {
                        option = Integer.parseInt(JOptionPane.showInputDialog("""
                            0. para crear un medico
                            1. para mostrar todos los medicos
                            2. para mostrar todos los medicos x especialidad
                            3. para actualizar la especialidad del medico
                            4. para eliminar un medico
                            5. para volver al menu principal
                            """));

                        switch (option){
                            case 0:
                                objMedicoController.create();
                                break;
                            case 1 :
                                objMedicoController.findAll();
                                break;
                            case 2:
                                  objMedicoController.findName();
                                break;
                            case 4:
                                // objMedicoController.delete();
                                break;
                        }
                    }while(option != 5);
                    break;
                case 2:
                    // Salir
                    JOptionPane.showMessageDialog(null, "Adiós");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        }while(seleccion != 3);

    }
}
