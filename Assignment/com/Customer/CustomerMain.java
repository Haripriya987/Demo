package com.Customer;

import java.util.Scanner;
public class CustomerMain {
    public static void main(String args[]){

     Scanner in=new Scanner(System.in);
     System.out.println("Enter Details accno name balance cid adress");
     int ano=in.nextInt();
     String name=in.next();
     int balance=in.nextInt();
     int cid=in.nextInt();
     String adress=in.next();

         CustomerDemo s=new CustomerDemo(cid,name,adress);
        Account  a=new Account(ano,name,s,balance);//Here s is the object of class CustomerDemo
        System.out.println(a.getAccountDetails());

        in.close();

    }
}
//Here we are using CustomerDemo class to store customer data like id,name,adress
class CustomerDemo{
    private  int custId;
    private  String custName;
    private String custAdress;
    CustomerDemo(){
        System.out.println("It is a Default constructor of Customer");
    }
    CustomerDemo(int cId,String cName,String cAdress){
        setCustId(cId);
        setCustName(cName);
        setCustAdress(cAdress);

    }
    public void setCustId(int cId){
        custId=cId;

    } 
    public void setCustName(String cName){
        custName=cName;
    }
    public void  setCustAdress(String cAdress){
        custAdress=cAdress;

    }
     public int  getCustId(){
        return custId;
    } 
    public String getCustName(){
        return custName;
    }
    public String  getCustAdress(){
        return custAdress;
    }
    public String getCustomerDetails(){
        return "Customer id is : "+getCustId()+"\n"+"Customer Name is : "+getCustName()+"\n"+" Adress is: "+getCustAdress()+"\n";
       }

}

//Here we are creating Account class with details accno,Name,Balance and also Customer class reference
class Account{
    private int accNo;
    private String accName;
    private int accBalance;
    CustomerDemo cust;//we are declaring reference of customer class
    Account(){
        System.out.println("It is a Default constructor of Account");    
    }
    Account(int no,String name,CustomerDemo cd,int balance){
        setAccNo(no);
        setAccName(name);
        setAccBalance(balance);
        cust=cd;
    }

    public void setAccNo(int no){
        accNo=no;

    } 
    public void setAccName(String name){
        accName=name;

    }
    public void  setAccBalance(int balance){
        accBalance=balance;

    }
    public int getAccNo(){
        return accNo;
    } 
    public String getAccName(){
        return accName;

    }
    public int getAccBalance(){
        return accBalance;
    }
    public String getCustData(){
        //Here we are accessing the details of customer by using object of Customer
        System.out.println(" Details are:");
      return  cust.getCustomerDetails();

    } 
    public String getAccountDetails(){
                return "Account No is :"+getAccNo()+"\n"+"Account Name is : "+getAccName()+"\n "+" Balance is : "+getAccBalance()+"\n"+getCustData();
    }


}