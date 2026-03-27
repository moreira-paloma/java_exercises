package model;

public abstract class Account {

    private String owner;
    private int numberAccount;
    private double balance;

    public Account(String owner, int numberAccount){
        this.owner = owner;
        this.numberAccount = numberAccount;
        this.balance = 0.0;
    }

    public void deposit(double value){
        if(value > 0){
            this.balance += value;
            System.out.println("The amount has been successfully deposited..");
        }else{
            System.out.println("The value needs to be always positive.");
        }
    }
//metodo abstrato nao precisa de {}
    public abstract boolean withdraw(double value);

    public String getOwner(){
        return owner;
    }

    public int getNumberAccount(){

        return numberAccount;
    }

    public double getBalance(){

        return balance;
    }

    protected void setBalance(double balance){
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [Number=" + numberAccount + ", Holder=" + owner + ", Balance=" + String.format("%.2f", balance) + "]";

    }
}
