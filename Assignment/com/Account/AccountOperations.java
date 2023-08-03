//Assignment 10
package com.Account;

public class AccountOperations {
    private  int amount;
    private String name;
    public AccountOperations(){

    }
    public  AccountOperations(String name,int amount){
        this.name=name;
        this.amount=amount;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAmount(int amount){
         this.amount=amount;

    }
    public String getName(){
        return name;
    }

   public  void depositDemo(int amount){
        this.amount+=amount;
        System.out.println("Amount is deposited successfully");

    }
   public void withDrawDemo(int amount){
        if(this.amount>0){
        this.amount-=amount;
        System.out.println("Withdraw is successful");
        }
        else
        System.out.println("Sufficient Balance is not there in account");    

    }
  public void getBalanceAmount(){
        System.out.println("Balance amount is : "+amount );
        
    }
   public String display(){
        return "Name is : "+ name+"\n"+"Amount is : "+amount;
        

    }
}
