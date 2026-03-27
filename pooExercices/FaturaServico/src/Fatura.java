public class Fatura {

    private String descricao;
    private double valorTotal;
    private double valorPago;

    public Fatura(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
        this.valorPago = 0.0;
    }

    public void pagar(double valor){
        if(valor > 0 && valor <= valorTotal){
            valorPago += valor; //??
            calcularSaldoRestante(valor);
            System.out.println("O valor total atual é de " + valorTotal);


        } else{
            System.out.println("O valor precisa ser maior do que 0 e menor que o valor total.");
        }
    }

    public double calcularSaldoRestante(double valor){
        double total = valorTotal - valor;
        this.valorTotal = total;
        System.out.println("O saldo restante é de " + valorTotal);
        return total;
    }

    public boolean estaQuitada(){
       if(valorPago == valorTotal) {
           System.out.println("A sua fatura já esta quitada!");
           return true;
       }

       System.out.println("A sua fatura nao esta quitada.");
       return false;
    }


    public void exbirResumo(){
        System.out.println("Descricao da fatura " + descricao + " o valor pago foi de " + valorPago + "e o valor a pagar é de R$ " + valorTotal);
    }
}
