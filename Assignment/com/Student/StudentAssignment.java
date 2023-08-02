package com.Student;
import java.util.*;
 class StudentDetails{
       int rollnum;
       String studName;
       int marks1;
       int marks2;
       int marks3;
       int totalmarks;
       public void setStudDetails(int r,String n,int m1,int m2,int m3){
              rollnum=r;
              studName=n;
              marks1=m1;
              marks2=m2;
              marks3=m3;
              totalMarks();
       }
       public void totalMarks(){
              totalmarks=this.marks1+this.marks2+this.marks3;
       }
       public void displayStudDetails(){
              System.out.println("Student Details are :");
              System.out.println("No:"+rollnum+"\n"+"Name:"+studName+"\n"+"M1:"+marks1+"\n"+"M2:"+marks2+"\n"+"M3:"+marks3+"\n"+"Total:"+totalmarks);

       }

 }
 public class StudentAssignment{
        public static void main(String args[]){
              Scanner in=new Scanner(System.in);
              System.out.println("Enter Details of Students rollno name marks1 marks2 marks3");
              int r=in.nextInt();
              String name=in.next();
              int m1=in.nextInt();
              int m2=in.nextInt();
              int m3=in.nextInt();
              in.close();
              StudentDetails sd=new StudentDetails();
              sd.setStudDetails(r, name, m1, m2, m3);
              sd.displayStudDetails();
            
        } 
 }