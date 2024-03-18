import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        GestionEmpleados gest = new GestionEmpleados();
        int option = 0,id;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, "------- MENU PRINCIPAL --------\n" +
                    "1. Agregar empleado\n" +
                    "2. Eliminar empleado\n" +
                    "3. Mostrar empleados\n" +
                    "4. Salir"));
            switch (option){
                case 1:
                     gest.crearEmpleado();
                    break;
                case 2:
                    gest.mostrarEmpleados();
                    id = Integer.parseInt(JOptionPane.showInputDialog("ingresa el id del empleado a eliminar"));
                    gest.eliminarEmpleado(id);
                case 3:
                    gest.mostrarEmpleados();
                    break;
            }
        }while(option != 4);

    }
}