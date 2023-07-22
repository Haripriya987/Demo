enum Size{
SMALL,MEDIUM,LARGE;
}
public class EnumPractise2{
public static void main(String args[]){
	Size s=Size.SMALL;
	System.out.println(s);
	for(Size z : Size.values())//Array of values
	{
	System.out.println(z+" " +z.ordinal());
	}
//Size x=Size.values();//Another way to get values of enum
	
}
}

/*
SMALL
SMALL 0
MEDIUM 1
LARGE 2
*/