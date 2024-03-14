import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String codigo;
    private String nombre;
    private ArrayList<Estudiante> listaEstudiantes;

    private static int idEstudiante = 1;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }

    public void guardarEstudiante(Scanner sc){
        System.out.println("--- Agregar un nuevo Estudiante ---");
        System.out.println("Ingresa el nombre del Estudiante");
        String nombre = sc.next();

        System.out.println("Ingresa el Email");
        String email = sc.next();

        Estudiante estudiante = new Estudiante(idEstudiante, nombre, email);
        idEstudiante++;

        if (listaEstudiantes.add(estudiante)) {
            System.out.println("Estudiante agregado correctamente");
        } else {
            System.out.println("El estudiante no se ha agregado ");
        }

    }

    public void listarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("El curso ".concat(this.nombre).concat("El curso esta vacio"));
        } else {
            for (Estudiante estudianteTemp : this.listaEstudiantes){
                System.out.println(estudianteTemp.toString());
            }
        }
    }

    public void deletEstudiante(Scanner sc) {
        listarEstudiantes();
        System.out.println("Ingresa el Id de la persona que se va a eliminar");
        int idDelet = sc.nextInt();

        if (listaEstudiantes.removeIf(estudiante -> estudiante.getId() == idDelet)) {
            System.out.println("Estudiante eliminado correctamente");
        } else {
            System.out.println("No se pudo eliminar el estudiante");
        }
    }
}
