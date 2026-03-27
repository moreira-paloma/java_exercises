public class SavingAccount implements AccountInterface {

    private int numberAccount;
    private String owner;
    private double balance;

    public SavingAccount(int numberAccount, String owner) {
        this.numberAccount = numberAccount;
        this.owner = owner;
        this.balance = 0.0;
    }

    @Override
    public void deposit(double value) {
        if(value > 0){
            this.balance += value;
            System.out.println("Depósito de R$" + value + " na Poupança de " + owner);
        }
    }

    @Override
    public boolean withdraw(double value) {
        double fee = 2.0;
        double totalWithdraw = value + fee;
        if(this.balance > totalWithdraw){
            this.balance -= totalWithdraw;
            System.out.println("Saque de R$" + value + " realizado (Taxa: R$2,00).");
            return true;

        }
        System.out.println("Saldo insuficiente para saque + taxa na Conta Poupanca.");
        return false;
    }

    public void interest(double fee){
        double rendimento = fee * this.balance;
        this.deposit(rendimento);
        System.out.println("Rendimento aplicado: R$" + rendimento);

        
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public String getOwner() {
        return this.owner;
    }

    @Override
    public int getNumberAccount() {
        return this.numberAccount;
    }

    @Override
    public String getDetails() {
        return "Conta Poupança [Número=" + numberAccount + ", Titular=" + owner + ", Saldo=" + String.format("%.2f", balance) + "]";
    }
}
