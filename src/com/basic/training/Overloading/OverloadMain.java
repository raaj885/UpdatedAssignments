package com.basic.training.Overloading;

public class OverloadMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("James", "Manager");
        Employee emp2 = new Employee("Rajesh", "Programmer");
        Employee emp3 = new Employee("Sam", "Director");

        System.out.println(" Net salary : "+emp1.calcBonus(76789));
        System.out.println(" Net salary : "+emp2.calcBonus(76689, 873));
        System.out.println(" Net salary : "+emp3.calcBonus(76789, 2344, 9000));
    }
}

