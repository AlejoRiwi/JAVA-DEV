import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Inventario objInventario = new Inventario();
        int id = 0;
        int option = 0;
        String nombre = "";
        double precio = 0;

        do {
            JOptionPane.showMessageDialog(null, "Menu Principal");
            option = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar Producto\n" +
                    "2. Eliminar producto\n" +
                    "3. Buscar productos\n" +
                    "4. Listar todos los productos\n" +
                    "5. Salir del menu"));

            switch (option){
                case 1:
                    Producto product;
                    id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del producto"));
                    nombre = JOptionPane.showInputDialog("Ingresa el nombre del producto");
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto"));
                    product = new Producto(id, nombre, precio);
                    objInventario.addProducto(product);
                    break;
                case 2:
                    objInventario.listarProductos();
                    id = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID del producto que quieres eliminar"));
                    objInventario.deletProducto(id);
                    break;
                case 3:
                    nombre = JOptionPane.showInputDialog("Ingresa el nombre del producto a buscar");
                    JOptionPane.showMessageDialog(null, objInventario.buscarNombre(nombre));
                    break;
                case 4:
                    objInventario.listarProductos();
                    break;
            }
        }while(option != 5);
    }
}