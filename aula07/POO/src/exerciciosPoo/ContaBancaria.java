package exerciciosPoo;

public class ContaBancaria {
    private int numConta;
    private double saldo;

    public void setSaldo(double saldo) {

        if(saldo < 0){
            System.out.println("O saldo nao pode ser negativo! ");
            return;
        }
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaBancaria(int numConta, double saldo) {
        this.numConta = numConta;

        if(saldo < 0){
            System.out.println("O saldo nao pode ser negativo. ");
            this.saldo = 0;
        } else{
            this.saldo = saldo;
        }

        }

     public void statusConta(){
         System.out.println("O seu saldo é de R$ : " + this.saldo);

    }


}
