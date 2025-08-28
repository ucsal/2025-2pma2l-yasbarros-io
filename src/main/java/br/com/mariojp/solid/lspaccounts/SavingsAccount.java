package br.com.mariojp.solid.lspaccounts;

public class SavingsAccount extends Account {
 
     public void deposit(double amount){
        this.balance += amount;
    }

    public double getBalance(){
        return balance;
    }

}