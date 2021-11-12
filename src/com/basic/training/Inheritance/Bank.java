package com.basic.training.Inheritance;

public class Bank {

    double balance;

        public Bank() {
            super();
        }

        public Bank(double balance) {
            this.balance = balance;
        }

    void withdraw(double amount) {
        if ((balance != 0) && (amount != 0)) {
            balance = balance - amount;
            System.out.println("Balance after withdrawal : " + balance);
        }
    }

    void deposit(double amount) {
        if (amount != 0) {
            balance = balance + amount;
            System.out.println("Balance after Deposit: " + balance);
        }
    }

    double getBalance() {
        System.out.println("Balance available: " + balance);
        return balance;
    }


}
