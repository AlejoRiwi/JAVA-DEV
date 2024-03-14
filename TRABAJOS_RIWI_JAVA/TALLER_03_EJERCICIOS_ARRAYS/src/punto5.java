import javax.swing.*;
import java.util.ArrayList;

public class punto5 {
    public static void main(String[] args) {
        // Creacion de la lista de canciones ->
        ArrayList<String> playList = new ArrayList<>();
        int option = 0, cancionActual = 0;
        do {
            try{
                option = Integer.parseInt(JOptionPane.showInputDialog(null, "--- MENU DEL REPRODUCTOR ---\n" +
                        "1. Agregar cancion \n2. Remover cancion \n3. Mostrar cancion actual y siguiente de la lista \n4.Saltar a la siguiente cancion\n" +
                        "5. Salir"));
                switch (option) {
                    case 1:
                        String nuevaCancion = JOptionPane.showInputDialog("Ingresa el nombre de la cancion que quieres agregar");
                        playList.add(nuevaCancion.toLowerCase());
                        JOptionPane.showMessageDialog(null, "Cancion agregada correctamente");
                        break;
                    case 2:
                        String eliminarCancion = JOptionPane.showInputDialog("Ingresa el nombre de la cancion que quieres Eliminar");
                        if (playList.remove(eliminarCancion.toLowerCase())){
                            JOptionPane.showMessageDialog(null, "Cancion Eliminada correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "Cancion no existe");
                        }
                        break;
                    case 3:
                        if (playList.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "La playList esta vacia");
                        } else {
                            String listaTotal = "";
                            listaTotal += "Cancion actual: \n" + playList.get(cancionActual) + "\n";
                            for (int i = cancionActual; i < playList.size() -1 ; i++) {
                                listaTotal += "Cancion siguiente: \n" +  playList.get(i+1) + "\n";
                            }
                            JOptionPane.showMessageDialog(null, listaTotal);
                        }
                        break;
                    case 4:
                        if (cancionActual + 1 < playList.size()) {
                            cancionActual++;
                            JOptionPane.showMessageDialog(null, playList.get(cancionActual) + " Se esta reproduciendo correctamente");
                        }else {
                            JOptionPane.showMessageDialog(null, "LA play list Se acabo");
                            cancionActual = 0;
                        }
                }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Caracteres no validos");
            }
        }while(option != 5);
    }
}
