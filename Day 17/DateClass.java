import java.util.*;
@SuppressWarnings("Deprecated")
public class DateClass{
	public static void main(String args[]){
	Date d=new Date();
	System.out.println(d);
	Date d1=new Date("1/1/1980");
	System.out.println(d1);
	Date d2=new Date();
	System.out.println(d2.getTime());
	System.out.println(d2.getDay());
	System.out.println(d2.getMonth());
	System.out.println(d2.getYear()+1900);


	
	}
}


//It is a deprecated class we are no longer using  this class .From  Java 8 onwards it provides New Joda Date and Time API.
//Wed Jul 26 15:18:29 IST 2023
//Tue Jan 01 00:00:00 IST 1980

/*
1690365121908//It will show time in Milliseconds
3//Day count as it starts as sun-0,mon-1,.....
6//Month also start as jan-0,feb-1,........
2023//It starts from 1900 so we have to add 1900 for it to get current year
*/