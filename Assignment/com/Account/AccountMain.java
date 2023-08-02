
package com.Account;

import java.util.*;

class AccountDemo {
   private int accountNo;
   private String accountType;
   private int accountBalance;
   public void setAccountDetails(int acc,String accType,int balance){
        setAccountNo(acc);
        setAccountType(accType);
        setAccountBalance(balance);
    

    }
    public void setAccountNo(int acc){
        this.accountNo=acc;
    }
    public void setAccountBalance(int amount){
        this.accountBalance=amount;
    }
    public void  setAccountType(String accType){
        this.accountType=accType;
    }
    public String getAccountType(){
       return "AccountType is : "+accountType;
    }
    public String  getAccountNo(){
        return "AccountNo is : "+accountNo;
    }
    public void withDraw(int amount){
         if (amount > 0 ) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Updated Balance is: " + accountBalance);
        }
        else 
            System.out.println("Withdrawal failed. Insufficient balance.");
        
    
    }
    public void deposit(int amount){
        accountBalance+=amount;
       System.out.println("Updated Balance is : "+accountBalance);
    
        
    }
   public  String getAccountBalance(){
        return "Account Balance is : "+accountBalance;
    }
    public String dispAccountDetails(){
       return  getAccountNo()+"\n"+getAccountType()+"\n"+getAccountBalance();
    }

}
public class AccountMain {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the details accNo accType accBalance");
        int accNo=in.nextInt();
        String accType=in.next();
        int accountBalance=in.nextInt();

        in.close();

        AccountDemo ad=new AccountDemo();
        ad.setAccountDetails(accNo, accType, accountBalance);
      System.out.println(ad.dispAccountDetails());
        ad.withDraw(200);
      System.out.println(ad.getAccountType());
    }
}
