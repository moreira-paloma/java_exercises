import model.*;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("Yellow Bank");
        Account checkingAccount = new CheckinAccount("Paloma", 10);
        Account savingAccount = new SavingAccount("Manuela", 20);
        Account salaryAccount = new SalaryAccount("Diego", 30);

        bank.addAccount(checkingAccount);
        bank.addAccount(savingAccount);
        bank.addAccount(salaryAccount);

        System.out.println("Operations : " );

        checkingAccount.deposit(100);
        checkingAccount.withdraw(10);
        bank.searchAccount(20);


    }
}
