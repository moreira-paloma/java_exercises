import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String bankName;
    private List<AccountInterface> accountList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accountList = new ArrayList<>();
        
    }

    public void adicionarConta(AccountInterface account){
        accountList.add(account);
        System.out.println("Conta " + account.getNumberAccount() + " adicionada com sucesso.");

    }

    public void listarConta(){
        for(AccountInterface accountInterface : accountList){
            System.out.println(accountInterface.getDetails());
        }
    }
}
