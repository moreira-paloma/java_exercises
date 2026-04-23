public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular invalido.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial nao pode ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void transferir(double valor, ContaBancaria destino) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para transferencia.");
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para transferencia.");
        }

        this.saldo -= valor;
        destino.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
}
