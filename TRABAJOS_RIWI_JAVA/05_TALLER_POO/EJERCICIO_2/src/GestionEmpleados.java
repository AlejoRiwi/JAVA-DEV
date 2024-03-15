import javax.swing.*;
import java.util.ArrayList;

public class GestionEmpleados {

    //Variables
    ArrayList<Empleado> listaEmpleado;
    private String nombre;
    private String edad;
    private int idEmpleado = 0;
    private double salario;

    private String tipoEmpleado;
    String option;

    // metodos constructores

    public GestionEmpleados() {
        listaEmpleado = new ArrayList<>();
    }
    // Getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }



    /* --------------------------------- METODOS ---------------------------- -*/
    public void crearEmpleado() {
        do {
            JOptionPane.showMessageDialog(null, """
                --- MENU DE REGISTRO EMPLEADO ---
                """);
            option = JOptionPane.showInputDialog("Quieres iniciar el programa?\nResponde si o no");
            if (option.equalsIgnoreCase("si")) {
                nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
                edad = JOptionPane.showInputDialog("Ingresa tu edad");
                idEmpleado += 1;
                salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu salario"));
                tipoEmpleado = JOptionPane.showInputDialog("""
                        Que tipo de empleado eres?
                        - Empleado temporal
                        - Empleado Permanente
                        """);
                if (tipoEmpleado.equalsIgnoreCase("temporal")){
                    EmpleadoTemporal empleadoTemp = new EmpleadoTemporal(nombre,edad,idEmpleado,salario,tipoEmpleado);
                    listaEmpleado.add(empleadoTemp);

                    JOptionPane.showMessageDialog(null, "Empleado Temporal creado con Exito!");
                }else {
                    EmpleadoPermanente empleadoPer = new EmpleadoPermanente(nombre,edad,idEmpleado,salario,tipoEmpleado);
                    listaEmpleado.add(empleadoPer);
                    JOptionPane.showMessageDialog(null, "Empleado Permanente creado con Exito!");
                }

            } else {
                JOptionPane.showMessageDialog(null, "El programa cerro! ");
            }



        }while("si".equals(option));

    }
}
