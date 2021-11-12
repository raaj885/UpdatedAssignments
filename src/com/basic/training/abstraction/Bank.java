package com.basic.training.abstraction;

abstract public class Bank {
    double balance;

    public Bank() {
        super();
    }

    public Bank(double balance) {
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    abstract void deposit(double amount);

    double getBalance() {
        System.out.println("Available balance in your account: " + balance);
        return balance;
    }
}
