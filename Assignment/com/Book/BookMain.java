package com.Book;
import java.util.Scanner;

public class BookMain {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the details like Bookno  BookName  Price");
        int no=in.nextInt();
        String name=in.next();
        int price=in.nextInt();
        System.out.println("Give the discount percentaage from 1 to 100 only ");
        int discount=in.nextInt();
        BookDemo b=new BookDemo(no,name,price);
        System.out.println(b.getBookDetails());
        SpecialEditionBook se=new SpecialEditionBook(no, name, price, discount);
        System.out.println(se.getBookDetails());
        in.close();
    }
}  
class BookDemo{
private int bNo;
private String bName;
private int bPrice;
public BookDemo(){
    System.out.println("Use Paramterised  constructor to instantiate the variables");
}
public BookDemo(int no,String name,int price){

    setBNo(no);
    setBName(name);
    setBPrice(price);

}
public void setBNo(int no){
    bNo=no;
}
public void setBName(String name){
    bName=name;
}
public void setBPrice(int price){
    bPrice=price;
}
public int getBNo(){
   return bNo;
}
public String getBName(){
   return bName;
}
public int getBPrice(){
   return bPrice;
}

public String getBookDetails(){
    return "Book No : "+getBNo()+"\n"+"Book Name is : "+getBName()+"\n"+" Book Price is : "+getBPrice();
}
}
class SpecialEditionBook extends BookDemo{
private int discount;
public SpecialEditionBook(){

}
public SpecialEditionBook(int no,String name,int price,int discount){
    super(no, name,price);
    if(discount>0 && discount<100)
    setDiscount(discount);

}
public void setDiscount(int discount){
    this.discount=discount;
}
public int  getDiscount(){
    return discount;
}
public String getBookDetails(){
    return super.getBookDetails()+"\n"+"Discount on this book is : "+discount+"%";
}
}
