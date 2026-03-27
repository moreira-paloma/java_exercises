package model;

public class CheckinAccount extends Account{

    public CheckinAccount(String owner, int numberAccount){
        super(owner,numberAccount);
    }

    @Override
    public boolean withdraw(double value) {
        double fee = 2.0;
        double valuePlusFee = value + fee;

        if(getBalance() >= valuePlusFee){
            double newBalanceAfterWithdraw = getBalance();
            newBalanceAfterWithdraw -= valuePlusFee;
            setBalance(newBalanceAfterWithdraw);
            return true;
        } else{
            System.out.println("Your balance is lower than your current amount.");
            return false;
        }

    }


    }

