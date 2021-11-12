package com.basic.training.Inheritance;

import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account type");
        System.out.println("Press 1 for Savings Account,  press 2 for current Account");

        System.out.println();

        String accountType = sc.next();
        Bank bank;

        if (accountType.equals("1")) {

            bank= new Bank(1000);
            System.out.println("Select the required operation");
            System.out.println("press 1 to Deposit amount");
            System.out.println("press 2 to Withdraw amount");
            System.out.println("Press 3 to Balance details");

            System.out.println();

            String input = sc.next();
        //Choosing type of accounts
            switch (input) {
                case "1":
                    System.out.println("Enter the amount to Deposit");
                    int depositAmount = sc.nextInt();
                    bank.deposit(depositAmount);
                    break;
                case "2":
                    System.out.println("Enter the amount to Withdraw");
                    int withdrawAmount = sc.nextInt();
                    bank.withdraw(withdrawAmount);
                    break;
                case "3":
                    System.out.println();
                    bank.getBalance();
            }

        }
        if (accountType.equals("2")) {

            bank=new Savings(98645);
            System.out.println("Select the operation to");
            System.out.println("press 1 to Deposit amount");
            System.out.println("press 2 to Withdraw amount");
            System.out.println("Press 3 to Balance details");
            System.out.println();
            String input = sc.next();

            switch (input) {
                case "1":
                    System.out.println("Enter the amount to Deposit");
                    int depositAmount = sc.nextInt();
                    bank.deposit(depositAmount);
                    break;
                case "2":
                    System.out.println("Enter the amount to Withdraw");
                    int withdrawAmount = sc.nextInt();
                    bank.withdraw(withdrawAmount);
                    break;
                case "3":
                    System.out.println();
                    bank.getBalance();
            }

        }
        sc.close();

    }
}
