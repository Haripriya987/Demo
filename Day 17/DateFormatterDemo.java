import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;	
public class DateFormatterDemo{
	public static void main(String args[]){
	LocalDateTime ldt=LocalDateTime.now();
	System.out.println(ldt);
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println(dtf.format(ldt));
	ZonedDateTime zdt=ZonedDateTime.now();
	System.out.println(zdt);
  	DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy   hh:mm:ss  z  Z");
	System.out.println(dt.format(zdt));
	
	
	}
}

//Here we can format the date and time based on our choice
/*Notations to remember for formating the Date and Time.
h Hour(0-11)
H  Hour(0-23)
y  Year
M Month(0-11)
m Minutes
d Day
s Seconds
S MilliSeconds
z TimeZone
Z  offset
*/
/*
2023-07-26T20:07:20.983920100
26/07/2023
2023-07-26T20:07:20.999545900+05:30[Asia/Calcutta]
26/07/2023   08:07:20  IST  +0530
*/