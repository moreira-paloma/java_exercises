public class Main {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("Maria",1000);

        conta.depositar(500);
        conta.exibirResumo();

        conta.sacar(1700);
        conta.exibirResumo();

        conta.depositar(200);
        conta.exibirResumo();

        conta.sacar(1700);
        conta.exibirResumo();
    }
}
