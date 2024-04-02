import controller.EspecialidadController;
import controller.MedicoController;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        EspecialidadController objEspeController = new EspecialidadController();
        MedicoController objMedicoController = new MedicoController();

        objMedicoController.create();


         // objEspeController.insert();
        //  objEspeController.delete();
    }
}