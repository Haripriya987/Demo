import java.util.*;
import java.time.*;
public class Demo3{
	public static void main(String args[]){
	ZonedDateTime zdt=ZonedDateTime.now();//It will show along with zone
	System.out.println(zdt);
	OffsetDateTime odt=OffsetDateTime.now();//It will show offset also
	System.out.println(odt);
	MonthDay md=MonthDay.now();//It will display only month and day
	System.out.println(md);
	YearMonth ym=YearMonth.now();//It will display only year and month
	System.out.println(ym);
	Year y=Year.now();//It will display only year
	System.out.println(y);
	LocalDateTime ldt=LocalDateTime.now();
	Period p=Period.of(1,7,12);
	System.out.println(p.addTo(ldt));//It will display the time difference 
	Instant i=Instant.now();//It will display Greenwich MeanTime
	System.out.println(i);
	
	}
}
/*
2023-07-26T19:51:58.105216300+05:30[Asia/Calcutta]
2023-07-26T19:51:58.105216300+05:30
2023-07-26T03:51:58.105216300+05:30
--07-26
2023-07
2023
2025-03-10T19:51:58.136422
2023-07-26T14:21:58.167721900Z
*/