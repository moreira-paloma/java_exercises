package model;

public class SavingAccount extends Account {


    public SavingAccount(String owner, int numberAccount) {
        super(owner, numberAccount);
    }

    @Override
    public boolean withdraw(double value) {
        if (getBalance() >= value) {
            double balanceAfterWithdraw = getBalance();
            balanceAfterWithdraw -= value;
            setBalance(balanceAfterWithdraw);
            return true;
        } else {
            System.out.println("Your balance is lower than your value.");
            return false;
        }
    }

    public void interest(double fee){
        double income = getBalance() * fee;
        deposit(income);
        System.out.println("Value income " + income);


    }
}
