import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        System.out.println("Punto 1");
        /*
        String option = JOptionPane.showInputDialog(null,
                "Menu Principal \n 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division \n");



        switch(option){
            case "1":
                String num1 = JOptionPane.showInputDialog(null, "Ingresa el numero 1");
                String num2 = JOptionPane.showInputDialog(null, "Ingresa el numero 2");

                double numero1 = Double.parseDouble(num1);
                double numero2 = Double.parseDouble(num2);
                System.out.println("La suma de los numeros es: " + (numero1 + numero2));
                break;
            case "2":
                num1 = JOptionPane.showInputDialog(null, "Ingresa el numero 1");
                num2 = JOptionPane.showInputDialog(null, "Ingresa el numero 2");

                numero1 = Double.parseDouble(num1);
                numero2 = Double.parseDouble(num2);
                System.out.println("La resta de los numeros es: " + (numero1 - numero2));
                break;
            case "3":
                num1 = JOptionPane.showInputDialog(null, "Ingresa el numero 1");
                num2 = JOptionPane.showInputDialog(null, "Ingresa el numero 2");

                numero1 = Double.parseDouble(num1);
                numero2 = Double.parseDouble(num2);
                System.out.println("La multiplicacion de los numeros es: " + (numero1 * numero2));
                break;
            case "4":
                num1 = JOptionPane.showInputDialog(null, "Ingresa el numero 1");
                num2 = JOptionPane.showInputDialog(null, "Ingresa el numero 2");

                numero1 = Double.parseDouble(num1);
                numero2 = Double.parseDouble(num2);
                if(numero2 == 0) {
                    System.out.println("No se puede dividir entre 0");
                }else {
                    System.out.println("La multiplicacion de los numeros es: " + (numero1 * numero2));
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
         */

        System.out.println("Punto 2");
        /*
        String edad1 = JOptionPane.showInputDialog(null, "Ingresa tu edad");
        int edad = Integer.parseInt(edad1);

        if (edad >= 18){
            JOptionPane.showMessageDialog(null, "Eres mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "Eres menor de edad");
        } */

        System.out.println("Punto 3");
        /*
            Ejercicio 3: Conversor de Unidades
            Desarrolla un programa que convierta kilómetros a millas. El programa debe solicitar al
            usuario que introduzca una distancia en kilómetros y luego debe mostrar la distancia equivalente en millas.
            Utiliza el hecho de que una milla es igual a 1.60934 kilómetros.
         */

        /*String km = JOptionPane.showInputDialog(null, "Ingresa cuantos Kilometros hiciste");
        double kilometros = Double.parseDouble(km);

        double kilometros_totales = kilometros * 1.60934;
        JOptionPane.showMessageDialog(null, "La distancia en total en millas fue: " + kilometros_totales + " millas");*/

        System.out.println("Punto 4");

        /*double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu estatura"));

        double resultado = peso / (altura * altura);
        JOptionPane.showMessageDialog(null, "Su IMC es: " + resultado);*/


        System.out.println("Punto 5");

       /* String input = JOptionPane.showInputDialog("Introduce un número:");
        int numero = Integer.parseInt(input);

        // Comprobando si el número es positivo, negativo o cero
        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "El número es positivo.");
        } else if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El número es negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es cero.");
        }

        // Comprobando si el número es par o impar
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número es par.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es impar.");
        }*/

        System.out.println("Punto 6");

        /*String input = JOptionPane.showInputDialog("Introduce el número de un mes (1-12):");
        int mes = Integer.parseInt(input);

        int dias;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Número de mes inválido.");
                return;
        }

        JOptionPane.showMessageDialog(null, "El mes " + mes + " tiene " + dias + " días.");*/


        /*
        Implementa un programa que muestre un menú con opciones para realizar diferentes operaciones matemáticas (por ejemplo, sumar, restar, multiplicar, dividir). El usuario debe poder seleccionar una opción ingresando un número, y luego el programa debe pedir los números necesarios para realizar la operación elegida y mostrar el resultado. Utiliza una estructura switch para manejar las opciones del menú.
        */


        int  option = 0, num1 = 0, num2 = 0, resultado = 0;



        do {
            JOptionPane.showMessageDialog(null, "Menu principal de la Calculadora");
            option = Integer.parseInt(JOptionPane.showInputDialog("1. Sumar\n" +
                    "2. Resta\n" +
                    "3. Multiplicar\n" +
                    "4. Dividir\n" +
                    "5. Cerrar programa"));
            switch(option) {
                case 1:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2"));
                    resultado = num1 + num2;
                    JOptionPane.showMessageDialog(null, "La suma de los dos numeros es: " + resultado);
                    break;
                case 2:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2"));
                    resultado = num1 - num2;
                    JOptionPane.showMessageDialog(null, "La resta de los dos numeros es: " + resultado);
                    break;
                case 3:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2"));
                    resultado = num1 * num2;
                    JOptionPane.showMessageDialog(null, "La multiplicacion de los dos numeros es: " + resultado);
                    break;
                case 4:
                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 1"));
                    num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero 2"));
                    if(num2 != 0) {
                        resultado = num1 / num2;
                        JOptionPane.showMessageDialog(null, "La division de los dos numeros es: " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "No se puede dividir por 0");
                    }
            }
        }while (option != 5);

    }
}
