import javax.swing.*;

public class Estudiante {
    private String nombre;

    private double [] listaNotas;

    private double notas = 0;

    public Estudiante() {
    }

    public Estudiante(String nombre, double notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public void calculoNotas (){
        int nNotas = Integer.parseInt(JOptionPane.showInputDialog("Inresa la cantidad de notas a registrar"));
        double sumaNotas = 0;
        listaNotas = new double[nNotas];
        double resultado = 0;
        for (int i = 0; i < nNotas ;i++){
            notas = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la nota: " + (i +1)));
            listaNotas[i]= notas;
            sumaNotas += notas;
            resultado = sumaNotas / nNotas ;
            System.out.println(listaNotas[i]);
        }
        System.out.println(sumaNotas);
        System.out.println("El promedio: " + resultado);
    }
}
