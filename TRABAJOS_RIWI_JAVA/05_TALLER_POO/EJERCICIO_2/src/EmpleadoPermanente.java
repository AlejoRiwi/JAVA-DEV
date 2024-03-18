public class EmpleadoPermanente extends Empleado{
    private String antiguedad;

    public EmpleadoPermanente() {
    }

    public EmpleadoPermanente(String nombre, String edad, int idEmpleado, double salario, String antiguedad) {
        super(nombre, edad, idEmpleado, salario);
        this.antiguedad = antiguedad;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }
}
