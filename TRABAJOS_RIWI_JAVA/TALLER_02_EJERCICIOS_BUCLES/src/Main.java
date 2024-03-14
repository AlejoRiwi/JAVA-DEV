import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Taller bucles in JAVA");
        System.out.println("punto 1");
        /*for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/

        System.out.println("Punto 2");
        /* int contador = 0;
        int resultado;

        for (int i = 0; i <= 100; i++) {
            contador = i;
            resultado = contador + i;
            System.out.println(resultado);
        }*/

        System.out.println("punto 3");
        /* for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.println("multiplicando");
                System.out.println(i + "*" + j + "=" + (i*j));
            }
        } */

        System.out.println("punto 4");
        /*int contador = 0;
        for (int i = 1; i <= 101; i++) {
            if (i % 2 == 0) {
                contador += i;
                System.out.println(contador);
            }
        }*/

        System.out.println("punto 5");
        /* boolean flag = true;
        do {
            String edadString = JOptionPane.showInputDialog(null, "Ingresa tu edad");
            try {
                int edad = Integer.parseInt(edadString);
                if (edad > 120) {
                    JOptionPane.showMessageDialog(null, "Debes ingresar un numero razonable, esa edad no es valida");

                } else {
                    JOptionPane.showMessageDialog(null, "Tienes " + edad + " años");
                    flag = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingresa un valor numerico");
            }
        } while (flag);
        */

        System.out.println("punto 6");
        /* int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero a verificar"));
        boolean primo = true;
        for (int i = 2; i < num; i++){
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo){
            JOptionPane.showMessageDialog(null, num + " Es un numero primo");
        } else {
            JOptionPane.showMessageDialog(null, num + " No es un numero primo");
        }
         */

        System.out.println("punto 7");
        /*String flag;
        do {
            flag = JOptionPane.showInputDialog(null,"JUEGO ADIVINANDO \n1.Jugar\n2.Salir del juego");
            int n_random = (int)(Math.random()*10+1);
            System.out.println(n_random);
            switch (flag){
                case "1":
                    int num_user = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero"));
                    if(num_user == n_random) {
                        JOptionPane.showMessageDialog(null, "Felicidades !GANASTE!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lo siento !NO GANASTE!");
                    }
                    break;
            }
        }while(!flag.equals("2"));*/

        System.out.println("punto 8");
        double capital = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa su capital"));
        double tasa_interes = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa su tasa de interes"));
        double year = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el tiempo en años de la inversion"));

        for(double i = 0; i <= year; i++){
            double resultado = capital * (1+tasa_interes).Math.pow(year);
            JOptionPane.showMessageDialog(null, "El saldo de la inversion en el año " + i + " Es de: " + resultado );
        }

        System.out.println("Punto 9");
        /* String option;
        double saldo = 0;
        do {
            option = JOptionPane.showInputDialog(null, "Menu interactivo\n1.Ver Saldo \n2.Depositar dinero\n3.Retirar dinero\n4.Salir");
            switch (option) {
                case "1":
                    JOptionPane.showMessageDialog(null, "Tu saldo actual es de: " + saldo + " $");
                    break;
                case "2":
                    String depositar_saldo = JOptionPane.showInputDialog(null, "Ingresa el monto que quieres depositar");
                    try{
                        double dinero_ingresado = Double.parseDouble(depositar_saldo);
                        saldo += dinero_ingresado;
                        JOptionPane.showMessageDialog(null, "Dinero ingresado correctamente");
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Debes ingresar un numero Valido");
                    }
                    break;
                case "3":
                    String dinero_ingresado = JOptionPane.showInputDialog(null, "Ingresa el monto que quieres retirar");
                    try {
                        double dinero_retirar = Double.parseDouble(dinero_ingresado);
                        if (dinero_retirar > saldo) {
                            JOptionPane.showMessageDialog(null, "No tienes esa cantidad de dinero");
                        } else {
                            saldo -= dinero_retirar;
                            JOptionPane.showMessageDialog(null, "El dinero fue retirado correctamente, tu saldo actual es de: " + saldo + " $");
                        }
                    }catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar un numero Valido");
                    }
            }
        } while (!option.equals("4")); */
    }
}