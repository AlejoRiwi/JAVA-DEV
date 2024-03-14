import java.util.Scanner;

public class Empleado {
    private String nombre, posicion;
    private double salario;
    private int id;
    Scanner sc = new Scanner(System.in);

    public Empleado (){

    }
    public Empleado(String nombre, String posicion, double salario, int id) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.salario = salario;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", posicion='" + posicion + '\'' +
                ", salario=" + salario +
                ", id=" + id +
                '}';
    }

    public void createUser() {
        System.out.println("Ingresa el nombre del usuario");
        setNombre(sc.next());

        System.out.println("Ingresa la posicion del usuario");
        setPosicion(sc.next());

        System.out.println("Ingresa el salario del usuario");
        setSalario(sc.nextDouble());

        System.out.println("Ingresa la identificacion del usuario");
        setId(sc.nextInt());

        System.out.println(toString());

    }
    public void modificarSalario() {
        System.out.println("Quieres aumentar tu salario?");


        String aumento = sc.next();
        if (aumento.equals("si")){
            System.out.println("A que porcentaje quieres aumentar tu salario? ");
            double valorAumento = sc.nextDouble();

            double resultado = ((getSalario() * valorAumento) / 100) + getSalario();
            System.out.println("Tu salario aumento a: " + resultado);
        } else {
            System.out.println("Sigues siendo pobre");
        }
    }
}
