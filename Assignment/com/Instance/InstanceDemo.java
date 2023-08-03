package com.Instance;
public class InstanceDemo{
    public static void main(String args[]){
        InstanceCount i1=new InstanceCount();
         System.out.println(i1.getInstanceCount());
      // InstanceCount i2=new InstanceCount();
        InstanceCount i3=new InstanceCount();
        System.out.println(i3.getInstanceCount());
        
    }
}
class InstanceCount{
    private static int count=0;//Here we have to declare variable as  static
    InstanceCount(){
        count++;
    }
    public String getInstanceCount(){
        return  "No of Instances created  is : "+ count;
    }
}
