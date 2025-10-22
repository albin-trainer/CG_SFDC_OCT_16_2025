package com;
public class Account {
    private int accNum;
    private String accHolderName;
    private float bankBalance;

    public void transferFunds(Account benAccount,
     float amt){
        // write the logic here
        if(amt<bankBalance){
        bankBalance=bankBalance-amt;
       benAccount.bankBalance=benAccount.bankBalance+amt;
       System.out.println("Transaction success");
        }
        else{
            System.out.println("Insufficient funds");
        }
    }
    //setter and getter
}
