public class CurrentAccount implements AccountInterface {

    private int numberAccount;
    private String owner;
    private double balance;

    public CurrentAccount(String owner, int numberAccount){
        this.owner = owner;
        this.numberAccount = numberAccount;
        this.balance = 0.0;

    }

    @Override
    public void deposit(double value) {
        if(value > 0){
            this.balance += value;
            System.out.println("Your deposit was processed successfully. " + getBalance());
        } else{
            System.out.println("Deposits must always have a positive value.");
        }


    }

    @Override
    public boolean withdraw(double value) {
        double fee = 2.0;
        double total = value + fee;
        if(getBalance() >= total){
            this.balance -= total;
            System.out.println("Saque de R$" + value + " realizado (Taxa: R$2,00).");
            return true;
        }
        System.out.println("Saldo insuficiente para saque + taxa na Conta Corrente.");
        return false;
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
        return "Checking Account [Number=" + numberAccount
                + ", Holder=" + owner
                + ", Balance=" + String.format("%.2f", balance)
                + "]";
    }
}
