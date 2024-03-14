import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionCurso objGestion = new GestionCurso();


        Scanner sc = new Scanner(System.in);

        int option = 0;
        int option2 = 0;

        do {
            System.out.println("""
                    MENU DE OPCIONES
                    1. Administrar Cursos
                    2. Administrar Estudiantes
                    3. Salir
                    """);
            option = sc.nextInt();
            switch (option) {
                case 1:
                    do {
                        System.out.println("""
                            MENU DE CURSOS
                            1. Crear cursos
                            2. Buscar curso
                            3. Listar cursos
                            4. Salir
                            """);
                        option2 = sc.nextInt();

                        switch (option2) {
                            case 1:
                                objGestion.guardarCursos(sc);
                                break;
                            case 2:
                                System.out.println("Ingresa codigo del curso");
                                String codigo = sc.next();
                                System.out.println(objGestion.buscarPorCodigo(codigo).toString());
                                break;
                            case 3:
                                objGestion.listarCursos();
                                break;
                        }
                    }while(option2 != 4);

                break;
                case 2:
                    do {
                        System.out.println("""
                            MENU DE OPCIONES
                            1. Agregar estudiante
                            2. Eliminar estudiante
                            3. Listar estudiante
                            4. Salir
                        """);
                        option2 = sc.nextInt();

                        switch (option2){
                            case 1:
                                objGestion.listarCursos();
                                System.out.println("Ingresar el codigo del curso donde desa inscribir al estudiante");
                                String codigo = sc.next();
                                Curso curso = objGestion.buscarPorCodigo(codigo);

                                if (curso == null) {
                                    System.out.println("Codigo del curso No encontrado");
                                } else {
                                    curso.guardarEstudiante(sc);
                                }
                                break;
                            case 2:
                                // Listamos los cursos
                                objGestion.listarCursos();

                                System.out.println("Ingresar el codigo del curso a eliminar");
                                codigo = sc.next();

                                Curso objCurso = objGestion.buscarPorCodigo(codigo);

                                if (objCurso == null){
                                    System.out.println("Codigo no valido");
                                } else {
                                    objCurso.deletEstudiante(sc);
                                }
                                break;
                            case 3:
                                objGestion.listarCursos();
                                System.out.println("Ingresar el codigo del curso donde desa inscribir al estudiante");
                                codigo = sc.next();
                                curso = objGestion.buscarPorCodigo(codigo);

                                if (curso == null) {
                                    System.out.println("Codigo del curso No encontrado");
                                } else {
                                    curso.listarEstudiantes();
                                }
                                break;
                        }
                    }while(option2 != 4);
            }
        }while (option != 3);

    }
}