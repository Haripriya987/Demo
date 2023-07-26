import java.util.*;
import java.time.*;
public class NewDateDemo{
	public static void main(String args[]){
	LocalDate dt=LocalDate.now();
	System.out.println(dt);
	LocalDate d1=LocalDate.now(Clock.systemDefaultZone());
	System.out.println(d1);
	LocalDate d=LocalDate.ofEpochDay(1000);
	System.out.println(d);
	LocalTime t=LocalTime.now();
	System.out.println(t);
	LocalTime t1=t.minusHours(3);
	System.out.println(t1);
	LocalDateTime ldt=LocalDateTime.now();
	System.out.println(ldt);	
	}
}

/*
LocalDate:Shows only date
LocalTime:Shows only time
LocalDateTime:Shows both date and Time.
2023-07-26//It is in the order yyyy-mm-dd
2023-07-26
1972-09-27//1000 th day from 1970-01-01
16:00:59.371911100//minutes-seconds-milliseconds
13:00:59.371911100//Present time- 3hours
2023-07-26T16:00:59.371911100

*/