public class ContaSimples {

    private double saldo;

    public ContaSimples(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo nao pode ser negativo.");
        }
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("O valor nao pode ser 0 ou negativo.");
        }

        if(valor > saldo){
            throw new IllegalArgumentException("O valor nao pode ser maior que o saldo.");
        }
    }
}
