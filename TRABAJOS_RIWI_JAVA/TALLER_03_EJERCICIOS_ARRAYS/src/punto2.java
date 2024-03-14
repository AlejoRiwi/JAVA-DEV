import java.util.Scanner;
public class punto2 {
    public static void main(String[] args){
        int [] listNumber = new int [5];
        Scanner sc = new Scanner(System.in);
        int num_mayor = 0;
        int num_menor = 100000;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un numero");
            listNumber[i] = sc.nextInt();
            if (listNumber[i] > num_mayor){
                num_mayor = listNumber[i];
            }
            if (listNumber[i] < num_menor){
                num_menor = listNumber[i];
            }
        }
        System.out.println("El numero mayor es " + num_mayor);
        System.out.println("El numero menor es " + num_menor);
    }
}
