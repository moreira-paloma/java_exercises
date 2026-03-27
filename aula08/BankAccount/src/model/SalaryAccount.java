package model;

public class SalaryAccount extends Account{


    public SalaryAccount(String owner, int numberAccount) {
        super(owner, numberAccount);
    }

    @Override
    public boolean withdraw(double value) {
        if(getBalance() >= value){
            double balanceAfterWithdraw = getBalance();
            balanceAfterWithdraw -= value;
            setBalance(balanceAfterWithdraw);
            return true;

        } else{
            System.out.println("Your balance is lower than your value.");
            return false;
        }

    }
}
