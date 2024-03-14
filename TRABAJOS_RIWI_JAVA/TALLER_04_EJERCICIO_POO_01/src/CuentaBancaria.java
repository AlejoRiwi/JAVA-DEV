import javax.swing.*;

public class CuentaBancaria {
    private String titular;
    private double balance;

    public CuentaBancaria() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "titular='" + titular + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void usuarios(){
        int option = 0;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(" --- MENU BANCO ---\n" +
                    "Escoge la opcion de tu preferencia\n" +
                    "1. Depositar Dinero\n" +
                    "2. Retirar Dinero\n" +
                    "3. Salir"));
            switch (option) {
                case 1:
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor que quieres añadir a tu cuenta bancaria"));
                    if(salario < 0){
                        JOptionPane.showMessageDialog(null, "No puedes ingresar un numero negativo");
                    } else {
                        setBalance(salario);
                        JOptionPane.showMessageDialog(null, "Tu salario actual es: " + getBalance());
                    }
                    break;
                case 2:
                    double saldoRetirado = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor que quieres retirar de tu cuenta bancaria"));
                    if (getBalance() < saldoRetirado) {
                        JOptionPane.showMessageDialog(null, "Lo siento no tienes ese dinero");
                    } else {
                        double saldoActual = getBalance() - saldoRetirado;
                        setBalance(saldoActual);
                        JOptionPane.showMessageDialog(null, "Retiraste: " + saldoRetirado + "El balance actual es de: " + getBalance());
                    }
                    break;
            }
        }while(option != 3);
    }
}
