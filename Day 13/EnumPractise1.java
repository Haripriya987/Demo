enum Size{
SMALL,MEDIUM,LARGE //enum Constants
}
class Test{
Size Bottle;
public Test(Size Bottle){
this.Bottle=Bottle;
}
public void orderBottle(){
 switch(Bottle){
	case SMALL -> System.out.println("SMALL size bottle is ordered");
	case MEDIUM -> System.out.println("MEDIUM size bottle is ordered");
	case LARGE ->  System.out.println("LARGE size bottle is ordered");
      }
    }
}
public class EnumPractise1{
	public static void main(String args[]){
	Test t1=new Test(Size.MEDIUM);
	t1.orderBottle();	
	}
}

//MEDIUM size bottle is ordered
