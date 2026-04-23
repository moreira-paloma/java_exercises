public class Main {
    public static void main(String[] args) {

        try {
            ContaBancaria conta1 = new ContaBancaria("Paloma", 500);
            ContaBancaria conta2 = new ContaBancaria("Maria", 100);

            System.out.println("Transferencia válida:");
            conta1.transferir(200, conta2);
            System.out.println("Saldo Paloma: " + conta1.getSaldo());
            System.out.println("Saldo Maria: " + conta2.getSaldo());

            System.out.println("\nTransferencia inválida:");
            conta1.transferir(400, conta2);

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro de saldo: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro de valor: " + e.getMessage());
        }
    }
}
