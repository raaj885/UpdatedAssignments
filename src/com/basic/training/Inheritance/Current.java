package com.basic.training.Inheritance;

public class Current extends Bank{

    public Current(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        //Making sure balance is not 0 or negative
        if ((balance > amount) && (amount != 0)) {
            balance = balance - amount - 20;// transaction charge for current accounts
            System.out.println("Balance available after withdrawal: " + balance);
            System.out.println("with");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    void deposit(double amount) {
        if (amount != 0) {
            balance = balance - amount -20;// transaction charge for current accounts
            System.out.println("Balance available after deposit: " + balance);
        } else {
            System.out.println("Enter the valid amount");
        }
    }


}
