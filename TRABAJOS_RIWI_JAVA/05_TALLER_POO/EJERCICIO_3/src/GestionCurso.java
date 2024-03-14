import java.util.ArrayList;
import java.util.Scanner;

public class GestionCurso {
    private ArrayList<Curso> listaCursos;

    public GestionCurso () {
        this.listaCursos = new ArrayList<>();
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    @Override
    public String toString() {
        return "GestionCurso{" +
                "listaCursos=" + listaCursos +
                '}';
    }

    public void guardarCursos(Scanner sc){
        System.out.println("Agregar Cusro");
        System.out.println("Ingresa el nombre del curso");
        String nombre = sc.next();

        System.out.println("Ingresa el codigo del curso");
        String codigo = sc.next();

        // Si el metodo buscar devuelve null, quiere decir que ese codigo ya eicste
        if (this.buscarPorCodigo(codigo) != null){
            System.out.println("El codigo del curso ya existe, no se puede agregar este codigo");
        } else {
            Curso objCurso = new Curso(codigo, nombre);
            this.listaCursos.add(objCurso);
        }
    }

    public Curso buscarPorCodigo(String codigoBuscar){
        for (Curso temp : this.listaCursos) {
            if (temp.getCodigo().equalsIgnoreCase(codigoBuscar)){
                return temp;
            }
        }
        return null;
    }

    public void listarCursos(){
        if (listaCursos.isEmpty()) {
            System.out.println("No hay cursos");
        } else {
            for (Curso cursoTemp : this.listaCursos){
                System.out.println(cursoTemp.toString());
            }
        }
    }
}
