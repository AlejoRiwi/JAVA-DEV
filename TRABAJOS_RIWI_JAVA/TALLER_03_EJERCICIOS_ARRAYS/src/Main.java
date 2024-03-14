import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("punto 1");
        Scanner sc = new Scanner(System.in);
        // se crea el array
        double [] notas = new double[10];

        double sumaNotas = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("ingresa la nota del estudiante #: " + (i + 1));
            try {
                notas[i] = sc.nextDouble();
                sumaNotas += notas[i];
            }catch (Exception e) {
                System.out.println("Numero no valido");
                break;
            }
        }
        double promedio = sumaNotas/notas.length;
        System.out.println("El promedio de todos estos vagos es: " + promedio);

    }
}