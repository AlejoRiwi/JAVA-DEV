import javax.swing.*;
import java.util.ArrayList;

public class punto4 {
    public static void main(String[] args) {
        ArrayList<String> listaCiudades = new ArrayList<>();
        int option = 0;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("---- MENU ----\n" +
                    "1. Agregar ciudad \n" +
                    "2. Eliminar ciudad\n" +
                    "3. Ver ciudades\n" +
                    "5. Salir del MENU"));
            switch (option) {
                case 1:
                    int addCiudad = 0;
                    do {
                        String ciudadNueva = JOptionPane.showInputDialog(null, "Ingresa el nombre de la ciudad");
                        listaCiudades.add(ciudadNueva);
                        addCiudad = JOptionPane.showConfirmDialog(null, "Quieres continuar agregar mas ciudades?");
                    }while(addCiudad == 0);

                    break;
            }
        }while (option != 5);
    }
}
