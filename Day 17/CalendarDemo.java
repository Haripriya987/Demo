import java.util.*;
public class CalendarDemo{
	public static void main(String args[]){
	GregorianCalendar gc=new GregorianCalendar();
	System.out.println(gc.isLeapYear(2020));
	System.out.println(gc.get(Calendar.DATE));
	System.out.println(gc.get(Calendar.MONTH));
	System.out.println(gc.get(Calendar.DAY_OF_WEEK));
	System.out.println(gc.get(Calendar.DAY_OF_YEAR));

	


	
	}
}


/*
true
6
4
26
sun.util.calendar.ZoneInfo[id="Asia/Calcutta",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null]
*/