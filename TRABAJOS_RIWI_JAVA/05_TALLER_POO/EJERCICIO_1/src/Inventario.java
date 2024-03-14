import javax.swing.*;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> listaProductos;

    public Inventario() {
        this.listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void addProducto (Producto producto){
        this.listaProductos.add(producto);
    }

    public boolean deletProducto(int id){
        // Remover en la lista de productos si encuentra el ID del producto
        return listaProductos.removeIf(producto -> producto.getId() == id);
    }


    public void listarProductos() {
        String lista = "";
        for (Producto producto : this.listaProductos){
            lista += "ID: "+producto.getId()+" " +
                    "Nombre: " + producto.getNombre() + " " +
                    "Precio: " + producto.getPrecio() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public Producto buscarNombre(String nombreBuscar){
        for(Producto objProducto : this.listaProductos){

            if (objProducto.getNombre().compareToIgnoreCase(nombreBuscar) == 0){
                return objProducto;
            }
        }
        return null;
    }
}