package com;

public class BankingApp {
    public static void main(String[] args) {
        Account a1=new Account();
        //call all setters of a1

        Account a2= new Account();

        //call  all setters of a2
        a1.transferFunds(a2, 500);
        //print the bal of a1
        //print the bal of a2
    }
}
