//Assignment 10
package com.Account.test;

import com.Account.AccountOperations;
import java.util.Scanner;

public class AccountTest {
    public static void main(String args[]){

       Scanner in=new Scanner(System.in);
       System.out.println("Enter Account Details accName, amount");
       String accName=in.next();
       int am=in.nextInt(); 

     AccountOperations acc=new AccountOperations(accName, am);
     
     int choice;
     int amount;
     do{
        System.out.println("1.Deposit the amount");
        System.out.println("2.Withdraw amount");
        System.out.println("3.Display Balance");
        System.out.println("4.Exit from the program");
        choice=in.nextInt();
        switch(choice){
            case 1:System.out.println("Enter the amount to deposit");
                    amount=in.nextInt();
                    acc.depositDemo(amount);
                    break;
            case 2:System.out.println("Enter the amount to withDraw ");
                    amount=in.nextInt();
                    acc.withDrawDemo(amount);
                    break;
            case 3:acc.getBalanceAmount();
                    break;
            default:System.out.println("Exiting from the program");
        }

     }while(choice!=4);
       
       acc.display();
       in.close();
    }
}
