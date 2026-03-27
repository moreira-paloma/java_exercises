package exerciciosPoo;

public class ContaBancariaRun {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(0101,-10);
        conta1.statusConta();

        System.out.println("_______________________________________");

        ContaBancaria conta2 = new ContaBancaria(0205, 1000);
        conta2.statusConta();

    }
}
