

package com.Account;

import java.util.*;

class AccountDemo2{
   private int accountNo;
   private String accountType;
   private int accountBalance;
   public AccountDemo2(){
    System.out.println("It is a default constructor");
   }
   public AccountDemo2(int acc,String accType,int balance){
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
            System.out.println("Withdraw successful. Updated Balance is: " + accountBalance);
        }
        else 
            System.out.println("Withdraw failed. Insufficient balance.");
        
    
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
public class AccountConst {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the details accNo accType accBalance");
        int accNo=in.nextInt();
        String accType=in.next();
        int accountBalance=in.nextInt();

        in.close();

        AccountDemo2 ad=new AccountDemo2(accNo, accType, accountBalance);
      System.out.println(ad.dispAccountDetails());
        ad.withDraw(200);
      System.out.println(ad.getAccountType());
    }
}
