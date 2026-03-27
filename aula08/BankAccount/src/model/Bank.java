package model;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String nameBank;
    private List<Account> accounts;


    public Bank(String nameBank){
        this.nameBank = nameBank;
        this.accounts = new ArrayList<>();

    }

    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account creat successfully " + account.getNumberAccount());
    }

    public Account searchAccount(int number){
        for(Account account : accounts){
            if(account.getNumberAccount() == number){
                System.out.println(account);
                return account;

            }
        }
        return null;
    }

    public void listAllAccounts(){
        for(Account account : accounts){
            System.out.println("Account " + account);
        }
    }


}
