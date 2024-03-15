public class EmpleadoPermanente extends Empleado{
    private String tipo;

    public EmpleadoPermanente() {
    }

    public EmpleadoPermanente(String nombre, String edad, int idEmpleado, double salario, String tipo) {
        super(nombre, edad, idEmpleado, salario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
