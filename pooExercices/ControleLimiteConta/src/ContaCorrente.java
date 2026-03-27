public class ContaCorrente {

    private String nome;
    private double saldo;
    private double limite;

    public ContaCorrente(String nome, double limite) {
        this.nome = nome;
        this.saldo = 0.0;
        this.limite = limite;

    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("O deposito foi realizado com sucesso.");

        } else {
            System.out.println("O valor de deposito precisa ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {


            if (valor > saldo + limite) {
                System.out.println("Saldo insuficiente para saque.");

            } else {
                this.saldo -= valor;
                System.out.println("Saque realizado");
            }
        }
    }

    public void exibirResumo() {
        System.out.println("Titular da conta " + nome + " Saldo " + saldo + " limite da conta " + limite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
